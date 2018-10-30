/*
Programa que lee una cadena y un carácter y cuenta el número de 
veces que aparece dicho carácter en la cadena.
 */
package stringsgithub;
import java.util.Scanner;
public class StringsGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena; // Las cadenas empiezan en 0
        int cont=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("¿Por qué letra empieza?");
        char caracter=sc.nextLine().charAt(0);
        caracter=Character.toUpperCase(caracter);
        System.out.println("Anota cadena");
        cadena=sc.nextLine();
        cadena=cadena.toUpperCase(); // Hace mayúsculas las cadenas
        for(int i=0; i<cadena.length(); i++){
            char letra=cadena.charAt(i);
            if (letra==caracter)
                cont++;
        }
        System.out.println("La letra "+ caracter +" se repite "+cont+ " veces");
    }
    
}
