
package paquete1;
import java.util.Scanner;

public class Ejecutordos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String barrio = sc.nextLine();
        Barrio b1 = new Barrio(barrio);
        String nombre = sc.nextLine();
        String cedula = sc.nextLine();
        
        Persona p1 = new Persona(nombre, cedula, b1);
        
        System.out.printf("%s", p1);
        
        
    }   
}
