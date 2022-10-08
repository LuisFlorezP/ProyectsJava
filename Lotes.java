import javax.swing.JOptionPane;

public class Lotes {
    public static void main(String args[]) {
        int limite=0, limUsuario=0, numero=-1, lote=1, cont=0;
    
        do {
            limUsuario=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar un límite para la secuencia (debe ser igual o mayor a 50):","INGRESAR LÍMITE",JOptionPane.QUESTION_MESSAGE));
            if (limUsuario>=50) {
                limite=limUsuario;
            }
            else {
                JOptionPane.showMessageDialog(null,"Digitó un número erróneo, vuelva a intentarlo.","ERROR",JOptionPane.ERROR_MESSAGE);
            }   
        } while (limUsuario<50);
        
        System.out.println();

        for (cont=0;numero+1<=limite-1;cont++) {
            numero+=2;
            if (cont==10) {
                System.out.println("\nLOTE "+lote+".");
                cont=0; ++lote;
            }
            System.out.print(numero+", ");
        }
        System.out.println("\nLote "+lote+".");
        System.out.println("\n\nFIN DEL PROCESO.\n");
        
    }
}
