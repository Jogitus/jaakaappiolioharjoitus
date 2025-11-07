import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        ArrayList<Integer>lampotila = new ArrayList<Integer>();
    // jaakaappi olio1 = new jaakaappi();
    
    System.out.println("Aseta jaakaapin lampotila: ");
    int ltarvo = Integer.parseInt(in.nextLine());
    lampotila.add(0,ltarvo);

    System.out.println(lampotila.get(0));
    }
} // Main loppuu
// class jaakaappi{
//     boolean onkoPaalla;
//     String merkki;
//     int lampoTila;
//     boolean oviAuki;

//     public jaakaappi(){ // Parametriton muodostin
//         onkoPaalla = false;
//         merkki = "";
//         lampoTila = 0;
//         oviAuki = false; 
//     }
//     public vaihdaLampotila(String vaihto){
//         vaihto = 
//     }
//     public tulostaLampotila(){
//         System.out.println("Lampotila on :" + lampoTila);
//     }
//     public void virtaPaalla(){
//         onkoPaalla = true;
//     }
//     public void oviAuki(){
//         if(oviAuki){
//             System.out.println("Valo palaa.");
//         } else {System.out.println("Valo ei pala.");}
//     }
//     public void 
// } // Class jaakaappi loppuu