/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.view;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import kovacevic.controller.Obrada;
import kovacevic.model.Materijal;
import kovacevic.model.Rad;
import kovacevic.pomocno.HibernateUtil;

/**
 *
 * @author Marko Kovačević
 */
public class FormaMaterijal extends Forma<Materijal> {

    private List<Materijal> rezultati;

    /**
     * Creates new form FormaMaterijal
     */
    public FormaMaterijal() {
        initComponents();
        setTitle("Materijal");
        obrada = new Obrada();

        ucitaj();
    }

    @Override
    protected void ucitaj() {

        rezultati = HibernateUtil.getSession().createQuery("from Materijal a where a.obrisan=false").list();
        ucitavanje();

//        DefaultListModel<Materijal> m = new DefaultListModel<>();
//        Lista.setModel(m);
//        List<Materijal> l = HibernateUtil.getSession().createQuery("from Matrijal a where a.obrisan=false").list();
//        l.forEach((s) -> {
//            System.out.println("Prije liste " + s.hashCode());
//            m.addElement(s);
//        });
    }

    private void ucitavanje() {
        DefaultListModel<Materijal> m = new DefaultListModel<>();
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
        lblGrupaMaterijal = new javax.swing.JLabel();
        txtGrupaMaterijal = new javax.swing.JTextField();
        lblProizvodac = new javax.swing.JLabel();
        txtProizvodac = new javax.swing.JTextField();
        lblOznaka = new javax.swing.JLabel();
        lblKolicinaAmbalaza = new javax.swing.JLabel();
        lblJedinicaMjereAmbalaza = new javax.swing.JLabel();
        lblCijenaAmbalaza = new javax.swing.JLabel();
        lblOpis = new javax.swing.JLabel();
        txtOznaka = new javax.swing.JTextField();
        txtKolicinaAmbalaza = new javax.swing.JTextField();
        txtJedinicaMjereAmbalaza = new javax.swing.JTextField();
        txtCijenaAmbalaza = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tarOpis = new javax.swing.JTextArea();

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

        lblGrupaMaterijal.setText("Grupa materijala:");

        lblProizvodac.setText("Proizvođač:");

        lblOznaka.setText("Oznaka:");

        lblKolicinaAmbalaza.setText("Pakovanje količina:");

        lblJedinicaMjereAmbalaza.setText("Jedinica mjere:");

        lblCijenaAmbalaza.setText("Cijena pakovanja:");

        lblOpis.setText("Opis:");

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

        tarOpis.setColumns(20);
        tarOpis.setRows(5);
        tarOpis.setWrapStyleWord(true);
        jScrollPane2.setViewportView(tarOpis);
        tarOpis.setLineWrap(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtUvjet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrazi))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGrupaMaterijal)
                            .addComponent(lblProizvodac)
                            .addComponent(lblOznaka)
                            .addComponent(lblKolicinaAmbalaza)
                            .addComponent(lblJedinicaMjereAmbalaza)
                            .addComponent(lblCijenaAmbalaza)
                            .addComponent(lblOpis))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGrupaMaterijal)
                            .addComponent(txtProizvodac)
                            .addComponent(txtOznaka)
                            .addComponent(txtKolicinaAmbalaza)
                            .addComponent(txtJedinicaMjereAmbalaza)
                            .addComponent(txtCijenaAmbalaza)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromjeni)
                        .addGap(18, 68, Short.MAX_VALUE)
                        .addComponent(btnObrisi)
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrazi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGrupaMaterijal)
                            .addComponent(txtGrupaMaterijal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProizvodac)
                            .addComponent(txtProizvodac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOznaka)
                            .addComponent(txtOznaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKolicinaAmbalaza)
                            .addComponent(txtKolicinaAmbalaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJedinicaMjereAmbalaza)
                            .addComponent(txtJedinicaMjereAmbalaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCijenaAmbalaza)
                            .addComponent(txtCijenaAmbalaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOpis)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaValueChanged

        if (evt.getValueIsAdjusting()) {
            return;
        }

        try {
            this.entitet = Lista.getSelectedValue();
            txtGrupaMaterijal.setText(Lista.getSelectedValue().getGrupa_materijal());
            txtProizvodac.setText(Lista.getSelectedValue().getProizvodac());
            txtOznaka.setText(Lista.getSelectedValue().getOznaka());
            txtKolicinaAmbalaza.setText(Lista.getSelectedValue().getKolicina_ambalaza().toString());
            txtJedinicaMjereAmbalaza.setText(Lista.getSelectedValue().getJedinica_mjere_ambalaza());
            txtCijenaAmbalaza.setText(Lista.getSelectedValue().getCijena_ambalaza().toString());
            tarOpis.setText(Lista.getSelectedValue().getOpis());
        } catch (Exception e) {
        }

    }//GEN-LAST:event_ListaValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        entitet = new Materijal();
        spremi();
        //lstRadovi.clearSelection();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if (Lista.getSelectedValue() == null) {
            JOptionPane.showConfirmDialog(rootPane, "Prvo odaberite stavku");
        }
        spremi();
        //lstRadovi.clearSelection();
    }//GEN-LAST:event_btnPromjeniActionPerformed
    @Override
    protected void spremi() {
        entitet.setGrupa_materijal(txtGrupaMaterijal.getText());
        entitet.setProizvodac(txtProizvodac.getText());
        entitet.setOznaka(txtOznaka.getText());
        entitet.setKolicina_ambalaza(new BigDecimal(txtKolicinaAmbalaza.getText()));
        entitet.setJedinica_mjere_ambalaza(txtJedinicaMjereAmbalaza.getText());
        entitet.setCijena_ambalaza(new BigDecimal(txtCijenaAmbalaza.getText()));
        entitet.setOpis(tarOpis.getText());
        super.spremi();
    }
    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if (Lista.getSelectedValue() == null) {
            JOptionPane.showConfirmDialog(rootPane, "Prvo odaberite stavku");
        }
        obrisi();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void txtUvjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetActionPerformed

    }//GEN-LAST:event_txtUvjetActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        rezultati = HibernateUtil.getSession().createQuery("from Materijal a where "
                + " a.obrisan=false and concat(a.grupa_mateijral, ' ', a.proizvodac, ' ',a.oznaka, ' ',a.opis) like :uvjet").setString("uvjet", "%" + txtUvjet.getText() + "%").list();
        ucitavanje();
    }//GEN-LAST:event_btnTraziActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Materijal> Lista;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCijenaAmbalaza;
    private javax.swing.JLabel lblGrupaMaterijal;
    private javax.swing.JLabel lblJedinicaMjereAmbalaza;
    private javax.swing.JLabel lblKolicinaAmbalaza;
    private javax.swing.JLabel lblOpis;
    private javax.swing.JLabel lblOznaka;
    private javax.swing.JLabel lblProizvodac;
    private javax.swing.JTextArea tarOpis;
    private javax.swing.JTextField txtCijenaAmbalaza;
    private javax.swing.JTextField txtGrupaMaterijal;
    private javax.swing.JTextField txtJedinicaMjereAmbalaza;
    private javax.swing.JTextField txtKolicinaAmbalaza;
    private javax.swing.JTextField txtOznaka;
    private javax.swing.JTextField txtProizvodac;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables
}