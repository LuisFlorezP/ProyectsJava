import javax.swing.JOptionPane;

public class Consecutivos {
    public static void main(String args[]){
        String resul="";
        int menu=0;

        JOptionPane.showMessageDialog(null,"⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟\nBIENVENIDO AL PROGRAMA CONSECUTIVOS\n⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟⍟","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);
        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Consecutivos.\n   - Opción 2: Cerrar sistema.","⍟⍟⍟CONSECUTIVOS⍟⍟⍟",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    resul=consecutivo();
                    JOptionPane.showMessageDialog(null,resul,"⍟⍟⍟CONSECUTIVOS⍟⍟⍟",JOptionPane.INFORMATION_MESSAGE);
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

    static String consecutivo() {
        String mensaje="";
        int numero=1, limite=0, bloque=0;

        limite=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el límite de números consecutivos a partir de 1: ","⍟⍟⍟CONSECUTIVOS⍟⍟⍟",JOptionPane.QUESTION_MESSAGE));

        mensaje="IMPRESIÓN NÚMEROS.\n   - Secuencia:\n   ";
        while (numero<=limite) {
            if (bloque!=10) {
                if (numero==limite) {
                    mensaje+=numero+".";
                    numero++;
                }
                else {
                    mensaje+=numero+", ";
                    numero++;
                }
                bloque++;
            }
            else {
                mensaje+="\n   ";
                bloque=0;
            }            
        }
        return (mensaje);
    }
}
