import javax.swing.JOptionPane;
public class Cajero {
    enum cuenta {Ahorros,Corriente}
    String nombre, tipoDoc, documento, numCuenta;
    cuenta tipoCuenta;
    double saldo=0;

    Cajero(String nombre, String tipoDoc, String documento, cuenta tipoCuenta, String numCuenta) {
        this.nombre=nombre;
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.tipoCuenta=tipoCuenta;
        this.numCuenta=numCuenta;
    }

    public static void main (String args[]) {
        int menu=0;
        Cajero valor = new Cajero("Luis Florez","CC","1025882220",cuenta.Ahorros,"105-971-84835");

        JOptionPane.showMessageDialog(null,"♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆\nBIENVENIDO AL PROGRAMA CAJERO\n♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Consultar información básica.\n   - Opción 2: Consignaciones.\n   - Opción 3: Retiros.\n   - Opción 4: Consultar saldo.\n   - Opción 5: Saldo con rentabilidad.\n   - Opción 6: Cerrar sistema.","LUCHINI S.A.S",JOptionPane.QUESTION_MESSAGE));
        
            switch (menu) {
                case 1:
                    valor.datos();
                    break;
                case 2: 

                    break;
                case 3:

                    break;
                case 4: 

                    break;
                case 5:

                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (menu!=6);
    }

    void datos() {
        System.out.println("\nINFORMACIÓN BÁSICA DE LA CUENTA.\nNombre titular: "+nombre+"\nTipo documento: "+tipoDoc+"\nNúmero documento: "+documento+"\nTipo de cuenta: "+tipoCuenta+"\nNúmero de cuenta: "+numCuenta+"\n");
    }

    void consignar() {

    }

    void retirar() {

    }

    void saldo() {

    }

    void rentabilidadSaldo() {

    }
}
