package talentotech.Excercises;

/**
 *
 * @author Alexander
 */
public class Functions {

    /*3.1. Crear una función llamada "suma", que reciba como parámetros dos números enteros y devuelva como resultado otro número entero que sea la suma de ambos. */
    public static int add(int a, int b) {
        return a + b;
    }

    /*3.2. Crear una función llamada "division", que reciba como parámetros dos números enteros y devuelva como resultado un número real, que sea el resultado de dividir el primer número entre el segundo (con decimales).*/
    public static double division(int a, int b) {
        return a / b;
    }

    /*3.3. Crear una función llamada "letraRepetida", que reciba como parámetros una letra y un número, y escriba en pantalla esa letra repetida en pantalla varias veces (tantas como indique el número), sin devolver ningún valor. */
    public static void repeatedLetter(char letter, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(letter);
        }
    }

    /*3.4. Crear una función llamada "rotulo", que tome como parámetro una cadena de texto, no devuelva ningún valor, y escriba en pantalla ese texto centrado (suponiendo una anchura de pantalla de 80 letras) y en la línea siguiente escriba guiones para que el rótulo parezca subrayado (tantos guiones como letras formen la palabra). */
    public static void label(String chain) {
        int space = 80 - chain.length();
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
        System.out.print(chain);
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println("");
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < chain.length(); i++) {
            System.out.print("-");
        }
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }

    }

    /*3.5. Crea dos funciones "solucionRC1" y "solucionRC2" que devuelvan las dos raíces de una ecuación de segundo grado. Además, deberás crear una función "existeSolucionRC", que devuelva un 1 si la raíz cuadrada tiene solución, o un 0, si no la tiene.*/
    public static int existeSolucionRC(double a, double b, double c) {
        double discriminante = ((b * b) - (4 * a * c));
        return discriminante > 0 ? 1 : 0;
    }

    public static double soltuionRC1(double a, double b, double c) {
        if (existeSolucionRC(a, b, c) == 1) {
            return (-b + Math.sqrt((b * b) - (4 * a * c)) / (2 * a));
        } else {
            return -1;
        }
    }

    public static double soltuionRC2(double a, double b, double c) {
        if (existeSolucionRC(a, b, c) == 1) {
            return (-b - Math.sqrt((b * b) - (4 * a * c)) / (2 * a));
        } else {
            return -1;
        }
    }

    /*3.6. Crea una función "raizCubica", que calcule la raíz cúbica de un "real", y devuelva otro "real" (pista: puedes elevar a 1/3 para hallarla).  */
    public static double raizCubica(int number) {
        return Math.pow(number, (1/3));
    }
    
    /*3.7. Escribir un procedimiento que calcule el factorial de un número natural pasado como parámetro, en forma iterativa. Realizar todas las validaciones que considere necesarias.*/
    
    public static int factorial(int number) {
        int product = number;
        for(int i = number; i > 0; i--){
            if(i-1 == 0){
                product *= 1;
            }else{
                product *= i-1;
            }
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(factorial(12
        ));
    }

}
