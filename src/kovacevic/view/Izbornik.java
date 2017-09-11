/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.view;

/**
 *
 * @author Marko Kovačević
 */
public class Izbornik extends javax.swing.JFrame {
//nasljedjje se form??
    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        setTitle("Završni rad");
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRad = new javax.swing.JButton();
        btnMaterijal = new javax.swing.JButton();
        btnStavkaTroskovnik = new javax.swing.JButton();
        btnEraDijagram = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRad.setText("Rad");
        btnRad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadActionPerformed(evt);
            }
        });

        btnMaterijal.setText("Materijal");
        btnMaterijal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaterijal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaterijalActionPerformed(evt);
            }
        });

        btnStavkaTroskovnik.setText("<html><center>Stavka<br>Troškovnika</center></html>");
        btnStavkaTroskovnik.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnEraDijagram.setText("<html><center>ERA<br> Dijagram</center></html>");
        btnEraDijagram.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEraDijagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraDijagramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaterijal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStavkaTroskovnik, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(btnEraDijagram))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMaterijal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStavkaTroskovnik, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnEraDijagram, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadActionPerformed
        new FormaRad().setVisible(true);
    }//GEN-LAST:event_btnRadActionPerformed

    private void btnMaterijalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaterijalActionPerformed
        new FormaMaterijal().setVisible(true);
    }//GEN-LAST:event_btnMaterijalActionPerformed

    private void btnEraDijagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraDijagramActionPerformed
        new EraDijagram().setVisible(true);
    }//GEN-LAST:event_btnEraDijagramActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEraDijagram;
    private javax.swing.JButton btnMaterijal;
    private javax.swing.JButton btnRad;
    private javax.swing.JButton btnStavkaTroskovnik;
    // End of variables declaration//GEN-END:variables
}