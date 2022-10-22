public class Construc {
    String nivel="", ciclo="", recom="";
    int edad=0;
    double peso=0, estatura=0, imc=0;

    Construc(int edad, double peso, double estatura) {
        this.edad=edad;
        this.peso=peso;
        this.estatura=estatura;
    }
    Construc(double imc, String nivel) {
        this.imc=imc;
        this.nivel=nivel;
    }
    Construc(double imc, String nivel, String ciclo, String recom) {
        this.imc=imc;
        this.nivel=nivel;
        this.ciclo=ciclo;
        this.recom=recom;
    }   

    double calculo() {
        imc=peso/(Math.pow(estatura,2));
        imc=imc*10;
        imc=Math.round(imc);
        imc=imc/10;
    
        return (imc);
    } 

    void basico() {        
        System.out.println("\n  - IMC: "+imc);
        System.out.println("  - Nivel de vida: "+nivel);
    }

    void detallado() {
        System.out.println("\n  - Ciclo de vida: "+ciclo);
        System.out.println("  - IMC: "+imc);
        System.out.println("  - Nive de peso: "+nivel);
        System.out.println("  - Recomendación: "+recom);
    }
}
