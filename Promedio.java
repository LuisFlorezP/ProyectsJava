import javax.swing.JOptionPane;

public class Promedio {
    public static void main(String[] args) {
        // Definir variable
        int cont=1;
        double nota=0, porc=0.25, total=0;

        // Saludo
        JOptionPane.showMessageDialog(null,"♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜\nBIENVENIDO AL PROGRAMA DE CALCULAR EL PROMEDIO DE SU SEMESTRE\n♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜♜","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);

        // Ciclo para pedir las 4 notas y hacer el promedio
        while (cont<=4) {
            nota=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar nota N°"+cont+" del 25%:","♜♜♜PROMEDIO SEMESTRE♜♜♜",JOptionPane.QUESTION_MESSAGE));
            if (nota>=0&&nota<=5) {
                total+=nota*porc;
                ++cont;
            }
            else {
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // Imprimir el resultado del promedio
        JOptionPane.showMessageDialog(null,"La nota final de su semestre es: "+total,"♜♜♜PROMEDIO SEMESTRE♜♜♜",JOptionPane.INFORMATION_MESSAGE);
    }
}
