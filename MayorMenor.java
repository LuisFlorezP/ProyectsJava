import javax.swing.JOptionPane;

public class MayorMenor {
    public static void main(String[] args) {
        double numero1, numero2, numero3, mayor, medio, menor;

        JOptionPane.showMessageDialog(null, "BIENVENIDO", "LUCHINI S.A.S", JOptionPane.INFORMATION_MESSAGE);
        numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar primer número:", "NÚMERO 1", JOptionPane.QUESTION_MESSAGE));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar segundo número:", "NÚMERO 2", JOptionPane.QUESTION_MESSAGE));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar tercero número:", "NÚMERO 3", JOptionPane.QUESTION_MESSAGE));

        if (numero1 > numero2 && numero1 > numero3) {
            mayor = numero1;
            if (numero2 > numero3) {
                medio = numero2;
                menor = numero3;
            }
            else {
                medio = numero3;
                menor = numero2;
            }
        }
        else if (numero2 > numero3) {
            mayor = numero2;
            if (numero1 > numero3) {
                medio = numero1;
                menor = numero3;
            }
            else {
                medio = numero3;
                menor = numero1;
            }
        }
        else {
            mayor = numero3;
            if (numero1 > numero2) {
                medio = numero1;
                menor = numero2;
            }
            else {
                medio = numero2;
                menor = numero1;
            }
        }
        JOptionPane.showMessageDialog(null, "Orden de mayor a menor:\n - " + mayor + ".\n - " + medio + ".\n - " + menor + ".", "MAYOR A MENOR", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Orden de menor a mayor:\n - " + menor + ".\n - " + medio + ".\n - " + mayor + ".", "MENOR A MAYOR", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Número mayor: " + mayor + ".\nNúmero menor: " + menor + ".", "MAYOR Y MENOR", JOptionPane.INFORMATION_MESSAGE);
    }
}
