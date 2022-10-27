import javax.swing.JOptionPane;

public class Nombres{
    static int menu;

    public static void main(String[] args) {
        int dimen;

        JOptionPane.showMessageDialog(null,"⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘\nBIENVENIDO AL PROGRAMA ALMACENAMIENTO\n⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Almacenamiento de nombres.\n   - Opción 2: Cerrar sistema.","⌘⌘⌘ALMACENAMIENTO⌘⌘⌘",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    dimen=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar el espacio que tendrá el almacenamiento de nombres:","⌘⌘⌘ALMACENAMIENTO⌘⌘⌘",JOptionPane.QUESTION_MESSAGE));
                    menu(dimen);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while(menu!=2);
    }

    static void menu(int espacio) {
        String nombres[]=new String[espacio];

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Ingresar nombre.\n   - Opción 2: Ver nombre.\n   - Opción 3: Ver todos los nombres.\n   - Opción 4: Menú anterior.","⌘⌘⌘ALMACENAMIENTO⌘⌘⌘",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    almacenar();
                    break;
                case 2:
                    dato1();
                    break;
                case 3:
                    dato2();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (menu!=4);
    }

    static void almacenar() {

    }

    static void dato1() {

    }

    static void dato2() {

    }
}
