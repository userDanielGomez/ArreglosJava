import java.util.Scanner;

public class Ej4 {
  
  public static void main(String[] args) {
    // Crear un programa solicite filas y columnas al usuario y
    //posteriormente hacer un llenado de la matriz bidimendional
    //con variables ingresadas por el usuario

    //Declaración de variables y objeto Scanner
    int filas, columnas;
    Scanner entrada = new Scanner(System.in);

    //Solicitud, lectura y validación de las filas de la matriz
    while (true) {
      try {
        System.out.println("Ingrese las filas de la matriz");
        filas = Integer.parseInt(entrada.nextLine());
        if(filas>0)
          break;
      } catch (Exception e) {
        System.out.println("El valor ingresado debe ser un número entero positivo");
      }
    }

    //Solicitud, lectura y validación de las columnas de la matriz
    while (true) {
      try {
        System.out.println("Ingrese las columnas de la matriz");
        columnas = Integer.parseInt(entrada.nextLine());
        if(columnas>0)
          break;
      } catch (Exception e) {
        System.out.println("El valor ingresado debe ser un número entero positivo");
      }
    }

    //Declaración y definición de arreglo bidimendional
    int arreglo [][] = new int[filas][columnas];

    //Solicitud y validación de valores para arreglo bidimensional
    for(int i=0; i<filas; i++){
      for(int j=0; j<columnas; j++){
        try {
          System.out.println("Ingrese un valor entero para "+"["+i+"]"+"["+j+"]");
          arreglo[i][j]= Integer.parseInt(entrada.nextLine());
        } catch (Exception e) {
          //Si el valor ingresado no es un entero se manda un mensaje al usuario, se
          //resta una iteración para que se ejecute este codigo mientras el usuario
          //no ingrese un valor válido
          System.out.println("El valor ingresado debe ser un número entero");
          j--;
        }
      }
    }

    //Ciclo for para imprimir el arreglo ordenado
    for(int i=0; i<filas; i++){
      System.out.println();
      for(int j=0; j<columnas; j++){
        System.out.print("["+arreglo[i][j]+"]");
      }
    }

    //Se cierra la conexión del objeto Scanner
    entrada.close();

  }
}
