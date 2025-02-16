package Excercises;

import java.util.Scanner;
import java.util.HashMap;


public class Main {
    public static void main(String[] args){

    /*1.1. Escribir un programa que solicite un valor entero al usuario y determine si es par o impar. */

    /* Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un valor entero: ");
    int valor = scanner.nextInt();
    String answer = "";
    answer = valor % 2 == 0 ? "Es par" : "No es par";
    System.out.println(answer);
    scanner.close();*/



    /*1.2. Escribir un programa que solicite un valor entero al usuario y determine si es positivo o negativo.  */

    /* Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un valor: ");
    int valor = scanner.nextInt();
    String answer = "";
    answer = valor >= 0 ? "Positivo " : "Negativo";
    System.out.println(answer); 
    scanner.close();*/



    /*1.3. Pedir al usuario un valor. Si el valor es positivo, pedir un segundo valor y calcular la suma, resta y producto de ambos. Mostrar los resultados por pantalla.  */
    
    /*Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un valor: ");
    int valor = scanner.nextInt();
    if(valor >= 0 ){
        System.out.println("Ingrese otro numero: ");
        int secondValor = scanner.nextInt();
        System.out.println("La suma de los dos valores es: " + (valor + secondValor));
        System.out.println("La resta de los dos valores es: " + (valor - secondValor));
        System.out.println("La multiplicacion de los dos valores es: " + (valor * secondValor));
    }
    scanner.close();*/



    /* 1.4. Calcular el mayor de dos números enteros introducidos por teclado.  */

    /* Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un valor: ");
    int valor = scanner.nextInt();
    System.out.println("Ingrese otro numero: ");
    int secondValor = scanner.nextInt();

    String answer = "Son iguales";
    answer = valor > secondValor ? "valor es mayor" : "secondValor es mayor" ;
    System.out.println(answer);

    scanner.close(); */



    /* 1.5. Calcular el mayor de tres números enteros introducidos por teclado. */

    /* Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un valor: ");
    int valor = scanner.nextInt();
    System.out.println("Ingrese otro numero: ");
    int secondValor = scanner.nextInt();
    System.out.println("Ingrese otro numero: ");
    int thirdValor = scanner.nextInt();


    String answer = "Valor es el mayor";

    if(secondValor > valor && secondValor > thirdValor){
        answer = "SecondValor es el mayor";
    }
    else if (thirdValor > valor && thirdValor > secondValor) {
        answer = "ThirdValor es el mayor";
    }
    else{
        answer = "Todos son iguales";
    }

    System.out.println(answer);

    scanner.close(); */



    /* 1.6. Calcular el mayor de cuatro números enteros introducidos por teclado.  */

    /* Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un valor: ");
    int valor = scanner.nextInt();
    System.out.println("Ingrese otro numero: ");
    int secondValor = scanner.nextInt();
    System.out.println("Ingrese otro numero: ");
    int thirdValor = scanner.nextInt();
    System.out.println("Ingrese otro numero: ");
    int fourthValor = scanner.nextInt();


    String answer = "Valor es el mayor";

    if(secondValor > valor && secondValor > thirdValor && secondValor > fourthValor){
        answer = "SecondValor es el mayor";
    }
    else if (thirdValor > valor && thirdValor > secondValor && thirdValor > fourthValor) {
        answer = "ThirdValor es el mayor";
    }
    else if (fourthValor > valor && fourthValor > secondValor && fourthValor > thirdValor){
        answer = "FourthValor es el mayor";
    }
    else{
        answer = "Todos son iguales";
    }

    System.out.println(answer);

    scanner.close(); */



    /* 1.7. Determinar en que estado está el agua en función de su temperatura. Si es negativa el estado será sólido, si es menor que 100 será líquido y si es mayor que 100 será gas. Pedir al usuario el valor de la temperatura. */

    /* Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un valor para el agua: ");
    int valor = scanner.nextInt();

    String answer = "";

     if (valor >= 0 && valor <= 100) {
        answer = "El agua es liquida";
     }
     else if(valor > 100){
        answer = "El agua es gas";
     }
     else{
        answer = "El agua es solida";
     }

    System.out.println(answer);

    scanner.close(); */



    /* 1.8. Un año es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400. Escribe un programa que lea un año y devuelva si es bisiesto o no.  */

    /* Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un año: ");
    int valor = scanner.nextInt();

    String answer = "El año NO es bisiesto";

    if((valor % 4 == 0) || (valor % 100 == 0 && valor % 400 == 0)){
        answer = "El año es bisiesto";
    }

    System.out.println(answer);

    scanner.close(); */



    /* 1.9. Dada la fecha de hoy, calcular la fecha del día siguiente. Suponer que el año no es bisiesto.  */

    /* Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el numero del dia: ");
    int day = scanner.nextInt();
    System.out.println("Ingrese el numero del mes: ");
    int month = scanner.nextInt();
    System.out.println("Ingrese el numero del año: ");
    int year = scanner.nextInt();

    if((month >= 1 && month <= 12) && (day >= 1 && day <= 31) && (year >= 0)){
        if((month == 4 || month == 6 || month == 9 || month == 11) && day >= 31){
            System.out.println("Hay un error en el dia de la fecha");
            System.exit(0);
        }
        else if(month == 2 && day > 28){
            System.out.println("Hay un error en el dia de la fecha");
            System.exit(0);
        }
        else{
            day++;
            if(month == 2 && day == 29){
                day = 1;
                month++;
            }   
            else if (month == 12 && day == 32){
                day = 1;
                month = 1;
                year++;
            } 
            else if(month != 4 && month != 6 && month != 9 && month != 11){
                if(day == 32){
                    day = 1;
                month++;
                }
            }
            else{
                day = 1;
                month++;
            }
        }
        System.out.println(day + "/" + month + "/" + year);
    }
    else{
        System.out.println("Hay un error en el dia de la fecha");
        System.exit(0);
    }
    scanner.close(); */



    /*1.10. Pedir un mes (número) y mostrar el nombre del mes. */

    /* Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el numero del mes: ");
    int day = scanner.nextInt();

    String months[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    System.out.println("El nombre del mes es: " + months[day-1]);
    scanner.close(); */



    /* 1.11. Solicitar al usuario la inicial del día de la semana y mostrar el nombre del día completo. La letra inicial puede ser mayúscula o minúscula. Usar la x para el miércoles.  */

    /* HashMap<String, String> daysOfWeek = new HashMap<>();
    daysOfWeek.put("L", "Lunes");
    daysOfWeek.put("M", "Martes");
    daysOfWeek.put("X", "Miercoles");
    daysOfWeek.put("J", "Jueves");
    daysOfWeek.put("V", "Viernes");
    daysOfWeek.put("S", "Sabado");
    daysOfWeek.put("D", "Domingo");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la inicial del dia de la semana: ");
    String day = scanner.nextLine();
    day = day.toUpperCase();
    System.out.println(daysOfWeek.get(day)); */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la fecha en el formato dd:mm:aa ");
    String date = scanner.nextLine();
    String day = date.substring(0, 2);
    String month = date.substring(3, 5);
    String year = date.substring(7);


    System.out.println( month);
}
}

/* 1.12. Solicitar al usuario una fecha (dd:mm:aaaa) y comprobar si es correcta. Para que una fecha sea correcta es necesario: 
• El año debe ser mayor que cero. 
• El mes debe estar entre 1 y 12. 
• Dependiendo del mes que sea, el día debe estar dentro de los límites válidos. Los meses que tienen 31 días son 1, 3, 5, 7, 8, 10 y 12. Los meses de 30 días son 4, 6, 9 y 11. El mes de 28 días es 2, excepto en un año bisiesto que es 29 días.  */






 


