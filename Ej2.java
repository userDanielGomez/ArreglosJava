import java.util.Scanner;

public class Ej2{
  
  public static void main(String[] args) {
    // Realizar un programa que contenga un vector cuya longitud sea 
    // proporcionada por el usuario, despues solicitar al usuario los
    // números necesarios para llenar todas las posiciones del vector, es
    // decir, si el usuario solicitó un arreglo de 10 dimensiones, entonces
    // el programa deberá de solicitarle al usuario 10 números, y 
    // finalmente imprimir el arreglo en pantalla de la siguiente manera
    // [5] [54] [12] [65] [6] [54] [897]

    int longitud = 0;
    //Creación de objeto Scanner para leer la entrada de teclado
    Scanner entrada = new Scanner(System.in);
    //Lectura y validación de la variable longitud
    while (true) {
      try{
        System.out.println("Ingrese la longitud del vector a crear");
        longitud = Integer.parseInt(entrada.nextLine());
        if(longitud>0)
          break;
      }catch(Exception e){
        System.out.println("El valor debe ser un numero entero");
      }
    }

    int arreglo[] = new int[longitud];

    //Bucle para obtener y almacenar los valores del arreglo
    for(int i=0; i<longitud; i++){
      while (true) {
        try{
          System.out.println("Ingrese el valor a almacenar en la posición "+i);
          arreglo[i]=Integer.parseInt(entrada.nextLine());
          break;
        }catch(Exception e){
          System.out.println("El valor debe ser númerico");
        }
      }
    }

    //Bucle para recorrer el arreglo almacenado
    for(int i = 0; i<longitud; i++){
      System.out.print("["+arreglo[i]+"]");
    }

    //Se cierra el objeto Scanner
    entrada.close();
  }

}