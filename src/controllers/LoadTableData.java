package controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;

public class LoadTableData {
  private Connection connection;
  private DefaultTableModel model;

  public LoadTableData(Connection connection, DefaultTableModel model) {
    this.connection = connection;
    this.model = model;
  }

  public void loadDataToTable() {
    try {
      String sqlquery = "SELECT * FROM users WHERE status = 'active'";
      PreparedStatement statement = connection.prepareStatement(sqlquery);
      ResultSet rs = statement.executeQuery();
      model.setRowCount(0);
      while (rs.next()) {
        Vector<String> row = new Vector<>();
        row.add(rs.getString("id"));
        row.add(rs.getString("lastName"));
        row.add(rs.getString("firstName"));
        row.add(rs.getString("middleName"));
        row.add(rs.getString("age"));
        row.add(rs.getString("dateOfBirth"));
        row.add(rs.getString("course"));
        row.add(rs.getString("email"));
        row.add(rs.getString("userName"));
        row.add("**********");
        model.addRow(row);
      }

    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, "Error connecting to the database.", "Database Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
}
