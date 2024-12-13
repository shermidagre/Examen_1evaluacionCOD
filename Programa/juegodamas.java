 class juegodamas {
     /**
      * @author Samuel Hermida Gregores
      * @return el tablero
      * @param args
      */
    static  void  main(String[] args){
        String [][] tablero = {

                {"0", "X", "0", "X", "0", "X", "0", "X"},  //Fila 0 (Blancas)

                {"X", "0", "X", "0", "X", "X", "X", "0"},  //Fila 1 (Blancas)

                {"0", "X", "0", "X", "0", "X", "0", "X"},  //Fila 2 (Blancas)

                {"0", "0", "0", "0", "0", "0", "0", "0"},  //Fila 3 (Vacía)

                {"0", "0", "0", "0", "0", "0", "0", "0"},  //Fila 4 (Vacía)

                {"0", ".", "0", ".", "0", ".", "0", "."},  //Fila 5 (Negras)

                {".", "0", ".", "0", ".", "0", ".", "0"},  //Fila 6 (Negras)

                {"0", ".", "0", ".", "0", ".", "0", "."}   //Fila 7 (Negras)

};
        mostrarTablero(tablero);

        int totalFichas = contarFichasTotales(tablero);

        int[] conteoFichas = contarFichasBlancasNegras(tablero);


        System.out.println("Total de fichas en el tablero: " + totalFichas);

        System.out.println("Fichas blancas (X): " + conteoFichas[0] + ", Fichas negras (.): " + conteoFichas[1]);

    }


     /**
      * Esta función sirve para mostrar nuestro tablero
      * @param tablero
      */
     public static void mostrarTablero(String[][] tablero) {

         for (int fila = 0; fila < 8; fila++) {

             for (int columna = 0; columna < 8; columna++) {

                 System.out.print(tablero[fila][columna] + " ");

             }

             System.out.println(); // Nueva línea al final de cada fila

         }

     }


     // Función para contar el total de fichas en el tablero

     /**
      * Esta funcion realiza una cuenta de fichas en nuestro tablero y realiza la suma de blancas(x) y negras (.)
      * @param tablero
      * @return
      */
     public static int contarFichasTotales(String[][] tablero) {

         int totalFichas = 0;

         for (int fila = 0; fila < 8; fila++) {

             for (int columna = 0; columna < 8; columna++) {

                 if (tablero[fila][columna].equals("X") || tablero[fila][columna].equals(".")) {

                     totalFichas++;

                 }

             }

         }

         return totalFichas;

     }


     /**
      * Esta funcion sirve para realizar la cuenta de las fichas blancas(x) y negras(.) indivuidualmente
      * @param tablero
      * @return
      */

     public static int[] contarFichasBlancasNegras(String[][] tablero) {

         int contadorBlancas = 0;

         int contadorNegras = 0;

         for (int fila = 0; fila < 8; fila++) {

             for (int columna = 0; columna < 8; columna++) {

                 if (tablero[fila][columna].equals("X")) {

                     contadorBlancas++;

                 } else if (tablero[fila][columna].equals(".")) {

                     contadorNegras++;

                 }

             }

         }

         return new int[]{contadorBlancas, contadorNegras};

     }

 }