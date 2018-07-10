package localadaptationsource;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.CommandCall;
import com.ibm.as400.access.ErrorCompletingRequestException;
import java.awt.Component;
import java.awt.Desktop;
import java.beans.PropertyVetoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Interface extends javax.swing.JFrame {

    private LoadData data = new LoadData();
    private String[] comboList = data.LoadMarket();
    private String[] comboLibList = data.LoadLibrary();
    private String machine, login, pass, mach, lib1, lib2, lib3, lib4, cc, projekt;
    private int index;

    private String path45 = ("/QSYS.LIB/LADPTTOOL.LIB/LPROJ.PGM");
    private String path1 = ("/QSYS.LIB/LADPTTOOL.LIB/CRTRESTAB.PGM");
    private String path2 = ("/QSYS.LIB/LADPTTOOL.LIB/LSRC.PGM");
    private String path3 = ("/QSYS.LIB/LADPTTOOL.LIB/LOBJ.PGM");
    private String path4 = ("/QSYS.LIB/LADPTTOOL.LIB/LCMP.PGM");
    private String path5 = ("/QSYS.LIB/LADPTTOOL.LIB/LREF.PGM");
    private String path6 = ("/QSYS.LIB/LADPTTOOL.LIB/LREFSQL.PGM");
    private String path7 = ("/QSYS.LIB/LADPTTOOL.LIB/LREFSQLTYP.PGM");
    private String path8 = ("/QSYS.LIB/LADPTTOOL.LIB/GETDISCOBJ.PGM");
    private String path9 = ("/QSYS.LIB/LADPTTOOL.LIB/GETRESULTX.PGM");
    private String path10 = ("/QSYS.LIB/LADPTTOOL.LIB/GETRESULT3.PGM");
    String[] tab = new String[1000];
    String[] tab1 = new String[1000];

    public Interface() throws FileNotFoundException {
        initComponents();
        setTitle("Local Adaptation Tool");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        buttonGroup5 = new javax.swing.ButtonGroup();
        rightScroller = new javax.swing.JScrollPane();
        jLabel8 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        leftScroller = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        bLoadData = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        type = new javax.swing.JCheckBox();
        name = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bAddMarkets = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        bLoadMarketsLIst = new javax.swing.JButton();
        bRemove = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        trash = new javax.swing.JCheckBox();
        prod = new javax.swing.JRadioButton();
        test = new javax.swing.JRadioButton();
        bRmvAll = new javax.swing.JButton();
        bAddAll = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jProj = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        edit1Button = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        label1.setText("label1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "LIST OF AVAILABLE", "MARKETS" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        leftScroller.setViewportView(jScrollPane1);

        bLoadData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bLoadData.setText("Start Program");
        bLoadData.setToolTipText("Start Program");
        bLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoadDataActionPerformed(evt);
            }
        });

        bExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bExit.setText("Exit");
        bExit.setToolTipText("Exit Program");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        type.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        type.setText("Type");

        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setSelected(true);
        name.setText("Name");
        name.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("INSERT PROJECT FOR ESTIMATION RAPORT:");

        bAddMarkets.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bAddMarkets.setText("Add Market");
        bAddMarkets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddMarketsActionPerformed(evt);
            }
        });

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "CHOOSEN MARKETS" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        bLoadMarketsLIst.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bLoadMarketsLIst.setText("Load Markets");
        bLoadMarketsLIst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoadMarketsLIstActionPerformed(evt);
            }
        });

        bRemove.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bRemove.setText("Remove Market");
        bRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoveActionPerformed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 51, 51));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setLabelFor(bAddMarkets);
        jLabel.setText("Please wait this may take a while ...");
        jLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 51), 1, true));
        jLabel.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Would you like to delete trash after all?");

        trash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        trash.setText("YES");

        buttonGroup5.add(prod);
        prod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prod.setText("Production");

        buttonGroup5.add(test);
        test.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        test.setSelected(true);
        test.setText("Test");

        bRmvAll.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bRmvAll.setText("Remove ALL");
        bRmvAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRmvAllActionPerformed(evt);
            }
        });

        bAddAll.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bAddAll.setText("Select ALL");
        bAddAll.setMinimumSize(new java.awt.Dimension(107, 23));
        bAddAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddAllActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("SELECT OPTION TO RUN THE PROGRAM");

        jProj.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jProj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jProj.setText("R132");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("DO YOU WANT TO MARGE PROGRAMS <br />\nADDITIONAL WITH TYPE OPTION?");

        edit1Button.setText("Edit Configuration File");
        edit1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit1ButtonActionPerformed(evt);
            }
        });

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bLoadData, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jProj, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(trash)
                                .addGap(101, 101, 101))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(bLoadMarketsLIst)
                                .addGap(18, 18, 18)
                                .addComponent(leftScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bAddAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bRmvAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bRemove, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bAddMarkets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(test)
                                .addGap(18, 18, 18)
                                .addComponent(prod)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(name)
                                .addGap(33, 33, 33)
                                .addComponent(type)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edit1Button)
                                .addGap(71, 71, 71)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bRemove)
                                        .addGap(61, 61, 61)
                                        .addComponent(bAddAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bRmvAll)
                                        .addGap(12, 12, 12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bAddMarkets)
                                    .addComponent(leftScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bLoadMarketsLIst)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(edit1Button))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jProj, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bLoadData, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trash))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name)
                        .addComponent(type)
                        .addComponent(prod)
                        .addComponent(test)))
                .addGap(30, 30, 30))
        );

        bLoadData.getAccessibleContext().setAccessibleName("bLoadData");
        bExit.getAccessibleContext().setAccessibleDescription("");
        jLabel.setVisible(false);
        jLabel6.getAccessibleContext().setAccessibleName("INSERT THE NAME OF PROJECT (e.g. R132)");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoadDataActionPerformed
        Component frame = null;
        //Progress text
        jLabel.setVisible(true);

        login = JOptionPane.showInputDialog(" Enter your login :  \n (eg. A023028)  ");
        pass = JOptionPane.showInputDialog(" Enter your Password for the selected market : ");
        //  pass = JOptionPane.JPasswordField();

        for (int i = 0; i < dim2.getSize(); i++) {
            for (int j = 0; j < data.marketslist.size(); j++) {
                machine = dim2.elementAt(i).toString();
                //  System.out.println("\nmaszyna " +machine);
                //   System.out.println(data.marketslist.get(j).name);
                if (data.marketslist.get(j).apk.equals(machine)) {
                    //       try {
                    index = Integer.parseInt(data.marketslist.get(j).pk);
                    index = index - 1;
                    //  System.out.println("index " + index);
//ustawianie loginu

                    String login1;
                    if (prod.isSelected()) {
                        login1 = data.marketslist.get(index).prod_prf;
                        mach = data.marketslist.get(index).prod;
                    } else {
                        login1 = data.marketslist.get(index).test_prf;
                        mach = data.marketslist.get(index).test;
                    }
                    String login2 = login;
                    login = login + login1;

                    System.out.println("\nWybrano " + machine + " zalogowano " + login);

                    String str = machine;
                    cc = str.substring(5, 7);
                    if ("VIPS_TR_ASC".equals(machine)) {
                        cc = str.substring(5, 9);
                    }
//Logowanie do Iseries

                    AS400 system = new AS400(mach, login, pass);

                    try {
                        if (system.validateSignon(login, pass)) {
                        }

                    } catch (AS400SecurityException ex) {
                        JOptionPane.showMessageDialog(frame, "INVALID PASSWORD");
                        pass = JOptionPane.showInputDialog(" Enter your Password for the selected market : ");
                    } catch (IOException ex) {
                        Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    system.setPassword(pass);

                    try {

                        Connection Load = new Connection(mach, login, pass);

                    } catch (Exception e) {

                    }

                    System.out.println("Wywołane connection !");

                    ProgCall program = new ProgCall();

//Tworzenie biblioteki na wynik
                    CommandCall command = new CommandCall(system);
                    try {
                        //tylko na poczatku ACHTUNG !!!!!!!!
                        if (command.run("CHKOBJ OBJ(QSYS/LADPT_" + cc + ") OBJTYPE(*LIB)")) {
                             System.out.println("nie Skasowano bilbioteke LADPT_" + cc);
                            // BIBLIOTEKA ISTNIEJE
                            // TRZEBA JA USUNAC
                            /*try {
                                command.run("RMVLIBLE LIB(LADPT_" + cc + ")");
                            } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                                JOptionPane.showMessageDialog(frame, "Error with RMVLIBLE");
                                e.printStackTrace();
                            }
                            try {
                                command.run("DLTLIB LIB(LADPT_" + cc + ")");
                            } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                                JOptionPane.showMessageDialog(frame, "Error with DLTLIB");
                                e.printStackTrace();
                            }
                            System.out.println("Skasowano bilbioteke LADPT_" + cc);
                            // NIE ISTNIEJE WIEC TWORZYMY
                            try {
                                command.run("CRTLIB LIB(LADPT_" + cc + ")");
                            } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                                JOptionPane.showMessageDialog(frame, "Error with creating library");
                                e.printStackTrace();
                            }
                            System.out.println("utworzono bilbioteke LADPT_" + cc);
                            // DODAJEMY JA NA LIBLISTE
                            try {
                                command.run("ADDLIBLE LADPT_" + cc);
                            } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                                JOptionPane.showMessageDialog(frame, "Error with Addlible library");
                                e.printStackTrace();
                            }

                        }*/} else {
                            // NIE ISTNIEJE WIEC TWORZYMY
                            try {
                                command.run("CRTLIB LIB(LADPT_" + cc + ")");
                            } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                                JOptionPane.showMessageDialog(frame, "Error with creating library");
                                e.printStackTrace();
                            }
                            System.out.println("Utworzono bilbioteke ! LADPT_" + cc);
                            // DODAJEMY JA NA LIBLISTE
                            try {
                                command.run("ADDLIBLE LADPT_" + cc);
                            } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                                JOptionPane.showMessageDialog(frame, "Error with ADDLIBLE");
                                e.printStackTrace();
                            }

                        }

                    } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                        JOptionPane.showMessageDialog(frame, "Error with creating library");
                        e.printStackTrace();
                    }

                    // Program 4,5
                    projekt = jProj.getText();
                    try {
                        program.ProgCallLProj(mach, projekt, cc, login, pass, path45);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(frame, "Error with program LPROJ");
                    }

//call program 1
                    try {
                        program.ProgCallCrtResTab(mach, cc, login, pass, path1);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(frame, "Error with program CRTRESTAB");
                    }

//call Program 2
                    if (!prod.isSelected()) {
                        for (int z = 0; z < comboLibList.length; z++) {
                            int libNumber = Integer.parseInt(data.librarylist.get(z).pk);
                            libNumber = libNumber - 1;
                            if (libNumber == index) {

                                if ("LSRC".equals(data.librarylist.get(z).type)) {

                                    lib1 = data.librarylist.get(z).library;

                                    lib2 = data.librarylist.get(z).file;

                                    System.out.println("library " + lib1 + "   file: " + lib2 + " CC : " + cc);
                                    try {
                                        program.ProgCallLSrc(mach, lib1, lib2, cc, login, pass, path2);
                                    } catch (Exception e) {
                                        JOptionPane.showMessageDialog(frame, "Error with program LSRC");
                                    }
                                }
                            }
                        }
                    }
//Call program 3
                    for (int z = 0; z < comboLibList.length; z++) {
                        int libNumber = Integer.parseInt(data.librarylist.get(z).pk);
                        libNumber = libNumber - 1;
                        if (libNumber == index) {
                            if ("LOBJ".equals(data.librarylist.get(z).type)) {

                                lib1 = data.librarylist.get(z).library;
                                try {
                                    program.ProgCallLObj(mach, lib1, cc, login, pass, path3);
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(frame, "Error with program LOBJ");
                                }
                            }
                        }
                    }

//Call program 4
                    for (int z = 0; z < comboLibList.length; z++) {
                        int libNumber = Integer.parseInt(data.librarylist.get(z).pk);
                        libNumber = libNumber - 1;
                        if (libNumber == index) {

                            if ("LCMP".equals(data.librarylist.get(z).type)) {
                                lib1 = data.librarylist.get(z).library;

                                for (int d = 0; d < comboLibList.length; d++) {
                                    int pom = Integer.parseInt(data.librarylist.get(d).pk);
                                    pom = pom - 1;
                                    if ("LSRC".equals(data.librarylist.get(d).type) && pom == index && !data.librarylist.get(d).library.equals(data.librarylist.get(d - 1).library)) {
                                        //    if (prod.isSelected() && "TP".equals(data.librarylist.get(d).test_prod)) {
                                        if (prod.isSelected()) {
                                            if ("TP".equals(data.librarylist.get(d).test_prod)) {
                                                lib2 = data.librarylist.get(d).library;
                                                try {
                                                    program.ProgCallLcmp(mach, lib1, lib2, cc, login, pass, path4);
                                                } catch (Exception e) {
                                                    JOptionPane.showMessageDialog(frame, "Error with program LCMP");
                                                }
                                            }
                                        } else if (test.isSelected()) {
                                            lib2 = data.librarylist.get(d).library;
                                            //    System.out.println("library     file: " + lib1 + "   " + lib2 + " CC : " + cc);

                                            try {
                                                program.ProgCallLcmp(mach, lib1, lib2, cc, login, pass, path4);
                                            } catch (Exception e) {
                                                JOptionPane.showMessageDialog(frame, "Error with program LCMP");
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }

// Program 5
                    for (int z = 0; z < comboLibList.length; z++) {
                        int libNumber = Integer.parseInt(data.librarylist.get(z).pk);
                        libNumber = libNumber - 1;
                        if (libNumber == index) {
                            if ("LREF".equals(data.librarylist.get(z).type)) {
                                lib1 = data.librarylist.get(z).library;
                                try {
                                    program.ProgCallLRef(mach, lib1, cc, login, pass, path5);
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(frame, "Error with program LREF");
                                }
                            }
                        }
                    }
// PROGRAM 6
                    if (type.isSelected()) {
                        System.out.println("Selected 'type' option ");
                        try {
                            program.ProgCallLRefSqlTyp(mach, cc, login, pass, path7);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(frame, "Error with program LREFSQLTYP");
                        }
                    } else {
                        System.out.println("Selected  'name' option ");
                        try {
                            program.ProgCallLRefSql(mach, cc, login, pass, path6);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(frame, "Error with program LREFSQL");
                        }
                    }
// Program 7
                    try {
                        program.ProgCallGetDiscObj(mach, cc, login, pass, path8);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(frame, "Error with program GETDISCOBJ");
                    }
                    try {
                        command.run("RUNSQLSTM SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(GETATRUDF) COMMIT(*NONE)");
                        System.out.println(" SQL 1 Wykonany !");
                    } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException ex) {
                        JOptionPane.showMessageDialog(frame, "Error with RUNSQLSTM GETATRUDF");
                        Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        command.run("RUNSQLSTM SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(GETDETUDF) COMMIT(*NONE)");
                        System.out.println(" SQL 2 Wykonany !");
                    } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException ex) {
                        JOptionPane.showMessageDialog(frame, "Error with RUNSQLSTM GETDETUDF");
                        Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                    }
// Program 8
                    if ("VF03.it.volvo.se".equals(mach)) {
                        try {

                            program.ProgCallGetResultX(mach, cc, login, pass, path10);
                        } catch (AS400SecurityException | IOException e) {
                            JOptionPane.showMessageDialog(frame, "Error with program GETRESULTX3");
                        }
                    } else {
                        try {

                            program.ProgCallGetResultX(mach, cc, login, pass, path9);
                        } catch (AS400SecurityException | IOException e) {
                            JOptionPane.showMessageDialog(frame, "Error with program GETRESULTX");
                        }
                    }
//DOWNLOAD      

                    if (test.isSelected()) {
                        if ("VF03.it.volvo.se".equals(mach)) {
                            try {
                                Download download = new Download(mach, cc, machine, login, pass, "a");
                            } catch (AS400SecurityException ex) {
                                JOptionPane.showMessageDialog(frame, "Error with program Downloading outfiles");
                                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                Download download = new Download(mach, cc, machine, login, pass);
                            } catch (AS400SecurityException ex) {
                                JOptionPane.showMessageDialog(frame, "Error with program Downloading outfiles");
                                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
// DO POPRAWY
                        String login3 = login2 + "V1";
                        try {
                            Connection send = new Connection("VF00.it.volvo.se", login3, pass, "a");
                        } catch (AS400SecurityException ex) {
                            JOptionPane.showMessageDialog(frame, "Error with program Downloading LRES3");
                            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else if (prod.isSelected()) {
                        try {
                            Download download = new Download(mach, cc, machine, login, pass, 1);
                        } catch (AS400SecurityException ex) {
                            JOptionPane.showMessageDialog(frame, "Error with program Downloading outfiles");
                            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

/// DISCONNECT
                    system.disconnectAllServices();
                    System.out.println("  Disconnect  ");

                    if (trash.isSelected()) {
                        try {
                            //USUNAC biblioteke
                            command.run("RMVLIBLE LIB(LADPT_" + cc + ")");
                        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                            JOptionPane.showMessageDialog(frame, "Error with RMVLIBLE");
                            e.printStackTrace();
                        }
                        try {
                            command.run("DLTLIB LIB(LADPT_" + cc + ")");
                        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                            JOptionPane.showMessageDialog(frame, "Error with DLTLIB ");
                            e.printStackTrace();
                        }
                        try {
                            //USUNAC biblioteke
                            command.run("RMVLIBLE LIB(LADPTTOOL)");
                        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                            JOptionPane.showMessageDialog(frame, "Error with RMVLIBLE LADPTTOOL");
                            e.printStackTrace();
                        }
                        try {
                            command.run("DLTLIB LIB(LADPTTOOL)");
                            System.out.println(" Skasowano bilbioteke LADPT_" + cc + " i  LADPTTOOL ");
                        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException ex) {
                            JOptionPane.showMessageDialog(frame, "Error with DLTLIB LADPTTOOL");
                            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    login = login2;
                }
            }
        }

        jLabel.setVisible(false);

    }//GEN-LAST:event_bLoadDataActionPerformed
//EXIT program
    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        dispose();
    }//GEN-LAST:event_bExitActionPerformed

    //Lista wybranych marketów
    DefaultListModel dim2 = new DefaultListModel();
    private void bAddMarketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddMarketsActionPerformed

        dim2.addElement(jList1.getSelectedValue());

        jList2.setModel(dim2);
    }//GEN-LAST:event_bAddMarketsActionPerformed

    private void bLoadMarketsLIstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoadMarketsLIstActionPerformed
        DefaultListModel dim = new DefaultListModel();

        for (String comboList1 : comboList) {
            dim.addElement(comboList1);
        }
        jList1.setModel(dim);
    }//GEN-LAST:event_bLoadMarketsLIstActionPerformed

    private void bRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoveActionPerformed
        if (!jList2.isSelectionEmpty()) {
            dim2.remove(jList2.getSelectedIndex());
        }
    }//GEN-LAST:event_bRemoveActionPerformed

    private void bAddAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddAllActionPerformed
        for (String comboList1 : comboList) {
            dim2.addElement(comboList1);
        }
        jList2.setModel(dim2);
    }//GEN-LAST:event_bAddAllActionPerformed

    private void bRmvAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRmvAllActionPerformed
        dim2.removeAllElements();
    }//GEN-LAST:event_bRmvAllActionPerformed

    private void edit1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit1ButtonActionPerformed

        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("txt documents", "txt");
            fileChooser.setFileFilter(txtFilter);
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {

                File configFile = fileChooser.getSelectedFile();
                String configFileName = configFile.getAbsolutePath();
                System.out.println("Selected file: " + configFileName);
                
                try {
                    Desktop.getDesktop().open(new File(configFileName));

                } catch (IOException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        
    }//GEN-LAST:event_edit1ButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Interface().setVisible(true);

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddAll;
    private javax.swing.JButton bAddMarkets;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bLoadData;
    private javax.swing.JButton bLoadMarketsLIst;
    private javax.swing.JButton bRemove;
    private javax.swing.JButton bRmvAll;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton edit1Button;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JTextField jProj;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private javax.swing.JScrollPane leftScroller;
    private javax.swing.JCheckBox name;
    private javax.swing.JRadioButton prod;
    private javax.swing.JScrollPane rightScroller;
    private javax.swing.JRadioButton test;
    private javax.swing.JCheckBox trash;
    private javax.swing.JCheckBox type;
    // End of variables declaration//GEN-END:variables

}
