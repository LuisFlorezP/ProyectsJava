import java.util.Scanner;
import javax.swing.JOptionPane;

public class Constructor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String codigoA2, nomAsig2, nomProg2;
        int menu;
        

        JOptionPane.showMessageDialog(null,"◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉\nBIENVENIDO AL SISTEMA ACADÉMICO\n◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉◉","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);
        
        System.out.print("\nIngresar código de la asignatura: ");
        codigoA2=sc.nextLine();
        System.out.print("Ingresar código de la asignatura: ");
        nomAsig2=sc.next();
        System.out.print("Ingresar código de la asignatura: ");
        nomProg2=sc.next();

        Matricula materia = new Matricula(codigoA2,nomAsig2,nomProg2);
        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Datos generales.\n   - Opción 2: Cerrar sistema.","◉◉◉SIA◉◉◉",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    materia.informacion();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (menu!=2);        
    }
}
