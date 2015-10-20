/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.AdjustmentEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JScrollBar;
import javax.swing.JViewport;

/**
 *
 * @author Héctor Garbisu DIU 2015
 */
public class Tarea5Frame extends javax.swing.JFrame {

    /**
     * Creates new form Tarea1Frame
     */
    public Tarea5Frame() {
        initComponents();
        Dimension idimension;
        idimension = imageLabel.getSize();
        iAncho = idimension.width;
        iAlto = idimension.height;
        textIAlto.setText(String.valueOf(iAlto));
        textIAncho.setText(String.valueOf(iAncho));
        
        vista=jScrollPane1.getViewport();
        Dimension vDimension = vista.getExtentSize();
        vAncho = vDimension.width;
        vAlto = vDimension.height;
        altoViewportTextField.setText(String.valueOf(vAlto));
        anchoViewportTextField.setText(String.valueOf(vAncho));
        Point p = vista.getViewPosition();
        vX = p.x;
        vY = p.y;
        posXViewportTextField.setText(String.valueOf(vX));
        posYViewportTextField.setText(String.valueOf(vY));
        
        hBar = jScrollPane1.getHorizontalScrollBar();
        vBar = jScrollPane1.getVerticalScrollBar();
        hBar.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent ae) {
                hScrollAdjust(ae);
            }
        });
        vBar.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent ae) {
                vScrollAdjust(ae);
            }
        });        
    }
    private void hScrollAdjust(java.awt.event.AdjustmentEvent e){
        Point p = vista.getViewPosition();
        vX = p.x;
        posXViewportTextField.setText(String.valueOf(vX));
    }
    private void vScrollAdjust(java.awt.event.AdjustmentEvent e){
        Point p = vista.getViewPosition();
        vY = p.y;
        posYViewportTextField.setText(String.valueOf(vY));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textIAncho = new javax.swing.JTextField();
        textIAlto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        imageLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        estadoLabel = new javax.swing.JLabel();
        posXLabel = new javax.swing.JLabel();
        posYLabel = new javax.swing.JLabel();
        estadoTextField = new javax.swing.JTextField();
        posXTextField = new javax.swing.JTextField();
        posYTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        anchoViewportLabel = new javax.swing.JLabel();
        altoViewportLabel = new javax.swing.JLabel();
        posXViewportLabel = new javax.swing.JLabel();
        posYViewportLabel = new javax.swing.JLabel();
        anchoViewportTextField = new javax.swing.JTextField();
        altoViewportTextField = new javax.swing.JTextField();
        posXViewportTextField = new javax.swing.JTextField();
        posYViewportTextField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visor de Imágenes");

        jLabel1.setText("Héctor Garbisu DIU 2015");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Image"));

        jLabel2.setText("Ancho");

        jLabel3.setText("Alto");

        textIAncho.setText("jTextField1");
        textIAncho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIAnchoActionPerformed(evt);
            }
        });

        textIAlto.setText("jTextField2");
        textIAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIAltoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textIAncho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIAlto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textIAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textIAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jScrollPane1ComponentResized(evt);
            }
        });

        imageLabel.setText(" ");
        imageLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imageLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                imageLabelMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageLabelMouseMoved(evt);
            }
        });
        imageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imageLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imageLabelMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(imageLabel);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cursor"));

        estadoLabel.setText("Estado");

        posXLabel.setText("Pos X:");

        posYLabel.setText("Pos Y:");

        estadoTextField.setText(" ");
        estadoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoTextFieldActionPerformed(evt);
            }
        });

        posXTextField.setText(" ");

        posYTextField.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posXLabel)
                    .addComponent(estadoLabel)
                    .addComponent(posYLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(posYTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(estadoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(posXTextField))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoLabel)
                    .addComponent(estadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posXLabel)
                    .addComponent(posXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posYLabel)
                    .addComponent(posYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Viewport"));

        anchoViewportLabel.setText("Ancho");

        altoViewportLabel.setText("Alto");

        posXViewportLabel.setText("Pos X:");

        posYViewportLabel.setText("Pos Y:");

        anchoViewportTextField.setText("jTextField1");

        altoViewportTextField.setText("jTextField2");

        posXViewportTextField.setText("jTextField3");
        posXViewportTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posXViewportTextFieldActionPerformed(evt);
            }
        });

        posYViewportTextField.setText("jTextField4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posXViewportLabel)
                    .addComponent(posYViewportLabel)
                    .addComponent(altoViewportLabel)
                    .addComponent(anchoViewportLabel))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(posXViewportTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(altoViewportTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(anchoViewportTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(posYViewportTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anchoViewportLabel)
                    .addComponent(anchoViewportTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altoViewportTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altoViewportLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posXViewportLabel)
                    .addComponent(posXViewportTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posYViewportTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posYViewportLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Close");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIAnchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIAnchoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIAnchoActionPerformed

    private void textIAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIAltoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIAltoActionPerformed

    private void imageLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelMouseDragged
        estadoTextField.setText("Arrastrando");
        Point posicion = imageLabel.getMousePosition();
        if(posicion==null)return;
        cX = posicion.x;
        cY = posicion.y;
        posXTextField.setText(String.valueOf(cX));
        posYTextField.setText(String.valueOf(cY));
        
        Point p = new Point();
        p.x = p0.x - (int)((cX-cX0)/1.2);
        p.y = p0.y - (int)((cY-cY0)/1.2);
        if(p.x<0) p.x = 0;
        if(p.x>iAncho-vAncho) p.x = iAncho-vAncho;
        if(p.y<0) p.y = 0;
        if(p.y>iAlto-vAlto) p.y = iAlto-vAlto;
        vista.setViewPosition(p);
    }//GEN-LAST:event_imageLabelMouseDragged

    private void imageLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelMouseMoved
        Point posicion = imageLabel.getMousePosition();
        if(posicion==null)return;
        cX = posicion.x;
        cY = posicion.y;
        posXTextField.setText(String.valueOf(cX));
        posYTextField.setText(String.valueOf(cY));
    }//GEN-LAST:event_imageLabelMouseMoved

    private void imageLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelMousePressed
        imageLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estadoTextField.setText("Presionado");
        Point posicion = imageLabel.getMousePosition();
        cX0 = posicion.x;
        cY0 = posicion.y;
        p0 = vista.getViewPosition();
    }//GEN-LAST:event_imageLabelMousePressed

    private void imageLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelMouseReleased
        imageLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        estadoTextField.setText("");
    }//GEN-LAST:event_imageLabelMouseReleased

    private void jScrollPane1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentResized
        // TODO add your handling code here:
        Dimension vDimension;
        vDimension = vista.getExtentSize();
        vAncho = vDimension.width;
        vAlto = vDimension.height;
        altoViewportTextField.setText(String.valueOf(vAlto));
        anchoViewportTextField.setText(String.valueOf(vAncho));
    }//GEN-LAST:event_jScrollPane1ComponentResized

    private void posXViewportTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posXViewportTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posXViewportTextFieldActionPerformed

    private void estadoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoTextFieldActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(null);
        fileChooser.addChoosableFileFilter(new ImageFilter());
        int retorno = fileChooser.showOpenDialog(jMenuItem1);
        if (retorno == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            imageLabel.setIcon(new javax.swing.ImageIcon(file.getAbsolutePath()));
            setTitle("Visor Imágenes - "+file.getName());
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        imageLabel.setIcon(null);
        setTitle("Visor de Imágenes");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tarea5Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarea5Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarea5Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarea5Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tarea5Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altoViewportLabel;
    private javax.swing.JTextField altoViewportTextField;
    private javax.swing.JLabel anchoViewportLabel;
    private javax.swing.JTextField anchoViewportTextField;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JTextField estadoTextField;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel posXLabel;
    private javax.swing.JTextField posXTextField;
    private javax.swing.JLabel posXViewportLabel;
    private javax.swing.JTextField posXViewportTextField;
    private javax.swing.JLabel posYLabel;
    private javax.swing.JTextField posYTextField;
    private javax.swing.JLabel posYViewportLabel;
    private javax.swing.JTextField posYViewportTextField;
    private javax.swing.JTextField textIAlto;
    private javax.swing.JTextField textIAncho;
    // End of variables declaration//GEN-END:variables
    private int iAncho, iAlto;
    private int cX, cY, cX0, cY0;  
    private JViewport vista; 
    private int vAncho, vAlto, vX, vY;
    private JScrollBar hBar, vBar;
    private Point p0;
}

