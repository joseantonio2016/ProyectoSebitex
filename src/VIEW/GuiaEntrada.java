/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

/**
 *
 * @author Administrador
 */
public class GuiaEntrada extends javax.swing.JFrame {

   

    /**
     * Creates new form FrmFacturacion
     */
    public GuiaEntrada() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guia de Entrada");
        setPreferredSize(new java.awt.Dimension(740, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Razón Social", "RUC", "Dirección", "Teléfono", "Fecha "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 640, 150));

        jLabel5.setText("Desde: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jButton3.setText("NUEVO");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        jButton4.setText("GRABAR");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        jButton5.setText("EDITAR");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        jButton6.setText("CANCELAR");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        jButton7.setText("RETORNAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("SEBITEX COMPANY S.A.C");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel11.setText("Hasta: ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jButton8.setText("Ejecutar");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        jLabel4.setText("OBSERVACIONES: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jTextField6.setText(" ");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 490, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("GUIA DE ENTRADA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
FrmAlmacen falmacen = new FrmAlmacen();
        falmacen.setLocationRelativeTo(falmacen);
        falmacen.setVisible(true);
        this.setVisible(false);
        dispose();      
        
// TODO add your handling code here:


    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiaEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
