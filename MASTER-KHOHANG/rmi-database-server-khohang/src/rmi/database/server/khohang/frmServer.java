package rmi.database.server.khohang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frmServer extends javax.swing.JFrame {

    public frmServer() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtPort = new javax.swing.JTextField();
        txtDatabase = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        txtHost = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtServicePort = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btSave = new javax.swing.JButton();
        btTest = new javax.swing.JButton();
        lbTimeServer = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        lbIP = new javax.swing.JLabel();
        lbPort = new javax.swing.JLabel();
        lbTimeStart = new javax.swing.JLabel();
        btStart = new javax.swing.JButton();
        btStop = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbShow = new javax.swing.JLabel();
        lbShowRestore = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tfPath = new javax.swing.JTextField();
        btnBackup = new javax.swing.JButton();
        btnPath = new javax.swing.JButton();
        tfDTBU = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        tfSVNBU = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        tfPathRestore = new javax.swing.JTextField();
        btnDrop = new javax.swing.JButton();
        btnRestore = new javax.swing.JButton();
        btnPath1 = new javax.swing.JButton();
        label3 = new java.awt.Label();
        tfSVNRS = new javax.swing.JTextField();
        tfDTRS = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miThoat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SERVER KHO HÀNG");
        setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setName("SERVER KHO HÀNG"); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 1000));

        jPanel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N

        txtPort.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPort.setName("txtPort"); // NOI18N
        txtPort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPortKeyTyped(evt);
            }
        });

        txtDatabase.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDatabase.setName("txtDatabase"); // NOI18N

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPassword.setName("txtPassword"); // NOI18N

        txtUserName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUserName.setName("txtUserName"); // NOI18N

        txtHost.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtHost.setName("txtHost"); // NOI18N
        txtHost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHostKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Host:");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("UserName:");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Password:");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Database:");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Port:");
        jLabel5.setName("jLabel5"); // NOI18N

        txtServicePort.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtServicePort.setName("txtServicePort"); // NOI18N
        txtServicePort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPortKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Server Port:");
        jLabel6.setName("jLabel6"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtServicePort, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword)
                            .addComponent(txtUserName)
                            .addComponent(txtPort)
                            .addComponent(txtDatabase)
                            .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtServicePort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btSave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btSave.setText("Save");
        btSave.setName("btSave"); // NOI18N
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btTest.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btTest.setText("Test Connect");
        btTest.setName("btTest"); // NOI18N
        btTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTestActionPerformed(evt);
            }
        });

        lbTimeServer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbTimeServer.setText("Time System:");
        lbTimeServer.setName("lbTimeServer"); // NOI18N

        lbStatus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbStatus.setText("Server is stop ...");
        lbStatus.setName("lbStatus"); // NOI18N

        lbIP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbIP.setText("IP:");
        lbIP.setName("lbIP"); // NOI18N

        lbPort.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbPort.setText("Port:");
        lbPort.setName("lbPort"); // NOI18N

        lbTimeStart.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbTimeStart.setText("Time Start:");
        lbTimeStart.setName("lbTimeStart"); // NOI18N

        btStart.setText("Start Server");
        btStart.setName("btStart"); // NOI18N
        btStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStartActionPerformed(evt);
            }
        });

        btStop.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btStop.setText("Stop Server");
        btStop.setName("btStop"); // NOI18N
        btStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStopActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons.png"))); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btSave)
                        .addGap(28, 28, 28)
                        .addComponent(btTest)
                        .addGap(18, 18, 18)
                        .addComponent(lbTimeServer))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lbStatus))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lbIP)
                                .addGap(18, 18, 18)
                                .addComponent(lbPort))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lbTimeStart))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btStart)
                                .addGap(18, 18, 18)
                                .addComponent(btStop)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSave)
                            .addComponent(btTest)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lbTimeServer)))
                        .addGap(6, 6, 6)
                        .addComponent(lbStatus)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIP)
                            .addComponent(lbPort))
                        .addGap(6, 6, 6)
                        .addComponent(lbTimeStart)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btStart))
                            .addComponent(btStop))))
                .addGap(363, 363, 363))
        );

        jTabbedPane1.addTab("Kết Nối", jPanel1);

        jPanel2.setName("jPanel2"); // NOI18N

        jPanel3.setName("jPanel3"); // NOI18N

        lbShow.setForeground(new java.awt.Color(51, 0, 255));
        lbShow.setName("lbShow"); // NOI18N

        lbShowRestore.setForeground(new java.awt.Color(51, 0, 255));
        lbShowRestore.setName("lbShowRestore"); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Backup server Quản lý", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14))); // NOI18N
        jPanel5.setName("jPanel5"); // NOI18N

        tfPath.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        tfPath.setEnabled(false);
        tfPath.setName("tfPath"); // NOI18N

        btnBackup.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Save.png"))); // NOI18N
        btnBackup.setText("BACKUP");
        btnBackup.setName("btnBackup"); // NOI18N
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });

        btnPath.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPath.setText("Path");
        btnPath.setName("btnPath"); // NOI18N
        btnPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathActionPerformed(evt);
            }
        });

        tfDTBU.setName("tfDTBU"); // NOI18N

        label1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label1.setName("label1"); // NOI18N
        label1.setText("Server name");

        label2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setName("label2"); // NOI18N
        label2.setText("Database name");

        tfSVNBU.setName("tfSVNBU"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackup)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfPath, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfSVNBU, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDTBU, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48)
                        .addComponent(btnPath, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDTBU, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(tfSVNBU, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPath, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPath, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBackup)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Restore server Quản lý", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14))); // NOI18N
        jPanel7.setName("jPanel7"); // NOI18N

        tfPathRestore.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        tfPathRestore.setEnabled(false);
        tfPathRestore.setName("tfPathRestore"); // NOI18N

        btnDrop.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDrop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        btnDrop.setText("DROP DATABASE");
        btnDrop.setName("btnDrop"); // NOI18N
        btnDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropActionPerformed(evt);
            }
        });

        btnRestore.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRestore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reload.png"))); // NOI18N
        btnRestore.setText("RESTORE");
        btnRestore.setName("btnRestore"); // NOI18N
        btnRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestoreActionPerformed(evt);
            }
        });

        btnPath1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPath1.setText("Path");
        btnPath1.setName("btnPath1"); // NOI18N
        btnPath1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPath1ActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label3.setName("label3"); // NOI18N
        label3.setText("Server name");

        tfSVNRS.setName("tfSVNRS"); // NOI18N

        tfDTRS.setName("tfDTRS"); // NOI18N

        label4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setName("label4"); // NOI18N
        label4.setText("Database name");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSVNRS, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDTRS, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(tfPathRestore, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnPath1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnDrop)
                        .addGap(18, 18, 18)
                        .addComponent(btnRestore)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDTRS, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(tfSVNRS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPathRestore, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPath1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestore)
                    .addComponent(btnDrop))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbShowRestore, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbShow, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(lbShow)
                .addGap(177, 177, 177)
                .addComponent(lbShowRestore)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Backup & Restore", jPanel2);

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu1.setText("Hệ Thống");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenu1.setName("jMenu1"); // NOI18N

        miThoat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        miThoat.setText("Thoát");
        miThoat.setName("miThoat"); // NOI18N
        miThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miThoatActionPerformed(evt);
            }
        });
        jMenu1.add(miThoat);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Trợ giúp");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenu2.setName("jMenu2"); // NOI18N

        jMenuItem1.setText("F1");
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(912, 533));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  public void init() {
        txtHost.setText(Config.Host);
        txtUserName.setText(Config.Username);
        txtPassword.setText(Config.Password);
        txtDatabase.setText(Config.Database);
        txtPort.setText(Config.Port);
        txtServicePort.setText(Config.ServicePort);
        lbTimeServer.setVisible(false);
        btStop.setEnabled(false);
        lbIP.setVisible(false);
        lbPort.setVisible(false);
        lbTimeStart.setVisible(false);
        btStart.setEnabled(false);
    }
private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed

    GhiFile(1);
}//GEN-LAST:event_btSaveActionPerformed
    private void GhiFile(int i) {
        try {
            File out = new File("./src/rmi/database/server/khohang/config.txt");
            PrintWriter outdata = new PrintWriter(out);
            outdata.println("Host: " + txtHost.getText());
            outdata.println("Username: " + txtUserName.getText());
            outdata.println("Password: " + txtPassword.getText());
            outdata.println("Database: " + txtDatabase.getText());
            outdata.println("Port: " + txtPort.getText());
            outdata.println("ServicePort: " + txtServicePort.getText());
            outdata.close();
            Config.set(txtHost.getText(), txtUserName.getText(), txtPassword.getText(), txtDatabase.getText(), txtPort.getText(), txtServicePort.getText());
            if (i == 1) {
                JOptionPane.showMessageDialog(new JFrame(), "Quá Trình Lưu config Thành Công!", "Save Config", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Quá Trình Lưu config Thất Bại!", "Save Config", JOptionPane.ERROR_MESSAGE);
        }
    }
private void btTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTestActionPerformed
    try {
        Config.set(this.txtHost.getText(), this.txtUserName.getText(), this.txtPassword.getText(), this.txtDatabase.getText(), this.txtPort.getText(), this.txtServicePort.getText());
        Connection _con = SQLConnect.GetConnection();
        PreparedStatement ps = _con.prepareStatement("SELECT CURRENT_TIMESTAMP");
        ResultSet testtime = ps.executeQuery();
        lbTimeServer.setVisible(true);
        testtime.next();
        lbTimeServer.setText(lbTimeServer.getText() + " " + testtime.getString(1));
        JOptionPane.showMessageDialog(new JFrame(), "Kết Nối Với Cơ Sở Dữ Liệu Thành Công", "Test Connect", JOptionPane.INFORMATION_MESSAGE);
        btStart.setEnabled(true);
    } catch (Exception ex) {
        btStart.setEnabled(false);
        JOptionPane.showMessageDialog(new JFrame(), "Kết Nối Với Cơ Sở Dữ Liệu Thất Bại", "Test Connect", JOptionPane.INFORMATION_MESSAGE);
    }
}//GEN-LAST:event_btTestActionPerformed

private void btStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStartActionPerformed

    try {
        InetAddress ip = InetAddress.getLocalHost();
        PreparedStatement ps = SQLConnect.GetConnection().prepareStatement("SELECT CURRENT_TIMESTAMP");
        ResultSet rstime = ps.executeQuery();
        rstime.next();
        String time = rstime.getString(1);
        GhiFile(0);
        java.rmi.registry.LocateRegistry.createRegistry(Integer.parseInt(Config.ServicePort));
        ServerImpl.KetNoiKhoHang(Config.Host, Integer.parseInt(Config.ServicePort));
        lbIP.setVisible(true);
        lbPort.setVisible(true);
        lbTimeStart.setVisible(true);
        lbStatus.setText("Server is running ...");
        lbIP.setText(lbIP.getText() + " " + ip.getHostAddress());
        lbPort.setText(lbPort.getText() + " " + Config.ServicePort);
        lbTimeStart.setText(lbTimeStart.getText() + " " + time);

        setenable(false);
    } catch (RemoteException ex) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            PreparedStatement ps = SQLConnect.GetConnection().prepareStatement("SELECT CURRENT_TIMESTAMP");
            ResultSet rstime = ps.executeQuery();
            rstime.next();
            String time = rstime.getString(1);
            GhiFile(0);
            ServerImpl.KetNoiKhoHang(Config.Host, Integer.parseInt(Config.ServicePort));
            lbIP.setVisible(true);
            lbPort.setVisible(true);
            lbTimeStart.setVisible(true);
            lbStatus.setText("Server is running ...");
            lbIP.setText(lbIP.getText() + " " + ip.getHostAddress());
            lbPort.setText(lbPort.getText() + " " + Config.ServicePort);
            lbTimeStart.setText(lbTimeStart.getText() + " " + time);
//            btStart.setEnabled(false);
//            btStop.setEnabled(true);
//            txtServicePort.setEnabled(false);
            setenable(false);
        } catch (RemoteException ex1) {
            Logger.getLogger(frmServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex1) {
            Logger.getLogger(frmServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.net.UnknownHostException ex1) {
            Logger.getLogger(frmServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex1) {
            Logger.getLogger(frmServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    } catch (NamingException ex) {
        Logger.getLogger(frmServer.class.getName()).log(Level.SEVERE, null, ex);
    } catch (java.net.UnknownHostException ex) {
        Logger.getLogger(frmServer.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception ex) {
        Logger.getLogger(frmServer.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_btStartActionPerformed

    private void setenable(boolean b) {
        btStart.setEnabled(b);
        btStop.setEnabled(!b);
        btSave.setEnabled(b);
        btTest.setEnabled(b);
        txtServicePort.setEnabled(b);
        txtDatabase.setEnabled(b);
        txtHost.setEnabled(b);
        txtPassword.setEnabled(b);
        txtPort.setEnabled(b);
        txtUserName.setEnabled(b);
    }
private void btStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStopActionPerformed

    try {
        ServerImpl.DongKetNoiKhoHang(Config.Host, Integer.parseInt(Config.ServicePort));
        lbStatus.setText("Server is stop ...");
        btStop.setEnabled(false);
        btStart.setEnabled(true);
        lbTimeServer.setVisible(false);
        btStop.setEnabled(false);
        lbIP.setVisible(false);
        lbPort.setVisible(false);
        lbTimeStart.setVisible(false);
        lbIP.setText("IP:");
        lbPort.setText("Port:");
        lbTimeStart.setText("Time Start:");
        setenable(true);
    } catch (Exception e) {
    }
}//GEN-LAST:event_btStopActionPerformed
    public void ReadConfig() throws FileNotFoundException, IOException {
        try {
            FileInputStream in = new FileInputStream("./src/rmi/database/server/khohang/config.txt");
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);
            String[] temphost = br.readLine().split(":");
            String[] tempuser = br.readLine().split(":");
            String[] temppass = br.readLine().split(":");
            String[] tempdb = br.readLine().split(":");
            String[] tempport = br.readLine().split(":");
            String[] tempserviceport = br.readLine().split(":");
            Config.set(temphost[1].trim(), tempuser[1].trim(), temppass[1].trim(), tempdb[1].trim(), tempport[1].trim(), tempserviceport[1].trim());
        } catch (Exception e) {

        }
    }
private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    try {
        ReadConfig();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(frmServer.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(frmServer.class.getName()).log(Level.SEVERE, null, ex);
    }
    init();
}//GEN-LAST:event_formComponentShown

private void miThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miThoatActionPerformed

    int result = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát không?", "Thoát chương trình", 0, 3);
    if (result == JOptionPane.YES_OPTION) // this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    {
        this.dispose();
    }
}//GEN-LAST:event_miThoatActionPerformed

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
// TODO add your handling code here:
    if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không ?", "Question", JOptionPane.YES_NO_OPTION) != 1) {
        this.setDefaultCloseOperation(frmServer.EXIT_ON_CLOSE);
    }
}//GEN-LAST:event_formWindowClosing

private void txtPortKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPortKeyTyped
    char c = evt.getKeyChar();
    if (!Character.isDigit(c)) {
        evt.consume();
    }
    // TODO add your handling code here:
}//GEN-LAST:event_txtPortKeyTyped

private void txtHostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHostKeyTyped
    char c = evt.getKeyChar();
    if (!Character.isDigit(c) && c != '.') {
        evt.consume();
    }
    // TODO add your handling code here:
}//GEN-LAST:event_txtHostKeyTyped

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        if ("".equals(tfPath.getText()) || "".equals(tfDTBU.getText()) || "".equals(tfSVNBU.getText())) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Server & Database\nVui lòng chọn đường dẫn");
            return;
        }

        String dtbu = tfDTBU.getText();
        String svnbu = tfSVNBU.getText();
        svnbu = svnbu.replace('/', '\\');
        Process p = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec("SQLCMD -E -S " + svnbu + " -Q \"BACKUP DATABASE " + dtbu + " TO DISK='" + pathBackup + "'\"");

            int processComplete = p.waitFor();
            if (processComplete == 0) {
                JOptionPane.showMessageDialog(this, "Backup thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Backup thất bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBackupActionPerformed

    private void btnPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPathActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        try {
            File f = fc.getSelectedFile();
            pathBackup = f.getAbsolutePath();
            pathBackup = pathBackup.replace('\\', '/');
            pathBackup = pathBackup + "_" + date + ".bak";
            tfPath.setText(pathBackup);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPathActionPerformed

    private void btnDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropActionPerformed
        if ("".equals(tfSVNRS.getText()) || "".equals(tfDTRS.getText())) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Server & Database");
            return;
        }
        String dtrs = tfDTRS.getText();
        String svrs = tfSVNRS.getText();
        svrs = svrs.replace('/', '\\');
        Process p = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec("sqlcmd -S " + svrs + " -U sa -P 12345 -Q \"drop database " + dtrs + "\"");

            int processComplete = p.waitFor();
            if (processComplete == 0) {
                JOptionPane.showMessageDialog(this, "Drop database thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Drop database thất bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDropActionPerformed

    private void btnRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestoreActionPerformed
        if ("".equals(tfSVNRS.getText()) || "".equals(tfDTRS.getText())) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Server & Database");
            return;
        }

        if ("".equals(tfPathRestore.getText()) || "".equals(tfSVNRS.getText()) || "".equals(tfDTRS.getText())) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn đường dẫn \n Vui lòng nhập Server & Database");
            return;
        }
        String dtrs = tfDTRS.getText();
        String svrs = tfSVNRS.getText();
        svrs = svrs.replace('/', '\\');
        Process p = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec("SQLCMD -S " + svrs + " -U sa -P 12345 -Q \"restore database " + dtrs + " from disk='" + pathRestore + "' with stats=10\"");

            int processComplete = p.waitFor();
            if (processComplete == 0) {
                JOptionPane.showMessageDialog(this, "Restore thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Restore thất bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRestoreActionPerformed
    String pathBackup = null;
    String pathRestore = null;
    String filename;
    private void btnPath1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPath1ActionPerformed

        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        try {
            File f = fc.getSelectedFile();
            pathRestore = f.getAbsolutePath();
            pathRestore = pathRestore.replace('\\', '/');

            tfPathRestore.setText(pathRestore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPath1ActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmServer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JButton btStart;
    private javax.swing.JButton btStop;
    private javax.swing.JButton btTest;
    private javax.swing.JButton btnBackup;
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnPath;
    private javax.swing.JButton btnPath1;
    private javax.swing.JButton btnRestore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JLabel lbIP;
    private javax.swing.JLabel lbPort;
    private javax.swing.JLabel lbShow;
    private javax.swing.JLabel lbShowRestore;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTimeServer;
    private javax.swing.JLabel lbTimeStart;
    private javax.swing.JMenuItem miThoat;
    private javax.swing.JTextField tfDTBU;
    private javax.swing.JTextField tfDTRS;
    private javax.swing.JTextField tfPath;
    private javax.swing.JTextField tfPathRestore;
    private javax.swing.JTextField tfSVNBU;
    private javax.swing.JTextField tfSVNRS;
    private javax.swing.JTextField txtDatabase;
    private javax.swing.JTextField txtHost;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtServicePort;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
