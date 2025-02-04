/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thechainstores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SARA ALINEZHAD
 */
public class branches extends javax.swing.JFrame {

    /**
     * Creates new form branches
     */
    
    /*this is constructor*/
    public branches() {
        initComponents();
        selectBranch() ;
    }

    /*used for including database*/
Connection Con = null;
Statement St = null ;  
ResultSet Rs = null ;

/*used to get dataa from database*/
public void selectBranch(){
        try{
          Con=DriverManager.getConnection("jdbc:derby://localhost:1527/TheChainStore","admin1","admin");
          St=Con.createStatement();
          Rs=St.executeQuery("Select * from admin1.BRANCHTBL");
          branchTable.setModel(DbUtils.resultSetToTableModel(Rs));
          
        }catch(Exception e){
        e.printStackTrace();
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        branchTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        branchName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        branchId = new javax.swing.JTextField();
        clearButtonn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        exitClick = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        goToLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BRANCHES");

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton.setText("ADD");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        branchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "BRANCH ID:", "BRANCH'S NAME:"
            }
        ));
        branchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                branchTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(branchTable);
        if (branchTable.getColumnModel().getColumnCount() > 0) {
            branchTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel3.setText("BRANCH NAME:");

        jLabel4.setText("BRANCH ID:");

        clearButtonn.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        clearButtonn.setText("CLEAR");
        clearButtonn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButtonn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonnMouseClicked(evt);
            }
        });

        jLabel2.setText("BRANCH'S LIST:");

        exitClick.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exitClick.setForeground(new java.awt.Color(255, 255, 255));
        exitClick.setText("X");
        exitClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitClickMouseClicked(evt);
            }
        });

        editBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editBtn.setText("EDIT");
        editBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });

        goToLogin.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        goToLogin.setText("LOGIN");
        goToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitClick)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(54, 54, 54)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(branchId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(branchName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(clearButtonn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goToLogin)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(exitClick, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(branchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(branchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearButtonn, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(goToLogin)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*for cleariing textboxes , when clicked it will replace "blankspace" instead of text */ 
    private void clearButtonnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonnMouseClicked
        branchId.setText(" ");
        branchName.setText(" ");
    }//GEN-LAST:event_clearButtonnMouseClicked


    /*for adding data using database*/
    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
  
        /*when textfields are empty it hints user */
        if(branchId.getText().isEmpty() ||branchName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Fill The Buttons!") ;
        }
        /*it first will connect to the related database then it adds info given*/
        else{
        try{
        /*connects to database*/
            Con=DriverManager.getConnection("jdbc:derby://localhost:1527/TheChainStore","admin1","admin");
            /*inserting to the chosen table of database*/
        PreparedStatement add = Con.prepareStatement("insert into BRANCHTBL values(?,?)");
        //by giving address and info. it is added
        add.setInt(1 , Integer.valueOf(branchId.getText()));
        add.setString(2, branchName.getText());
        int row = add.executeUpdate();
          /*when it is shown the method is done successfully*/
        JOptionPane.showMessageDialog(this,"Added Successfully") ;
        /*to add the info given instantly to the table*/
        Con.close();
        //connecting to database
        selectBranch();
    
        } catch(Exception e){
            e.printStackTrace();
        }
    }          
   
    }//GEN-LAST:event_addButtonMouseClicked


    
    /*it will delete selected item from database as well as table*/
    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
       /*if textfields are empty it will hint the user */
        if(branchId.getText().isEmpty()){
    JOptionPane.showMessageDialog(this,"Select To Delete!") ;
    }
        /*it will connect to related database first then by selecting it will remove it*/
       else{
           try{
               /*connects to database*/
    Con=DriverManager.getConnection("jdbc:derby://localhost:1527/TheChainStore","admin1","admin");
    String branId = branchId.getText();
    /*by giving the address it is deleted*/
    String Query="Delete from admin1.BRANCHTBL WHERE BRANCHESID="+branId ;
    Statement Add = Con.createStatement();
    Add.execute(Query);
    selectBranch();
      /*when it is shown the method is done successfully*/
    JOptionPane.showMessageDialog(this,"Deleted!") ;
           }
      catch(SQLException e){
           e.printStackTrace();
       }
    }  
    }//GEN-LAST:event_deleteButtonMouseClicked

    
    /*when clicking the table , info will be shown in textboxes*/ 
    private void branchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branchTableMouseClicked
        DefaultTableModel model=(DefaultTableModel)branchTable.getModel() ;
        /*for clearing the index of table*/
        int myIndex = branchTable.getSelectedRow();
        branchId.setText(model.getValueAt(myIndex, 0).toString());
        branchName.setText(model.getValueAt(myIndex, 1).toString()) ;
    }//GEN-LAST:event_branchTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    //for exiting the page
    private void exitClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitClickMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitClickMouseClicked

    /*for editing */
    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
      /*if empty it will hint*/
        if(branchId.getText().isEmpty()||branchName.getText().isEmpty()){
           JOptionPane.showMessageDialog(this,"Select To Edit") ;
       }
        /*connects the database and it will update changed info*/
       else{
           try{
               //address of database
          Con=DriverManager.getConnection("jdbc:derby://localhost:1527/TheChainStore","admin1","admin");
          //selects from data base and updates the info wanted
          String Query="Update admin1.BRANCHTBL set BRANCHESNAME='"+branchName.getText()+"'"+"where BRANCHESID="+branchId.getText();
          Statement Add = Con.createStatement();
          Add.executeUpdate(Query) ;
          /*when it is shown the method is done successfully*/
          JOptionPane.showMessageDialog(this,"Edited") ;
          selectBranch();
           }catch(SQLException e){
               e.printStackTrace();
           }
       }
    }//GEN-LAST:event_editBtnMouseClicked

    /*a method that is linked to loginpage whenever clicking on it*/
    private void goToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToLoginMouseClicked
        new loginPage().setVisible(true);
        //the page will be disposed after
        this.dispose();
    }//GEN-LAST:event_goToLoginMouseClicked

    
        /*this is a method that if the user click on any rows of the table
    the info. would be displayed on the textboxes */

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
            java.util.logging.Logger.getLogger(branches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(branches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(branches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(branches.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new branches().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField branchId;
    private javax.swing.JTextField branchName;
    private javax.swing.JTable branchTable;
    private javax.swing.JButton clearButtonn;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel exitClick;
    private javax.swing.JLabel goToLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
