/*Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * DIFICULTAD: DIFICIL
 * ENUNCIADO: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando por el 0.
 * La serie de Fibonacci se compone de una sucesión de números en la que el siguiente siempre es la suma del anterior.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

 public class Fibonacci {
    
   public static void main(String[] args) throws Exception { 
      long n1=0;
      long n2=1;
      int i=0;

      for (i=0; i<=50; i++){
         System.out.println(n1);
         long fib = n1+n2;
         n1=n2;
         n2=fib;
         
      }
   }
}
