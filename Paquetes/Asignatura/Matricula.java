public class Matricula {
    int numCred, intHora;
    String codigoA, nomAsig, nomProg, docente, codAB;

    Matricula(String codigoA, String nomAsig, String nomProg, String docente, String codAB, int numCred, int intHora) {
        this.codigoA=codigoA;
        this.nomAsig=nomAsig;
        this.nomProg=nomProg;
        this.docente=docente;
        this.codAB=codAB;
        this.numCred=numCred;
        this.intHora=intHora;
    }

    Matricula(String codigoA, String nomAsig, int numCred) {
        this.codigoA=codigoA;
        this.nomAsig=nomAsig;
        this.numCred=numCred;
    }

    void informacion() {
        System.out.println("\n - Código asignatura: "+codigoA+".");
        System.out.println(" - Asignatura: "+nomAsig+".");
        System.out.println(" - Programa: "+nomProg+".");
        System.out.println(" - Docente: "+docente+".");
        System.out.println(" - Bloque y aula: "+codAB+".");
        System.out.println(" - Créditos: "+numCred+".\n");
    }
}
