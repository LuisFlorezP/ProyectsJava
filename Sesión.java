import javax.swing.JOptionPane;

public class Sesión {
    static boolean R;
    String usuario;
    String contra;

    Sesión(String usuario, String contra) {
        this.usuario=usuario;
        this.contra=contra;
    }

    public static void main(String args[]) {
        int menu;
        Sesión datos = new Sesión("LuisFlorez","2004");

        JOptionPane.showMessageDialog(null,"★★★★★★★★★★★★★★★★★★\nBIENVENIDO AL SISTEMA GERENCIAL\n★★★★★★★★★★★★★★★★★★","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);


        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Acceder.\n   - Opción 2: Cerrar sistema.","★★★GERENCIA★★★",JOptionPane.QUESTION_MESSAGE));
            
            switch (menu) {
                case 1:
                    datos.Acceso();
                    if (R==true) {
                        JOptionPane.showMessageDialog(null,"¡INICIO DE SESIÓN CORRECTO!","★★★GERENCIA★★★",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"¡USUARIO O CONTRASEÑA INCORRECTA!","★★★GERENCIA★★★",JOptionPane.WARNING_MESSAGE);
                    }
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

    boolean Acceso () {
        String usuarioU, contraU;

        usuarioU=JOptionPane.showInputDialog(null,"Ingresar nombre de usuario:","★★★GERENCIA★★★",JOptionPane.QUESTION_MESSAGE);
        contraU=JOptionPane.showInputDialog(null,"Ingresar contraseña de usuario:","★★★GERENCIA★★★",JOptionPane.QUESTION_MESSAGE);

        if (usuario.equals(usuarioU)&&contra.equals(contraU)) {
            R=true;
            return(R);
        }
        else {
            R=false;
            return(R);
        }
    }
}
