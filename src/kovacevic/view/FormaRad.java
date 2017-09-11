/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.view;

import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import kovacevic.controller.Obrada;
import kovacevic.model.Rad;
import kovacevic.pomocno.HibernateUtil;

/**
 *
 * @author Marko Kovačević
 */
public class FormaRad extends Forma<Rad> {
    
    private  List<Rad> rezultati;

    /**
     * Creates new form FormaRad
     */
    public FormaRad() {
        initComponents();
        setTitle("Rad");
        obrada = new Obrada();

        ucitaj();
    }

        @Override
    protected void ucitaj() {

        rezultati=HibernateUtil.getSession().createQuery("from Rad a where a.obrisan=false").list();
        ucitavanje();
        
    }
//        DefaultListModel<Rad> m = new DefaultListModel<>();
//        Lista.setModel(m);
//        List<Rad> l = HibernateUtil.getSession().createQuery("from Rad a where a.obrisan=false").list();
//        l.forEach((s) -> {
//            System.out.println("Prije liste " + s.hashCode());
//            m.addElement(s);
//        });
        
    private void ucitavanje(){
        DefaultListModel<Rad> m = new DefaultListModel<>();
        Lista.setModel(m);
        rezultati.forEach((s) -> {
            m.addElement(s);
        });        
      
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
        Lista = new javax.swing.JList<>();
        lblGrupaRadova = new javax.swing.JLabel();
        lblKategorijaRada = new javax.swing.JLabel();
        lblCijena = new javax.swing.JLabel();
        txtGrupaRadova = new javax.swing.JTextField();
        txtKategorijaRad = new javax.swing.JTextField();
        txtCijena = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Lista.setToolTipText("");
        Lista.setDropMode(javax.swing.DropMode.INSERT);
        Lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Lista);

        lblGrupaRadova.setText("Grupa radova:");

        lblKategorijaRada.setText("Kategorija rada:");

        lblCijena.setText("Cijena rada:");

        txtGrupaRadova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupaRadovaActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        txtUvjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetActionPerformed(evt);
            }
        });

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrazi))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGrupaRadova)
                    .addComponent(lblKategorijaRada)
                    .addComponent(lblCijena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGrupaRadova)
                    .addComponent(txtKategorijaRad)
                    .addComponent(txtCijena)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btnPromjeni))
                    .addComponent(btnObrisi))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrazi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGrupaRadova)
                            .addComponent(txtGrupaRadova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKategorijaRada)
                            .addComponent(txtKategorijaRad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCijena)
                            .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni))
                        .addGap(80, 80, 80)
                        .addComponent(btnObrisi)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaValueChanged

        if (evt.getValueIsAdjusting()){
            return;
        }
        
        try {
           this.entitet=Lista.getSelectedValue();
            txtGrupaRadova.setText(Lista.getSelectedValue().getGrupa_radova());
            txtKategorijaRad.setText(Lista.getSelectedValue().getKategorija_rad());
            txtCijena.setText(Lista.getSelectedValue().getCijena().toString());
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_ListaValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        entitet = new Rad();
        spremi();
        //lstRadovi.clearSelection();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
 if(Lista.getSelectedValue()==null){
            JOptionPane.showConfirmDialog(rootPane, "Prvo odaberite stavku");
        }
        spremi();
       //lstRadovi.clearSelection();
    }//GEN-LAST:event_btnPromjeniActionPerformed
    @Override
    protected void spremi(){
        entitet.setGrupa_radova(txtGrupaRadova.getText());
        entitet.setKategorija_rad(txtKategorijaRad.getText());
        entitet.setCijena(new BigDecimal(txtCijena.getText()));
        super.spremi();
    }

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
 if(Lista.getSelectedValue()==null){
            JOptionPane.showConfirmDialog(rootPane, "Prvo odaberite stavku");
        }
        obrisi();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUvjetActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        rezultati=HibernateUtil.getSession().createQuery("from Rad a where "
            + " a.obrisan=false and concat(a.grupa_radova, ' ', a.kategorija_rad) like :uvjet").setString("uvjet", "%" + txtUvjet.getText() + "%").list();
        ucitavanje();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void txtGrupaRadovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupaRadovaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupaRadovaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Rad> Lista;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCijena;
    private javax.swing.JLabel lblGrupaRadova;
    private javax.swing.JLabel lblKategorijaRada;
    private javax.swing.JTextField txtCijena;
    private javax.swing.JTextField txtGrupaRadova;
    private javax.swing.JTextField txtKategorijaRad;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables
}
