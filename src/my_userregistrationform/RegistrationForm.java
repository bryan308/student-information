import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import controllers.UserDAO;

public class RegistrationForm extends javax.swing.JFrame {

  private int selectedRowIndex = -1;
  private int userId;

  public RegistrationForm() {
    initComponents();
    UserDAO.showUsers(jTable1);
    disableTextFields();
    btnAdd.setEnabled(true);
    btnSave.setEnabled(false);
    btnClear.setEnabled(false);
    btnClose.setEnabled(true);
    btnEdit.setEnabled(false);
    btnDelete.setEnabled(false);
  }

  private void disableTextFields() {
    txtLastName.setEnabled(false);
    txtFirstName.setEnabled(false);
    txtMiddleName.setEnabled(false);
    txtAge.setEnabled(false);
    txtDateOfBirth.setEnabled(false);
    txtCivilStatus.setEnabled(false);
    txtCourse.setEnabled(false);
    txtSection.setEnabled(false);
    txtEmailAddress.setEnabled(false);
    txtContactNumber.setEnabled(false);
  }

  private void enableTextFields() {
    txtLastName.setEnabled(true);
    txtFirstName.setEnabled(true);
    txtMiddleName.setEnabled(true);
    txtAge.setEnabled(true);
    txtDateOfBirth.setEnabled(true);
    txtCivilStatus.setEnabled(true);
    txtCourse.setEnabled(true);
    txtSection.setEnabled(true);
    txtEmailAddress.setEnabled(true);
    txtContactNumber.setEnabled(true);
  }

  private void clearTextFields() {
    txtLastName.setText("");
    txtFirstName.setText("");
    txtMiddleName.setText("");
    txtAge.setText("");
    txtDateOfBirth.setText("");
    txtCivilStatus.setText("");
    txtCourse.setText("");
    txtSection.setText("");
    txtEmailAddress.setText("");
    txtContactNumber.setText("");
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    lblHeader = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    btnPrint = new javax.swing.JButton();
    jLabel15 = new javax.swing.JLabel();
    txtSearchInput = new javax.swing.JTextField();
    jPanel3 = new javax.swing.JPanel();
    txtLastName = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    txtFirstName = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    txtMiddleName = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    txtAge = new javax.swing.JTextField();
    txtDateOfBirth = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    txtCivilStatus = new javax.swing.JTextField();
    txtCourse = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    txtSection = new javax.swing.JTextField();
    txtEmailAddress = new javax.swing.JTextField();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    txtContactNumber = new javax.swing.JTextField();
    btnEdit = new javax.swing.JButton();
    btnDelete = new javax.swing.JButton();
    btnClose = new javax.swing.JButton();
    btnSave = new javax.swing.JButton();
    btnClear = new javax.swing.JButton();
    btnAdd = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));

    jPanel1.setBackground(new java.awt.Color(102, 153, 255));

    lblHeader.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
    lblHeader.setText("Student Information");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblHeader)
                .addContainerGap(24, Short.MAX_VALUE)));

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {

        },
        new String[] {
            "ID", "Last Name", "First Name", "Middle Name", "Age", "Date of Birth",
            "Civil Status", "Course", "Section", "Email Address", "Contact No."
        }) {
      boolean[] canEdit = new boolean[] {
          false, false, false, false, false, false, false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
      }
    });

    // Hide the ID column
    jTable1.getColumnModel().getColumn(0).setMinWidth(0);
    jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
    jTable1.getColumnModel().getColumn(0).setWidth(0);
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable1MouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(jTable1);

    btnPrint.setBackground(new java.awt.Color(0, 123, 255));
    btnPrint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    btnPrint.setText("Print");
    btnPrint.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPrintActionPerformed(evt);
      }
    });

    jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel15.setText("Search");

    txtSearchInput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    txtSearchInput.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtSearchInputActionPerformed(evt);
      }
    });

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));

    txtLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel5.setText("Last Name:");

    jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel6.setText("First Name:");

    txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel7.setText("Middle Name:");

    txtMiddleName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel8.setText("Age:");

    txtAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    txtDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel9.setText("Date of Birth:");

    jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel10.setText("Civil Status:");

    txtCivilStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    txtCourse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel11.setText("Course:");

    jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel12.setText("Section:");

    txtSection.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    txtEmailAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel13.setText("Email Address:");

    jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel14.setText("Contact Number:");

    txtContactNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    btnEdit.setBackground(new java.awt.Color(0, 123, 255));
    btnEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    btnEdit.setText("Edit");
    btnEdit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditActionPerformed(evt);
      }
    });

    btnDelete.setBackground(new java.awt.Color(220, 53, 69));
    btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    btnDelete.setForeground(new java.awt.Color(255, 255, 255));
    btnDelete.setText("Delete");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDeleteActionPerformed(evt);
      }
    });

    btnClose.setBackground(new java.awt.Color(108, 117, 125));
    btnClose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    btnClose.setForeground(new java.awt.Color(255, 255, 255));
    btnClose.setText("Close");
    btnClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCloseActionPerformed(evt);
      }
    });

    btnSave.setBackground(new java.awt.Color(40, 167, 69));
    btnSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    btnSave.setForeground(new java.awt.Color(255, 255, 255));
    btnSave.setText("Save");
    btnSave.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSaveActionPerformed(evt);
      }
    });

    btnClear.setBackground(new java.awt.Color(253, 126, 20));
    btnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    btnClear.setText("Clear");
    btnClear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnClearActionPerformed(evt);
      }
    });

    btnAdd.setBackground(new java.awt.Color(40, 167, 69));
    btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    btnAdd.setForeground(new java.awt.Color(255, 255, 255));
    btnAdd.setText("Add New");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 196,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnClose, javax.swing.GroupLayout.Alignment.LEADING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLastName)
                            .addComponent(txtFirstName)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMiddleName)
                            .addComponent(txtAge)
                            .addComponent(txtDateOfBirth)
                            .addComponent(txtCivilStatus)
                            .addComponent(txtCourse)
                            .addComponent(txtSection)
                            .addComponent(txtEmailAddress)
                            .addComponent(txtContactNumber))))
                .addContainerGap()));
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCivilStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSection, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 646, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(1, 1, 1)))))
                .addContainerGap()));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap()));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
    if (selectedRowIndex != -1) {
      try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "")) {
        String sql = "UPDATE users SET status=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "inactive");
        pstmt.setInt(2, userId);
        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
          JOptionPane.showMessageDialog(this, "User successfully removed.");
          UserDAO.showUsers(jTable1);
          clearTextFields();
          disableTextFields();
        }
      } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
      }
    } else {
      JOptionPane.showMessageDialog(this, "Please select a row to delete.");
    }
  }

  private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPrintActionPerformed
    // TODO add your handling code here:
  }// GEN-LAST:event_btnPrintActionPerformed

  // ...existing code...
  private void txtSearchInputActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSearchInputActionPerformed
    String searchValue = txtSearchInput.getText().trim();
    if (searchValue.length() > 3) {
      try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "")) {
        String sql = "SELECT * FROM users WHERE status='active' AND lastName LIKE ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "%" + searchValue + "%");
        java.sql.ResultSet rs = pstmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing rows

        while (rs.next()) {
          model.addRow(new Object[] {
              rs.getInt("id"),
              rs.getString("lastName"),
              rs.getString("firstName"),
              rs.getString("middleName"),
              rs.getString("age"),
              rs.getString("dateOfBirth"),
              rs.getString("civilStatus"),
              rs.getString("course"),
              rs.getString("section"),
              rs.getString("email"),
              rs.getString("contactNumber")
          });
        }
      } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
      }
    } else {
      UserDAO.showUsers(jTable1);
    }
  }// GEN-LAST:event_txtSearchInputActionPerformed

  private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
    selectedRowIndex = jTable1.getSelectedRow();
    if (selectedRowIndex != -1) {
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      userId = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
      txtLastName.setText(model.getValueAt(selectedRowIndex, 1).toString());
      txtFirstName.setText(model.getValueAt(selectedRowIndex, 2).toString());
      txtMiddleName.setText(model.getValueAt(selectedRowIndex, 3).toString());
      txtAge.setText(model.getValueAt(selectedRowIndex, 4).toString());
      txtDateOfBirth.setText(model.getValueAt(selectedRowIndex, 5).toString());
      txtCivilStatus.setText(model.getValueAt(selectedRowIndex, 6).toString());
      txtCourse.setText(model.getValueAt(selectedRowIndex, 7).toString());
      txtSection.setText(model.getValueAt(selectedRowIndex, 8).toString());
      txtEmailAddress.setText(model.getValueAt(selectedRowIndex, 9).toString());
      txtContactNumber.setText(model.getValueAt(selectedRowIndex, 10).toString());

      btnEdit.setEnabled(true);
      btnDelete.setEnabled(true);
      btnClear.setEnabled(false);
      btnAdd.setEnabled(false);
    }
  }

  private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {
    if (selectedRowIndex != -1) {
      enableTextFields();
      btnSave.setEnabled(true);
      btnAdd.setEnabled(false);
      btnEdit.setEnabled(false);
      btnDelete.setEnabled(false);
    } else {
      JOptionPane.showMessageDialog(this, "Please select a row to edit.");
    }
  }

  private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSaveActionPerformed
    String lastName = txtLastName.getText();
    String firstName = txtFirstName.getText();
    String middleName = txtMiddleName.getText();
    String age = txtAge.getText();
    String dateOfBirth = txtDateOfBirth.getText();
    String civilStatus = txtCivilStatus.getText();
    String course = txtCourse.getText();
    String section = txtSection.getText();
    String email = txtEmailAddress.getText();
    String contactNumber = txtContactNumber.getText();

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "")) {
      if (selectedRowIndex != -1) {
        // Update existing user
        String sql = "UPDATE users SET lastName=?, firstName=?, middleName=?, age=?, dateOfBirth=?, civilStatus=?, course=?, section=?, email=?, contactNumber=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, lastName);
        pstmt.setString(2, firstName);
        pstmt.setString(3, middleName);
        pstmt.setString(4, age);
        pstmt.setString(5, dateOfBirth);
        pstmt.setString(6, civilStatus);
        pstmt.setString(7, course);
        pstmt.setString(8, section);
        pstmt.setString(9, email);
        pstmt.setString(10, contactNumber);
        pstmt.setInt(11, userId);

        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
          JOptionPane.showMessageDialog(this, "User updated successfully.");
        }
      } else {
        StringBuilder emptyFields = new StringBuilder();
        if (lastName.trim().isEmpty())
          emptyFields.append("• Last Name\n");
        if (firstName.trim().isEmpty())
          emptyFields.append("• First Name\n");
        if (middleName.trim().isEmpty())
          emptyFields.append("• Middle Name\n");
        if (age.trim().isEmpty())
          emptyFields.append("• Age\n");
        if (dateOfBirth.trim().isEmpty())
          emptyFields.append("• Date of Birth\n");
        if (civilStatus.trim().isEmpty())
          emptyFields.append("• Civil Status\n");
        if (course.trim().isEmpty())
          emptyFields.append("• Course\n");
        if (section.trim().isEmpty())
          emptyFields.append("• Section\n");
        if (email.trim().isEmpty())
          emptyFields.append("• Email\n");
        if (contactNumber.trim().isEmpty())
          emptyFields.append("• Contact Number\n");

        // If there are empty fields, show a message and stop
        if (emptyFields.length() > 0) {
          JOptionPane.showMessageDialog(
              this,
              "Please fill in the following field(s):\n\n" + emptyFields.toString(),
              "Missing Fields",
              JOptionPane.WARNING_MESSAGE);
          return;
        }

        // Insert new user
        String sql = "INSERT INTO users(lastName, firstName, middleName, age, dateOfBirth, civilStatus, course, section, email, contactNumber, status) VALUES(?,?,?,?,?,?,?,?,?,?,'active')";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, lastName);
        pstmt.setString(2, firstName);
        pstmt.setString(3, middleName);
        pstmt.setString(4, age);
        pstmt.setString(5, dateOfBirth);
        pstmt.setString(6, civilStatus);
        pstmt.setString(7, course);
        pstmt.setString(8, section);
        pstmt.setString(9, email);
        pstmt.setString(10, contactNumber);

        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
          JOptionPane.showMessageDialog(this, "User registered successfully.");
        }
      }

      UserDAO.showUsers(jTable1);
      clearTextFields();
      disableTextFields();
      btnSave.setEnabled(false);
      btnAdd.setEnabled(true);
      btnEdit.setEnabled(false);
      btnDelete.setEnabled(false);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
  }// GEN-LAST:event_btnSaveActionPerformed

  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed
    enableTextFields();
    btnAdd.setEnabled(false);
    btnSave.setEnabled(true);
    btnClear.setEnabled(true);
    btnClose.setEnabled(true);
    selectedRowIndex = -1;
    clearTextFields();
  }// GEN-LAST:event_btnAddActionPerformed

  private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnClearActionPerformed
    clearTextFields();
    btnAdd.setEnabled(true);
    btnEdit.setEnabled(false);
    btnDelete.setEnabled(false);
    btnSave.setEnabled(false);
    btnClear.setEnabled(false);
  }// GEN-LAST:event_btnClearActionPerformed

  private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCloseActionPerformed
    System.exit(0);
  }// GEN-LAST:event_btnCloseActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RegistrationForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdd;
  private javax.swing.JButton btnClear;
  private javax.swing.JButton btnClose;
  private javax.swing.JButton btnDelete;
  private javax.swing.JButton btnEdit;
  private javax.swing.JButton btnPrint;
  private javax.swing.JButton btnSave;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JLabel lblHeader;
  private javax.swing.JTextField txtAge;
  private javax.swing.JTextField txtCivilStatus;
  private javax.swing.JTextField txtContactNumber;
  private javax.swing.JTextField txtCourse;
  private javax.swing.JTextField txtDateOfBirth;
  private javax.swing.JTextField txtEmailAddress;
  private javax.swing.JTextField txtFirstName;
  private javax.swing.JTextField txtLastName;
  private javax.swing.JTextField txtMiddleName;
  private javax.swing.JTextField txtSearchInput;
  private javax.swing.JTextField txtSection;
  // End of variables declaration//GEN-END:variables
}
