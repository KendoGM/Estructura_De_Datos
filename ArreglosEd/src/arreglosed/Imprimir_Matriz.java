package arreglosed;
/*
 * @author Kendall G
 */

public class Imprimir_Matriz {
    //Creamos una funcion para imprimir la matriz. 
    static void imprimirMatriz(int[][] matriz) {
    //Creamos ciclo for para crear la matriz
  int cont = 1; //Iniciamos el contador en 1, para que empiece por 1.
  for (int x=0; x < matriz.length; x++) {
        System.out.print("|");
    for (int y=0; y < matriz[x].length; y++) {
        matriz[x][y] = cont++; // hacemos que aumente 1, cada vez que rellene un espacio.
    System.out.print (matriz[x][y]);
    
    if (y!=matriz[x].length-1) System.out.print("\t");
  }
  System.out.println("|");
    }
    }
}
