package delivery_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class cancelorder extends javax.swing.JInternalFrame implements myvariables {
    
    
    public cancelorder() {
        initComponents();
    }
    
    public void previousholiday()
    {
       
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cancel Order");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cancel Order"));
        jPanel1.setToolTipText("");

        jLabel1.setText("Enter Order Number");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        double t_amt=0,dis=0,amt_paid=0,cpay=0;
        if(JOptionPane.showConfirmDialog(rootPane, "Do you really want to cancel the order?", "Order cancel confirmation .", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
        Connection myconnection;
        try
        {
            myconnection=DriverManager.getConnection(path+place, username, password);
            try
            {
                 String query2="select * from deliverytable where ord_no=?";
                    PreparedStatement mystatement2=myconnection.prepareStatement(query2);
                    mystatement2.setString(1, jTextField1.getText());
                    ResultSet myresult=mystatement2.executeQuery();
                    if(myresult.next())
                    {
                        t_amt=Double.parseDouble(myresult.getString(16));
                        dis=Double.parseDouble(myresult.getString(17));
                        amt_paid=Double.parseDouble(myresult.getString(18));
                        cpay=(amt_paid*15)/100;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Please check order number");
                    }
                    
                String query3="insert into cancelorder values(?,?,?,?,?,?,?)";
                PreparedStatement mystatement3=myconnection.prepareStatement(query3);
                mystatement3.setString(1, jTextField1.getText());
                mystatement3.setString(2, login.lguser);
                mystatement3.setString(3, String.valueOf(t_amt));
                mystatement3.setString(4, String.valueOf(dis));
                mystatement3.setString(5, String.valueOf(amt_paid));
                mystatement3.setString(6, String.valueOf(cpay));
                SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
                java.util.Date cdate=new java.util.Date();
                mystatement3.setString(7, myformat.format(cdate));
                mystatement3.executeUpdate();
                
                String query="delete from deliverytable where ord_no=?";
                PreparedStatement mystatement=myconnection.prepareStatement(query);
                mystatement.setString(1, jTextField1.getText());
                
                 if(mystatement.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Order Cancelled Successfully. Please pay : "+String.valueOf(cpay));
                    jTextField1.setText("");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Fetching Error:"+e.getMessage());
            }
            finally
            {
                myconnection.close();
            }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, "Connection Error:"+e.getMessage());
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
