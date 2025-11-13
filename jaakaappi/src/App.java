import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer>asteet = new ArrayList<Integer>();
        Scanner in = new Scanner (System.in);
        jaakaappi olio1 = new jaakaappi();

    boolean auki = false; // Asetetaan oven default arvo false. Koska yleisesti parempi jos jaakaappi on kiinni.
    System.out.println("Onko ovi auki? Vastaa: On/Ei");
        String ovi = in.nextLine();
            if(ovi.equalsIgnoreCase("on")){
                auki = true;
            } // Kysyy kayttajalta onko jaakaappi auki vai kiinni. (Palaako valo vai ei)

    System.out.println("Monta astetta jaakaappi on?");
        asteet.add(Integer.parseInt(in.nextLine())); // Kayttaja asettaa jaakaapin lampotilan.


    // Kutsutaan olioita
    olio1.virtaPaalla();
    olio1.tulostaLampotila(asteet.get(0));
    olio1.valoPaalla(auki);

// Niin sanottu "Tiedon muunnos olio."
    System.out.println("Onko jaakaapissa liian kylma? Halutako vaihtaa asteita? Vastaa: Kylla/Ei");
        String kysely = in.nextLine();
            if(kysely.equalsIgnoreCase("kylla")){
                System.out.println("Anna uusi lampotila: ");
                    int uusiaste = Integer.parseInt(in.nextLine());
                asteet.set(0, uusiaste);
    olio1.tulostaLampotila(asteet.get(0));
            } // Jos jaakaapin lampotila on sopiva jo alusta, niin vastaus ei ohittaa taman kyselyn.
    }
}  // Main loppuu

class jaakaappi{
    boolean onkoPaalla;
    String merkki;
    // int lampoTila = 0;
    // boolean oviAuki;

    public jaakaappi(){ // Ei kysyttavaa
        onkoPaalla = true;
        merkki = "Epoc";
    }
    public void tulostaLampotila(Integer lampoTila){ // Miksi tama ei ole INT?!?!?
        System.out.println("Lampotila on " + lampoTila);
    }
    public void virtaPaalla(){ // Hiukan turha methodi kokonaisuudessaan.
        onkoPaalla = true;
        System.out.println("Jaakaapissa on virta");
    }
    public void valoPaalla(boolean oviAuki){ // Onko booleanissa joku fiksumpi tapa kuin String if-lause user inputtiin.
        if(oviAuki){
            System.out.println("Valo palaa.");
        } else {System.out.println("Valo ei pala.");}
    }
} // Class jaakaappi loppuu

// Kiitos :) -Roni