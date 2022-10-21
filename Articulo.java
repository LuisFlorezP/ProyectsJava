import java.util.Scanner;

public class Articulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int cantidad;
        double valorUni, valorBru, valorDes, valorIva, valorNet, d1=0.10, d2=0.15, iva=0.19;

        System.out.print("\nIngresar el nombre del artículo: ");
        nombre=sc.next();
        System.out.print("Ingresar el valor unitario del artículo: ");
        valorUni=sc.nextDouble();
        System.out.print("Ingresar la cantidad vendida: ");
        cantidad=sc.nextInt();

        valorBru=valorUni*cantidad;

        if (valorBru<100000) {
            valorDes=valorBru*d1;
        }
        else {
            valorDes=valorBru*d2;
        }

        valorIva=valorBru*iva;

        valorNet=valorBru-valorDes+valorIva;

        System.out.println("\n - Nombre del artículo: "+nombre);
        System.out.println(" - Valor bruto: "+valorBru);
        System.out.println(" - Valor descuento: "+valorDes);
        System.out.println(" - Valor iva: "+valorIva);
        System.out.println(" - Valor neto: "+valorNet+"\n");
    }
}
