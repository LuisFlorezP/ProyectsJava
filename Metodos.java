import javax.swing.JOptionPane;

public class Metodos {
    public static void main(String args[]) {
        int opcion=0;
        JOptionPane.showMessageDialog(null,"♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨\nBIENVENIDO AL PROGRAMA SECUENCIAS\n♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨♨","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);
        
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccionar opción:\n   - Opción 1: Secuencia par.\n   - Opción 2: Secuencia impar.\n   - Opción 3: Secuencia de incremento y decremento.\n   - Opción 4: Secuencia de la suma con el anterior.\n   - Opción 5: Salir del programa.","♨♨♨PROGRAMA SECUENCIAS♨♨♨",JOptionPane.QUESTION_MESSAGE));
            switch (opcion) {
                case 1:
                    secuencia1();
                    break;
                case 2:
                    secuencia2();
                    break;
                case 3:
                    secuencia3();
                    break;
                case 4:
                    secuencia4();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Saliendo del programa","♨♨♨PROGRAMA SECUENCIAS♨♨♨",JOptionPane.OK_OPTION);
                    break;
            }   
        } while (opcion!=5);
    }
    public static void secuencia1() {

    }
    public static void secuencia2() {

    }
    public static void secuencia3() {
        
    }
    public static void secuencia4() {
        
    }
}
