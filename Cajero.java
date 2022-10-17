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

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar:","LUCHINI S.A.S",JOptionPane.QUESTION_MESSAGE));
        
            switch (menu) {
            
            }
        } while ();
        
        
        valor.datos();
    }

    void datos() {
        System.out.println("\nINFORMACIÓN BÁSICA DE LA CUENTA.\nNombre titular: "+nombre+"\nTipo documento: "+tipoDoc+"\nNúmero documento: "+documento+"\nTipo de cuenta: "+tipoCuenta+"\nNúmero de cuenta: "+numCuenta+"\n");
    }

}
