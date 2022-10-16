public class Cajero {
    enum cuenta {Ahorros,Corriente}
    String nombre, tipoDoc, documento, numCuenta;
    cuenta tipoCuenta;
    double saldo;

    Cajero(String nombre, String tipoDoc, String documento, cuenta tipoCuenta, String numCuenta, double saldo) {
        this.nombre=nombre;
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.tipoCuenta=tipoCuenta;
        this.numCuenta=numCuenta;
        this.saldo=saldo;
    }

    public static void main (String args[]) {
        Cajero valor = new Cajero("Luis Florez","CC","1025882220",cuenta.Ahorros,"105-971-84835",100000);

        valor.datos();
    }

    void datos() {
        System.out.println("\nINFORMACIÓN BÁSICA DE LA CUENTA.\nNombre titular: "+nombre+"\nTipo documento: "+tipoDoc+"\nNúmero documento: "+documento+"\nTipo de cuenta: "+tipoCuenta+"\nNúmero de cuenta: "+numCuenta+"\n");
    }

}
