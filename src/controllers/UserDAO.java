package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserDAO {

    public static void showUsers(JTable jTable1) {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "")) {
            
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM users";
            ResultSet result = statement.executeQuery(sql);
            // System.out.print(result.getString(0));

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (result.next()) {
                String lastName = result.getString("lastName");
                String firstName = result.getString("firstName");
                String middleName = result.getString("middleName");
                String age = result.getString("age");
                String dateOfBirth = result.getString("dateOfBirth");
                String civilStatus = result.getString("civilStatus");
                String course = result.getString("course");
                String section = result.getString("section");
                String email = result.getString("email");
                String contactNumber = result.getString("contactNumber");

                String tbData[] = { lastName, firstName, middleName, age, dateOfBirth, civilStatus, course, section,
                        email, contactNumber };
                model.addRow(tbData);
            }

            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}