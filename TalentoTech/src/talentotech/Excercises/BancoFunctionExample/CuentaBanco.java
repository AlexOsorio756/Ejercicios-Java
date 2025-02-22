package talentotech.Excercises.BancoFunctionExample;
import java.util.Scanner;


/**
 *
 * @author Alexander
 */
public class CuentaBanco {
    // Funciones:
    public static double consultaSaldo(){
        double saldo = 123897.4;
        return saldo;
    }
    
    public static double hacerRetiro(){
        double saldo = 123897.4;
        Scanner scanner =new Scanner(System.in);
        double valor = scanner.nextDouble();
        if(valor > saldo){
            System.out.println("No tienes fondos suficientes pobre ");
            return 0;  
        }
        else{
            saldo -= valor;
            return valor;
        }
    }
    public static double hacerConsignacion(){
        double saldo = 123897.4;
        Scanner scanner =new Scanner(System.in);
        double dineroParaConsignar = scanner.nextDouble();
        if(dineroParaConsignar >= 0){
            saldo += dineroParaConsignar;
            System.out.println("se consigno satisfactoriamente...");
            return saldo;
        }else{
            System.out.println("El saldo a consignar es invalido...");
            return saldo;
        }
    }
    
    // Método Main:
    public static void main(String[] args){
        String usuario = "Alexander Osorio";
        while(true){
            System.out.println("Hola Usuario" + usuario+"\n");
            System.out.println("¿Qué quieres hacer el día de hoy?\n");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Hacer Retiros");
            System.out.println("3. Hacer Consignación");
            System.out.println("4. Salir");
            
            Scanner scanner =new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            if (opcion == 4){
                break;
            }
            
            switch(opcion){
                case 1:
                    System.out.println("Consultando Saldo ...");
                    consultaSaldo();
                    break;
                case 2:
                   System.out.println("4. Salir");
                    break; 
                case 3:
                   System.out.println("4. Salir");
                    break; 
                default:
                    break;
            }
        }
        
    }
}
