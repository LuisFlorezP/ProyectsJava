import java.util.Scanner;

public class Venta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre="";
        double precio=0, cantidad=0, valB=0, valI=0, valN=0, iva=0;
        int ventas=0, linea=0;
    
        System.out.print("Ingresar cantidad de ventas: ");
        ventas=sc.nextInt();
    
        for (int ct=1;ct<=ventas;ct++) {
            System.out.println("\nVENTA N°"+ct+":");
            System.out.print(" - Ingresar nombre artículo: ");
            nombre=sc.next();
            System.out.print(" - Ingresar el número de la línea del artículo (1=A,2=F,V=3,E=4): ");
            linea=sc.nextInt();
            System.out.print(" - Ingresar precio de la unidad: ");
            precio=sc.nextDouble();
            System.out.print(" - Ingresar cantidad de artículos vendidos: ");
            cantidad=sc.nextDouble();
            
            valB=precio*cantidad;
            
            if (linea==1) {
                iva=0.04;
            }
            else if (linea==2) {
                iva=0.19;
            }
            else if (linea==3) {
                iva=0.15;
            }
            else if (linea==4) {
                iva=0.22;
            }
            
            valI=valB*iva;
            valN=valB+valI;
            
            System.out.println("\nVENTA N°"+ct+":");
            System.out.println(" - Nombre artículo: "+nombre+".");
            System.out.println(" - Valor bruto: $"+valB+".");
            System.out.println(" - Valor iva: $"+valI+".");
            System.out.println(" - Valor neto: $"+valN+".");
        }
    } 
}
