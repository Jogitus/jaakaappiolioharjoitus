import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
    jaakaappi olio1 = new jaakaappi(true,"Epoc",6, true);

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

    public jaakaappi(boolean op, String m, Integer lT, boolean oA){ // taysiparametri muodostin
        onkoPaalla = op;
        merkki = m;
        lampoTila = lT;
        oviAuki = oA;
    }
    public void tulostaLampotila(){
        System.out.println("Lampotila on " + lampoTila);
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