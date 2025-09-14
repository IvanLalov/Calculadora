package app;

import java.awt.Color;
import java.text.DecimalFormat;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        jLabelOperador.setForeground(Color.WHITE);
        jLMemoria.setForeground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonPositivoNegativo = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonPunto = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButtonRaiz = new javax.swing.JButton();
        jTFPantalla = new javax.swing.JTextField();
        jButtonPot3 = new javax.swing.JButton();
        jButtonPot2 = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonSuma = new javax.swing.JButton();
        jButtonLOG = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonDEL = new javax.swing.JButton();
        jButtonPI = new javax.swing.JButton();
        jButtonAC = new javax.swing.JButton();
        jButtonANS = new javax.swing.JButton();
        jLMemoria = new javax.swing.JLabel();
        jLabelOperador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton7.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButton7.setText("7");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButton9.setText("9");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButton8.setText("8");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButton4.setText("4");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButton5.setText("5");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButton1.setText("1");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButton6.setText("6");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButton2.setText("2");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButton3.setText("3");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonPositivoNegativo.setBackground(new java.awt.Color(204, 102, 0));
        jButtonPositivoNegativo.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonPositivoNegativo.setText("+ -");
        jButtonPositivoNegativo.setBorder(null);
        jButtonPositivoNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPositivoNegativoActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButton0.setText("0");
        jButton0.setBorder(null);
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonPunto.setBackground(new java.awt.Color(204, 102, 0));
        jButtonPunto.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonPunto.setText(",");
        jButtonPunto.setBorder(null);
        jButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuntoActionPerformed(evt);
            }
        });

        jButtonDivision.setBackground(new java.awt.Color(255, 204, 102));
        jButtonDivision.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonDivision.setText("÷");
        jButtonDivision.setToolTipText("");
        jButtonDivision.setBorder(null);
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setBackground(new java.awt.Color(255, 204, 102));
        jButtonMultiplicar.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonMultiplicar.setText("x");
        jButtonMultiplicar.setBorder(null);
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButtonResta.setBackground(new java.awt.Color(255, 204, 102));
        jButtonResta.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonResta.setText("—");
        jButtonResta.setBorder(null);
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });

        jButtonRaiz.setBackground(new java.awt.Color(0, 204, 204));
        jButtonRaiz.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonRaiz.setText("√");
        jButtonRaiz.setBorder(null);
        jButtonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaizActionPerformed(evt);
            }
        });

        jTFPantalla.setBackground(new java.awt.Color(0, 102, 255));
        jTFPantalla.setFont(new java.awt.Font("Lucida Bright", 1, 30)); // NOI18N
        jTFPantalla.setForeground(new java.awt.Color(255, 255, 255));
        jTFPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFPantalla.setText("0");
        jTFPantalla.setToolTipText("");
        jTFPantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButtonPot3.setBackground(new java.awt.Color(0, 204, 204));
        jButtonPot3.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonPot3.setText("^3");
        jButtonPot3.setBorder(null);
        jButtonPot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPot3ActionPerformed(evt);
            }
        });

        jButtonPot2.setBackground(new java.awt.Color(0, 204, 204));
        jButtonPot2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonPot2.setText("^2");
        jButtonPot2.setBorder(null);
        jButtonPot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPot2ActionPerformed(evt);
            }
        });

        jButtonIgual.setBackground(new java.awt.Color(0, 102, 255));
        jButtonIgual.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.setBorder(null);
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonSuma.setBackground(new java.awt.Color(255, 204, 102));
        jButtonSuma.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonSuma.setText("+");
        jButtonSuma.setBorder(null);
        jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumaActionPerformed(evt);
            }
        });

        jButtonLOG.setBackground(new java.awt.Color(0, 204, 204));
        jButtonLOG.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonLOG.setText("log");
        jButtonLOG.setBorder(null);
        jButtonLOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLOGActionPerformed(evt);
            }
        });

        jButtonC.setBackground(new java.awt.Color(0, 204, 204));
        jButtonC.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonC.setText("C");
        jButtonC.setBorder(null);
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonDEL.setBackground(new java.awt.Color(0, 204, 204));
        jButtonDEL.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jButtonDEL.setText("DEL");
        jButtonDEL.setToolTipText("");
        jButtonDEL.setBorder(null);
        jButtonDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDELActionPerformed(evt);
            }
        });

        jButtonPI.setBackground(new java.awt.Color(0, 204, 204));
        jButtonPI.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jButtonPI.setText("π");
        jButtonPI.setBorder(null);
        jButtonPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPIActionPerformed(evt);
            }
        });

        jButtonAC.setBackground(new java.awt.Color(0, 204, 204));
        jButtonAC.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jButtonAC.setText("AC");
        jButtonAC.setToolTipText("");
        jButtonAC.setBorder(null);
        jButtonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonACActionPerformed(evt);
            }
        });

        jButtonANS.setBackground(new java.awt.Color(0, 204, 204));
        jButtonANS.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jButtonANS.setText("ANS");
        jButtonANS.setToolTipText("");
        jButtonANS.setBorder(null);
        jButtonANS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonANSActionPerformed(evt);
            }
        });

        jLMemoria.setFont(new java.awt.Font("Lucida Bright", 1, 20)); // NOI18N
        jLMemoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLMemoria.setToolTipText("");

        jLabelOperador.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabelOperador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOperador.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonLOG, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jButtonPot3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                .addComponent(jButtonPositivoNegativo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                            .addComponent(jButtonPI, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(jButtonPot2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                    .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonResta, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(jButtonRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonDivision, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonPunto, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonAC, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                    .addComponent(jLabelOperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonDEL, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jButtonANS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jTFPantalla)
                    .addComponent(jLMemoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonAC, jButtonC, jButtonDEL, jButtonDivision, jButtonIgual, jButtonLOG, jButtonMultiplicar, jButtonPI, jButtonPositivoNegativo, jButtonPot2, jButtonPot3, jButtonPunto, jButtonRaiz, jButtonResta, jButtonSuma});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonANS, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButtonPI, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabelOperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLOG, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButtonAC, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButtonDEL, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDivision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonPot3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jButtonPot2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jButtonRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addComponent(jButtonResta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addComponent(jButtonSuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jButtonPunto, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                    .addComponent(jButtonPositivoNegativo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonAC, jButtonANS, jButtonC, jButtonDEL, jButtonDivision, jButtonIgual, jButtonLOG, jButtonMultiplicar, jButtonPI, jButtonPositivoNegativo, jButtonPot2, jButtonPot3, jButtonPunto, jButtonRaiz, jButtonResta, jButtonSuma});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        escribirNumero("7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButtonPositivoNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPositivoNegativoActionPerformed
        String pantalla = jTFPantalla.getText();

        if (!(pantalla.length() == 1 && pantalla.contains("0"))) {
            if (pantalla.contains("-")) {
                pantalla = pantalla.substring(1, pantalla.length());
            } else {
                pantalla = "-" + pantalla;
            }
        }
        jTFPantalla.setText(pantalla);
    }//GEN-LAST:event_jButtonPositivoNegativoActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        cambioOperador("—");
    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escribirNumero("1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        escribirNumero("9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        escribirNumero("8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void escribirNumero(String numero) {
        String pantalla = jTFPantalla.getText();

        if (pantalla.equals("0")) {
            pantalla = numero;
        } else {
            pantalla += numero;
        }

        jTFPantalla.setText(pantalla);
    }

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        String pantalla = jTFPantalla.getText();
        if (!(pantalla.length() == 1 && pantalla.contains("0"))) {
            pantalla = pantalla + "0";
        }

        jTFPantalla.setText(pantalla);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRaizActionPerformed
        try {
            Double numero = Double.parseDouble(jTFPantalla.getText());
            if (numero < 0) {
                jTFPantalla.setText("Error: Negativo");
                return;
            }
            Double operacion = Math.sqrt(numero);
            if (operacion == Math.floor(operacion)) {
                jTFPantalla.setText(String.valueOf((int) (double) operacion));
            } else {
                jTFPantalla.setText(operacion.toString());
            }

        } catch (NumberFormatException ex) {
            jTFPantalla.setText("Error");
        }
    }//GEN-LAST:event_jButtonRaizActionPerformed

    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumaActionPerformed
        cambioOperador("+");
    }//GEN-LAST:event_jButtonSumaActionPerformed

    private void cambioOperador(String op) {
        if (!jTFPantalla.getText().equals("0") || operador == null || operador.isEmpty()) {
            jLMemoria.setText(jTFPantalla.getText());
        }

        operador = op;
        jLabelOperador.setText(op);
        jTFPantalla.setText("0");

        repetirOperacion = false;
    }

    private void jButtonPot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPot2ActionPerformed
        try {
            Double numero = Double.parseDouble(jTFPantalla.getText());
            Double resultado = Math.pow(numero, 2);

            if (resultado == Math.floor(resultado)) {
                jTFPantalla.setText(String.valueOf((int) (double) resultado));
            } else {
                jTFPantalla.setText(resultado.toString());
            }
        } catch (NumberFormatException ex) {
            jTFPantalla.setText("Error");
        }
    }//GEN-LAST:event_jButtonPot2ActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
        cambioOperador("÷");
    }//GEN-LAST:event_jButtonDivisionActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        escribirNumero("4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        escribirNumero("5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        escribirNumero("6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        escribirNumero("2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        escribirNumero("3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonLOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLOGActionPerformed
        try {
            Double numero = Double.valueOf(jTFPantalla.getText());
            if (numero <= 0) {
                jTFPantalla.setText("Error: <=0");
                return;
            }
            Double operacion = Math.log10(numero);

            if (operacion == Math.floor(operacion)) {
                jTFPantalla.setText(String.valueOf((int) (double) operacion));
            } else {
                jTFPantalla.setText(operacion.toString());
            }
        } catch (NumberFormatException ex) {
            jTFPantalla.setText("Error");
        }
    }//GEN-LAST:event_jButtonLOGActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        jTFPantalla.setText("0");
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDELActionPerformed
        String pantalla = jTFPantalla.getText();
        if (pantalla.length() == 1) {
            pantalla = "0";
        } else {
            pantalla = pantalla.substring(0, pantalla.length() - 1);
        }
        jTFPantalla.setText(pantalla);
    }//GEN-LAST:event_jButtonDELActionPerformed

    private void jButtonPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPIActionPerformed
        Double pi = Math.PI;
        jTFPantalla.setText(pi.toString());
    }//GEN-LAST:event_jButtonPIActionPerformed

    private void jButtonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonACActionPerformed
        jTFPantalla.setText("0");
        jLMemoria.setText("0");
        jLabelOperador.setText("");
        operador = "";
        ans = "0";
    }//GEN-LAST:event_jButtonACActionPerformed

    private void jButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuntoActionPerformed
        String pantalla = jTFPantalla.getText();

        if (!pantalla.contains(".")) {
            pantalla += ".";
        }

        jTFPantalla.setText(pantalla);
    }//GEN-LAST:event_jButtonPuntoActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        if (operador == null || operador.isEmpty()) {
            return;
        }

        double numPantalla = Double.parseDouble(jTFPantalla.getText());

        if (!repetirOperacion) {
            ultimoNumero = numPantalla;
            resultadoActual = Double.parseDouble(jLMemoria.getText());
            repetirOperacion = true;
        }

        switch (operador) {
            case "+" ->
                resultadoActual += ultimoNumero;
            case "—" ->
                resultadoActual -= ultimoNumero;
            case "÷" -> {
                if (ultimoNumero == 0) {
                    jTFPantalla.setText("Error: División por 0");
                    repetirOperacion = false;
                    return;
                }
                resultadoActual /= ultimoNumero;
            }
            case "x" ->
                resultadoActual *= ultimoNumero;
        }

        jLMemoria.setText(String.valueOf(resultadoActual));

        if (resultadoActual == Math.floor(resultadoActual)) {
            jTFPantalla.setText(String.valueOf((int) resultadoActual));
        } else {
            jTFPantalla.setText(String.valueOf(resultadoActual));
        }

        ans = jTFPantalla.getText();
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonANSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonANSActionPerformed
        jTFPantalla.setText(ans);
    }//GEN-LAST:event_jButtonANSActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        cambioOperador("x");
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jButtonPot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPot3ActionPerformed
        try {
            Double numero = Double.parseDouble(jTFPantalla.getText());
            Double resultado = Math.pow(numero, 3);

            if (resultado == Math.floor(resultado)) {
                jTFPantalla.setText(String.valueOf((int) (double) resultado));
            } else {
                jTFPantalla.setText(resultado.toString());
            }
        } catch (NumberFormatException ex) {
            jTFPantalla.setText("Error");
        }
    }//GEN-LAST:event_jButtonPot3ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    private double ultimoNumero = 0;
    private double resultadoActual = 0;
    private boolean repetirOperacion = false;
    private DecimalFormat formato = new DecimalFormat("0.########");
    private String ans = "0";
    private String operador; //El boton pulsado para hacer la operacion
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAC;
    private javax.swing.JButton jButtonANS;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonDEL;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonLOG;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonPI;
    private javax.swing.JButton jButtonPositivoNegativo;
    private javax.swing.JButton jButtonPot2;
    private javax.swing.JButton jButtonPot3;
    private javax.swing.JButton jButtonPunto;
    private javax.swing.JButton jButtonRaiz;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JLabel jLMemoria;
    private javax.swing.JLabel jLabelOperador;
    private javax.swing.JTextField jTFPantalla;
    // End of variables declaration//GEN-END:variables
}
