
import java.util.Scanner;



public class Boletin52{
    public static void main(String [] args) {
        Satelite luna=new Satelite();
        Satelite europa=new Satelite(15,20,35);
        
       luna.verPosicion();
        europa.verPosicion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuanto distancia esta del meridiano?");
        double meridiano=sc.nextDouble();
        System.out.println("Cuanta distacia esta del paralelo?");
        double paralelo=sc.nextDouble();
        System.out.println("Cuanta distacia esta de la tierra?");
        double distanciatierra=sc.nextDouble();
        Satelite colombo=new Satelite(meridiano,paralelo,distanciatierra);
        colombo.verPosicion();
      
        
        
        
        
    }
}
