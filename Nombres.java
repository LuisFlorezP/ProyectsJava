public class Nombres{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int ubic;
        String datos[]=new String[10];

        System.out.print("\nIngresar nombre: ");
        nombre=sc.nextLine();
        System.out.print("Ingresar la ubicación para almacenar de 1 a 10: ");
        ubic=sc.nextInt();

        datos[ubic]=nombre;
        System.out.println("\nEl arreglo contiene: "+datos[ubic]);
        System.out.println("\nLongitud del arreglo: "+datos.length+".\n");
    }
}
