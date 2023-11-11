package calculadorav1.igu;

import calculadorav1.logica.Calcular;

public class Pantalla extends javax.swing.JFrame {

    String valorAnterior = "0";
    String valorActual = "0";
    String operador = "+";
    Calcular calcular = new Calcular();

    public Pantalla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAc = new javax.swing.JButton();
        btnElevarAlCuadrado = new javax.swing.JButton();
        btnRaizCuadrada = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnComa = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        txtVisor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        btnAc.setBackground(new java.awt.Color(0, 0, 0));
        btnAc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAc.setForeground(new java.awt.Color(255, 255, 255));
        btnAc.setText("AC");
        btnAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcActionPerformed(evt);
            }
        });

        btnElevarAlCuadrado.setBackground(new java.awt.Color(0, 0, 0));
        btnElevarAlCuadrado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnElevarAlCuadrado.setForeground(new java.awt.Color(255, 255, 255));
        btnElevarAlCuadrado.setText("x²");
        btnElevarAlCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElevarAlCuadradoActionPerformed(evt);
            }
        });

        btnRaizCuadrada.setBackground(new java.awt.Color(0, 0, 0));
        btnRaizCuadrada.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRaizCuadrada.setForeground(new java.awt.Color(255, 255, 255));
        btnRaizCuadrada.setText("√");
        btnRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizCuadradaActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(0, 0, 0));
        btnDividir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDividir.setForeground(new java.awt.Color(255, 255, 255));
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnSiete.setBackground(new java.awt.Color(0, 0, 0));
        btnSiete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSiete.setForeground(new java.awt.Color(255, 255, 255));
        btnSiete.setText("7");
        btnSiete.setMaximumSize(new java.awt.Dimension(60, 32));
        btnSiete.setMinimumSize(new java.awt.Dimension(60, 32));
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnOcho.setBackground(new java.awt.Color(0, 0, 0));
        btnOcho.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOcho.setForeground(new java.awt.Color(255, 255, 255));
        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnNueve.setBackground(new java.awt.Color(0, 0, 0));
        btnNueve.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNueve.setForeground(new java.awt.Color(255, 255, 255));
        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(0, 0, 0));
        btnMultiplicar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicar.setText("x");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnCuatro.setBackground(new java.awt.Color(0, 0, 0));
        btnCuatro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCuatro.setForeground(new java.awt.Color(255, 255, 255));
        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(0, 0, 0));
        btnCinco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(255, 255, 255));
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setBackground(new java.awt.Color(0, 0, 0));
        btnSeis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(255, 255, 255));
        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnRestar.setBackground(new java.awt.Color(0, 0, 0));
        btnRestar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnDos.setBackground(new java.awt.Color(0, 0, 0));
        btnDos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDos.setForeground(new java.awt.Color(255, 255, 255));
        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnUno.setBackground(new java.awt.Color(0, 0, 0));
        btnUno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUno.setForeground(new java.awt.Color(255, 255, 255));
        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnTres.setBackground(new java.awt.Color(0, 0, 0));
        btnTres.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnTres.setForeground(new java.awt.Color(255, 255, 255));
        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnSumar.setBackground(new java.awt.Color(0, 0, 0));
        btnSumar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSumar.setForeground(new java.awt.Color(255, 255, 255));
        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnCero.setBackground(new java.awt.Color(0, 0, 0));
        btnCero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCero.setForeground(new java.awt.Color(255, 255, 255));
        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btnComa.setBackground(new java.awt.Color(0, 0, 0));
        btnComa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnComa.setForeground(new java.awt.Color(255, 255, 255));
        btnComa.setText(".");
        btnComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComaActionPerformed(evt);
            }
        });

        btnRetroceder.setBackground(new java.awt.Color(0, 0, 0));
        btnRetroceder.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRetroceder.setForeground(new java.awt.Color(255, 255, 255));
        btnRetroceder.setText("<");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(0, 0, 0));
        btnIgual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        txtVisor.setEditable(false);
        txtVisor.setBackground(new java.awt.Color(0, 0, 0));
        txtVisor.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtVisor.setForeground(new java.awt.Color(255, 255, 255));
        txtVisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Calculadora");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnElevarAlCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRetroceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSumar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRestar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElevarAlCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 104, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        String cero = "0";
        txtVisor.setText(txtVisor.getText() + cero);

    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        String uno = "1";
        txtVisor.setText(txtVisor.getText() + uno);

    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        String dos = "2";
        txtVisor.setText(txtVisor.getText() + dos);

    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        String tres = "3";
        txtVisor.setText(txtVisor.getText() + tres);

    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        String cuatro = "4";
        txtVisor.setText(txtVisor.getText() + cuatro);

    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        String cinco = "5";
        txtVisor.setText(txtVisor.getText() + cinco);

    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        String seis = "6";
        txtVisor.setText(txtVisor.getText() + seis);

    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        String siete = "7";
        txtVisor.setText(txtVisor.getText() + siete);

    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        String ocho = "8";
        txtVisor.setText(txtVisor.getText() + ocho);

    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        String nueve = "9";
        txtVisor.setText(txtVisor.getText() + nueve);

    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcActionPerformed
        txtVisor.setText("");
    }//GEN-LAST:event_btnAcActionPerformed

    private void btnComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComaActionPerformed

        if (!txtVisor.getText().contains(".")) {
            txtVisor.setText(txtVisor.getText() + ".");
        }
    }//GEN-LAST:event_btnComaActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed

        String cadena = txtVisor.getText();
        int n = cadena.length();
        String cadNueva = "";

        if (cadena.length() == 0) {
            txtVisor.setText(cadNueva);
        } else if (!cadena.isEmpty()) {
            cadNueva = cadena.substring(0, n - 1);
            txtVisor.setText(cadNueva);
        }
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        valorAnterior = txtVisor.getText();
        operador = "+";
        txtVisor.setText("");
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        valorActual = txtVisor.getText();

        if (valorAnterior.equals("")) {
            valorAnterior = "0";
        }
        if (valorActual.equals("")) {
            valorActual = "0";
        }
        Double total = calcular.operacion(operador, valorAnterior, valorActual);
        txtVisor.setText(calcular.validacionCero(total));

    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        valorAnterior = txtVisor.getText();
        operador = "-";
        txtVisor.setText("");
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        valorAnterior = txtVisor.getText();
        operador = "x";
        txtVisor.setText("");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        valorAnterior = txtVisor.getText();
        operador = "/";
        txtVisor.setText("");
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnElevarAlCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElevarAlCuadradoActionPerformed
        valorActual = txtVisor.getText();
        if (!valorActual.equals("")) {
            Double resultado = calcular.elevarAlCuadrado(valorActual);
            txtVisor.setText(calcular.validacionCero(resultado));
        }
    }//GEN-LAST:event_btnElevarAlCuadradoActionPerformed

    private void btnRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizCuadradaActionPerformed
        valorActual = txtVisor.getText();
        if (!valorActual.equals("")) {
            Double resultado = calcular.raizCuadrada(valorActual);
            txtVisor.setText(calcular.validacionCero(resultado));
        }
    }//GEN-LAST:event_btnRaizCuadradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAc;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnComa;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnElevarAlCuadrado;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnRaizCuadrada;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtVisor;
    // End of variables declaration//GEN-END:variables
}
