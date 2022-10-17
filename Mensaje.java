import javax.swing.JOptionPane;

public class Mensaje {
    static String mensaje;
    static int menu1, menu2;

    public static void main(String args[]) {
        JOptionPane.showMessageDialog(null,"⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝\nBIENVENIDO AL PROGRAMA MENSAJE\n⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝⍝","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);

        do {
            menu1=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Escribir mensaje.\n   - Opción 2: Cerrar programa.","⍝⍝⍝MENSAJE⍝⍝⍝",JOptionPane.QUESTION_MESSAGE));

            switch (menu1) {
                case 1:
                    cadena();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                default: 
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (menu1!=2);
    }

    static void cadena() {
        
        int caracteres;

        mensaje=JOptionPane.showInputDialog(null,"Ingresar texto:","⍝⍝⍝MENSAJE⍝⍝⍝",JOptionPane.QUESTION_MESSAGE);
        caracteres=mensaje.length();

        JOptionPane.showMessageDialog(null,"Mensaje: "+mensaje+"\nCantidad de caracteres: "+caracteres,"⍝⍝⍝MENSAJE⍝⍝⍝",JOptionPane.INFORMATION_MESSAGE);

        do {
            menu2=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Mostrar una parte del texto.\n   - Opción 2: Menú anterior.","⍝⍝⍝MENSAJE⍝⍝⍝",JOptionPane.QUESTION_MESSAGE));

            switch (menu2) {
                case 1:
                    parte();
                    break;
                case 2: break;
                default: 
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (menu2!=2);
    }

    static void parte() {
        String parte;
        int ini, fin;

        ini=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar inicio de la parte deseada:","⍝⍝⍝MENSAJE⍝⍝⍝",JOptionPane.QUESTION_MESSAGE)); 
        fin=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar final de la parte deseada:","⍝⍝⍝MENSAJE⍝⍝⍝",JOptionPane.QUESTION_MESSAGE)); 

        parte=mensaje.substring(ini,fin);

        JOptionPane.showMessageDialog(null,"Nuevo mensaje: "+parte,"⍝⍝⍝MENSAJE⍝⍝⍝",JOptionPane.INFORMATION_MESSAGE);
    }
}
