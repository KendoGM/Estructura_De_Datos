package arreglosed;

import static arreglosed.Imprimir_Matriz.imprimirMatriz; //Importamos la funcion de imprimir
import static arreglosed.sumar_matriz.sumarDiagonal; // Importamos la funcion de sumar
import java.util.Scanner;
/**
 *
 * @author Kendall G
 */
public class ArreglosEd {

    public static void main(String[] args) {
        //
        Scanner Scan = new Scanner(System.in);
        // Ponemos el tamaño de la matriz, rellenando X y Y
        int size_X = 0;
        int size_Y = 0;
        //Pedir al usuario rellenar el codigo.
        System.out.println("Bienvenido, por favor digite de que tamaño quiere su matriz. \n El tamaño será siempre simetrico");
        System.out.println("Tamaño: ");
        size_X = Scan.nextInt();
        size_Y = size_X; 
        // Creamos la matriz, en este caso sera 3x3
        int matriz [][] = new int [size_X][size_Y];
        
        //Se imprime la matriz, y la respuesta de la suma
        System.out.println("Creando matriz de: " + size_X + " x "+ size_Y);
        imprimirMatriz(matriz);
        int sumaP = sumarDiagonal(matriz, "p");//cambiamos de String a INT
        int sumaS = sumarDiagonal(matriz, "s");//cambiamos de String a INT
        int sumaT = sumaP + sumaS; //Sumamos ambos resultados
        System.out.println("La suma de la diagonal principal es: "+ sumaP+ " y la de la secundaria es: "+  sumaS);
        System.out.println("La suma de ambas diagonales es " + sumaT);
    }
}