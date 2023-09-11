public class ArraysMultidimensionales{
    // esto es un array de arrays
    public static void main(String[] args) {
        int miArrayDeUnaDimension[] = new int[10];
        int myArrayDeDosDimension[][] = new int[19][22];
        // como se observa se agrega un par de [] por cada dimension.

        // asi inicializamos arrays multiD en el momento de su declaracion
        int myArrayMultiD[][] = {{1, 2, 3}, {1, 3, 5, 5}, {2, 4, 5}};
        // estos se utilizan cuando 
        int[][] matriz = new int[3][3];

// Asignar valores a la matriz
    matriz[0][0] = 1;
    matriz[0][1] = 2;
    matriz[0][2] = 3;
    matriz[1][0] = 4;
    matriz[1][1] = 5;
    matriz[1][2] = 6;
    matriz[2][0] = 7;
    matriz[2][1] = 8;
    matriz[2][2] = 9;

// Recorrer la matriz
for (int fila = 0; fila < 3; fila++) {
    for (int columna = 0; columna < 3; columna++) {
        System.out.print(matriz[fila][columna] + " ");
    }
    System.out.println(); // Salto de línea para cada fila
}
    }
}