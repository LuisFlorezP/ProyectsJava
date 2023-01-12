import javax.swing.JOptionPane;
// Luis Angel Flórez Palacio

public class Calculadora {
    public static void main(String[] args) {
        int menu;
        double numero1, numero2, resultado;

        JOptionPane.showMessageDialog(null,"¡BIENVENIDO A TU CALCULADORA!" ,"LUCHINI S.A.S", JOptionPane.INFORMATION_MESSAGE);
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "   - Opción 1: Sumar 2 números.\n   - Opción 2: Restar 2 números.\n   - Opción 3: Multiplicar 2 números.\n   - Opción 4: Dividir 2 números.\n   - Opción 5: Potencia de un número sobre otros.\n   - Opción 6: Salir.\nIngrese la opción deseada.", "CALCULADORA", JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1: 
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar primer número:", "SUMA", JOptionPane.QUESTION_MESSAGE));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar primer segundo:", "SUMA", JOptionPane.QUESTION_MESSAGE));
                    resultado = numero1 + numero2;
                    JOptionPane.showMessageDialog(null, "Resultado de " + numero1 + " y " + numero2 + ": " + resultado + ".", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar primer número:", "RESTA", JOptionPane.QUESTION_MESSAGE));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar primer segundo:", "RESTA", JOptionPane.QUESTION_MESSAGE));
                    resultado = numero1 - numero2;
                    JOptionPane.showMessageDialog(null, "Resultado de " + numero1 + " y " + numero2 + ": " + resultado + ".", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3: 
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar primer número:", "MULTIPLICACIÓN", JOptionPane.QUESTION_MESSAGE));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar primer segundo:", "MULTIPLICACIÓN", JOptionPane.QUESTION_MESSAGE));
                    resultado = numero1 * numero2;
                    JOptionPane.showMessageDialog(null, "Resultado de " + numero1 + " y " + numero2 + ": " + resultado + ".", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);

                    break;
                case 4:
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar primer número:", "DIVISIÓN", JOptionPane.QUESTION_MESSAGE));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar primer segundo:", "DIVISIÓN", JOptionPane.QUESTION_MESSAGE));
                    resultado = numero1 / numero2;
                    JOptionPane.showMessageDialog(null, "Resultado de " + numero1 + " y " + numero2 + ": " + resultado + ".", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5: 
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar número a elevar:", "POTENCIA", JOptionPane.QUESTION_MESSAGE));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar cantidad de elevación:", "POTENCIA", JOptionPane.QUESTION_MESSAGE));
                    resultado = Math.pow(numero1, numero2);
                    JOptionPane.showMessageDialog(null, "Resultado de " + numero1 + " elevado a  " + numero2 + ": " + resultado + ".", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo...", "SALIR", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelva a intentarlo.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                }
        } while (menu!=6);
    }
}
