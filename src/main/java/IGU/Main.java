package IGU;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Ejercicio1Butt = new javax.swing.JButton();
        Ejercicio2Butt = new javax.swing.JButton();
        Ejercicio3Butt = new javax.swing.JButton();
        Ejercicio4Butt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Desarrollado por: Ing. Gabriel Peñate");

        Ejercicio1Butt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Ejercicio1Butt.setText("Ejercicio 01");
        Ejercicio1Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio1ButtActionPerformed(evt);
            }
        });

        Ejercicio2Butt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Ejercicio2Butt.setText("Ejercicio 02");
        Ejercicio2Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio2ButtActionPerformed(evt);
            }
        });

        Ejercicio3Butt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Ejercicio3Butt.setText("Ejercicio 03");
        Ejercicio3Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio3ButtActionPerformed(evt);
            }
        });

        Ejercicio4Butt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Ejercicio4Butt.setText("Ejercicio 04");
        Ejercicio4Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio4ButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ejercicio3Butt)
                            .addComponent(Ejercicio1Butt))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ejercicio2Butt)
                            .addComponent(Ejercicio4Butt))
                        .addGap(35, 35, 35))
                    .addComponent(jLabel1))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ejercicio1Butt)
                    .addComponent(Ejercicio2Butt))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ejercicio3Butt)
                    .addComponent(Ejercicio4Butt))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ejercicio1ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio1ButtActionPerformed
        Ejercicio01 Form01 = new Ejercicio01();
        Form01.setVisible(true);
        Form01.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_Ejercicio1ButtActionPerformed

    private void Ejercicio2ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio2ButtActionPerformed
        Ejercicio02 Form02 = new Ejercicio02();
        Form02.setVisible(true);
        Form02.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_Ejercicio2ButtActionPerformed

    private void Ejercicio3ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio3ButtActionPerformed
        Ejercicio03 Form03 = new Ejercicio03();
        Form03.setVisible(true);
        Form03.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_Ejercicio3ButtActionPerformed

    private void Ejercicio4ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio4ButtActionPerformed
        Ejercicio04 Form04 = new Ejercicio04();
        Form04.setVisible(true);
        Form04.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_Ejercicio4ButtActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ejercicio1Butt;
    private javax.swing.JButton Ejercicio2Butt;
    private javax.swing.JButton Ejercicio3Butt;
    private javax.swing.JButton Ejercicio4Butt;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
