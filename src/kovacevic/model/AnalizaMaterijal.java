/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Marko Kovačević
 */
@Entity
@Table
public class AnalizaMaterijal extends Entitet implements Serializable {

    private BigDecimal kolicina, jedinicna_cijena_materijal, cijena_materijal;

    private String jedinica_mjere;
    
    @ManyToOne
    private Materijal materijal;
    
    @ManyToOne
    private AnalizaCijene analiza_cijene;

    public BigDecimal getKolicina() {
        return kolicina;
    }

    public void setKolicina(BigDecimal kolicina) {
        this.kolicina = kolicina;
    }

    public BigDecimal getJedinicna_cijena_materijal() {
        return jedinicna_cijena_materijal;
    }

    public void setJedinicna_cijena_materijal(BigDecimal jedinicna_cijena_materijal) {
        this.jedinicna_cijena_materijal = jedinicna_cijena_materijal;
    }

    public BigDecimal getCijena_materijal() {
        return cijena_materijal;
    }

    public void setCijena_materijal(BigDecimal cijena_materijal) {
        this.cijena_materijal = cijena_materijal;
    }

    public String getJedinica_mjere() {
        return jedinica_mjere;
    }

    public void setJedinica_mjere(String jedinica_mjere) {
        this.jedinica_mjere = jedinica_mjere;
    }

    
    public Materijal getMaterijal() {
        return materijal;
    }

    public void setMaterijal(Materijal materijal) {
        this.materijal = materijal;
    }

    public AnalizaCijene getAnaliza_cijene() {
        return analiza_cijene;
    }

    public void setAnaliza_cijene(AnalizaCijene analiza_cijene) {
        this.analiza_cijene = analiza_cijene;
    }
    
    
    
}
