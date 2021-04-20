
package ejer_github;
import java.util.Scanner;


public class Ejer_Github {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        
        System.out.println("Hola grupo de POO");
        System.out.println("Ingresa un nombre para obtener sus iniciales");
        n = sc.nextLine();
        
        System.out.println(YELLOW + "--------------------------------");
        System.out.println(GREEN + "Las iniciales son: ");
        Iniciales(n);
    }
     public static void Iniciales(String nombre){
        String[] iniciales = nombre.split(" ");
        String completo = "";
      
        for (int i = 0; i < iniciales.length ; ++i ){
            String Nom= iniciales[i];
            Nom = Nom.replace(Nom.charAt(0), Character.toUpperCase(Nom.charAt(0)));
            char charM =  Character.toUpperCase(Nom.charAt(0));
            System.out.print(CIAN + charM);
            
            completo = completo + Nom + " ";
           
        }
         System.out.println("");
         System.out.println(YELLOW + "--------------------------------");
         System.out.println(GREEN + "Y su nombre completo es: ");
         System.out.println(CIAN + completo);
         System.out.println(YELLOW + "--------------------------------");
         
    }
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String CIAN = "\u001B[36m";
}
