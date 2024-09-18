public class Ej3 {
  
  public static void main(String[] args) {
  // Crear un programa que muestre en pantalla una matriz de 2 filas
  // y 2 columnas con un numero 0 dentro de cada posición 

  //Definicion y llenado de array bidimensional
  int arreglo [][] = new int[2][2];
  arreglo[0][0]=0;
  arreglo[0][1]=0;
  arreglo[1][0]=0;
  arreglo[1][1]=0;

  //Impresion de valores de array bidimensional
  System.out.print("["+arreglo[0][0]+"]");
  System.out.println("["+arreglo[0][1]+"]");
  System.out.print("["+arreglo[1][0]+"]");
  System.out.print("["+arreglo[1][1]+"]");
  
  }

}
