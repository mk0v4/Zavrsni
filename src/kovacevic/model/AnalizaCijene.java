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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Marko Kovačević
 */
@Entity
@Table
public class AnalizaCijene extends Entitet implements Serializable {

    private String oznaka_norme, grupa_norme, opis, jedinica_mjere;

    private BigDecimal ukupan_normativ_vremena, ukupna_cijena_materijal, ukupna_cijena_rad, koeficijent_firme, sveukupan_iznos;

    @OneToMany (mappedBy = "analiza_cijene")
    private List<AnalizaRad> analize_radova;
    
    @OneToMany (mappedBy = "analiza_cijene")
    private List<AnalizaMaterijal> analize_materijala;
    
    @ManyToOne
    private StavkaTroskovnik stavka_troskovnik;

    public StavkaTroskovnik getStavka_troskovnik() {
        return stavka_troskovnik;
    }

    public void setStavka_troskovnik(StavkaTroskovnik stavka_troskovnik) {
        this.stavka_troskovnik = stavka_troskovnik;
    }
    
    public String getOznaka_norme() {
        return oznaka_norme;
    }

    public void setOznaka_norme(String oznaka_norme) {
        this.oznaka_norme = oznaka_norme;
    }

    public String getGrupa_norme() {
        return grupa_norme;
    }

    public void setGrupa_norme(String grupa_norme) {
        this.grupa_norme = grupa_norme;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getJedinica_mjere() {
        return jedinica_mjere;
    }

    public void setJedinica_mjere(String jedinica_mjere) {
        this.jedinica_mjere = jedinica_mjere;
    }

    public BigDecimal getUkupan_normativ_vremena() {
        return ukupan_normativ_vremena;
    }

    public void setUkupan_normativ_vremena(BigDecimal ukupan_normativ_vremena) {
        this.ukupan_normativ_vremena = ukupan_normativ_vremena;
    }

    public BigDecimal getUkupna_cijena_materijal() {
        return ukupna_cijena_materijal;
    }

    public void setUkupna_cijena_materijal(BigDecimal ukupna_cijena_materijal) {
        this.ukupna_cijena_materijal = ukupna_cijena_materijal;
    }

    public BigDecimal getUkupna_cijena_rad() {
        return ukupna_cijena_rad;
    }

    public void setUkupna_cijena_rad(BigDecimal ukupna_cijena_rad) {
        this.ukupna_cijena_rad = ukupna_cijena_rad;
    }

    public BigDecimal getKoeficijent_firme() {
        return koeficijent_firme;
    }

    public void setKoeficijent_firme(BigDecimal koeficijent_firme) {
        this.koeficijent_firme = koeficijent_firme;
    }

    public BigDecimal getSveukupan_iznos() {
        return sveukupan_iznos;
    }

    public void setSveukupan_iznos(BigDecimal sveukupan_iznos) {
        this.sveukupan_iznos = sveukupan_iznos;
    }

    public List<AnalizaRad> getAnalize_radova() {
        return analize_radova;
    }

    public void setAnalize_radova(List<AnalizaRad> analize_radova) {
        this.analize_radova = analize_radova;
    }

    public List<AnalizaMaterijal> getAnalize_materijala() {
        return analize_materijala;
    }

    public void setAnalize_materijala(List<AnalizaMaterijal> analize_materijala) {
        this.analize_materijala = analize_materijala;
    }

        @Override
    public String toString(){
        return getOznaka_norme();
    }
    
}
