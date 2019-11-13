package paint;

import java.awt.Color;

/**
 *
 * @author marce
 */
public class InterfacePaint extends javax.swing.JFrame {

    public enum TipoFigura {
        tfPonto, tfReta, tfCirculo, tfRetangulo, tfBorracha, tfSpray, tfCilindro, tfElipse
    };
    TipoFigura tipoFigura = null;
    Reta reta = new Reta();
    Retangulo retangulo = new Retangulo();
    Elipse elipse = new Elipse();
    Elipse circulo = new Elipse();
    Cilindro cilindro = new Cilindro();

    public InterfacePaint() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnReta = new javax.swing.JButton();
        canvasPaint = new java.awt.Canvas();
        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        pnlCor = new javax.swing.JPanel();
        pnlCorFundo = new javax.swing.JPanel();
        checkFundo = new javax.swing.JCheckBox();
        btnRetangulo = new javax.swing.JButton();
        checkArea = new javax.swing.JCheckBox();
        btnPonto = new javax.swing.JButton();
        btnElipse = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReta.setText("Reta");
        btnReta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetaActionPerformed(evt);
            }
        });

        canvasPaint.setBackground(new java.awt.Color(255, 255, 255));
        canvasPaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canvasPaintMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                canvasPaintMouseReleased(evt);
            }
        });

        jLabel1.setText("Cor");

        pnlCor.setBackground(new java.awt.Color(255, 0, 153));
        pnlCor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCorLayout = new javax.swing.GroupLayout(pnlCor);
        pnlCor.setLayout(pnlCorLayout);
        pnlCorLayout.setHorizontalGroup(
            pnlCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        pnlCorLayout.setVerticalGroup(
            pnlCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        pnlCorFundo.setBackground(new java.awt.Color(255, 255, 255));
        pnlCorFundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCorFundoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCorFundoLayout = new javax.swing.GroupLayout(pnlCorFundo);
        pnlCorFundo.setLayout(pnlCorFundoLayout);
        pnlCorFundoLayout.setHorizontalGroup(
            pnlCorFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        pnlCorFundoLayout.setVerticalGroup(
            pnlCorFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        checkFundo.setText("Fundo");
        checkFundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFundoActionPerformed(evt);
            }
        });

        btnRetangulo.setText("Retangulo");
        btnRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetanguloActionPerformed(evt);
            }
        });

        checkArea.setText("Área");

        btnPonto.setText("Ponto");
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnElipse.setText("Elipse");
        btnElipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElipseActionPerformed(evt);
            }
        });

        jButton1.setText("Circulo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cilindro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkFundo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCorFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1))
                            .addComponent(pnlCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnReta)
                    .addComponent(btnPonto)
                    .addComponent(btnElipse)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btnRetangulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(checkArea))
                    .addComponent(canvasPaint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkArea)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvasPaint, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnPonto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReta)
                        .addGap(18, 18, 18)
                        .addComponent(btnRetangulo)
                        .addGap(17, 17, 17)
                        .addComponent(btnElipse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(checkFundo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCorFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElipseActionPerformed
        tipoFigura = TipoFigura.tfElipse;
    }//GEN-LAST:event_btnElipseActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        tipoFigura = TipoFigura.tfPonto;
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnRetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetanguloActionPerformed
        tipoFigura = TipoFigura.tfRetangulo;
    }//GEN-LAST:event_btnRetanguloActionPerformed

    private void checkFundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFundoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkFundoActionPerformed

    private void pnlCorFundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCorFundoMouseClicked
        pnlCorFundo.setBackground(jColorChooser1.getColor());
    }//GEN-LAST:event_pnlCorFundoMouseClicked

    private void pnlCorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCorMouseClicked
        pnlCor.setBackground(jColorChooser1.getColor());
    }//GEN-LAST:event_pnlCorMouseClicked

    private void canvasPaintMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasPaintMouseReleased
        if (tipoFigura == TipoFigura.tfReta) {
            reta.x2 = evt.getX();
            reta.y2 = evt.getY();
            reta.desenhar(canvasPaint.getGraphics());
        } else if (tipoFigura == TipoFigura.tfRetangulo) {
            retangulo.base = evt.getX() - retangulo.x;
            retangulo.altura = evt.getY() - retangulo.y;
            retangulo.showArea = checkArea.isSelected();
            retangulo.desenhar(canvasPaint.getGraphics(), checkFundo.isSelected());
        } else if (tipoFigura == TipoFigura.tfElipse) {

            elipse.raioHorizontal = (evt.getX() - elipse.x) / 2;
            elipse.raioVertical = (evt.getY() - elipse.y) / 2;
            elipse.showArea = checkArea.isSelected();
            elipse.desenhar(canvasPaint.getGraphics(), checkFundo.isSelected());
        }
        else if (tipoFigura == TipoFigura.tfCirculo) {
            double conta = Math.pow(evt.getX() - circulo.x, 2);
            conta += Math.pow(evt.getY() - circulo.y, 2);
            circulo.raioHorizontal = (int)(Math.sqrt(conta))/2;
            circulo.raioVertical = circulo.raioHorizontal;
            circulo.showArea = checkArea.isSelected();
            circulo.desenhar(canvasPaint.getGraphics(), checkFundo.isSelected());
        }else  if (tipoFigura == TipoFigura.tfCilindro) {
            cilindro.x2 = evt.getX();
            cilindro.y2 = evt.getY();
            cilindro.desenhar(canvasPaint.getGraphics(),checkFundo.isSelected());
        } 
    }//GEN-LAST:event_canvasPaintMouseReleased

    private void canvasPaintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasPaintMousePressed
        if (tipoFigura == TipoFigura.tfPonto) {
            Ponto ponto = new Ponto();
            ponto.x = evt.getX();
            ponto.y = evt.getY();
            ponto.cor = pnlCor.getBackground();
            ponto.desenhar(canvasPaint.getGraphics());
        } else if (tipoFigura == TipoFigura.tfReta) {
            reta.x = evt.getX();
            reta.y = evt.getY();
            reta.cor = pnlCor.getBackground();
        } else if (tipoFigura == TipoFigura.tfRetangulo) {
            retangulo.x = evt.getX();
            retangulo.y = evt.getY();
            if (checkFundo.isSelected()) {
                retangulo.corFundo = pnlCorFundo.getBackground();
            }
            retangulo.cor = pnlCor.getBackground();
        } else if (tipoFigura == TipoFigura.tfElipse) {
            elipse.x = evt.getX();
            elipse.y = evt.getY();
            if (checkFundo.isSelected()) {
                elipse.corFundo = pnlCorFundo.getBackground();
            }
            elipse.cor = pnlCor.getBackground();
        }else if (tipoFigura == TipoFigura.tfCirculo) {
            circulo.x = evt.getX();
            circulo.y = evt.getY();
            if (checkFundo.isSelected()) {
                circulo.corFundo = pnlCorFundo.getBackground();
            }
            circulo.cor = pnlCor.getBackground();
        }else if (tipoFigura == TipoFigura.tfCilindro) {
            cilindro.x = evt.getX();
            cilindro.y = evt.getY();
            cilindro.cor = pnlCor.getBackground();
            
            if (checkFundo.isSelected()) {
                cilindro.corFundo = pnlCorFundo.getBackground();
            }
            elipse.cor = pnlCor.getBackground();
        }
    }//GEN-LAST:event_canvasPaintMousePressed

    private void btnRetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetaActionPerformed
        tipoFigura = TipoFigura.tfReta;
    }//GEN-LAST:event_btnRetaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       tipoFigura = TipoFigura.tfCirculo;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tipoFigura = TipoFigura.tfCilindro;
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfacePaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElipse;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnReta;
    private javax.swing.JButton btnRetangulo;
    private java.awt.Canvas canvasPaint;
    private javax.swing.JCheckBox checkArea;
    private javax.swing.JCheckBox checkFundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlCor;
    private javax.swing.JPanel pnlCorFundo;
    // End of variables declaration//GEN-END:variables
}
