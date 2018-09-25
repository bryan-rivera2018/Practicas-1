/*
 * PRactica del examen
 */
package eva1_2_examen_practico;

import java.util.Scanner;

/**
 *
 * @author Bryan Rivera Villaseñor
 */
public class EVA1_2_EXAMEN_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bCap = new Scanner (System.in);//Variable para captura del teclado
        //Scanner es una clase para facilitar la lectira del teclado
        //System.in es la entrada de perifericos de java
        
        //Comunicar al usuario las instrucciones
        System.out.println("Introduce el numero de un mes del 1 al 12: ");//Mensaje en pantalla para el usurio
        
        int LeerMes = bCap.nextInt(); //Lo que el usuario teclee, lo convertimos a entero
        switch (LeerMes){
            case 1:
                System.out.println("El Mes es Enero");
                break;
            case 2:
                System.out.println("El Mes es Febrero");
                break;
            case 3:
                System.out.println("El Mes es Marzo");
                break;
            case 4:
                System.out.println("El Mes es Abril");
                break;
            case 5:
                System.out.println("El Mes es Mayo");
                break;
            case 6:
                System.out.println("El Mes es Junio");
                break;
            case 7:
                System.out.println("El Mes es Julio");
                break;
            case 8:
                System.out.println("El Mes es Agosto");
                break;
            case 9:
                System.out.println("El Mes es Septiembre");
                break;
            case 10:
                System.out.println("El Mes es Octubre");
                break;
            case 11:
                System.out.println("El Mes es Noviembre");
                break;
            case 12:
                System.out.println("El Mes es Diciembre");
                break;
            default: //Siempre al final, sin break
                System.out.println("El mes no existe, lo siento!!");
        }
    
    }
    
}
