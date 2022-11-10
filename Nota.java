import javax.swing.JOptionPane;

public class Nota{
    public static void main(String[] args) {
        String resul1="", resul2="";
        int menu;

        JOptionPane.showMessageDialog(null,"■━■━■━■━■━■━■━■━■━■━■\nBIENVENIDO AL PROGRAMA NOTA\n■━■━■━■━■━■━■━■━■━■━■","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Promedio de 2 notas.\n   - Opción 2: Promedio de 3 notas.\n   - Opción 3: Cerrar sistema.","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    resul1=promedio1();
                    JOptionPane.showMessageDialog(null,resul1,"■━■━■NOTA■━■━■",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    resul2=promedio2();
                    JOptionPane.showMessageDialog(null,resul2,"■━■━■NOTA■━■━■",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while(menu!=3);    
    }

    static String promedio1() {
        String mensaje="";
        double total=100, p1=0, p2=0, n1=0, n2=0, def=0;

        mensaje="Promedio de las 2 notas ingresadas: ";
        p1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar el porcentaje (valor entre 1% y 99%) de la primer nota:","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
        p2=total-p1;
        n1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar la primer nota:","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
        n2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar la segunda nota:","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
        n1*=p1;
        n2*=p2;
        def=(n1+n2)/10;
        def=Math.round(def);
        def/=10;
        mensaje+=def+".";

        return (mensaje);
    }
    
    static String promedio2() {
        String mensaje="";



        return (mensaje);
    }
}
