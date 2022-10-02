import javax.swing.JOptionPane;

public class Definitiva {
    public static void main(String[] args) {
        // Definir variables
        String DD="DEFICIENTE", DM="MEDIO", DA="ALTO", DS="SUPERIOR";
        int fin=0;
        double nota=0;
        
        // Saludo
        JOptionPane.showMessageDialog(null,"✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤\nBIENVENIDO AL PROGRAMA NOTA DEFINITIVA\n"+
        "✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);

        do {
            // Ingresar nota
            nota=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese su nota en el rango de 0 a 5:","✤✤✤"+
            "NOTA DEFINITIVA✤✤✤",JOptionPane.QUESTION_MESSAGE));

            // Tipo de desempeño según el rango al que aplique la nota
            if (nota<0) {
              JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌"+
              "ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
            else if (nota<3) {
                JOptionPane.showMessageDialog(null,"Su nota es: "+nota+".\nDesempeño: "+DD,"✤✤✤"+
                "NOTA DEFINITIVA✤✤✤",JOptionPane.INFORMATION_MESSAGE);
                ++fin;
            }
            else if (nota<4) {
                JOptionPane.showMessageDialog(null,"Su nota es: "+nota+".\nDesempeño: "+DM,"✤✤✤"+
                "NOTA DEFINITIVA✤✤✤",JOptionPane.INFORMATION_MESSAGE);
                ++fin;
            }
            else if (nota<4.5) {
                JOptionPane.showMessageDialog(null,"Su nota es: "+nota+".\nDesempeño: "+DA,"✤✤✤"+
                "NOTA DEFINITIVA✤✤✤",JOptionPane.INFORMATION_MESSAGE);
                ++fin;
            }
            else if (nota<=5) {
                JOptionPane.showMessageDialog(null,"Su nota es: "+nota+".\nDesempeño: "+DS,"✤✤✤"+
                "NOTA DEFINITIVA✤✤✤",JOptionPane.INFORMATION_MESSAGE);
                ++fin;
            }
            else {
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌"+
                "ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (fin==0);
    }
}
