import javax.swing.JOptionPane;
public class Cajero {
    // Definir variables
    enum cuenta {Ahorros,Corriente}
    String nombre, tipoDoc, documento, numCuenta;
    cuenta tipoCuenta;
    static double saldo=0;

    // Crear método constructor
    Cajero(String nombre, String tipoDoc, String documento, cuenta tipoCuenta, String numCuenta) {
        this.nombre=nombre;
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.tipoCuenta=tipoCuenta;
        this.numCuenta=numCuenta;
    }

    public static void main (String args[]) {
        // Definir variables
        int menu=0;
        // Definir datos de entrada por el constructor
        Cajero valor = new Cajero("Luis Florez","CC","1025882220",cuenta.Ahorros,"105-971-84835");
        // Saludo
        JOptionPane.showMessageDialog(null,"♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆\nBIENVENIDO AL PROGRAMA CAJERO\n♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆♆","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);
        // Ciclo programa
        do {
            // Mostrar opciones de menú
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Consultar información básica.\n   - Opción 2: Consignaciones.\n   - Opción 3: Retiros.\n   - Opción 4: Consultar saldo.\n   - Opción 5: Saldo con rentabilidad.\n   - Opción 6: Cerrar sistema.","♆♆♆CAJERO♆♆♆",JOptionPane.QUESTION_MESSAGE));
            // Opciones
            switch (menu) {
                case 1:
                    // Opción del método para consultar información básica
                    valor.datos();
                    break;
                case 2: 
                    // Opción del método para consginar
                    valor.consignar(100000);
                    break;
                case 3:
                    // Opción del método para retirar
                    valor.retirar(50000);
                    break;
                case 4: 
                    // Opción del método para consultar saldo actual
                    valor.saldo();
                    break;
                case 5:
                    // Opción del método para consultar saldo actual con rentabilidad
                    valor.rentabilidadSaldo();
                    break;
                case 6:
                    // Cerrar programa
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    // Error de digitación
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (menu!=6);
    }
    // Método para consultar información básica
    void datos() {
        // Mensaje de información básica
        JOptionPane.showMessageDialog(null,"INFORMACIÓN BÁSICA DE LA CUENTA.\n   - Nombre titular: "+nombre+"\n   - Tipo documento: "+tipoDoc+"\n   - Número documento: "+documento+"\n   - Tipo de cuenta: "+tipoCuenta+"\n   - Número de cuenta: "+numCuenta,"♆♆♆CAJERO♆♆♆",JOptionPane.INFORMATION_MESSAGE);
    }
    // Método para consginar
    void consignar(int nuevo) {
        // Sumar la consignación
        saldo+=nuevo;
        // Mensaje de éxito y nuevo saldo
        JOptionPane.showMessageDialog(null,"¡CONSIGNACIÓN EXITOSA!\n\nNuevo saldo: "+saldo,"♆♆♆CAJERO♆♆♆",JOptionPane.INFORMATION_MESSAGE);
    }
    // Método para retirar
    void retirar(int nuevo) {
        if (saldo>=nuevo) {
            // Restar el retiro
            saldo-=nuevo;
            // Mensaje de éxito y nuevo saldo
            JOptionPane.showMessageDialog(null,"¡RETIRO EXITOSO!\n\nNuevo saldo: "+saldo,"♆♆♆CAJERO♆♆♆",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            // Mensajes de fallo por saldo insuficiente
            JOptionPane.showMessageDialog(null,"¡SALDO INSUFICIENTE!","♆♆♆CAJERO♆♆♆",JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null,"¡RETIRO FALLIDO!\n\nNuevo saldo: "+saldo,"♆♆♆CAJERO♆♆♆",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    // Método para consultar saldo actual
    void saldo() {
        // Mensaje del saldo actual
        JOptionPane.showMessageDialog(null,"Saldo actual: "+saldo,"♆♆♆CAJERO♆♆♆",JOptionPane.INFORMATION_MESSAGE);
    }
    // Método para consultar saldo actual con rentabilidad
    void rentabilidadSaldo() {
        // Definir variables
        double saldoR=saldo;
        double renta=0.089;

        if (saldoR>20000) {
            // Operación para calcular la rentabilidad
            saldoR+=saldoR*renta;
            // Mensaje del saldo actual con rentabilidad
            JOptionPane.showMessageDialog(null,"Saldo con rentabilidad: "+saldoR,"♆♆♆CAJERO♆♆♆",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            // Mensaje de fallo por saldo insuficiente
            JOptionPane.showMessageDialog(null,"Monto insuficiente.","♆♆♆CAJERO♆♆♆",JOptionPane.WARNING_MESSAGE);
        }
    }
}
