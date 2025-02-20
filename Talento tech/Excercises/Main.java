package Excercises;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /*
         * 1.1. Escribir un programa que solicite un valor entero al usuario y determine
         * si es par o impar.
         */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese un valor entero: ");
         * int valor = scanner.nextInt();
         * String answer = "";
         * answer = valor % 2 == 0 ? "Es par" : "No es par";
         * System.out.println(answer);
         * scanner.close();
         */

        /*
         * 1.2. Escribir un programa que solicite un valor entero al usuario y determine
         * si es positivo o negativo.
         */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese un valor: ");
         * int valor = scanner.nextInt();
         * String answer = "";
         * answer = valor >= 0 ? "Positivo " : "Negativo";
         * System.out.println(answer);
         * scanner.close();
         */

        /*
         * 1.3. Pedir al usuario un valor. Si el valor es positivo, pedir un segundo
         * valor y calcular la suma, resta y producto de ambos. Mostrar los resultados
         * por pantalla.
         */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese un valor: ");
         * int valor = scanner.nextInt();
         * if(valor >= 0 ){
         * System.out.println("Ingrese otro numero: ");
         * int secondValor = scanner.nextInt();
         * System.out.println("La suma de los dos valores es: " + (valor +
         * secondValor));
         * System.out.println("La resta de los dos valores es: " + (valor -
         * secondValor));
         * System.out.println("La multiplicacion de los dos valores es: " + (valor *
         * secondValor));
         * }
         * scanner.close();
         */

        /* 1.4. Calcular el mayor de dos números enteros introducidos por teclado. */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese un valor: ");
         * int valor = scanner.nextInt();
         * System.out.println("Ingrese otro numero: ");
         * int secondValor = scanner.nextInt();
         * 
         * String answer = "Son iguales";
         * answer = valor > secondValor ? "valor es mayor" : "secondValor es mayor" ;
         * System.out.println(answer);
         * 
         * scanner.close();
         */

        /* 1.5. Calcular el mayor de tres números enteros introducidos por teclado. */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese un valor: ");
         * int valor = scanner.nextInt();
         * System.out.println("Ingrese otro numero: ");
         * int secondValor = scanner.nextInt();
         * System.out.println("Ingrese otro numero: ");
         * int thirdValor = scanner.nextInt();
         * 
         * 
         * String answer = "Valor es el mayor";
         * 
         * if(secondValor > valor && secondValor > thirdValor){
         * answer = "SecondValor es el mayor";
         * }
         * else if (thirdValor > valor && thirdValor > secondValor) {
         * answer = "ThirdValor es el mayor";
         * }
         * else{
         * answer = "Todos son iguales";
         * }
         * 
         * System.out.println(answer);
         * 
         * scanner.close();
         */

        /* 1.6. Calcular el mayor de cuatro números enteros introducidos por teclado. */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese un valor: ");
         * int valor = scanner.nextInt();
         * System.out.println("Ingrese otro numero: ");
         * int secondValor = scanner.nextInt();
         * System.out.println("Ingrese otro numero: ");
         * int thirdValor = scanner.nextInt();
         * System.out.println("Ingrese otro numero: ");
         * int fourthValor = scanner.nextInt();
         * 
         * 
         * String answer = "Valor es el mayor";
         * 
         * if(secondValor > valor && secondValor > thirdValor && secondValor >
         * fourthValor){
         * answer = "SecondValor es el mayor";
         * }
         * else if (thirdValor > valor && thirdValor > secondValor && thirdValor >
         * fourthValor) {
         * answer = "ThirdValor es el mayor";
         * }
         * else if (fourthValor > valor && fourthValor > secondValor && fourthValor >
         * thirdValor){
         * answer = "FourthValor es el mayor";
         * }
         * else{
         * answer = "Todos son iguales";
         * }
         * 
         * System.out.println(answer);
         * 
         * scanner.close();
         */

        /*
         * 1.7. Determinar en que estado está el agua en función de su temperatura. Si
         * es negativa el estado será sólido, si es menor que 100 será líquido y si es
         * mayor que 100 será gas. Pedir al usuario el valor de la temperatura.
         */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese un valor para el agua: ");
         * int valor = scanner.nextInt();
         * 
         * String answer = "";
         * 
         * if (valor >= 0 && valor <= 100) {
         * answer = "El agua es liquida";
         * }
         * else if(valor > 100){
         * answer = "El agua es gas";
         * }
         * else{
         * answer = "El agua es solida";
         * }
         * 
         * System.out.println(answer);
         * 
         * scanner.close();
         */

        /*
         * 1.8. Un año es bisiesto si es divisible por 4 y no es por 100, o si es
         * divisible por 400. Escribe un programa que lea un año y devuelva si es
         * bisiesto o no.
         */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese un año: ");
         * int valor = scanner.nextInt();
         * 
         * String answer = "El año NO es bisiesto";
         * 
         * if((valor % 4 == 0) || (valor % 100 == 0 && valor % 400 == 0)){
         * answer = "El año es bisiesto";
         * }
         * 
         * System.out.println(answer);
         * 
         * scanner.close();
         */

        /*
         * 1.9. Dada la fecha de hoy, calcular la fecha del día siguiente. Suponer que
         * el año no es bisiesto.
         */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese el numero del dia: ");
         * int day = scanner.nextInt();
         * System.out.println("Ingrese el numero del mes: ");
         * int month = scanner.nextInt();
         * System.out.println("Ingrese el numero del año: ");
         * int year = scanner.nextInt();
         * 
         * if((month >= 1 && month <= 12) && (day >= 1 && day <= 31) && (year >= 0)){
         * if((month == 4 || month == 6 || month == 9 || month == 11) && day >= 31){
         * System.out.println("Hay un error en el dia de la fecha");
         * System.exit(0);
         * }
         * else if(month == 2 && day > 28){
         * System.out.println("Hay un error en el dia de la fecha");
         * System.exit(0);
         * }
         * else{
         * day++;
         * if(month == 2 && day == 29){
         * day = 1;
         * month++;
         * }
         * else if (month == 12 && day == 32){
         * day = 1;
         * month = 1;
         * year++;
         * }
         * else if(month != 4 && month != 6 && month != 9 && month != 11){
         * if(day == 32){
         * day = 1;
         * month++;
         * }
         * }
         * else{
         * day = 1;
         * month++;
         * }
         * }
         * System.out.println(day + "/" + month + "/" + year);
         * }
         * else{
         * System.out.println("Hay un error en el dia de la fecha");
         * System.exit(0);
         * }
         * scanner.close();
         */

        /* 1.10. Pedir un mes (número) y mostrar el nombre del mes. */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese el numero del mes: ");
         * int day = scanner.nextInt();
         * 
         * String months[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
         * "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
         * 
         * System.out.println("El nombre del mes es: " + months[day-1]);
         * scanner.close();
         */

        /*
         * 1.11. Solicitar al usuario la inicial del día de la semana y mostrar el
         * nombre del día completo. La letra inicial puede ser mayúscula o minúscula.
         * Usar la x para el miércoles.
         */

        /*
         * HashMap<String, String> daysOfWeek = new HashMap<>();
         * daysOfWeek.put("L", "Lunes");
         * daysOfWeek.put("M", "Martes");
         * daysOfWeek.put("X", "Miercoles");
         * daysOfWeek.put("J", "Jueves");
         * daysOfWeek.put("V", "Viernes");
         * daysOfWeek.put("S", "Sabado");
         * daysOfWeek.put("D", "Domingo");
         * 
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese la inicial del dia de la semana: ");
         * String day = scanner.nextLine();
         * day = day.toUpperCase();
         * System.out.println(daysOfWeek.get(day));
         * scanner.close();
         */

        /*
         * 1.12. Solicitar al usuario una fecha (dd:mm:aaaa) y comprobar si es correcta.
         * Para que una fecha sea correcta es necesario:
         * • El año debe ser mayor que cero.
         * • El mes debe estar entre 1 y 12.
         * • Dependiendo del mes que sea, el día debe estar dentro de los límites
         * válidos. Los meses que tienen 31 días son 1, 3, 5, 7, 8, 10 y 12. Los meses
         * de 30 días son 4, 6, 9 y 11. El mes de 28 días es 2, excepto en un año
         * bisiesto que es 29 días.
         */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese la fecha en el formato dd:mm:aa ");
         * String date = scanner.nextLine();
         * String dayString = date.substring(0, 2);
         * String monthString = date.substring(3, 5);
         * String yearString = date.substring(6);
         * 
         * int day = Integer.parseInt(dayString);
         * int month = Integer.parseInt(monthString);
         * int year = Integer.parseInt(yearString);
         * 
         * boolean isDayRigth, isMonthRight, isYearRight;
         * 
         * isYearRight = year >= 0 ? true : false;
         * 
         * if ((day >= 1 && day <= 31) && (month != 4 && month != 6 && month != 9 &&
         * month != 11)
         * && (month >= 1 && month <= 12)) {
         * isDayRigth = true;
         * isMonthRight = true;
         * } else if ((day >= 1 && day <= 30) && (month == 4 || month == 6 || month == 9
         * || month == 11)
         * && (month >= 1 && month <= 12)) {
         * isDayRigth = true;
         * isMonthRight = true;
         * } else if ((day >= 1 && day <= 28) && month == 2) {
         * isDayRigth = true;
         * isMonthRight = true;
         * } else if ((day >= 1 && day <= 29) && month == 2 && (year % 4 == 0) || (year
         * % 100 == 0 && year % 400 == 0)) {
         * isDayRigth = true;
         * isMonthRight = true;
         * } else {
         * isDayRigth = false;
         * isMonthRight = false;
         * }
         * 
         * System.out.println(day);
         * System.out.println(month);
         * System.out.println(year);
         * 
         * if (isDayRigth && isMonthRight && isYearRight) {
         * System.out.println("La fecha es correcta");
         * } else {
         * System.out.println("La fecha es incorrecta");
         * }
         * 
         * scanner.close();
         */

        /*
         * 1.13. Escribir un programa que permita determinar la cantidad total a pagar
         * por una llamada telefónica de N minutos
         * (introducido por el usuario), teniendo en cuenta lo siguiente:
         * • Las llamadas de 5 minutos o menos tienen un coste de 10 BsF.
         * • Cada minuto adicional a partir de los 5 primeros cuesta 2 BsF.
         */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese el numero de minutos en llamada: ");
         * String minutes = scanner.nextLine();
         * 
         * int minutesInt = Integer.parseInt(minutes);
         * 
         * if (minutesInt <= 5) {
         * System.out.println("El costo de la llamada es de 10 BsF");
         * } else {
         * int additionalMinutes = minutesInt - 5;
         * int cost = 10 + (additionalMinutes * 2);
         * System.out.println("El costo de la llamada es de " + cost + " BsF");
         * }
         * 
         * scanner.close();
         */

        /*
         * 1.14. El dueño de una papelería desea un programa que le indique el precio de
         * venta de un artículo dado. El precio se
         * calcula de acuerdo con la siguiente fórmula: PVP = precio_coste + ganancia.
         * Donde la ganancia será:
         * • El 15% si el precio de coste es inferior Bs. 3.
         * • 50 céntimos si el precio de coste está entre Bs. 3 y Bs. 6.
         * • El 25% si el precio de coste supera los Bs. 6.
         */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Ingrese el precio de coste: ");
         * String costPriceString = scanner.nextLine();
         * 
         * int costPrice = Integer.parseInt(costPriceString);
         * int gain = costPrice <= 3 && costPrice >= 6 ? 50
         * : costPrice <= 3 ? (int) (costPrice * 0.15) : (int) (costPrice * 0.25);
         * int salePrice = costPrice + gain;
         * System.out.println("El precio de venta es de: " + salePrice + " BsF");
         * scanner.close();
         */

        /*
         * 1.15. Una empresa de préstamos decidió cambiar su esquema de cobros así:
         * • Si el préstamo es de más de 5000 euros, cobra en tres cuotas
         * • Si el préstamo es de menos de 1000 euros, cobra en una cuota
         * • Si el préstamo es entre 2000 y 3000 euros cobra en dos cuotas
         * • En los demás casos cobra en cinco cuotas
         * Adicionalmente, si es de menos de 4000 euros cobra el 12% de interés, en caso
         * contrario cobra el 10% de interés.
         * El programa debe decir en cuántas cuotas debe pagar y de cuánto es cada
         * cuota. Para ello, se calcula el valor
         * total de la deuda con interés y se divide en cuotas iguales.
         */

    }
}
