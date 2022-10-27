import javax.swing.JOptionPane;

public class Nombres{
    static int menu;

    public static void main(String[] args) {
        int dimen;

        JOptionPane.showMessageDialog(null,"⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘\nBIENVENIDO AL PROGRAMA ALMACENAMIENTO\n⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);

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
        String nombre, todo="";
        int ubic, valor=espacio;

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Ingresar nombre.\n   - Opción 2: Ver nombre.\n   - Opción 3: Ver todos los nombres.\n   - Opción 4: Menú anterior.","⌘⌘⌘ALMACENAMIENTO⌘⌘⌘",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    nombre=nuevo();
                    ubic=ubicacion(valor);
                    nombres[ubic]=nombre;
                    break;
                case 2:
                    ubic=lugar(valor);
                    nombre=nombres[ubic];
                    dato1(nombre,ubic);
                    break;
                case 3:
                    for (String arreglo : nombres) {
                        todo+="\""+arreglo+"\" ";
                    }
                    JOptionPane.showMessageDialog(null,"Datos: "+todo,"⌘⌘⌘MOSTRAR TODOS LOS DATOS⌘⌘⌘",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4: break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (menu!=4);
    }

    static String nuevo() {
        String nombre;

        nombre=JOptionPane.showInputDialog(null,"Ingresar nombre a guardar:","⌘⌘⌘GUARDAR NOMBRE⌘⌘⌘",JOptionPane.QUESTION_MESSAGE);
        return (nombre);
    }

    static int ubicacion(int max) {
        int ubic=0;

        ubic=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar ubicación (valor entre 0 y "+(max-1)+") para guardar el nombre ingresado:","⌘⌘⌘GUARDAR NOMBRE⌘⌘⌘",JOptionPane.QUESTION_MESSAGE));
        return (ubic);
    }

    static int lugar(int max) {
        int ubic=0;

        ubic=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar la ubicación (valor entre 0 y "+(max-1)+") que desea ver:","⌘⌘⌘MOSTRAR DATO⌘⌘⌘",JOptionPane.QUESTION_MESSAGE));
        return (ubic);
    }

    static void dato1(String dato, int numero) {
        JOptionPane.showMessageDialog(null,"Nombre almacenado en la posición "+numero+": "+dato+".","⌘⌘⌘MOSTRAR DATO⌘⌘⌘",JOptionPane.INFORMATION_MESSAGE);
    }
}
