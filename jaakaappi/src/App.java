import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        ArrayList<Integer>lampotila = new ArrayList<Integer>();
    jaakaappi olio1 = new jaakaappi(true,"Epoc",lampotila.get(0));
    
    boolean ovi = false;

    System.out.println("Aseta jaakaapin lampotila: ");
    int ltarvo = Integer.parseInt(in.nextLine());
    lampotila.add(0,ltarvo);

    System.out.println("Onko ovi auki?");
    String onko = in.nextLine();
    if(onko.equalsIgnoreCase("on")){
        ovi = true;
    }else{ovi = false;}

    olio1.virtaPaalla();
    olio1.tulostaLampotila();
    olio1.oviAuki();
    }
}  // Main loppuu
class jaakaappi{
    boolean onkoPaalla;
    String merkki;
    int lampoTila;
    boolean oviAuki;

    public jaakaappi(boolean op, String m, Integer lT){ // taysiparametri muodostin
        onkoPaalla = op;
        merkki = m;
        lampoTila = lT;
        oviAuki = false;
    }
    public void tulostaLampotila(){
        System.out.println("Lampotila on :" + lampoTila);
    }
    public void virtaPaalla(){
        onkoPaalla = true;
    }
    public void oviAuki(){
        if(oviAuki){
            System.out.println("Valo palaa.");
        } else {System.out.println("Valo ei pala.");}
    }
} // Class jaakaappi loppuu