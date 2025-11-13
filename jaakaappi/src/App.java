import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer>asteet = new ArrayList<Integer>();
        Scanner in = new Scanner (System.in);
        jaakaappi olio1 = new jaakaappi();

    boolean auki = false;

    System.out.println("Onko ovi auki? Vastaa: On/Ei");
        String ovi = in.nextLine();

    System.out.println("Monta astetta jaakaappi on?");
        asteet.add(Integer.parseInt(in.nextLine()));

    if(ovi.equalsIgnoreCase("on")){
        auki = true;
    } else {auki = false;}
    
    // Kutsutaan olioita
    olio1.virtaPaalla();
    olio1.tulostaLampotila(asteet.get(0));
    olio1.valoPaalla(auki);

    System.out.println("Onko jaakaapissa liian kylma? Halutako vaihtaa asteita? Vastaa: Kylla/Ei");
        String kysely = in.nextLine();
            if(kysely.equalsIgnoreCase("kylla")){
                System.out.println("Anna uusi lampotila: ");
                    int uusiaste = Integer.parseInt(in.nextLine());
                asteet.set(0, uusiaste);
    olio1.tulostaLampotila(asteet.get(0));
            }
    }
}  // Main loppuu

class jaakaappi{
    boolean onkoPaalla;
    String merkki;
    // boolean oviAuki;

    public jaakaappi(){ // taysiparametri muodostin
        onkoPaalla = true;
        merkki = "Epoc";
    }
    public void tulostaLampotila(Integer lampoTila){ // Miksi tama ei ole INT?!?!?
        System.out.println("Lampotila on " + lampoTila);
    }
    public void virtaPaalla(){
        onkoPaalla = true;
        System.out.println("Jaakaapissa on virta");
    }
    public void valoPaalla(boolean oviAuki){
        if(oviAuki){
            System.out.println("Valo palaa.");
        } else {System.out.println("Valo ei pala.");}
    }
} // Class jaakaappi loppuu