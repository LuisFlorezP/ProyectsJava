import java.util.Scanner;

public class recuperacion {
    // Definir variables globales
    static Scanner sc = new Scanner(System.in);
    static String nombre, tipoDoc, tipoCuenta;
    static int documento, numCuenta, fin;
    static double saldo, valor;
    
    public static void main(String args[]) {
        // Definir variables locales
        int menu;
        // Pedir el ingreso por parte del usuario de todos los datos necesarios 
        System.out.print("\nIngresar nombre completo: ");
        nombre=sc.nextLine();
        System.out.print("Ingresar tipo de documento: ");
        tipoDoc=sc.next();
        System.out.print("Ingresar el número de documento: ");
        documento=sc.nextInt();
        System.out.print("Ingresar el tipo de cuenta: ");
        tipoCuenta=sc.next();
        System.out.print("Ingresar el número de cuenta: ");
        numCuenta=sc.nextInt();
        System.out.print("Ingresar saldo de la cuenta: ");
        saldo=sc.nextDouble();
        // Ciclo para el programa, opciones, fin o error
        do {
            // Menú
            System.out.println("\nCUENTA BANCARIA.");
            System.out.println("Opción 1: Consultar información básica.");
            System.out.println("Opción 2: Consignaciones.");
            System.out.println("Opción 3: Retiros.");
            System.out.println("Opción 4: Consulta de saldo.");
            System.out.println("Opción 5: Rentabilidad del saldo.");
            System.out.println("Opción 6: Cerrar sesión.");
            System.out.print("\nIngresar el número de la opción: ");
            menu=sc.nextInt();
            switch (menu) {
                case 1:
                    // Opción de consultar información básica
                    informacion();
                    break;
                case 2:
                    // Opción de consignaciones
                    consignaciones();
                    break;
                case 3:
                    // Opción de retiros
                    retiros();
                    break;
                case 4: 
                    // Opción de consulta de saldo
                    saldo();
                    break;
                case 5:
                    // Opción de rentabilidad del saldo
                    rentabilidad();
                    break;
                case 6:
                    // Salir del sistema 
                    System.out.println("\nCerrando sesión...\n");
                    break;
                default:
                    // Error de digitación
                    System.out.println("\nError, ingrese un dato válido (1,2,3,4,5,6).");
                    break;
            }
        } while (menu!=6);
    }  
    // Método para brindar la información de dicha persona
    public static void informacion() {
        // Impresión de datos básicos
        System.out.println("\nINFORMACIÓN BÁSICA DE LA CUENTA.\nNombre titular: "+nombre+"\nTipo documento: "+tipoDoc+"\nNúmero documento: "+documento+"\nTipo de cuenta: "+tipoCuenta+"\nNúmero de cuenta: "+numCuenta);
    }
    // Método para poder consignar al saldo
    public static void consignaciones() {
        // Ciclo para ingresar un valor >0
        do {
            // Pedir valor y sumarlo al saldo
            System.out.print("\nIngresar valor a consignar: $");
            valor=sc.nextDouble();
            if (valor>0) {
                saldo+=valor;
                ++fin;
                System.out.println("Consignación exitosa $$");
            }
            else {
                System.out.println("Error, digitó un valor equivocado.");
            }
        } while (fin==0);
        // Reiniciar variables
        fin=0;
    }
    // Método para poder retirar del saldo
    public static void retiros() {
        // Ciclo para ingresar un valor >0 y  menor al saldo
        do {
            // Pedir valor y restarlo al saldo
            System.out.print("\nIngresar valor a retirar: $");
            valor=sc.nextDouble();
            if (valor>0&&valor<=saldo) {
                saldo-=valor;
                ++fin;
                System.out.println("Retiro exitosa $$");
            }
            else if (valor<0) {
                System.out.println("Error, digitó un valor equivocado.");
            }
            else {
                System.out.println("Error, saldo insuficiente.");
            }
        } while (fin==0);
        fin=0;
    }
    // Método para conocer la actualidad del saldo
    public static void saldo() {
        // Imprimir saldo
        System.out.println("\nSaldo actual: $"+saldo);
    }
    // Método para ver la rentabilidad del saldo
    public static void rentabilidad() {
        // Definir variables locales
        double saldo2=saldo, rentabilidad=0.089;
        // Proceso de rentabilidad
        saldo2+=saldo2*rentabilidad;
        if (saldo2>20000) {
            // Imprimir rentabilidad siempre que sea >20.000
            System.out.println("\nRentabilidad: $"+saldo2);
        }
    }
}
