/*Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Dificultad: Facil
 * Enunciado: Escribe un programa que muestre por consola los números del 1 al 100.
 * - Múltiplos de 3: Se sustituyen por la palabra "Fizz"
 * - Múltiplos de 5: Se sustituyen por la palabra "Buzz"
 * - Múltiplos de 3 y 5: Se sustituyen por la palabra "FizzBuzz"
 */

public class FizzBuzz {
    public static void main(String[] args) throws Exception {
        int i =1;
        
        for (i=1; i<=100; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
