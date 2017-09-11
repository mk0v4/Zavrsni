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
public class AnalizaRad extends Entitet implements Serializable {

    private String opsis_operacije;

    private Byte broj_operacije;

    private BigDecimal jedinicni_normativ_vremena, cijena_vrijeme;

    public String getOpsis_operacije() {
        return opsis_operacije;
    }

    public void setOpsis_operacije(String opsis_operacije) {
        this.opsis_operacije = opsis_operacije;
    }

    public Byte getBroj_operacije() {
        return broj_operacije;
    }

    public void setBroj_operacije(Byte broj_operacije) {
        this.broj_operacije = broj_operacije;
    }

    public BigDecimal getJedinicni_normativ_vremena() {
        return jedinicni_normativ_vremena;
    }

    public void setJedinicni_normativ_vremena(BigDecimal jedinicni_normativ_vremena) {
        this.jedinicni_normativ_vremena = jedinicni_normativ_vremena;
    }

    public BigDecimal getCijena_vrijeme() {
        return cijena_vrijeme;
    }

    public void setCijena_vrijeme(BigDecimal cijena_vrijeme) {
        this.cijena_vrijeme = cijena_vrijeme;
    }

    @ManyToOne
    private Rad rad;
    
    @ManyToOne
    private AnalizaCijene analiza_cijene;

    public Rad getRad() {
        return rad;
    }

    public void setRad(Rad rad) {
        this.rad = rad;
    }

    public AnalizaCijene getAnaliza_cijene() {
        return analiza_cijene;
    }

    public void setAnaliza_cijene(AnalizaCijene analiza_cijene) {
        this.analiza_cijene = analiza_cijene;
    }
    
    
    
}
