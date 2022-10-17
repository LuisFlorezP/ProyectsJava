public class Matricula {
    int numCred, intHora;
    String codigoA, nomAsig, nomProg, nomDir, codAB;

    Matricula(String codigoA, String nomAsig, String nomProg, String nomDir, String codAB, int numCred, int intHora) {
        this.codigoA=codigoA;
        this.nomAsig=nomAsig;
        this.nomProg=nomProg;
        this.nomDir=nomDir;
        this.codAB=codAB;
        this.numCred=numCred;
        this.intHora=intHora;
    }

    void informacion() {
        System.out.println(codigoA);
        System.out.println(nomAsig);
        System.out.println(nomProg);
        System.out.println(nomDir);
        System.out.println(codAB);
        System.out.println(numCred);
    }
}
