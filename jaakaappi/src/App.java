import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        jaakaappi olio1 = new jaakaappi();

    boolean auki = false;

    System.out.println("Onko ovi auki?");
        String ovi = in.nextLine();

    System.out.println("Monta astetta jaakaappi on?");
        int lampo = Integer.parseInt(in.nextLine());

    if(ovi.equalsIgnoreCase("on")){
        auki = true;
    } else {auki = false;}
    
    // Kutsutaan olioita
    olio1.virtaPaalla();
    olio1.tulostaLampotila(lampo);
    olio1.valoPaalla(auki);
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
    public void tulostaLampotila(int lampoTila){
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