import javax.swing.JOptionPane;

public class Salario {
    public static void main(String[] args) {
        double salario, horas, valHora, salud, pension, total;

        JOptionPane.showMessageDialog(null, "BIENVENIDO", "LUCHINI S.A.S", JOptionPane.INFORMATION_MESSAGE);
        valHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar valor de la hora:", "INGRESE SALARIO", JOptionPane.QUESTION_MESSAGE));
        horas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar cantidad de horas:", "INGRESE SALARIO", JOptionPane.QUESTION_MESSAGE));
        salario = valHora * horas;
        salud = salario * 0.04;
        pension = salario * 0.04;
        total = salario - salud - pension;
        JOptionPane.showMessageDialog(null, "Salario normal: $" + salario + ".\nDescuento salud: $" + salud + ".\nDescuento pensión: $" + pension + ".\nSalario final: $" + total + ".", "NÓMINA", JOptionPane.INFORMATION_MESSAGE);
    }
}
