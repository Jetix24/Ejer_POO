/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_github;

/**
 *
 * @author 52614
 */
public class Formatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cabecera = "\n\t PRONOSTICO DE CLIMA: \n";
        cabecera+="\n\tDia\t\tMañana\tNoche\tConciciones\n";
        cabecera+="\t-----\t";
        String pronostico="\tDomingo\t25C\t\t33C\t\tCsoleado\n";
        pronostico +="\tLunes\t18C\t\t19C\t\tNublado\n";
        System.out.println(cabecera+pronostico);
        
                
                
    }
    
}
