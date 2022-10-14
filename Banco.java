import java.util.Scanner;

public class recuperacion {
    static Scanner sc = new Scanner(System.in);
    static String nombre, tipoDoc, tipoCuenta;
    static int documento, numCuenta, fin;
    static double saldo, valor;
    
    public static void main(String args[]) {
        int menu;

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

        do {
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
                    informacion();
                    break;
                case 2:
                    consignaciones();
                    break;
                case 3:
                    retiros();
                    break;
                case 4: 
                    saldo();
                    break;
                case 5:
                    rentabilidad();
                    break;
                case 6:
                    System.out.println("\nCerrando sesión...\n");
                    break;
                default:
                    System.out.println("\nError, ingrese un dato válido (1,2,3,4,5,6).");
                    break;
            }
        } while (menu!=6);
    }  
    
    public static void informacion() {
        System.out.println("\nINFORMACIÓN BÁSICA DE LA CUENTA.\nNombre titular: "+nombre+"\nTipo documento: "+tipoDoc+"\nNúmero documento: "+documento+"\nTipo de cuenta: "+tipoCuenta+"\nNúmero de cuenta: "+numCuenta);
    }

    public static void consignaciones() {
        do {
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
        fin=0;
    }

    public static void retiros() {
        do {
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

    public static void saldo() {
        System.out.println("\nSaldo actual: $"+saldo);
    }
    
    public static void rentabilidad() {
        double saldo2=saldo, rentabilidad=0.089;

        saldo2+=saldo2*rentabilidad;
        if (saldo2>20000) {
            System.out.println("\nRentabilidad: $"+saldo2);
        }
    }
}
