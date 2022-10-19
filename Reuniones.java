public class Reuniones {
    enum semana{Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo}
    
    public static void main(String args[]) {
        semana reunion;
        reunion=semana.Sabado;
        
        switch (reunion) {
            case Lunes: 
                System.out.println("\nJunta directiva.\n");
                break;
            case Martes:
                System.out.println("\nGrupo primario.\n");
                break;
            case Miercoles:
                System.out.println("\nSeguimiento proyecto gobernación.\n");
                break;
            case Jueves:
                System.out.println("\nValidación de requerimientos.\n");
                break;
            case Viernes:
                System.out.println("\nPreparar licitación.\n");
                break;
            default:
                System.out.println("\nFin de semana.\n");
                break;
        }
    }
}
