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
public class Rad extends Entitet implements Serializable {

    private String grupa_radova, kategorija_rad;

    private BigDecimal cijena;

    public String getGrupa_radova() {
        return grupa_radova;
    }

    public void setGrupa_radova(String grupa_radova) {
        this.grupa_radova = grupa_radova;
    }

    public String getKategorija_rad() {
        return kategorija_rad;
    }

    public void setKategorija_rad(String kategorija_rad) {
        this.kategorija_rad = kategorija_rad;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    @OneToMany(mappedBy = "rad")
    private List<AnalizaRad> analize_radova;

    public List<AnalizaRad> getAnalize_radova() {
        return analize_radova;
    }

    public void setAnalize_radova(List<AnalizaRad> analize_radova) {
        this.analize_radova = analize_radova;
    }

    @Override
    public String toString() {
        return "Grupa: " + grupa_radova + " Kategorija: " + kategorija_rad + " Cijena: " + cijena + " kn/h";
    }

}
