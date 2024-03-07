package IGU;
import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Ejercicio03 extends javax.swing.JFrame {

    public Ejercicio03() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Result = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        DiaN = new javax.swing.JTextField();
        MesN = new javax.swing.JTextField();
        YeaN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Ingrese el día de su nacimiento:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Ingrese el mes de su nacimiento:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Ingrese el año de su nacimiento:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Su edad es: ");

        Result.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Result.setForeground(new java.awt.Color(0, 0, 255));
        Result.setText("Edad");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Ejercicio 03");

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        DiaN.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        MesN.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        YeaN.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(Result))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(YeaN)
                                    .addComponent(MesN)
                                    .addComponent(DiaN, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(144, 144, 144)))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MesN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(YeaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Result)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int yeaa, mesa, diaa;
        int yean, mesn, dian;
        int y, m, d;
        y = 0;
        m = 0;
        d = 0;
        
        //Dia actual
        yeaa = Integer.parseInt(mid(LocalDate.now().toString(),0,4));
        mesa = Integer.parseInt(mid(LocalDate.now().toString(),5,2));
        diaa = Integer.parseInt(mid(LocalDate.now().toString(),8,2));
        
        boolean correct = false;
        
        try {
            yean = Integer.parseInt(YeaN.getText());
            mesn = Integer.parseInt(MesN.getText());
            dian = Integer.parseInt(DiaN.getText());
            
            if (yean < 1 || mesn < 1 || dian < 1){
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores positivos", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                if (mesn > 12){
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un mes dentro del rango de 12", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    if (dian > 30){
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un dia dentro del rango de 30", "Error", JOptionPane.ERROR_MESSAGE);
                    }else{
                         correct = true;
                    }
                }
            }
            
            if (correct){
                if(yean > yeaa){
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un año anterior al actual", "Error", JOptionPane.ERROR_MESSAGE);
                }   
                else if(yean == yeaa){
                    y = 0;
                    if(mesn > mesa) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un mes anterior al actual", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        m = mesa - mesn;
                    }
                } 
                else if (mesn > mesa){
                    y = yeaa - yean - 1;
                    m = 12 - (mesn - mesa);
                } 
                else {
                    y = yeaa - yean;
                    m = mesa - mesn;
                }

                if(mesn == mesa && yean == yeaa) {
                    m = 0;
                    if (dian > diaa){
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un dia anterior al actual", "Error", JOptionPane.ERROR_MESSAGE);  
                    } else {
                        d = diaa - dian;
                    }
                }
                else {
                    if(dian > diaa){
                        m = m - 1;
                        d = dian - diaa;
                    }
                    else {
                        d = diaa - dian;
                    }
                } 
                Result.setText(y + " años con " + m + " meses y " + d + " días.");
            }    
        } catch (NumberFormatException ex) {
            // Captura la excepción si el texto no se puede convertir a un entero
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        Main form = new Main();
        form.setVisible(true);
        form.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio03().setVisible(true);
            }
        });
    }

    public static String mid(String s, int startIndex, int length) {
    int endIndex = startIndex + length;
    return s.substring(startIndex, endIndex);
}
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DiaN;
    private javax.swing.JTextField MesN;
    private javax.swing.JLabel Result;
    private javax.swing.JTextField YeaN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
