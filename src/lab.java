
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.JTextComponent;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pratham Goel
 */
public class lab extends javax.swing.JFrame {
    
    String fone="Arial";
    int size=15;
    Graphics g1;
    private Color currentColor = Color.RED;
    static int nextposti = 0;
    static int intipos = 0;
    String intial = "";

    /**
     * Creates new form lab
     */
    
    public lab() {
     
     
      
        initComponents();
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor --By Pratham ");
        setBounds(new java.awt.Rectangle(0, 0, 1000, 1000));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 0));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("B");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("I");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("U");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton4.setText("S");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("LEFT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("CENTRE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("RIGHT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("JUSTIFIED");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Arial Black", "Arial Narrow", "Calibri", "Cambria", "Courier New", "Comic Sans MS", "Dialog", "Georgia", "Helevetica", "Lucida", "Monospaced", "SignPainter", "Sans", "Monospaced", "SignPainter", "Tahoma", "Times New Roman", "Verdana", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", "65", "70", "75", "80", "85", "90", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Find");

        jLabel2.setText("Replace");

        jButton9.setText("Find All");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Find Next");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setText("Replace All");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton11.setText("Replace");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Sketchpad");

        jButton13.setText("RECTANGLE");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("OVAL");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("LINE");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("TRAIANGLE");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("PENTAGON");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("CLEAR");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jTextPane2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextPane2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTextPane2MouseDragged(evt);
            }
        });
        jTextPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextPane2MouseClicked(evt);
            }
        });
        jTextPane2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextPane2KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTextPane2);

        jLabel4.setText("WORD COUNT:-");

        jLabel5.setText("CHARACTER COUNT:-");

        jLabel6.setText("WORD COUNT:-");

        jLabel7.setText("ENTIRE DOCUMENT");

        jLabel8.setText("SELECTED DOCUMENT");

        jLabel9.setText("CHARACTER COUNT:-");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        jButton19.setText("Uppercase");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("Lowercase");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jMenuBar1.setPreferredSize(new java.awt.Dimension(66, 45));

        jMenu1.setText("File");

        jMenuItem1.setText("New");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Open");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setText("Cut");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Copy");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Paste");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem7.setText("Google");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Dictionary");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton5)
                        .addGap(0, 0, 0)
                        .addComponent(jButton6)
                        .addGap(0, 0, 0)
                        .addComponent(jButton7)
                        .addGap(0, 0, 0)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(398, 398, 398)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addGap(948, 948, 948)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)
                        .addComponent(jButton18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(280, 280, 280)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jButton11)
                                .addGap(0, 0, 0)
                                .addComponent(jButton12)
                                .addGap(0, 0, 0)
                                .addComponent(jButton19)
                                .addGap(0, 0, 0)
                                .addComponent(jButton20))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(619, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1))
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        jTextPane2.setText("");
    }                                          

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JFileChooser chooser = new JFileChooser(); 
        chooser.showSaveDialog(null);
        File f = new File(chooser.getSelectedFile().getAbsolutePath());
       FileWriter fw;
        try {
            fw =new FileWriter(f);
            BufferedWriter bw =new BufferedWriter(fw);
            bw.write(jTextPane2.getText());
            bw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(lab.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        
    }                                          

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JFileChooser chooser = new JFileChooser(); 
        chooser.showOpenDialog(null);
        File f = new File(chooser.getSelectedFile().getAbsolutePath());
       FileReader fr;
        try {
            fr =new FileReader(f);
            BufferedReader bw =new BufferedReader(fr);
            String s="";
            String data;
            while((data=bw.readLine())!=null){
                s=s+data;
            }
            jTextPane2.setText(s);
            bw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(lab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                          

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    StyledDocument doc = (StyledDocument) jTextPane2.getDocument();
    int selEnd = jTextPane2.getSelectionEnd();
    int selStart = jTextPane2.getSelectionStart();
    if (selStart == selEnd) {
      return;
    }
    Element element = doc.getCharacterElement(selStart);
    AttributeSet as = element.getAttributes();

    MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());
    StyleConstants.setItalic(asNew, !StyleConstants.isItalic(as));
    doc.setCharacterAttributes(selStart, jTextPane2.getSelectedText()
        .length(), asNew, true);
    
    
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 StyledDocument doc = (StyledDocument) jTextPane2.getDocument();
    int selectionEnd = jTextPane2.getSelectionEnd();
    int selectionStart = jTextPane2.getSelectionStart();
    if (selectionStart == selectionEnd) {
      return;
    }
    Element element = doc.getCharacterElement(selectionStart);
    AttributeSet as = element.getAttributes();

    MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());
    StyleConstants.setUnderline(asNew, !StyleConstants.isUnderline(as));
    doc.setCharacterAttributes(selectionStart, jTextPane2.getSelectedText()
        .length(), asNew, true);        
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            String s = jTextPane2.getText();
            jTextPane2.setText("");

            StyledDocument doc = jTextPane2.getStyledDocument();
            SimpleAttributeSet one = new SimpleAttributeSet();
            StyleConstants.setAlignment(one, StyleConstants.ALIGN_JUSTIFIED);
            doc.setParagraphAttributes(0, doc.getLength(), one, false);
        try {
            doc.insertString(0, s, one);
        } catch (BadLocationException ex) {
            Logger.getLogger(lab.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
           String s = jTextPane2.getText();
            jTextPane2.setText("");

            StyledDocument doc = jTextPane2.getStyledDocument();
            SimpleAttributeSet right = new SimpleAttributeSet();
            StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
            doc.setParagraphAttributes(0, doc.getLength(), right, false);
        try {
            doc.insertString(0, s, right);
        } catch (BadLocationException ex) {
            Logger.getLogger(lab.class.getName()).log(Level.SEVERE, null, ex);
        }
            


    
    }                                        

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String font = (String)jComboBox1.getSelectedItem();
        
        Font f = new Font(font,Font.PLAIN,size);

        if(jTextPane2.getSelectedText()==null){
            jTextPane2.setFont(f);
        }else{

            StyledDocument doc = (StyledDocument) jTextPane2.getDocument();
            int selEnd = jTextPane2.getSelectionEnd();
            int selStart = jTextPane2.getSelectionStart();

            Element elements = doc.getCharacterElement(selStart);
            AttributeSet as =  elements.getAttributes();

            MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());
            StyleConstants.setFontFamily(asNew, font);
            doc.setCharacterAttributes(selStart,jTextPane2.getSelectedText()
                    .length(), asNew, true);
        }
        fone=font;
        
    }                                          

    


    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       String tota= jTextPane2.getText();
       String s=jTextField1.getText();
       if(s.equals("")){
           JOptionPane.showMessageDialog(this,"Find field is empty");
       }
       else{
            Highlighter h = jTextPane2.getHighlighter();
        h.removeAllHighlights();
        
            HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.ORANGE);
            
       
        if(tota.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please enter the word to be searched");
        }
       
        
            try{

            
            Document doc = jTextPane2.getDocument();
            String text = doc.getText(0, doc.getLength());
            int position = 0;

            while((position = text.toUpperCase().indexOf(s.toUpperCase(),position))>=0){

                h.addHighlight(position, position+s.length(), painter);
                position += s.length();
            }


        }catch(BadLocationException e){
                System.out.println(e.getMessage());

        }
       }
       
      

    }                                        

   

    
    
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         
        int selEnd = jTextPane2.getSelectionEnd();
    int selStart = jTextPane2.getSelectionStart();
    
       String text = jTextPane2.getText().toString();
      
       String inti=jTextPane2.getText();
           
            StringBuilder string = new StringBuilder(text);
            if(jTextField2.getText().equals("")||jTextPane2.getSelectedText()==null){
                jTextPane2.setText(inti);
            }
            else{
                String replacing= jTextField2.getText().toString();
            string.replace(selStart, selEnd, replacing);
           
           JOptionPane.showMessageDialog(rootPane, selStart);
            jTextPane2.setText(string.toString());
            }
           
 
         
    }                                         

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        jTextPane2.cut();
    }                                          

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        jTextPane2.copy();
    }                                          

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        jTextPane2.paste();
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            StyledDocument doc = (StyledDocument) jTextPane2.getDocument();
    int selEnd = jTextPane2.getSelectionEnd();
    int selStart = jTextPane2.getSelectionStart();
    if (selStart == selEnd) {
      return;
    }
    Element element = doc.getCharacterElement(selStart);
    AttributeSet as = element.getAttributes();

    MutableAttributeSet mu = new SimpleAttributeSet(as.copyAttributes());
    StyleConstants.setBold(mu, !StyleConstants.isBold(as));
    doc.setCharacterAttributes(selStart, jTextPane2.getSelectedText().length(), mu, true);
    
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String s = jComboBox2.getSelectedItem().toString();
        
        int selsize = Integer.parseInt(s);

        StyledDocument doc = (StyledDocument) jTextPane2.getDocument();
        int selectionEnd = jTextPane2.getSelectionEnd();
        int selectionStart = jTextPane2.getSelectionStart();


        Element element = doc.getCharacterElement(selectionStart);
        AttributeSet as =  element.getAttributes();

        if(selectionEnd == selectionStart){
            Font newFonts = new Font(fone,Font.PLAIN,selsize);
            jTextPane2.setFont(newFonts);
            return;
        }

        MutableAttributeSet asNew = new SimpleAttributeSet(as.copyAttributes());
        StyleConstants.setFontSize(asNew, selsize);
        doc.setCharacterAttributes(selectionStart,jTextPane2.getSelectedText()
                .length(), asNew, true);

        
        size=selsize;
    }                                          
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextPane2.getSelectedText();
            
            String s = jTextPane2.getText();
            jTextPane2.setText("");

            StyledDocument doc = jTextPane2.getStyledDocument();
            SimpleAttributeSet left = new SimpleAttributeSet();
            StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT);
            doc.setParagraphAttributes(0, doc.getLength(), left, false);
            
        try {
            doc.insertString(0, s, left);
        } catch (BadLocationException ex) {
            Logger.getLogger(lab.class.getName()).log(Level.SEVERE, null, ex);
        }
            

    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        String s =jTextPane2.getText();
        jTextPane2.setText("");

        StyledDocument doc = jTextPane2.getStyledDocument();
        SimpleAttributeSet cen = new SimpleAttributeSet();
        StyleConstants.setAlignment(cen, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), cen, false);
        
        
        
        try {
            doc.insertString(0, s, cen);
        } catch (BadLocationException ex) {
            Logger.getLogger(lab.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }                                        

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        JPanel jPanel2 = new javax.swing.JPanel(){
             protected void paintComponent(Graphics g)
            {
                //a circle with current color has been painted
                super.paintComponents(g);
                g1 = g;
                g.setColor(currentColor);
                
                g.drawRect(90, 90, 300, 100);
                
            }
        };  
         jPanel2.setBackground(new java.awt.Color(102, 102, 102));
         
        jPanel2.setLayout(null);
        
        jPanel1.add(jPanel2);
        jPanel2.setBounds(157, 115, 500, 315);
        repaint();
            
       
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         JPanel jPanel2 = new javax.swing.JPanel(){
             protected void paintComponent(Graphics g)
            {
                //a circle with current color has been painted
                super.paintComponents(g);
                g1 = g;
                g.setColor(currentColor);
                
                g.drawOval(90, 90, 200, 100);
                
            }
        };  
         jPanel2.setBackground(new java.awt.Color(102, 102, 102));
         
        jPanel2.setLayout(null);
        
        jPanel1.add(jPanel2);
        jPanel2.setBounds(157, 115, 500, 315);
            
       repaint();
                         
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         
         jPanel1.removeAll();
        jPanel1.revalidate();
        repaint();
        
        
         
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       JPanel jPanel2 = new javax.swing.JPanel(){
             protected void paintComponent(Graphics g)
            {
                //a circle with current color has been painted
                super.paintComponents(g);
                g1 = g;
                g.setColor(currentColor);
                g.drawLine(90,90, 500, 500);
                
                
            }
        };  
         jPanel2.setBackground(new java.awt.Color(102, 102, 102));
         
        jPanel2.setLayout(null);
        
        jPanel1.add(jPanel2);
        jPanel2.setBounds(157, 115, 500, 315);
            
       repaint();
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        JPanel jPanel2 = new javax.swing.JPanel(){
             protected void paintComponent(Graphics g)
            {
                //a circle with current color has been painted
                super.paintComponents(g);
                g1 = g;
                g.setColor(currentColor);
                int[]x={0,150,300};
                int[]y={200,0,200};
                
                g.drawPolygon(x,y,3);
                
            }
        };  
         jPanel2.setBackground(new java.awt.Color(102, 102, 102));
         
        jPanel2.setLayout(null);
        
        jPanel1.add(jPanel2);
        jPanel2.setBounds(157, 115, 500, 315);
            
       repaint();
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        JPanel jPanel2 = new javax.swing.JPanel(){
             protected void paintComponent(Graphics g)
            {
                //a circle with current color has been painted
                super.paintComponents(g);
                g1 = g;
                g.setColor(currentColor);
                
                Polygon p = new Polygon();
    for (int i = 0; i < 5; i++)
      p.addPoint((int) (100 + 50 * Math.cos(i * 2 * Math.PI / 5)),
          (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 5)));

    g.drawPolygon(p);
                
            }
        };  
         jPanel2.setBackground(new java.awt.Color(102, 102, 102));
         
        jPanel2.setLayout(null);
        
        jPanel1.add(jPanel2);
        jPanel2.setBounds(157, 115, 500, 315);
            
       repaint();
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
            String s=jTextField1.getText();
            String y=jTextField2.getText();
            String tot=jTextPane2.getText();
           
            if(s.equals("")||y.equals("")){
                
                jTextPane2.setText(tot);
            }
            else{
             tot=tot.replaceAll(s, y);
            jTextPane2.setText(tot);
    }
            
    }                                         

    private void jTextPane2MouseClicked(java.awt.event.MouseEvent evt) {                                        
        
        String s;
       

        if(jTextPane2.getSelectedText()==null){
            s = jTextPane2.getText();
        }else{
            s = jTextPane2.getSelectedText();
            
        }

        //Variables declaration
        int white = 0;
        int words = 0;
        int chara = 0;

        int check=0;
        if(s.isEmpty()){
            words=0;
            chara=0;
        }else{

            String[] s1 = s.split(" ");

            for(String trav :s1){

                String[] newLine = trav.split("\n");
                if(newLine.length != 1){
                    check=1;
                    for(String line:newLine){
                        if(!line.equals("")){
                            words++;
                        }
                        chara = chara + line.length();
                    }

                }

                if(check==0){
                    words++;
                    chara = chara + trav.length();
                }

                check=0;


            }


        }
                jLabel9.setText("CHARACTER COUNT:-"+String.valueOf(chara));
        jLabel6.setText("WORD COUNT:-"+String.valueOf(words));
       
    }                                       

    private void jTextPane2KeyReleased(java.awt.event.KeyEvent evt) {                                       
       
        String s;
       

        if(jTextPane2.getSelectedText()==null){
            s = jTextPane2.getText();
        }else{
            s = jTextPane2.getSelectedText();
            
        }

        
        int words = 0;
        int chara = 0;

        int check=0;
        if(s.isEmpty()){
            words=0;
            chara=0;
        }else{

            String[] s1 = s.split(" ");

            for(String trav :s1){

                String[] newLine = trav.split("\n");
                if(newLine.length != 1){
                    check=1;
                    for(String line:newLine){
                        if(!line.equals("")){
                            words++;
                        }
                        chara = chara + line.length();
                    }

                }

                if(check==0){
                    words++;
                    chara = chara + trav.length();
                }

                check=0;


            }


        }
                
        jLabel4.setText("WORD COUNT:-"+String.valueOf(words));
       jLabel5.setText("CHARACTER COUNT:-"+String.valueOf(chara));
    }                                      

    private void jTextPane2MouseDragged(java.awt.event.MouseEvent evt) {                                        
         String s;
       

        if(jTextPane2.getSelectedText()==null){
            s = jTextPane2.getText();
        }else{
            s = jTextPane2.getSelectedText();
            
        }

        //Variables declaration
        
        int words = 0;
        int chara = 0;

        int check=0;
        if(s.isEmpty()){
            words=0;
            chara=0;
        }else{

            String[] s1 = s.split(" ");

            for(String trav :s1){

                String[] newLine = trav.split("\n");
                if(newLine.length != 1){
                    check=1;
                    for(String line:newLine){
                        if(!line.equals("")){
                            words++;
                        }
                        chara = chara + line.length();
                    }

                }

                if(check==0){
                    words++;
                    chara = chara + trav.length();
                }

                check=0;


            }


        }
                jLabel9.setText("CHARACTER COUNT:-"+String.valueOf(chara));
        jLabel6.setText("WORD COUNT:-"+String.valueOf(words));
       
    }                                       

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        StyledDocument doc = (StyledDocument) jTextPane2.getDocument();
    int selectionEnd = jTextPane2.getSelectionEnd();
    int selectionStart = jTextPane2.getSelectionStart();
    if (selectionStart == selectionEnd) {
      return;
    }
    Element ele = doc.getCharacterElement(selectionStart);
    AttributeSet at = ele.getAttributes();

    MutableAttributeSet asNew = new SimpleAttributeSet(at.copyAttributes());
    StyleConstants.setStrikeThrough(asNew, !StyleConstants.isStrikeThrough(at));
    doc.setCharacterAttributes(selectionStart, jTextPane2.getSelectedText()
        .length(), asNew, true); 
    }                                        

    public static void fHighlight(JTextComponent textComponent, String s, Highlighter.HighlightPainter colourChoice){


        try{

            Highlighter h = textComponent.getHighlighter();
            Document doc = textComponent.getDocument();
            String text = doc.getText(0, doc.getLength());

            if((nextposti= text.toUpperCase().indexOf(s.toUpperCase(),nextposti))>=0){
               
                h.addHighlight(nextposti, nextposti+s.length(), colourChoice);
                nextposti += s.length();
            }


        }catch(BadLocationException e){

            System.out.println(e.getMessage());

        }

    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          

        HighlightPainter myHighlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.ORANGE);
        if (jTextField1.getText().equals(intial)){
                intial = jTextField1.getText();
                nextposti = 0;
            }
        
            if (nextposti == 0) {
                
                fHighlight(jTextPane2, jTextField1.getText(), myHighlightPainter);
            } else {

                try {

                   

                    Highlighter h = jTextPane2.getHighlighter();
                    Document doc = jTextPane2.getDocument();
                    String text = doc.getText(0, doc.getLength());


                    h.removeAllHighlights();
                    fHighlight(jTextPane2, jTextField1.getText(), myHighlightPainter);


                    intipos = nextposti;

                } catch (BadLocationException e) {

                    System.out.println(e.getMessage());

                }


            }

    }                                         

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
        Desktop.getDesktop().browse(new URL("http://www.google.com").toURI());    
    } 
        catch (Exception e) {
        }
    }                                          

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
        Desktop.getDesktop().browse(new URL("http://www.dictionary.com").toURI());    
    } 
        catch (Exception e) {
        }
         
    }                                          

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          

         int selEnd = jTextPane2.getSelectionEnd();
    int selStart = jTextPane2.getSelectionStart();
    
       String text = jTextPane2.getText().toString();
      
       String inti=jTextPane2.getText();
           
            StringBuilder string = new StringBuilder(text);
           
            
            
                String replacing= jTextPane2.getSelectedText().toUpperCase();
            string.replace(selStart, selEnd, replacing);
           
           
            jTextPane2.setText(string.toString());
            
            
           
           
           
            
    }                                         

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         int selEnd = jTextPane2.getSelectionEnd();
    int selStart = jTextPane2.getSelectionStart();
    
       String text = jTextPane2.getText().toString();
      
       String inti=jTextPane2.getText();
           
            StringBuilder string = new StringBuilder(text);
           
            
            
                String replacing= jTextPane2.getSelectedText().toLowerCase();
            string.replace(selStart, selEnd, replacing);
           
           
            jTextPane2.setText(string.toString());
            
     
    }                                         
   
  
 
              
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration                   
}
