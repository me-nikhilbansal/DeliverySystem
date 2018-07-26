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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GTBStudent
 */
public class searchdelivery extends javax.swing.JInternalFrame implements myvariables {
    
    int ord_no;

    /**
     * Creates new form adddelivery
     */
    public searchdelivery()  {
        initComponents();

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Search Delivery");
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(1800, 960));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1800, 960));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Search By", "Order Number", "Name", "Class", "Delivery Person ID", "Mode of payment", "Date of Order(yyyy-mm-dd)", "Delivery type" }));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Name", "Class", "Date of Order", "Delivery Person ID", "Delivery Type", "Mode of Payment"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(847, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Search", jPanel1);

        jLabel1.setText("Order Number");

        jLabel13.setText("Vehicle Number");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Mode of Payment");

        jLabel2.setText("From Location");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("Name");

        jLabel4.setText("To Location");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Mode of Payment", "Credit/Debit Card", "Master Card", "Online Banking", "Cash on Delivery", "Online Wallet" }));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel5.setText("Date of Order");

        jLabel15.setText("Total Amount");

        jLabel6.setText("Date of Delivery");

        jLabel7.setText("Fast Delivery");

        jLabel16.setText("Discount");

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Yes");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Amount Paid");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");

        jTextField8.setEditable(false);

        jLabel8.setText("Delivery Type");

        jLabel18.setText("Delivery Person ID");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Delivery Type", "Food", "Medicines", "Clothes", "Small Accessory", "Big Appliances" }));

        jLabel9.setText("Mobile Number");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Delivery Person Name" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Delivery Person name first" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Vehicle Number" }));

        jLabel10.setText("Number Of Items");

        jLabel11.setText("Customer Class");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Customer Class", "Normal", "Silver", "Gold", "Platinum" }));

        jLabel12.setText("Delivery Person Name");

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel Order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(96, 96, 96)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(96, 96, 96)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton2))
                                .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(96, 96, 96)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField4)
                                .addComponent(jTextField3)
                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("Details", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed

        Connection myconnection;
        try
        {
            myconnection=DriverManager.getConnection(path+place, username, password);
            try
            {
                String query="select * from deliverypersontable where name=?";
                PreparedStatement mystatement=myconnection.prepareStatement(query);
                mystatement.setString(1, jComboBox4.getSelectedItem().toString());
                ResultSet myresult=mystatement.executeQuery();
                if(myresult.next())
                {
                    jComboBox5.removeAllItems();
                    do
                    {
                        jComboBox5.addItem(myresult.getString(1));
                    }
                    while(myresult.next());
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
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jComboBox7.getSelectedIndex()==1)
        {
            Connection myconnection;
        try
        {
            myconnection=DriverManager.getConnection(path+place, username, password);
            try
            {
                String query="select * from deliverytable where ord_no like ?";
                PreparedStatement mystatement=myconnection.prepareStatement(query);
                mystatement.setString(1, "%"+jTextField6.getText()+"%");
                ResultSet myresult=mystatement.executeQuery();
                 DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
         if(myresult.next())
         {
             mymodel.setRowCount(0);
             do
             {
                 String ord_no,name,dclass,d_id,mode_pay,doo,type;
                 ord_no=myresult.getString(1);
                 name=myresult.getString(2);
                 dclass=myresult.getString(4);
                 d_id=myresult.getString(13);
                 mode_pay=myresult.getString(15);
                 doo=myresult.getString(7);
                 type=myresult.getString(9);
                 mymodel.addRow(new Object[] {ord_no,name,dclass,doo,d_id,type,mode_pay});
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
        
        else if(jComboBox7.getSelectedIndex()==2)
        {
            Connection myconnection;
        try
        {
            myconnection=DriverManager.getConnection(path+place, username, password);
            try
            {
                String query="select * from deliverytable where name like ?";
                PreparedStatement mystatement=myconnection.prepareStatement(query);
                mystatement.setString(1, "%"+jTextField6.getText()+"%");
                ResultSet myresult=mystatement.executeQuery();
                 DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
         if(myresult.next())
         {
             mymodel.setRowCount(0);
             do
             {
                 String ord_no,name,dclass,d_id,mode_pay,doo,type;
                 ord_no=myresult.getString(1);
                 name=myresult.getString(2);
                 doo=myresult.getString(7);
                 dclass=myresult.getString(4);
                 type=myresult.getString(9);
                 mode_pay=myresult.getString(15);
                 d_id=myresult.getString(13);
                 mymodel.addRow(new Object[] {ord_no,name,dclass,doo,d_id,type,mode_pay});
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
        
        else if(jComboBox7.getSelectedIndex()==3)
        {
            Connection myconnection;
        try
        {
            myconnection=DriverManager.getConnection(path+place, username, password);
            try
            {
                String query="select * from deliverytable where cust_class like ?";
                PreparedStatement mystatement=myconnection.prepareStatement(query);
                mystatement.setString(1, "%"+jTextField6.getText()+"%");
                ResultSet myresult=mystatement.executeQuery();
                 DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
         if(myresult.next())
         {
             mymodel.setRowCount(0);
             do
             {
                 String ord_no,name,dclass,d_id,mode_pay,doo,type;
                 ord_no=myresult.getString(1);
                 name=myresult.getString(2);
                 doo=myresult.getString(7);
                 dclass=myresult.getString(4);
                 type=myresult.getString(9);
                 mode_pay=myresult.getString(15);
                 d_id=myresult.getString(13);
                 mymodel.addRow(new Object[] {ord_no,name,dclass,doo,d_id,type,mode_pay});
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
        
        else if(jComboBox7.getSelectedIndex()==4)
        {
            Connection myconnection;
        try
        {
            myconnection=DriverManager.getConnection(path+place, username, password);
            try
            {
                String query="select * from deliverytable where d_id like ?";
                PreparedStatement mystatement=myconnection.prepareStatement(query);
                mystatement.setString(1, "%"+jTextField6.getText()+"%");
                ResultSet myresult=mystatement.executeQuery();
                 DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
         if(myresult.next())
         {
             mymodel.setRowCount(0);
             do
             {
                 String ord_no,name,dclass,d_id,mode_pay,doo,type;
                 ord_no=myresult.getString(1);
                 name=myresult.getString(2);
                 doo=myresult.getString(7);
                 dclass=myresult.getString(4);
                 type=myresult.getString(9);
                 mode_pay=myresult.getString(15);
                 d_id=myresult.getString(13);
                 mymodel.addRow(new Object[] {ord_no,name,dclass,doo,d_id,type,mode_pay});
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
        
        else if(jComboBox7.getSelectedIndex()==5)
        {
            Connection myconnection;
        try
        {
            myconnection=DriverManager.getConnection(path+place, username, password);
            try
            {
                String query="select * from deliverytable where mode_pay like ?";
                PreparedStatement mystatement=myconnection.prepareStatement(query);
                mystatement.setString(1, "%"+jTextField6.getText()+"%");
                ResultSet myresult=mystatement.executeQuery();
                 DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
         if(myresult.next())
         {
             mymodel.setRowCount(0);
             do
             {
                 String ord_no,name,dclass,d_id,mode_pay,doo,type;
                 ord_no=myresult.getString(1);
                 name=myresult.getString(2);
                 doo=myresult.getString(7);
                 dclass=myresult.getString(4);
                 type=myresult.getString(9);
                 mode_pay=myresult.getString(15);
                 d_id=myresult.getString(13);
                 mymodel.addRow(new Object[] {ord_no,name,dclass,doo,d_id,type,mode_pay});
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
        
        else if(jComboBox7.getSelectedIndex()==6)
        {
            Connection myconnection;
        try
        {
            myconnection=DriverManager.getConnection(path+place, username, password);
            try
            {
                String query="select * from deliverytable where doo like ?";
                PreparedStatement mystatement=myconnection.prepareStatement(query);
                mystatement.setString(1, "%"+jTextField6.getText()+"%");
                ResultSet myresult=mystatement.executeQuery();
                 DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
         if(myresult.next())
         {
             mymodel.setRowCount(0);
             do
             {
                 String ord_no,name,dclass,d_id,mode_pay,doo,type;
                 ord_no=myresult.getString(1);
                 name=myresult.getString(2);
                 doo=myresult.getString(7);
                 dclass=myresult.getString(4);
                 type=myresult.getString(9);
                 mode_pay=myresult.getString(15);
                 d_id=myresult.getString(13);
                 mymodel.addRow(new Object[] {ord_no,name,dclass,doo,d_id,type,mode_pay});
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
        
        else if(jComboBox7.getSelectedIndex()==7)
        {
            Connection myconnection;
        try
        {
            myconnection=DriverManager.getConnection(path+place, username, password);
            try
            {
                String query="select * from deliverytable where d_type like ?";
                PreparedStatement mystatement=myconnection.prepareStatement(query);
                mystatement.setString(1, "%"+jTextField6.getText()+"%");
                ResultSet myresult=mystatement.executeQuery();
                 DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
         if(myresult.next())
         {
             mymodel.setRowCount(0);
             do
             {
                 String ord_no,name,dclass,d_id,mode_pay,doo,type;
                 ord_no=myresult.getString(1);
                 name=myresult.getString(2);
                 doo=myresult.getString(7);
                 dclass=myresult.getString(4);
                 type=myresult.getString(9);
                 mode_pay=myresult.getString(15);
                 d_id=myresult.getString(13);
                 mymodel.addRow(new Object[] {ord_no,name,dclass,doo,d_id,type,mode_pay});
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int column=0;
        int row=jTable1.getSelectedRow();
        ord_no=Integer.parseInt(jTable1.getValueAt(row, column).toString());
       
        Connection myconnection;
       
       try
       {
           myconnection=DriverManager.getConnection(path+place, username, password);
           try
           {
               String query="select * from deliverypersontable";
               PreparedStatement mystatement=myconnection.prepareStatement(query);
               ResultSet myresult=mystatement.executeQuery();
               if(myresult.next())
               {
                   do
                   {
                       jComboBox4.addItem(myresult.getString(2));
                   }
                   while(myresult.next());
               }
               
               query="select * from deliverypersontable where name=?";
               mystatement=myconnection.prepareStatement(query);
               mystatement.setString(1, jComboBox4.getSelectedItem().toString());
               myresult=mystatement.executeQuery();
               if(myresult.next())
               {
                   jComboBox5.removeAllItems();
                   do
                   {
                       jComboBox5.addItem(myresult.getString(1));
                   }
                   while(myresult.next());
               }
               
               query="select * from vehicletable";
               mystatement=myconnection.prepareStatement(query);
               myresult=mystatement.executeQuery();
               if(myresult.next())
               {
                   do
                   {
                       jComboBox6.addItem(myresult.getString(1));
                   }
                   while(myresult.next());
               }
               
              query="select * from deliverytable where ord_no=?";
              mystatement=myconnection.prepareStatement(query);
              mystatement.setString(1,String.valueOf(ord_no));
              
              myresult=mystatement.executeQuery();
              if(myresult.next())
              {
              jTextField1.setText(myresult.getString(1));
              jTextField2.setText(myresult.getString(2));
              jTextField5.setText(myresult.getString(3));
              jComboBox2.setSelectedItem(myresult. getString(4));
              jTextArea1.setText(myresult.getString(5));
              jTextArea2.setText(myresult.getString(6));
              jDateChooser1.setDate(myresult.getDate(7));
              jDateChooser2.setDate(myresult.getDate(8));
              jComboBox1.setSelectedItem(myresult.getString(9));
              jSpinner1.setValue(Integer.parseInt(myresult.getString(10)));
              
              if(myresult.getString(11).equalsIgnoreCase("yes"))
              {
                  jRadioButton1.setSelected(true);
              }
              else
              {
                  jRadioButton2.setSelected(true);
              }
              
              jComboBox4.setSelectedItem(myresult.getString(12));
              jComboBox5.setSelectedItem(myresult.getString(13));
              jComboBox6.setSelectedItem(myresult.getString(14));
              jComboBox3.setSelectedItem(myresult.getString(15));
              jTextField3.setText(myresult.getString(16));
              jTextField4.setText(myresult.getString(17));
              jTextField8.setText(myresult.getString(18));
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int column=0;
        int row=jTable1.getSelectedRow();
        ord_no=Integer.parseInt(jTable1.getValueAt(row, column).toString());
        double tamt=Double.parseDouble(jTextField3.getText());
      double dis=0,ramt=0;
        if(jComboBox2.getSelectedIndex()==0 || jComboBox2.getSelectedIndex()==1)
       {
           dis=0;
           ramt=tamt;
       }
        else if(jComboBox2.getSelectedIndex()==2)
        {
            dis=(10*tamt)/100;
            ramt=tamt-dis;
        }
        else if(jComboBox2.getSelectedIndex()==3)
        {
            dis=(15*tamt)/100;
            ramt=tamt-dis;
        }
        else if(jComboBox2.getSelectedIndex()==4)
        {
            dis=(25*tamt)/100;
            ramt=tamt-dis;
        }
        Connection myconnection;
       
       try
       {
           myconnection=DriverManager.getConnection(path+place, username, password);
           try
           {
              
              String query="update deliverytable set name=?,mob_no=?,cust_class=?,f_location=?,t_location=?,"
                      +"doo=?,dod=?,d_type=?,no_items=?,fast_d=?,d_name=?,d_id=?,v_no=?,mode_pay=?"
                            + ",t_pay=?,dis=?,amt_paid=? where ord_no=?";
              PreparedStatement mystatement=myconnection.prepareStatement(query);
              mystatement.setString(18, String.valueOf(ord_no));
              mystatement.setString(1, jTextField2.getText());
              mystatement.setString(2, jTextField5.getText());
              mystatement.setString(3, jComboBox2.getSelectedItem().toString());
              mystatement.setString(4, jTextArea1.getText());
              mystatement.setString(5, jTextArea2.getText());
              
              SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
              mystatement.setString(6, myformat.format(jDateChooser1.getDate()));
              mystatement.setString(7, myformat.format(jDateChooser2.getDate()));
              
              mystatement.setString(8, jComboBox1.getSelectedItem().toString());
              mystatement.setString(9, jSpinner1.getValue().toString());
              
              if(jRadioButton1.isSelected())
              {
                  mystatement.setString(10, "Yes");
              }
              else
              {
                  mystatement.setString(10, "No");
              }
              mystatement.setString(11, jComboBox4.getSelectedItem().toString());
              mystatement.setString(12, jComboBox5.getSelectedItem().toString());
              mystatement.setString(13, jComboBox6.getSelectedItem().toString());
              mystatement.setString(14, jComboBox3.getSelectedItem().toString());
              mystatement.setString(15, jTextField3.getText());
              mystatement.setString(16, String.valueOf(dis));
              mystatement.setString(17, String.valueOf(ramt));
              
              if(mystatement.executeUpdate()>0)
              {
                  JOptionPane.showMessageDialog(rootPane, "Updated Successfully");
              }
           }
      
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(rootPane, "Updation Error:"+e.getMessage());
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int column=0;
        int row=jTable1.getSelectedRow();
        ord_no=Integer.parseInt(jTable1.getValueAt(row, column).toString());
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
                    mystatement2.setString(1, String.valueOf(ord_no));
                    ResultSet myresult=mystatement2.executeQuery();
                    if(myresult.next())
                    {
                        t_amt=Double.parseDouble(myresult.getString(16));
                        dis=Double.parseDouble(myresult.getString(17));
                        amt_paid=Double.parseDouble(myresult.getString(18));
                        cpay=(amt_paid*15)/100;
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
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
