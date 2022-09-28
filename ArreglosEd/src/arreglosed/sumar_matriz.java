package arreglosed;
/**
 * @author Kendall G
 */
public class sumar_matriz {
    //Creamos una funcion para poder sumar la matriz, diagonalmente.
    
    static int sumarDiagonal(int[][] matriz, String diagonal) {
        int suma = 0;
        
/*NOTA IMPORTANTE => El patron de las diagonales principales es que siempre suma X y Y,
las diagonales secundarias suman X y restan Y; */
        
        // Aqui compara si la diagonal, es la diagonal principal.
        if (diagonal.equals("p")) {
            int x = 0, y = 0; //inicializamos X y Y para comenzar con 0 , 0
            while (x < matriz.length && y < matriz[0].length) {
                suma += matriz[y][x];
                x++; // Sumamos 1 a X, Y para poder seguir con la diagonal 
                y++;
            }
        //En caso que ya la diagonal principal sea llenada, vamos a llenar ahora la diagonal secundara "S"
        } else {
            int x = 0, y = matriz.length - 1;
            while (x < matriz.length && y >= 0) {
                suma += matriz[y][x];
                x++; 
                y--;
            }
        }
        return suma;
    }
}
