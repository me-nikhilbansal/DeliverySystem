/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery_system;

import static delivery_system.myvariables.password;
import static delivery_system.myvariables.path;
import static delivery_system.myvariables.place;
import static delivery_system.myvariables.username;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sparsh
 */
public class searchvehicle extends javax.swing.JInternalFrame implements myvariables {

    String v_no;
    /**
     * Creates new form addvehicle
     */
    public searchvehicle() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Edit Vehicle Details");
        setPreferredSize(new java.awt.Dimension(1800, 960));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Search By", "Vehicle Number", "Chasis Number", "Engine Number", "Date of Issuing(yyyy-mm-dd)", "Type", "Wheeler" }));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Number", "Chasis Number", "Engine Number", "Date of issuing", "Type", "Wheeler"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(783, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Search", jPanel1);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Heavy Weight");

        jLabel8.setText("Engine Number");

        jLabel4.setText("Wheeler");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Two");

        jLabel9.setText("Colour");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Three");

        jLabel1.setText("Vehicle Number");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Four");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Vehicle Company");

        jLabel2.setText("Name with Model Number");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel6.setText("Date of Issuing");

        jLabel3.setText("Vehicle Type");

        jLabel7.setText("Chasis Number");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Low Weight");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(68, 68, 68)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(68, 68, 68)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3)
                                .addComponent(jTextField4)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jRadioButton3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton5))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jRadioButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton2))
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(687, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Details", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int column=0;
        int row=jTable1.getSelectedRow();
        v_no=jTable1.getValueAt(row, column).toString();
        
        Connection myconnection;
        try
        {
            myconnection=DriverManager.getConnection(path+place, username, password);
            try
            {
                String query="update vehicletable set company=?,name_model=?,type=?,wheeler=?,doi=?,"
                              +"chasis_no=?,engine_no=?,colour=? where v_no=?";
                PreparedStatement mystatement=myconnection.prepareStatement(query);
                mystatement.setString(9, v_no);
                mystatement.setString(1, jTextField2.getText());
                mystatement.setString(2, jTextArea1.getText());
                if(jRadioButton1.isSelected())
                {
                    mystatement.setString(3, "Low Weight");
                }
                else
                        {
                            mystatement.setString(3, "Heavy Weight");
                        }
                
                 if(jRadioButton3.isSelected())
                {
                    mystatement.setString(4, "Two");
                }
                 else if(jRadioButton4.isSelected())
                   {
                     mystatement.setString(4, "Three");
                   }
                 else
                 {
                     mystatement.setString(4, "Four");
                 }
                 
                 SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                 mystatement.setString(5, myformat.format(jDateChooser1.getDate()));
                 mystatement.setString(6, jTextField3.getText());
                 mystatement.setString(7, jTextField4.getText());
                 mystatement.setString(8, jTextField5.getText());
                 if(mystatement.executeUpdate()>0)
                 {
                     JOptionPane.showMessageDialog(rootPane, "Details Updated Successfully");
                 }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Updating Error:"+e.getMessage());
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jComboBox1.getSelectedIndex()==1)
        {
            Connection myconnection;
            try
            {
                myconnection=DriverManager.getConnection(path+place, username, password);
                try
                {
                    String query="select * from vehicletable where v_no like ?";
                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setString(1, "%"+jTextField6.getText()+"%");
                    ResultSet myresult=mystatement.executeQuery();
                    DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                    if(myresult.next())
                    {
                        mymodel.setRowCount(0);
                        do
                        {
                            String v_no,chasis,engine,doi,type,wheeler;
                            v_no=myresult.getString(1);
                            chasis=myresult.getString(7);
                            engine=myresult.getString(8);
                            doi=myresult.getString(6);
                            type=myresult.getString(4);
                            wheeler=myresult.getString(5);
                            mymodel.addRow(new Object[] {v_no,chasis,engine,doi,type,wheeler});
                        }
                        while(myresult.next());
                    }
                    else
         {
             JOptionPane.showMessageDialog(rootPane, "No matches found");
         }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Insertion Error."+e.getMessage());
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

        else if(jComboBox1.getSelectedIndex()==2)
        {
            Connection myconnection;
            try
            {
                myconnection=DriverManager.getConnection(path+place, username, password);
                try
                {
                     String query="select * from vehicletable where chasis_no like ?";
                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setString(1, "%"+jTextField6.getText()+"%");
                    ResultSet myresult=mystatement.executeQuery();
                    DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                    if(myresult.next())
                    {
                        mymodel.setRowCount(0);
                        do
                        {
                            String v_no,chasis,engine,doi,type,wheeler;
                            v_no=myresult.getString(1);
                            chasis=myresult.getString(7);
                            engine=myresult.getString(8);
                            doi=myresult.getString(6);
                            type=myresult.getString(4);
                            wheeler=myresult.getString(5);
                            mymodel.addRow(new Object[] {v_no,chasis,engine,doi,type,wheeler});
                        }
                        while(myresult.next());
                    }
                    else
         {
             JOptionPane.showMessageDialog(rootPane, "No matches found");
         }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Insertion Error."+e.getMessage());
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

        else if(jComboBox1.getSelectedIndex()==3)
        {
            Connection myconnection;
            try
            {
                myconnection=DriverManager.getConnection(path+place, username, password);
                try
                {
                     String query="select * from vehicletable where engine_no like ?";
                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setString(1, "%"+jTextField6.getText()+"%");
                    ResultSet myresult=mystatement.executeQuery();
                    DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                    if(myresult.next())
                    {
                        mymodel.setRowCount(0);
                        do
                        {
                            String v_no,chasis,engine,doi,type,wheeler;
                            v_no=myresult.getString(1);
                            chasis=myresult.getString(7);
                            engine=myresult.getString(8);
                            doi=myresult.getString(6);
                            type=myresult.getString(4);
                            wheeler=myresult.getString(5);
                            mymodel.addRow(new Object[] {v_no,chasis,engine,doi,type,wheeler});
                        }
                        while(myresult.next());
                    }
                    else
         {
             JOptionPane.showMessageDialog(rootPane, "No matches found");
         }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Insertion Error."+e.getMessage());
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

        else if(jComboBox1.getSelectedIndex()==4)
        {
            Connection myconnection;
            try
            {
                myconnection=DriverManager.getConnection(path+place, username, password);
                try
                {
                     String query="select * from vehicletable where doi like ?";
                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setString(1, "%"+jTextField6.getText()+"%");
                    ResultSet myresult=mystatement.executeQuery();
                    DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                    if(myresult.next())
                    {
                        mymodel.setRowCount(0);
                        do
                        {
                            String v_no,chasis,engine,doi,type,wheeler;
                            v_no=myresult.getString(1);
                            chasis=myresult.getString(7);
                            engine=myresult.getString(8);
                            doi=myresult.getString(6);
                            type=myresult.getString(4);
                            wheeler=myresult.getString(5);
                            mymodel.addRow(new Object[] {v_no,chasis,engine,doi,type,wheeler});
                        }
                        while(myresult.next());
                    }
                    else
         {
             JOptionPane.showMessageDialog(rootPane, "No matches found");
         }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Insertion Error."+e.getMessage());
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

        else if(jComboBox1.getSelectedIndex()==5)
        {
            Connection myconnection;
            try
            {
                myconnection=DriverManager.getConnection(path+place, username, password);
                try
                {
                     String query="select * from vehicletable where type like ?";
                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setString(1, "%"+jTextField6.getText()+"%");
                    ResultSet myresult=mystatement.executeQuery();
                    DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                    if(myresult.next())
                    {
                        mymodel.setRowCount(0);
                        do
                        {
                            String v_no,chasis,engine,doi,type,wheeler;
                            v_no=myresult.getString(1);
                            chasis=myresult.getString(7);
                            engine=myresult.getString(8);
                            doi=myresult.getString(6);
                            type=myresult.getString(4);
                            wheeler=myresult.getString(5);
                            mymodel.addRow(new Object[] {v_no,chasis,engine,doi,type,wheeler});
                        }
                        while(myresult.next());
                    }
                    else
         {
             JOptionPane.showMessageDialog(rootPane, "No matches found");
         }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Insertion Error."+e.getMessage());
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

        else if(jComboBox1.getSelectedIndex()==6)
        {
            Connection myconnection;
            try
            {
                myconnection=DriverManager.getConnection(path+place, username, password);
                try
                {
                     String query="select * from vehicletable where wheeler like ?";
                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setString(1, "%"+jTextField6.getText()+"%");
                    ResultSet myresult=mystatement.executeQuery();
                    DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                    if(myresult.next())
                    {
                        mymodel.setRowCount(0);
                        do
                        {
                            String v_no,chasis,engine,doi,type,wheeler;
                            v_no=myresult.getString(1);
                            chasis=myresult.getString(7);
                            engine=myresult.getString(8);
                            doi=myresult.getString(6);
                            type=myresult.getString(4);
                            wheeler=myresult.getString(5);
                            mymodel.addRow(new Object[] {v_no,chasis,engine,doi,type,wheeler});
                        }
                        while(myresult.next());
                    }
                    else
         {
             JOptionPane.showMessageDialog(rootPane, "No matches found");
         }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Insertion Error."+e.getMessage());
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

        else
        {
            JOptionPane.showMessageDialog(rootPane, "Please select option from the dropdown menu");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int column=0;
        int row=jTable1.getSelectedRow();
        v_no=jTable1.getValueAt(row, column).toString();
        
         Connection myconnection;
       
       try
       {
           myconnection=DriverManager.getConnection(path+place, username, password);
           try
           {
              String query="select * from vehicletable where v_no=?";
              PreparedStatement mystatement=myconnection.prepareStatement(query);
              mystatement.setString(1,v_no);
              
              ResultSet myresult=mystatement.executeQuery();
              if(myresult.next())
              {
              jTextField1.setText(myresult.getString(1));
              jTextField2.setText(myresult.getString(2));
              jTextArea1.setText(myresult.getString(3));
              jDateChooser1.setDate(myresult.getDate(6));
              jTextField3.setText(myresult.getString(7));
              jTextField4.setText(myresult.getString(8));
              jTextField5.setText(myresult.getString(9));
              jTextField5.setText(myresult.getString(3));
              
              if(myresult.getString(4).equalsIgnoreCase("low weight"))
              {
                  jRadioButton1.setSelected(true);
              }
              else
              {
                  jRadioButton2.setSelected(true);
              }
              
               if(myresult.getString(5).equalsIgnoreCase("two"))
              {
                  jRadioButton3.setSelected(true);
              }
               else if(myresult.getString(5).equalsIgnoreCase("three"))
              {
                  jRadioButton4.setSelected(true);
              }
                else
              {
                  jRadioButton5.setSelected(true);
              }
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
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
