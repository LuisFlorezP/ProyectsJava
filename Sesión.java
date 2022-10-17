import javax.swing.JOptionPane;

public class Sesión {
    static boolean R1, R2;
    String usuario, contra, nombre;

    Sesión(String usuario, String contra) {
        this.usuario=usuario;
        this.contra=contra;
    }
    Sesión(String nombre) {
        this.nombre=nombre;
    }

    public static void main(String args[]) {
        int menu;
        Sesión datos1 = new Sesión("LuisFlorez","2004");
        Sesión datos2 = new Sesión("Angel");

        JOptionPane.showMessageDialog(null,"★★★★★★★★★★★★★★★★★★\nBIENVENIDO AL SISTEMA GERENCIAL\n★★★★★★★★★★★★★★★★★★","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Acceder.\n   - Opción 2: Cerrar sistema.","★★★GERENCIA★★★",JOptionPane.QUESTION_MESSAGE));
            
            switch (menu) {
                case 1:
                    datos1.Acceso();
                    if (R1==true) {
                        JOptionPane.showMessageDialog(null,"¡INICIO DE SESIÓN CORRECTO!","★★★GERENCIA★★★",JOptionPane.INFORMATION_MESSAGE);
                        datos2.confirmacion();
                        if (R2==true) {
                            JOptionPane.showMessageDialog(null,"¡CONFIRMACIÓN CORRECTA!","★★★GERENCIA★★★",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"¡NOMBRE INCORRECTO!","★★★GERENCIA★★★",JOptionPane.WARNING_MESSAGE);
                        }
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
            R1=true;
            return(R1);
        }
        else {
            R1=false;
            return(R1);
        }
    }
    boolean confirmacion() {
        String nombreU;

        nombreU=JOptionPane.showInputDialog(null,"Ingresar segundo nombre para confirmar","★★★GERENCIA★★★",JOptionPane.QUESTION_MESSAGE);

        if (nombre.equalsIgnoreCase(nombreU)) {
            R2=true;
            return(R2);
        }
        else {
            R2=false;
            return(R2);
        }
    }
}
