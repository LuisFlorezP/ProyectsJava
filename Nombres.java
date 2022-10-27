import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Nombres{
    public static void main(String[] args) {
        String nombre;
        int ubic, menu;
        //String datos[]=new String[];

        JOptionPane.showMessageDialog(null,"⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘\nBIENVENIDO AL PROGRAMA ALMACENAMIENTO\n⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"","⌘⌘⌘ALMACENAMIENTO⌘⌘⌘",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);

                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while(menu!=3);

        System.out.print("\nIngresar nombre: ");
        nombre=sc.nextLine();
        System.out.print("Ingresar la ubicación para almacenar de 1 a 10: ");
        ubic=sc.nextInt();

        datos[ubic]=nombre;
        System.out.println("\nEl arreglo contiene: "+datos[ubic]);
        System.out.println("\nLongitud del arreglo: "+datos.length+".\n");
    }
}
