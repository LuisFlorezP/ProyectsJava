import javax.swing.JOptionPane;
public class Cajero {
    enum cuenta {Ahorros,Corriente}
    String nombre, tipoDoc, documento, numCuenta;
    cuenta tipoCuenta;
    static double saldo=0;

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
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Consultar información básica.\n   - Opción 2: Consignaciones.\n   - Opción 3: Retiros.\n   - Opción 4: Consultar saldo.\n   - Opción 5: Saldo con rentabilidad.\n   - Opción 6: Cerrar sistema.","♆♆♆CAJERO♆♆♆",JOptionPane.QUESTION_MESSAGE));
        
            switch (menu) {
                case 1:
                    valor.datos();
                    break;
                case 2: 
                    valor.consignar(100000);
                    break;
                case 3:
                    valor.retirar(50000);
                    break;
                case 4: 
                    valor.saldo();
                    break;
                case 5:
                    valor.rentabilidadSaldo();
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
        JOptionPane.showMessageDialog(null,"INFORMACIÓN BÁSICA DE LA CUENTA.\n   - Nombre titular: "+nombre+"\n   - Tipo documento: "+tipoDoc+"\n   - Número documento: "+documento+"\n   - Tipo de cuenta: "+tipoCuenta+"\n   - Número de cuenta: "+numCuenta,"♆♆♆CAJERO♆♆♆",JOptionPane.INFORMATION_MESSAGE);
    }

    void consignar(int nuevo) {
        saldo+=nuevo;
        JOptionPane.showMessageDialog(null,"¡CONSIGNACIÓN EXITOSA!\n\nNuevo saldo: "+saldo,"♆♆♆CAJERO♆♆♆",JOptionPane.INFORMATION_MESSAGE);
    }

    void retirar(int nuevo) {
        if (saldo>=nuevo) {
            saldo-=nuevo;
            JOptionPane.showMessageDialog(null,"¡RETIRO EXITOSO!\n\nNuevo saldo: "+saldo,"♆♆♆CAJERO♆♆♆",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,"¡SALDO INSUFICIENTE!","♆♆♆CAJERO♆♆♆",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null,"¡RETIRO FALLIDO!\n\nNuevo saldo: "+saldo,"♆♆♆CAJERO♆♆♆",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    void saldo() {
        JOptionPane.showMessageDialog(null,"Saldo actual: "+saldo,"♆♆♆CAJERO♆♆♆",JOptionPane.INFORMATION_MESSAGE);
    }

    void rentabilidadSaldo() {
        double saldoR=saldo;
        double renta=0.089;

        if (saldoR>20000) {
            saldoR+=saldoR*renta;
            JOptionPane.showMessageDialog(null,"Saldo con rentabilidad: "+saldoR,"♆♆♆CAJERO♆♆♆",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,"Monto insuficiente.","♆♆♆CAJERO♆♆♆",JOptionPane.WARNING_MESSAGE);
        }
    }
}
