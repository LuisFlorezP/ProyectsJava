import javax.swing.JOptionPane;

public class Lotes {
    public static void main(String args[]) {
        // Definir variables
        int limite=0, limUsuario=0, numero=-1, lote=1, cont=0;
        // Saludo
        JOptionPane.showMessageDialog(null,"☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬\nBIENVENIDO AL PROGRAMA DE LOTES IMPARES\n☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬☬","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);
        // Ciclo para pedir límite >=50
        do {
            limUsuario=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar un límite para la secuencia (debe ser igual o mayor a 50):","☬☬☬INGRESAR LÍMITE☬☬☬",JOptionPane.QUESTION_MESSAGE));
            if (limUsuario>=50) {
                // Asignar límite
                limite=limUsuario;
            }
            else {
                // Error de digitación
                JOptionPane.showMessageDialog(null,"Digitó un número erróneo, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }   
        } while (limUsuario<50);
        System.out.println();
        // Ciclo para imprimir los número impares hasta el límite indicado
        for (cont=0;numero+1<=limite-1;cont++) {
            // Sumar de 2 en 2
            numero+=2;
            // Ciclo para separar lotes
            if (cont==10) {
                System.out.println("\nLOTE "+lote+".");
                // Reiniciar variable y sumar para el nuevo lote
                cont=0; ++lote;
            }
            // Imprimir número impar
            System.out.print(numero+", ");
        }
        // Nombrar al último lote
        System.out.println("\nLote "+lote+".");
        // Mensaje de finalización
        System.out.println("\n\nFIN DEL PROCESO.\n");
    }
}
