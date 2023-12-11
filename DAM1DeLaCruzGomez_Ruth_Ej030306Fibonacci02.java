
package dam1delacruzgomez_ruth_ej030306fibonacci02;
import java.util.Scanner;
public class DAM1DeLaCruzGomez_Ruth_Ej030306Fibonacci02 {

    public static void main(String[] args) {
      
        int num1 = 0;
        int num2 = 1; 
        int resultado;
        String num1text;
        String num2text;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba un numero minimo: ");// pide por pantalla ingresar un numero minimo
        num1text = entrada.nextLine();
        num1 = Integer.valueOf(num1text);
        
        System.out.println("Escriba un numero maximo: "); // pide por pantalla ingresar un numero maximo 
        num2text = entrada.nextLine();
        num2 = Integer.valueOf(num2text);
        
        while (num2 <= 1000) { // condicional donde ingresa un numero menor o igual que 1000
            num1 = (num1 + num2);
            resultado = num1;
            System.out.println(resultado);
            System.out.print("\n");
            
            num2 = (num1 + num2); // la suma de ambos numeros es el resultado de el numero 2
            resultado = num2;
            System.out.print(resultado);
            System.out.println("\n");
            
        }
    }
}
