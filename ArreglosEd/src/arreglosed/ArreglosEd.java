package arreglosed;

import static arreglosed.Imprimir_Matriz.imprimirMatriz; //Importamos la funcion de imprimir
import static arreglosed.sumar_matriz.sumarDiagonal; // Importamos la funcion de sumar
/**
 *
 * @author Kendall G
 */
public class ArreglosEd {

    public static void main(String[] args) {
        // Ponemos el tamaño de la matriz, rellenando X y Y
        int size_X = 6;
        int size_Y = 6;
        // Creamos la matriz, en este caso sera 3x3
        int matriz [][] = new int [size_X][size_Y];
        
        //Se imprime la matriz, y la respuesta de la suma
        System.out.println("La matriz es:");
        imprimirMatriz(matriz);
        int sumaPrincipal = sumarDiagonal(matriz, "p");
        int sumaSecundaria = sumarDiagonal(matriz, "s");
        int sumaAmbas = sumaPrincipal + sumaSecundaria;
        System.out.printf("La suma de la diagonal principal es %d y la de la secundaria es %d\n", sumaPrincipal, sumaSecundaria);
        System.out.println("La suma de ambas diagonales es " + sumaAmbas);
    }
}