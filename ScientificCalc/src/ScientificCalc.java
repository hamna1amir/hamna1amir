
import java.awt.event.KeyEvent;


public class ScientificCalc extends javax.swing.JFrame {

    double firstnum;
    double secondnum;
    double result;
    String Operation;
    private Object math;
    
    public ScientificCalc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jtxtDisplay = new javax.swing.JTextField();
        jbtnClear = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jbtnBackspace = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnPercentage = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtnMultiply = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();
        jBtnDecimal = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbtntan = new javax.swing.JButton();
        jbtn1byx = new javax.swing.JButton();
        jbtncos = new javax.swing.JButton();
        jbtnsin = new javax.swing.JButton();
        jbtnsinh = new javax.swing.JButton();
        jbtncosh = new javax.swing.JButton();
        jbtntanh = new javax.swing.JButton();
        jbtn10powerx = new javax.swing.JButton();
        jbtnEqual1 = new javax.swing.JButton();
        jBtnpower = new javax.swing.JButton();
        jbtnsquare = new javax.swing.JButton();
        jBtnpi = new javax.swing.JButton();
        jBtnDecimal1 = new javax.swing.JButton();
        jbtnlog = new javax.swing.JButton();
        jbtncube = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jPasswordField1.setText("jPasswordField1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.setBorder(new javax.swing.border.MatteBorder(null));
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });
        jtxtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDisplayKeyTyped(evt);
            }
        });

        jbtnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnClear.setForeground(new java.awt.Color(0, 51, 51));
        jbtnClear.setText("c");
        jbtnClear.setActionCommand("");
        jbtnClear.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn4.setForeground(new java.awt.Color(0, 51, 51));
        jbtn4.setText("4");
        jbtn4.setActionCommand("");
        jbtn4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn1.setForeground(new java.awt.Color(0, 51, 51));
        jbtn1.setText("1");
        jbtn1.setActionCommand("");
        jbtn1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn7.setForeground(new java.awt.Color(0, 51, 51));
        jbtn7.setText("7");
        jbtn7.setActionCommand("");
        jbtn7.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn5.setForeground(new java.awt.Color(0, 51, 51));
        jBtn5.setText("5");
        jBtn5.setActionCommand("");
        jBtn5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn2.setForeground(new java.awt.Color(0, 51, 51));
        jbtn2.setText("2");
        jbtn2.setActionCommand("");
        jbtn2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn8.setForeground(new java.awt.Color(0, 51, 51));
        jBtn8.setText("8");
        jBtn8.setActionCommand("");
        jBtn8.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jbtnBackspace.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnBackspace.setForeground(new java.awt.Color(0, 51, 51));
        jbtnBackspace.setText("←");
        jbtnBackspace.setActionCommand("");
        jbtnBackspace.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackspaceActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn6.setForeground(new java.awt.Color(0, 51, 51));
        jbtn6.setText("6");
        jbtn6.setActionCommand("");
        jbtn6.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn3.setForeground(new java.awt.Color(0, 51, 51));
        jbtn3.setText("3");
        jbtn3.setActionCommand("");
        jbtn3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn9.setForeground(new java.awt.Color(0, 51, 51));
        jbtn9.setText("9");
        jbtn9.setActionCommand("");
        jbtn9.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtnPercentage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnPercentage.setForeground(new java.awt.Color(0, 51, 51));
        jbtnPercentage.setText("√");
        jbtnPercentage.setActionCommand("");
        jbtnPercentage.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPercentageActionPerformed(evt);
            }
        });

        jbtnDivide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnDivide.setForeground(new java.awt.Color(0, 51, 51));
        jbtnDivide.setText("/");
        jbtnDivide.setActionCommand("");
        jbtnDivide.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivideActionPerformed(evt);
            }
        });

        jbtnMultiply.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnMultiply.setForeground(new java.awt.Color(0, 51, 51));
        jbtnMultiply.setText("*");
        jbtnMultiply.setActionCommand("");
        jbtnMultiply.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiplyActionPerformed(evt);
            }
        });

        jbtnMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnMinus.setForeground(new java.awt.Color(0, 51, 51));
        jbtnMinus.setText("-");
        jbtnMinus.setActionCommand("");
        jbtnMinus.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });

        jbtnPlus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnPlus.setForeground(new java.awt.Color(0, 51, 51));
        jbtnPlus.setText("+");
        jbtnPlus.setActionCommand("");
        jbtnPlus.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });

        jbtnEqual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnEqual.setForeground(new java.awt.Color(0, 51, 51));
        jbtnEqual.setText("=");
        jbtnEqual.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });

        jBtnDecimal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnDecimal.setForeground(new java.awt.Color(0, 51, 51));
        jBtnDecimal.setText(".");
        jBtnDecimal.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jBtnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDecimalActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn0.setForeground(new java.awt.Color(0, 51, 51));
        jbtn0.setText("0");
        jbtn0.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("+/-");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jbtntan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtntan.setForeground(new java.awt.Color(0, 51, 51));
        jbtntan.setText("Tan");
        jbtntan.setActionCommand("");
        jbtntan.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtntan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntanActionPerformed(evt);
            }
        });

        jbtn1byx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn1byx.setForeground(new java.awt.Color(0, 51, 51));
        jbtn1byx.setText("1/x");
        jbtn1byx.setActionCommand("");
        jbtn1byx.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtn1byx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1byxActionPerformed(evt);
            }
        });

        jbtncos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtncos.setForeground(new java.awt.Color(0, 51, 51));
        jbtncos.setText("Cos");
        jbtncos.setActionCommand("");
        jbtncos.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtncos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncosActionPerformed(evt);
            }
        });

        jbtnsin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnsin.setForeground(new java.awt.Color(0, 51, 51));
        jbtnsin.setText("Sin");
        jbtnsin.setActionCommand("");
        jbtnsin.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsinActionPerformed(evt);
            }
        });

        jbtnsinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnsinh.setForeground(new java.awt.Color(0, 51, 51));
        jbtnsinh.setText("sinh");
        jbtnsinh.setActionCommand("");
        jbtnsinh.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnsinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsinhActionPerformed(evt);
            }
        });

        jbtncosh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtncosh.setForeground(new java.awt.Color(0, 51, 51));
        jbtncosh.setText("Cosh");
        jbtncosh.setActionCommand("");
        jbtncosh.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtncosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncoshActionPerformed(evt);
            }
        });

        jbtntanh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtntanh.setForeground(new java.awt.Color(0, 51, 51));
        jbtntanh.setText("Tanh");
        jbtntanh.setActionCommand("");
        jbtntanh.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtntanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntanhActionPerformed(evt);
            }
        });

        jbtn10powerx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn10powerx.setForeground(new java.awt.Color(0, 51, 51));
        jbtn10powerx.setText("round");
        jbtn10powerx.setActionCommand("");
        jbtn10powerx.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtn10powerx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn10powerxActionPerformed(evt);
            }
        });

        jbtnEqual1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnEqual1.setForeground(new java.awt.Color(0, 51, 51));
        jbtnEqual1.setText("hex");
        jbtnEqual1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnEqual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqual1ActionPerformed(evt);
            }
        });

        jBtnpower.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnpower.setForeground(new java.awt.Color(0, 51, 51));
        jBtnpower.setText("x^y");
        jBtnpower.setActionCommand("");
        jBtnpower.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jBtnpower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnpowerActionPerformed(evt);
            }
        });

        jbtnsquare.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnsquare.setForeground(new java.awt.Color(0, 51, 51));
        jbtnsquare.setText("x^2");
        jbtnsquare.setActionCommand("");
        jbtnsquare.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnsquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsquareActionPerformed(evt);
            }
        });

        jBtnpi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnpi.setForeground(new java.awt.Color(0, 51, 51));
        jBtnpi.setText("𝛑");
        jBtnpi.setActionCommand("");
        jBtnpi.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jBtnpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnpiActionPerformed(evt);
            }
        });

        jBtnDecimal1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnDecimal1.setForeground(new java.awt.Color(0, 51, 51));
        jBtnDecimal1.setText("bin");
        jBtnDecimal1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jBtnDecimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDecimal1ActionPerformed(evt);
            }
        });

        jbtnlog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnlog.setForeground(new java.awt.Color(0, 51, 51));
        jbtnlog.setText("log");
        jbtnlog.setActionCommand("");
        jbtnlog.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlogActionPerformed(evt);
            }
        });

        jbtncube.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtncube.setForeground(new java.awt.Color(0, 51, 51));
        jbtncube.setText("x^3");
        jbtncube.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.darkGray));
        jbtncube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncubeActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Scientific calc");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxtDisplay)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnDivide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBtnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnsquare, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnpi, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnpower, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn1byx, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtncos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtntan, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn10powerx, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtncosh, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtntanh, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnsinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtncube, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnDecimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEqual1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(211, 211, 211)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBtnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtncos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtntan, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn1byx, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jBtnpi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBtnpower, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbtnsquare, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jbtnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(211, 211, 211)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtncosh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtntanh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn10powerx, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtncube, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBtnDecimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnEqual1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         this.setResizable(true);
     this.setSize(384, 500);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       this.setResizable(true);
     this.setSize(684, 500);
     
    jtxtDisplay.setSize(610, 39);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisplayActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     this.setResizable(true);
     this.setSize(384, 500);
    }//GEN-LAST:event_formWindowActivated

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
      String iNum = jtxtDisplay.getText()+ jbtn7.getText();
      jtxtDisplay.setText(iNum);
      
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
  String iNum = jtxtDisplay.getText()+ jBtn8.getText();
      jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
   String iNum = jtxtDisplay.getText()+ jbtn9.getText();
      jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtntanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntanActionPerformed
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = Math.tan(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtntanActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
     
          String iNum = jtxtDisplay.getText()+ jbtn4.getText();
      jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
       
          String iNum = jtxtDisplay.getText()+ jBtn5.getText();
      jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed

          String iNum = jtxtDisplay.getText()+ jbtn6.getText();
      jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
         String iNum = jtxtDisplay.getText()+ jbtn1.getText();
      jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
          String iNum = jtxtDisplay.getText()+ jbtn2.getText();
      jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
          String iNum = jtxtDisplay.getText()+ jbtn3.getText();
      jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
  String iNum = jtxtDisplay.getText()+ jbtn0.getText();
      jtxtDisplay.setText(iNum);
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = ops*(-1);
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBtnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDecimalActionPerformed
       if(jtxtDisplay.getText().contains("."))
       {
           
           jtxtDisplay.setText(jtxtDisplay.getText()+ jBtnDecimal.getText());
    }//GEN-LAST:event_jBtnDecimalActionPerformed
    }
    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
        String answer;
        secondnum= Double.parseDouble(jtxtDisplay.getText());
        
        if(Operation == "+"){
            result = firstnum + secondnum;
            answer = String.format("%2f" , result);
            jtxtDisplay.setText(answer);
            
        }
        
        else if(Operation == "-"){
            result = firstnum - secondnum;
            answer = String.format("%2f" , result);
            jtxtDisplay.setText(answer);
            
        }
        
        else if(Operation == "/"){
            result = firstnum / secondnum;
            answer = String.format("%2f" , result);
            jtxtDisplay.setText(answer);
            
        }
        
     else    if(Operation == "*"){
            result = firstnum * secondnum;
            answer = String.format("%2f" , result);
            jtxtDisplay.setText(answer);
            
        }
    }//GEN-LAST:event_jbtnEqualActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
       
        firstnum= Double.parseDouble(jtxtDisplay.getText());
      jtxtDisplay.setText(null);
      Operation= ("+");
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
        firstnum= Double.parseDouble(jtxtDisplay.getText());
      jtxtDisplay.setText(null);
      Operation= ("-");
     
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiplyActionPerformed
         firstnum= Double.parseDouble(jtxtDisplay.getText());
      jtxtDisplay.setText(null);
      Operation= ("*");
    
    }//GEN-LAST:event_jbtnMultiplyActionPerformed

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivideActionPerformed
    firstnum= Double.parseDouble(jtxtDisplay.getText());
      jtxtDisplay.setText(null);
      Operation= ("/");
     
    }//GEN-LAST:event_jbtnDivideActionPerformed

    private void jbtnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPercentageActionPerformed
      double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = Math.sqrt(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnPercentageActionPerformed

    private void jbtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackspaceActionPerformed
   String bsp = null;
   if(jtxtDisplay.getText().length()>0)
{
StringBuilder strB =  new StringBuilder(jtxtDisplay.getText());
strB.deleteCharAt(jtxtDisplay.getText().length() - 1);
bsp = strB.toString();
jtxtDisplay.setText(bsp);
    }//GEN-LAST:event_jbtnBackspaceActionPerformed
    }
    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
         jtxtDisplay.setText("");
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlogActionPerformed
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = Math.log(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnlogActionPerformed

    private void jbtnsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsinActionPerformed
             double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = Math.sin(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnsinActionPerformed

    private void jbtnsinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsinhActionPerformed
            double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = Math.sinh(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnsinhActionPerformed

    private void jbtncosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncosActionPerformed
           double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = Math.cos(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtncosActionPerformed

    private void jbtncoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncoshActionPerformed
          double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = Math.cosh(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtncoshActionPerformed

    private void jbtntanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntanhActionPerformed
             double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = Math.tanh(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtntanhActionPerformed

    private void jBtnpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnpiActionPerformed
            double ops;
       
       ops = Math.PI;
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnpiActionPerformed

    private void jBtnpowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnpowerActionPerformed
             double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = Math.pow(ops, ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnpowerActionPerformed

    private void jbtnsquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsquareActionPerformed
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = ops*ops;
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnsquareActionPerformed

    private void jbtncubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncubeActionPerformed
      double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = ops*ops*ops;
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtncubeActionPerformed

    private void jbtn10powerxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn10powerxActionPerformed
      double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = Math.round(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtn10powerxActionPerformed

    private void jbtn1byxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1byxActionPerformed
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       
       ops = 1/ops;
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtn1byxActionPerformed

    private void jBtnDecimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDecimal1ActionPerformed
       int a  = Integer.parseInt(jtxtDisplay.getText());
       jtxtDisplay.setText(Integer.toString(a, 2));
    }//GEN-LAST:event_jBtnDecimal1ActionPerformed

    private void jbtnEqual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqual1ActionPerformed
          int a  = Integer.parseInt(jtxtDisplay.getText());
       jtxtDisplay.setText(Integer.toString(a, 16));
    }//GEN-LAST:event_jbtnEqual1ActionPerformed

    private void jtxtDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDisplayKeyTyped
      char c = evt.getKeyChar();
      if(!(Character.isDigit(c) || (c ==KeyEvent.VK_BACK_SPACE)    || (c == KeyEvent.VK_DELETE)))
                  { 
                      getToolkit().beep();
                      evt.consume();
    }//GEN-LAST:event_jtxtDisplayKeyTyped
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
            java.util.logging.Logger.getLogger(ScientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScientificCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScientificCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtnDecimal;
    private javax.swing.JButton jBtnDecimal1;
    private javax.swing.JButton jBtnpi;
    private javax.swing.JButton jBtnpower;
    private javax.swing.JButton jButton3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn10powerx;
    private javax.swing.JButton jbtn1byx;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnBackspace;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnEqual1;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMultiply;
    private javax.swing.JButton jbtnPercentage;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtncos;
    private javax.swing.JButton jbtncosh;
    private javax.swing.JButton jbtncube;
    private javax.swing.JButton jbtnlog;
    private javax.swing.JButton jbtnsin;
    private javax.swing.JButton jbtnsinh;
    private javax.swing.JButton jbtnsquare;
    private javax.swing.JButton jbtntan;
    private javax.swing.JButton jbtntanh;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
