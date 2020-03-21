/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getInt;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class RecordPayment extends javax.swing.JFrame {

    /**
     * Creates new form RecordPayment
     */
    public RecordPayment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        MainPageButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CardPaymentName = new javax.swing.JLabel();
        CardPaymentNameField = new javax.swing.JTextField();
        CardPaymentSurname = new javax.swing.JLabel();
        CardPaymentSurnameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CardNumberField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CVVField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CardPaymentAmountField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CardPaymentRecordPaymentButton = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CashAmountField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CashNameField = new javax.swing.JTextField();
        CashSurnameField = new javax.swing.JTextField();
        CashRecordPaymetButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        TableButton = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 145));

        MainPageButton.setText("Main Page");
        MainPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainPageButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Record Payment");

        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        CardPaymentName.setText("Name:");

        CardPaymentSurname.setText("Surname:");

        CardPaymentSurnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardPaymentSurnameFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Card Number:");

        jLabel5.setText("CVV:");

        jLabel6.setText("Amount:");

        jLabel7.setText("Date:");

        CardPaymentRecordPaymentButton.setText("Record Payment");
        CardPaymentRecordPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardPaymentRecordPaymentButtonActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VISA", "MASTER CARD" }));

        jLabel2.setText("Card Type");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "Local Currency" }));

        jLabel3.setText("Card Payment");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Ticket ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jXDatePicker2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CardPaymentSurname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CardPaymentName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CardPaymentNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CardPaymentSurnameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CardNumberField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CVVField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(CardPaymentAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(CardPaymentRecordPaymentButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CardPaymentName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CardPaymentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CardPaymentSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CardPaymentSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CardNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CVVField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardPaymentAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(CardPaymentRecordPaymentButton)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel10.setText("Amount:");

        jLabel8.setText("Name:");

        jLabel9.setText("Surname:");

        jLabel11.setText("Date:");

        CashSurnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashSurnameFieldActionPerformed(evt);
            }
        });

        CashRecordPaymetButton.setText("Record Payment");
        CashRecordPaymetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashRecordPaymetButtonActionPerformed(evt);
            }
        });

        jLabel12.setText("Cash Payment");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "Local Currency" }));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Ticket ID:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(CashRecordPaymetButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8))
                            .addGap(94, 94, 94))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(CashAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(CashNameField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CashSurnameField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel13))
                .addGap(0, 45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CashNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CashSurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CashAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(CashRecordPaymetButton)
                .addGap(23, 23, 23))
        );

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Ticket ID", "Is Payed", "Customer Name", "Customer Surname", "Amount", "Amount Paid"
            }
        ));
        jScrollPane1.setViewportView(table1);

        jLabel15.setText("Paymet Table:");

        TableButton.setText("Update Table");
        TableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(MainPageButton)
                .addGap(425, 425, 425)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOutButton)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(TableButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainPageButton)
                    .addComponent(jLabel1)
                    .addComponent(LogOutButton))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TableButton)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainPageButtonActionPerformed
        // TODO add your handling code here:
        
         travelAd ta =new travelAd();
        ta.setVisible(true);
        ta.pack();
        ta.setLocationRelativeTo(null); //puts in the center of the screen
      //  sls.setDefultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); //hides previos page
    }//GEN-LAST:event_MainPageButtonActionPerformed

    private void CardPaymentSurnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardPaymentSurnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CardPaymentSurnameFieldActionPerformed

    private void CashSurnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashSurnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CashSurnameFieldActionPerformed

    private void CardPaymentRecordPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardPaymentRecordPaymentButtonActionPerformed
        // TODO add your handling code here:
        
        //get the fields from the design into variables
        
        String fname=CardPaymentNameField.getText();
        String lname=CardPaymentSurnameField.getText();
        int cnumber= Integer.parseInt(CardNumberField.getText()); 
        
        // geting varibles for integers
        int camount= Integer.parseInt(CardPaymentAmountField.getText());
        int cvv= Integer.parseInt(CVVField.getText());
        //Date Problem fix !!!
        
       // SimpleDateFormat dateformat= new SimpleDateFormat("yyyy-MM-dd");
       // String  bdate= dateformat.format(CardPaymentDateField.getDate());
        
       //seting database link and which action to do
       PreparedStatement ps;
       String query="INSERT INTO `paymentdetails`(`customerID`, `tickedID`, `title`, `ExpiryDate`, `CVV`, `firstName`, `lastName`, `paymentType`, `cardNumber`, `amount`) VALUES (?,?,?,?,?,?,?,?,?,?)";
     try{
            
         ps=MyConnection.getConnection().prepareStatement(query);
         
         ps.setString(6,fname);
         ps.setString(7,lname);
         ps.setInt(9,cnumber);
         ps.setInt(5,cvv);
         ps.setInt(10,camount);
         ps.setString(4,"2000-12-23");
         ps.setString(8,"card");
         ps.setString(3,"Mr");
         ps.setInt(1,(int) (Math.random() * ( 000 - 999 )));
         ps.setInt(2,(int) (Math.random() * ( 000 - 999 )));
         
         if(ps.executeUpdate()>0){
             JOptionPane.showMessageDialog(null,"New User Payment Recorded");
         }
         
     }catch (SQLException ex){
         Logger.getLogger(RecordPayment.class.getName()).log(Level.SEVERE,null,ex);
         
     }
     
    }//GEN-LAST:event_CardPaymentRecordPaymentButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // TODO add your handling code here:
        loginFrame lf = new loginFrame();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        this.dispose();   
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void CashRecordPaymetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashRecordPaymetButtonActionPerformed
          String fname=CashNameField.getText();
          String lname=CashSurnameField.getText();
        
        // geting varibles for integers
        int camount= Integer.parseInt(CashAmountField.getText());
       
        //Date Problem fix !!!
       // SimpleDateFormat dateformat= new SimpleDateFormat("yyyy-MM-dd");
       // String  bdate= dateformat.format(CardPaymentDateField.getDate());
        
       //seting database link and which action to do
       PreparedStatement ps;
       String query="INSERT INTO `paymentdetails`(`customerID`, `tickedID`, `title`, `ExpiryDate`, `CVV`, `firstName`, `lastName`, `paymentType`, `cardNumber`, `amount`) VALUES (?,?,?,?,?,?,?,?,?,?)";
     try{
            
         ps=MyConnection.getConnection().prepareStatement(query);
         
         
         ps.setString(6,fname);
         ps.setString(7,lname);
         ps.setInt(9,-1);
         ps.setInt(5,-1);
         ps.setInt(10,camount);
         ps.setString(4,"2000-12-23");
         ps.setString(8,"cash");
         ps.setString(3,"Mr");
         ps.setInt(1, (int) (Math.random() * ( 999 -000  )));
         ps.setInt(2,(int) (Math.random() * ( 999 -000  )));
         
         if(ps.executeUpdate()>0){
             JOptionPane.showMessageDialog(null,"Customer Payment Recorded");
         }
         
     }catch (SQLException ex){
         Logger.getLogger(RecordPayment.class.getName()).log(Level.SEVERE,null,ex);
         
     }
    }//GEN-LAST:event_CashRecordPaymetButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void TableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableButtonActionPerformed
        // TODO add your handling code here:
       PreparedStatement ps;
       String query="SELECT ticketID, ts.customerID, amount, amountPaid, isPayed, c.firstName, c.lastName FROM customer AS c INNER JOIN ticketsales AS ts WHERE ts.customerID=c.customerID";
       PreparedStatement ps1;
       
     try{  
         ps=MyConnection.getConnection().prepareStatement(query);
        
         ResultSet rs=ps.executeQuery();
         DefaultTableModel tm=(DefaultTableModel)table1.getModel();
         tm.setRowCount(0); 
         while(rs.next()){
             
             Object o[]={rs.getInt("customerID"),rs.getInt("ticketID"),rs.getInt("isPayed"),rs.getString("c.firstName"),rs.getString("c.lastName"),rs.getInt("amount"),rs.getInt("amountPaid")};
             tm.addRow(o);
         }  
         
         
    }//GEN-LAST:event_TableButtonActionPerformed
    catch(Exception e){
        JOptionPane.showMessageDialog(this,e);
    }
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecordPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CVVField;
    private javax.swing.JTextField CardNumberField;
    private javax.swing.JTextField CardPaymentAmountField;
    private javax.swing.JLabel CardPaymentName;
    private javax.swing.JTextField CardPaymentNameField;
    private javax.swing.JButton CardPaymentRecordPaymentButton;
    private javax.swing.JLabel CardPaymentSurname;
    private javax.swing.JTextField CardPaymentSurnameField;
    private javax.swing.JTextField CashAmountField;
    private javax.swing.JTextField CashNameField;
    private javax.swing.JButton CashRecordPaymetButton;
    private javax.swing.JTextField CashSurnameField;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton MainPageButton;
    private javax.swing.JButton TableButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
