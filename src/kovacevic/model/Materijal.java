/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Marko Kovačević
 */
@Entity
@Table
public class Materijal extends Entitet implements Serializable {

    

    private String grupa_materijal, proizvodac, oznaka, opis, jedinica_mjere_ambalaza;

    private BigDecimal kolicina_ambalaza;

    private BigDecimal cijena_ambalaza;
    
    @OneToMany (mappedBy = "materijal")
    private List<AnalizaMaterijal> analize_materijala;

    public String getGrupa_materijal() {
        return grupa_materijal;
    }

    public void setGrupa_materijal(String grupa_materijal) {
        this.grupa_materijal = grupa_materijal;
    }

    public String getProizvodac() {
        return proizvodac;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public BigDecimal getKolicina_ambalaza() {
        return kolicina_ambalaza;
    }

    public void setKolicina_ambalaza(BigDecimal kolicina_ambalaza) {
        this.kolicina_ambalaza = kolicina_ambalaza;
    }

    public String getJedinica_mjere_ambalaza() {
        return jedinica_mjere_ambalaza;
    }

    public void setJedinica_mjere_ambalaza(String jedinica_mjere_ambalaza) {
        this.jedinica_mjere_ambalaza = jedinica_mjere_ambalaza;
    }

    public BigDecimal getCijena_ambalaza() {
        return cijena_ambalaza;
    }

    public void setCijena_ambalaza(BigDecimal cijena_ambalaza) {
        this.cijena_ambalaza = cijena_ambalaza;
    }

    public List<AnalizaMaterijal> getAnalize_materijala() {
        return analize_materijala;
    }

    public void setAnalize_materijala(List<AnalizaMaterijal> analize_materijala) {
        this.analize_materijala = analize_materijala;
    }
    
        @Override
    public String toString() {
        return grupa_materijal + " " + oznaka + " " + kolicina_ambalaza + " " + jedinica_mjere_ambalaza + " " + cijena_ambalaza + " kn";
    }
    
}
