/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kovacevic;

import java.math.BigDecimal;
import kovacevic.controller.Obrada;
import kovacevic.model.AnalizaCijene;
import kovacevic.model.AnalizaMaterijal;
import kovacevic.model.AnalizaRad;
import kovacevic.model.Materijal;
import kovacevic.model.Rad;
import kovacevic.model.StavkaTroskovnik;

/**
 *
 * @author Marko Kovačević
 */
public class PocetniLoad {
    
    public static void main(String[] args){

        
        Obrada<Rad> obradaRadovi = new Obrada<>();
        Rad rad = new Rad();
        rad.setGrupa_radova("Zidar");
        rad.setKategorija_rad("I");
        rad.setCijena(new BigDecimal(55.00));
        obradaRadovi.save(rad);
        
        Rad rad1 = new Rad();
        rad1.setGrupa_radova("Zidar");
        rad1.setKategorija_rad("II");
        rad1.setCijena(new BigDecimal(60.00));
        obradaRadovi.save(rad1);
        
        Rad rad2 = new Rad();
        rad2.setGrupa_radova("Zidar");
        rad2.setKategorija_rad("III");
        rad2.setCijena(new BigDecimal(65.00));
        obradaRadovi.save(rad2);    

        Rad rad3 = new Rad();
        rad3.setGrupa_radova("Zidar");
        rad3.setKategorija_rad("IV");
        rad3.setCijena(new BigDecimal(70.00));
        obradaRadovi.save(rad3);

        Rad rad4 = new Rad();
        rad4.setGrupa_radova("Zidar");
        rad4.setKategorija_rad("V");
        rad4.setCijena(new BigDecimal(75.00));
        obradaRadovi.save(rad4);

        Rad rad5 = new Rad();
        rad5.setGrupa_radova("Zidar");
        rad5.setKategorija_rad("VI");
        rad5.setCijena(new BigDecimal(80.00));
        obradaRadovi.save(rad5);
        
        Rad rad6 = new Rad();
        rad6.setGrupa_radova("Zidar");
        rad6.setKategorija_rad("VII");
        rad6.setCijena(new BigDecimal(85.00));
        obradaRadovi.save(rad6);

        Rad rad7 = new Rad();
        rad7.setGrupa_radova("Zidar");
        rad7.setKategorija_rad("VIII");
        rad7.setCijena(new BigDecimal(90.00));
        obradaRadovi.save(rad7);
        
        Rad rad8 = new Rad();
        rad8.setGrupa_radova("Radnik");
        rad8.setKategorija_rad("I");
        rad8.setCijena(new BigDecimal(50.00));
        obradaRadovi.save(rad8);
        
        Rad rad9 = new Rad();
        rad9.setGrupa_radova("Radnik");
        rad9.setKategorija_rad("II");
        rad9.setCijena(new BigDecimal(52.50));
        obradaRadovi.save(rad9);

        Rad rad10 = new Rad();
        rad10.setGrupa_radova("Radnik");
        rad10.setKategorija_rad("III");
        rad10.setCijena(new BigDecimal(55.00));
        obradaRadovi.save(rad10);

        Rad rad11 = new Rad();
        rad11.setGrupa_radova("Radnik");
        rad11.setKategorija_rad("IV");
        rad11.setCijena(new BigDecimal(57.50));
        obradaRadovi.save(rad11);
        
        Rad rad12 = new Rad();
        rad12.setGrupa_radova("Radnik");
        rad12.setKategorija_rad("V");
        rad12.setCijena(new BigDecimal(60.00));
        obradaRadovi.save(rad12);        
        
        Rad rad13 = new Rad();
        rad13.setGrupa_radova("Radnik");
        rad13.setKategorija_rad("VI");
        rad13.setCijena(new BigDecimal(62.50));
        obradaRadovi.save(rad13); 

        Rad rad14 = new Rad();
        rad14.setGrupa_radova("Radnik");
        rad14.setKategorija_rad("VII");
        rad14.setCijena(new BigDecimal(65.00));
        obradaRadovi.save(rad14);

        Rad rad15 = new Rad();
        rad15.setGrupa_radova("Radnik");
        rad15.setKategorija_rad("VIII");
        rad15.setCijena(new BigDecimal(70.00));
        obradaRadovi.save(rad15);


        Obrada<Materijal> obradaMaterijali = new Obrada<>();
        Materijal materijal = new Materijal();
        materijal.setGrupa_materijal("Cement");
        materijal.setProizvodac("NEXE");
        materijal.setOznaka("CEM II/B-M (P-S) 32,5R");
        materijal.setKolicina_ambalaza(new BigDecimal(25.00));
        materijal.setJedinica_mjere_ambalaza("kg");
        materijal.setCijena_ambalaza(new BigDecimal(20.00));
        materijal.setOpis("Standardni mješani portland cement, visoka rana čvrstoća; Razred čvrstoće 32,5 MPa");
        obradaMaterijali.save(materijal);

        Materijal materijal1 = new Materijal();
        materijal1.setGrupa_materijal("Vapno");
        materijal1.setProizvodac("InterCAL");
        materijal1.setOznaka("DL 80-30-S1");
        materijal1.setKolicina_ambalaza(new BigDecimal(25.00));
        materijal1.setJedinica_mjere_ambalaza("kg");
        materijal1.setCijena_ambalaza(new BigDecimal(18.00));
        materijal1.setOpis("Hidratizirano vapno");
        obradaMaterijali.save(materijal1);
        
        Materijal materijal2 = new Materijal();
        materijal2.setGrupa_materijal("Voda");
        materijal2.setProizvodac("Gradski vodovod");
        materijal2.setOznaka("Pitka voda");
        materijal2.setKolicina_ambalaza(new BigDecimal(1.00));
        materijal2.setJedinica_mjere_ambalaza("m3");
        materijal2.setCijena_ambalaza(new BigDecimal(15.00));
        materijal2.setOpis("Smatra se prikladnom za pripremu i ne treba se ispitivati");
        obradaMaterijali.save(materijal2);
        
        Materijal materijal3 = new Materijal();
        materijal3.setGrupa_materijal("Agregat");
        materijal3.setProizvodac("");
        materijal3.setOznaka("Granulacija 0-4 mm");
        materijal3.setKolicina_ambalaza(new BigDecimal(1.00));
        materijal3.setJedinica_mjere_ambalaza("m3");
        materijal3.setCijena_ambalaza(new BigDecimal(90.00));
        materijal3.setOpis("Riječni pijesak");
        obradaMaterijali.save(materijal3);
        
        Materijal materijal4 = new Materijal();
        materijal4.setGrupa_materijal("Opeka");
        materijal4.setProizvodac("");
        materijal4.setOznaka("15x30x6,5cm");
        materijal4.setKolicina_ambalaza(new BigDecimal(1.00));
        materijal4.setJedinica_mjere_ambalaza("kom");
        materijal4.setCijena_ambalaza(new BigDecimal(0.28));
        materijal4.setOpis("");
        obradaMaterijali.save(materijal4);
        
        Materijal materijal5 = new Materijal();
        materijal5.setGrupa_materijal("Mort");
        materijal5.setProizvodac("Gradilište");
        materijal5.setOznaka("Produžni mort 1:3:9 - strojno");
        materijal5.setKolicina_ambalaza(new BigDecimal(1.00));
        materijal5.setJedinica_mjere_ambalaza("m3");
        materijal5.setCijena_ambalaza(new BigDecimal(304.54));
        materijal5.setOpis("");
        obradaMaterijali.save(materijal5);


        Obrada<StavkaTroskovnik> obradaStavkeTroskovnika = new Obrada<>();
        StavkaTroskovnik stavkaTroskovnik = new StavkaTroskovnik();
        stavkaTroskovnik.setKolicina_troskovnik(new BigDecimal(30.52));
        stavkaTroskovnik.setDodatan_opis("Početka radova nakon odobrenja nadzornog inženjera.");
        stavkaTroskovnik.setUkupna_cijena(new BigDecimal(21886.50));
        obradaStavkeTroskovnika.save(stavkaTroskovnik);
        

        Obrada<AnalizaCijene> obradaAnalizeCijena = new Obrada<>();
        AnalizaCijene analizaCijene = new AnalizaCijene();
        analizaCijene.setOznaka_norme("GN 301-203-3.1.");
        analizaCijene.setGrupa_norme("Zidraski radovi");
        analizaCijene.setOpis("Zidanje zida punom opekom 15x30x6,5cm u produžnom mortu 1:3:9");
        analizaCijene.setJedinica_mjere("m3");
        analizaCijene.setUkupan_normativ_vremena(new BigDecimal(8.01));
        analizaCijene.setUkupna_cijena_materijal(new BigDecimal(174.45));
        analizaCijene.setUkupna_cijena_rad(new BigDecimal(174.45));
        analizaCijene.setKoeficijent_firme(new BigDecimal(1.05));
        analizaCijene.setSveukupan_iznos(new BigDecimal(717.12));
        analizaCijene.setStavka_troskovnik(stavkaTroskovnik);
        obradaAnalizeCijena.save(analizaCijene);
        
        AnalizaCijene analizaCijene1 = new AnalizaCijene();
        analizaCijene1.setOznaka_norme("GN 301-103-5.3.");
        analizaCijene1.setGrupa_norme("Zidraski radovi");
        analizaCijene1.setOpis("Strojna izrada produžnog morta 1:3:9");
        analizaCijene1.setJedinica_mjere("m3");
        analizaCijene1.setUkupan_normativ_vremena(new BigDecimal(2.03));
        analizaCijene1.setUkupna_cijena_materijal(new BigDecimal(304.54));
        analizaCijene1.setUkupna_cijena_rad(new BigDecimal(106.58));
        analizaCijene1.setKoeficijent_firme(new BigDecimal(1.00));
        analizaCijene1.setSveukupan_iznos(new BigDecimal(411.12));
        analizaCijene1.setStavka_troskovnik(stavkaTroskovnik);
        obradaAnalizeCijena.save(analizaCijene1);


        Obrada<AnalizaMaterijal> obradaAnalizeMaterijala = new Obrada<>();
        AnalizaMaterijal analizaMaterijal = new AnalizaMaterijal();
        analizaMaterijal.setKolicina(new BigDecimal(146.00));
        analizaMaterijal.setJedinica_mjere("kg");
        analizaMaterijal.setJedinicna_cijena_materijal(new BigDecimal(0.80));
        analizaMaterijal.setCijena_materijal(new BigDecimal(116.80));
        analizaMaterijal.setAnaliza_cijene(analizaCijene1);
        analizaMaterijal.setMaterijal(materijal);
        obradaAnalizeMaterijala.save(analizaMaterijal);
        
        AnalizaMaterijal analizaMaterijal1 = new AnalizaMaterijal();
        analizaMaterijal1.setKolicina(new BigDecimal(0.31));
        analizaMaterijal1.setJedinica_mjere("m3");
        analizaMaterijal1.setJedinicna_cijena_materijal(new BigDecimal(324.00));
        analizaMaterijal1.setCijena_materijal(new BigDecimal(100.44));
        analizaMaterijal1.setAnaliza_cijene(analizaCijene1);
        analizaMaterijal.setMaterijal(materijal1);
        obradaAnalizeMaterijala.save(analizaMaterijal1);
        
        AnalizaMaterijal analizaMaterijal2 = new AnalizaMaterijal();
        analizaMaterijal2.setKolicina(new BigDecimal(0.93));
        analizaMaterijal2.setJedinica_mjere("m3");
        analizaMaterijal2.setJedinicna_cijena_materijal(new BigDecimal(90.00));
        analizaMaterijal2.setCijena_materijal(new BigDecimal(83.70));
        analizaMaterijal2.setAnaliza_cijene(analizaCijene1);
        analizaMaterijal.setMaterijal(materijal2);
        obradaAnalizeMaterijala.save(analizaMaterijal2);
        
        AnalizaMaterijal analizaMaterijal3 = new AnalizaMaterijal();
        analizaMaterijal3.setKolicina(new BigDecimal(0.24));
        analizaMaterijal3.setJedinica_mjere("m3");
        analizaMaterijal3.setJedinicna_cijena_materijal(new BigDecimal(15.00));
        analizaMaterijal3.setCijena_materijal(new BigDecimal(3.60));
        analizaMaterijal3.setAnaliza_cijene(analizaCijene1);
        analizaMaterijal.setMaterijal(materijal3);
        obradaAnalizeMaterijala.save(analizaMaterijal3);         
        
        AnalizaMaterijal analizaMaterijal4 = new AnalizaMaterijal();
        analizaMaterijal4.setKolicina(new BigDecimal(275));
        analizaMaterijal4.setJedinica_mjere("kom");
        analizaMaterijal4.setJedinicna_cijena_materijal(new BigDecimal(0.28));
        analizaMaterijal4.setCijena_materijal(new BigDecimal(77.00));
        analizaMaterijal4.setAnaliza_cijene(analizaCijene);
        analizaMaterijal.setMaterijal(materijal4);
        obradaAnalizeMaterijala.save(analizaMaterijal4);        

        AnalizaMaterijal analizaMaterijal5 = new AnalizaMaterijal();
        analizaMaterijal5.setKolicina(new BigDecimal(0.32));
        analizaMaterijal5.setJedinica_mjere("m3");
        analizaMaterijal5.setJedinicna_cijena_materijal(new BigDecimal(304.54));
        analizaMaterijal5.setCijena_materijal(new BigDecimal(97.45));
        analizaMaterijal5.setAnaliza_cijene(analizaCijene);
        analizaMaterijal.setMaterijal(materijal5);
        obradaAnalizeMaterijala.save(analizaMaterijal5);         
        
        
        Obrada<AnalizaRad> obradaAnalizeRadova = new Obrada<>();
        AnalizaRad analizaRad = new AnalizaRad();
        analizaRad.setOpis_operacije("Strojno spravljanje morta");
        analizaRad.setBroj_operacije(2);
        analizaRad.setJedinicni_normativ_vremena(new BigDecimal(1.88));
        analizaRad.setCijena_vrijeme(new BigDecimal(98.70));
        analizaRad.setAnaliza_cijene(analizaCijene1);
        analizaRad.setRad(rad9);
        obradaAnalizeRadova.save(analizaRad);
        
        AnalizaRad analizaRad1 = new AnalizaRad();
        analizaRad1.setOpis_operacije("Prijenos cementa");
        analizaRad1.setBroj_operacije(3);
        analizaRad1.setJedinicni_normativ_vremena(new BigDecimal(0.15));
        analizaRad1.setCijena_vrijeme(new BigDecimal(7.88));
        analizaRad1.setAnaliza_cijene(analizaCijene1);
        analizaRad1.setRad(rad9);
        obradaAnalizeRadova.save(analizaRad1);

        AnalizaRad analizaRad2 = new AnalizaRad();
        analizaRad2.setOpis_operacije("Strojno spravljanje morta");
        analizaRad2.setBroj_operacije(1);
        analizaRad2.setJedinicni_normativ_vremena(new BigDecimal(0.60));
        analizaRad2.setCijena_vrijeme(new BigDecimal(31.50));
        analizaRad2.setAnaliza_cijene(analizaCijene);
        analizaRad2.setRad(rad9);
        obradaAnalizeRadova.save(analizaRad2);

        AnalizaRad analizaRad3 = new AnalizaRad();
        analizaRad3.setOpis_operacije("Zidanje");
        analizaRad3.setBroj_operacije(2);
        analizaRad3.setJedinicni_normativ_vremena(new BigDecimal(3.96));
        analizaRad3.setCijena_vrijeme(new BigDecimal(316.80));
        analizaRad3.setAnaliza_cijene(analizaCijene);
        analizaRad3.setRad(rad5);
        obradaAnalizeRadova.save(analizaRad3);
        
        AnalizaRad analizaRad4 = new AnalizaRad();
        analizaRad4.setOpis_operacije("Zidanje");
        analizaRad4.setBroj_operacije(2);
        analizaRad4.setJedinicni_normativ_vremena(new BigDecimal(1.26));
        analizaRad4.setCijena_vrijeme(new BigDecimal(66.15));
        analizaRad4.setAnaliza_cijene(analizaCijene);
        analizaRad4.setRad(rad9);
        obradaAnalizeRadova.save(analizaRad4); 
        
        AnalizaRad analizaRad5 = new AnalizaRad();
        analizaRad5.setOpis_operacije("Prijenos opeke");
        analizaRad5.setBroj_operacije(3);
        analizaRad5.setJedinicni_normativ_vremena(new BigDecimal(1.30));
        analizaRad5.setCijena_vrijeme(new BigDecimal(68.25));
        analizaRad5.setAnaliza_cijene(analizaCijene);
        analizaRad5.setRad(rad9);
        obradaAnalizeRadova.save(analizaRad5);

        AnalizaRad analizaRad6 = new AnalizaRad();
        analizaRad6.setOpis_operacije("Prijenos morta");
        analizaRad6.setBroj_operacije(4);
        analizaRad6.setJedinicni_normativ_vremena(new BigDecimal(0.65));
        analizaRad6.setCijena_vrijeme(new BigDecimal(34.13));
        analizaRad6.setAnaliza_cijene(analizaCijene);
        analizaRad6.setRad(rad9);
        obradaAnalizeRadova.save(analizaRad6);         
        
}
    
}
