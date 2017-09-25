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
public class StavkaTroskovnik extends Entitet implements Serializable {

    private String dodatan_opis, oznaka_stavka;

    public String getOznaka_stavka() {
        return oznaka_stavka;
    }

    public void setOznaka_stavka(String oznaka_stavka) {
        this.oznaka_stavka = oznaka_stavka;
    }

    private BigDecimal kolicina_troskovnik, ukupna_cijena;

    @OneToMany (mappedBy = "stavka_troskovnik")
    private List<AnalizaCijene> analize_cijena;

    public List<AnalizaCijene> getAnalize_cijena() {
        return analize_cijena;
    }

    public void setAnalize_cijena(List<AnalizaCijene> analize_cijena) {
        this.analize_cijena = analize_cijena;
    }
    
    public String getDodatan_opis() {
        return dodatan_opis;
    }

    public void setDodatan_opis(String dodatan_opis) {
        this.dodatan_opis = dodatan_opis;
    }

    public BigDecimal getKolicina_troskovnik() {
        return kolicina_troskovnik;
    }

    public void setKolicina_troskovnik(BigDecimal kolicina_troskovnik) {
        this.kolicina_troskovnik = kolicina_troskovnik;
    }

    public BigDecimal getUkupna_cijena() {
        return ukupna_cijena;
    }

    public void setUkupna_cijena(BigDecimal ukupna_cijena) {
        this.ukupna_cijena = ukupna_cijena;
    }

    @Override
    public String toString() {
        return getOznaka_stavka();
    }
    
}
