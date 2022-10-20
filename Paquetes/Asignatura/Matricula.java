public class Matricula {
    String codigoA, nomAsig, nomProg;

    Matricula(String codigoA, String nomAsig, String nomProg) {
        this.codigoA=codigoA;
        this.nomAsig=nomAsig;
        this.nomProg=nomProg;
    }

    void informacion() {
        System.out.println("\n - Código asignatura: "+codigoA+".");
        System.out.println(" - Asignatura: "+nomAsig+".");
        System.out.println(" - Programa: "+nomProg+".\n");
    }
}
