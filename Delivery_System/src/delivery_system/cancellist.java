/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sparsh
 */
public class cancellist extends javax.swing.JInternalFrame implements myvariables {

    /**
     * Creates new form deliverylist
     */
    public cancellist() {
        initComponents();
          
  
         Connection myconnection;
    
    try
    {
     myconnection=DriverManager.getConnection(path+place,username,password);
     try
     {
         String query="select * from cancelorder";
         PreparedStatement mystatement=myconnection.prepareStatement(query);
         ResultSet myresult=mystatement.executeQuery();
         DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
         if(myresult.next())
         {
             do
             {
                 String ord_no,username,t_amt,dis,amt_paid,penalty,d_t;
                 ord_no=myresult.getString(1);
                 username=myresult.getString(2);
                 t_amt=myresult.getString(3);
                 dis=myresult.getString(4);
                 amt_paid=myresult.getString(5);
                 penalty=myresult.getString(6);
                 d_t=myresult.getString(7);
                 mymodel.addRow(new Object[] {ord_no,username,t_amt,dis,amt_paid,penalty,d_t});
             }
             while(myresult.next());
         }
         
     }
     catch(Exception e)
    {
        JOptionPane.showMessageDialog(rootPane, "Fetching Error."+e.getMessage());
    }
     finally
     {
         myconnection.close();
     }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(rootPane, "Connection Error."+e.getMessage());
    }
    
   
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("List of Cancel Orders");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Username", "Total Amount", "Discount", "Amount Paid", "Penalty", "Date and Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1435, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       MessageFormat myheader=new MessageFormat("List of Cancel Orders");
       MessageFormat myfooter=new MessageFormat("Page {0}");
       try
       {
           jTable1.print(JTable.PrintMode.FIT_WIDTH,myheader,myfooter);
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(rootPane, "Printing Problem");
       }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
