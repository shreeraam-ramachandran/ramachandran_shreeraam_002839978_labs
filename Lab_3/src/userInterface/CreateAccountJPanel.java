/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import bussiness.Account;
import bussiness.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import util.CommonConstants;
import util.InputValidator;

/**
 *
 * @author Home
 */
public class CreateAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAccountJPanel
     */
    private JPanel userProcessContainer;
    private AccountDirectory accountDirectory;
    public CreateAccountJPanel(JPanel userProcessContainer, AccountDirectory accountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accountDirectory = accountDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateAccount = new javax.swing.JLabel();
        lblRoutingNumber = new javax.swing.JLabel();
        txtRoutingNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBankName = new javax.swing.JTextField();
        lblBalance = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblCreateAccount.setText("Create Account");

        lblRoutingNumber.setText("Routing Number:");

        jLabel1.setText("Account Number:");

        jLabel2.setText("Bank Name:");

        lblBalance.setText("Balance:");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblCreateAccount))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addComponent(lblRoutingNumber))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(151, 151, 151)
                                    .addComponent(jLabel1)))
                            .addComponent(lblBalance))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRoutingNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(txtAccountNumber)
                            .addComponent(txtBankName)
                            .addComponent(txtBalance)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btnCreate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnBack)))
                .addContainerGap(541, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblCreateAccount)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNumber)
                    .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBalance)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addGap(106, 106, 106)
                .addComponent(btnBack)
                .addContainerGap(234, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        
       String validate = validateAllFields();
                    
       if(validate.equals(CommonConstants.VALIDATION_MESSAGE)) {
           
            String routingNumber = txtRoutingNumber.getText();
            String accountNumberv= txtAccountNumber.getText();
            String bankName = txtBankName.getText();
            int balance = Integer.parseInt(txtBalance.getText());

            Account account = this.accountDirectory.addAccount();
            account.setRoutingNumber(routingNumber);
            account.setAccountNumber(accountNumberv);
            account.setBankName(bankName);
            account.setBalance(balance);

            JOptionPane.showMessageDialog(null, "Account sucessfully created");
            
       } else {
            JOptionPane.showMessageDialog(this, validate);
       }
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
          userProcessContainer.remove(this);
          CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
          cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblCreateAccount;
    private javax.swing.JLabel lblRoutingNumber;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNumber;
    // End of variables declaration//GEN-END:variables

    private String validateAllFields() {
        
        StringBuilder builder = new StringBuilder(CommonConstants.VALIDATION_MESSAGE);
         
        if(!InputValidator.isValidInteger(txtAccountNumber.getText())) {
              builder.append("\nPlease enter valid account number");
         }
         if(!InputValidator.isValidInteger(txtBalance.getText())) {
             builder.append("\nPlease enter a valid balance amount");
         }
         if(!InputValidator.isValidName(txtBankName.getText())) {
             builder.append("\nPlease enter valid bank name");
         }
         if(!InputValidator.isValidString(txtRoutingNumber.getText())) {
              builder.append("\nPlease enter valid routing number");
         }
         
         return builder.toString();
         
    }
}
