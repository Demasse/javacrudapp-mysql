package javacrudapp;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

import java.util.List;

public class CrudAppFrame extends javax.swing.JFrame {

    private int selectedUserId = -1;

    public CrudAppFrame() throws SQLException {
        initComponents();
        loadUserData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstnameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA CRUD Application");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("JAVA CRUD APPLICATION");

        jLabel2.setText("first name");

        firstnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTextFieldActionPerformed(evt);
            }
        });

        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("last name");

        jLabel4.setText("Email");

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("age");

        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(0, 102, 102));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 0, 51));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(0, 51, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        usersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(usersTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(addButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(updateButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteButton)))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void loadUserData() throws SQLException {
        UserDAO userDAO = new UserDAO();

        List<User> users = userDAO.getUsers();
        String[][] data = new String[users.size()][5];

        for (int i = 0; i < users.size(); i++) {
            data[i][0] = String.valueOf(users.get(i).getId());
            data[i][1] = users.get(i).getFirstName();
            data[i][2] = users.get(i).getLastName();
            data[i][3] = users.get(i).getEmail();
            data[i][4] = String.valueOf(users.get(i).getAge());

        }

        String[] columnNames = {"ID", "First Name", "Last Name", "Email", "Age"};

        // ⚡ CORRECTION ICI : DefaultTableModel avec D majuscule
        usersTable.setModel(new DefaultTableModel(data, columnNames));
    }

    private void clearForm() {
        firstnameTextField.setText("");
        lastNameTextField.setText("");
        emailTextField.setText("");
        ageTextField.setText("");

    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        // Récupération des champs
        String fn = firstnameTextField.getText();
        String ln = lastNameTextField.getText();
        String email = emailTextField.getText();

// Vérification et conversion de l'âge
        int age = 0;
        try {
            age = Integer.parseInt(ageTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "L'âge doit être un nombre valide", "Erreur", JOptionPane.ERROR_MESSAGE);
            return; // stop si erreur
        }

// Vérification que tous les champs sont remplis
        if (fn.isEmpty() || ln.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            User newUser = new User(0, fn, ln, email, age); // id=0 pour nouvel utilisateur
            UserDAO userDao = new UserDAO();
            userDao.insertUser(newUser);

            JOptionPane.showMessageDialog(this, "Utilisateur ajouté avec succès ✅", "Succès", JOptionPane.INFORMATION_MESSAGE);
            this.clearForm();   // vide les champs
            loadUserData();     // rafraîchit le tableau

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout dans la base", "Erreur", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // update

      // Récupération des champs
String fn = firstnameTextField.getText().trim();
String ln = lastNameTextField.getText().trim();
String email = emailTextField.getText().trim();

// Vérification que tous les champs sont remplis
if(fn.isEmpty() || ln.isEmpty() || email.isEmpty() || ageTextField.getText().trim().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
    return;
}

// Conversion sécurisée de l'âge
int age = 0;
try {
    age = Integer.parseInt(ageTextField.getText().trim());
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "L'âge doit être un nombre valide", "Erreur", JOptionPane.ERROR_MESSAGE);
    return; // stop si erreur
}

if (selectedUserId != -1) {
    User updatedUser = new User(selectedUserId, fn, ln, email, age);

    try {
        UserDAO userDao = new UserDAO();
        userDao.updateUser(updatedUser);  // mise à jour

        JOptionPane.showMessageDialog(this, "Utilisateur mis à jour avec succès ✅", "Succès", JOptionPane.INFORMATION_MESSAGE);

        this.clearForm();   // vider les champs
        loadUserData();     // rafraîchir le tableau
        selectedUserId = -1; // réinitialiser la sélection

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors de la mise à jour ❌", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
} else {
    JOptionPane.showMessageDialog(this, "Aucun utilisateur sélectionné pour la mise à jour", "Erreur", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        
        if (selectedUserId != -1) {
    int confirmation = JOptionPane.showConfirmDialog(
        this,
        "Voulez-vous vraiment supprimer cet utilisateur ?",
        "Confirmation de suppression",
        JOptionPane.YES_NO_OPTION
    );

    if (confirmation == JOptionPane.YES_OPTION) {
        try {
            UserDAO userDao = new UserDAO();
            userDao.deleteUser(selectedUserId); // suppression

            JOptionPane.showMessageDialog(
                this,
                "Utilisateur supprimé avec succès ✅",
                "Succès",
                JOptionPane.INFORMATION_MESSAGE
            );

            this.clearForm();   // vider les champs
            loadUserData();     // rafraîchir le tableau
            selectedUserId = -1; // réinitialiser la sélection

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(
                this,
                "Erreur lors de la suppression ❌",
                "Erreur",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
} else {
    JOptionPane.showMessageDialog(
        this,
        "Aucun utilisateur sélectionné pour la suppression",
        "Erreur",
        JOptionPane.ERROR_MESSAGE
    );
}

        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void usersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = usersTable.getSelectedRow();
        if (selectedRow != -1) {
            selectedUserId = Integer.parseInt(usersTable.getValueAt(selectedRow, 0).toString());
            firstnameTextField.setText(usersTable.getValueAt(selectedRow, 1).toString());
            lastNameTextField.setText(usersTable.getValueAt(selectedRow, 2).toString());
            emailTextField.setText(usersTable.getValueAt(selectedRow, 3).toString());
            ageTextField.setText(usersTable.getValueAt(selectedRow, 4).toString());
        }
    }//GEN-LAST:event_usersTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstnameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
