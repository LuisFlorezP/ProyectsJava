public class Reuniones {
    enum semana{Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo}
    
    public static void main(String args[]) {
        semana reunion;
        reunion=semana.Sabado;
        
        switch (reunion) {
            case Lunes: 
                System.out.println("\nCESDE: 8:15 am - 12:15 pm.\nITM: N/A.\n");
                break;
            case Martes:
                System.out.println("\nCESDE: 8:15 am - 11:15 pm.\nITM: 8:00 pm - 10:00 pm.\n");
                break;
            case Miercoles:
                System.out.println("\nCESDE: N/A.\nITM: 4:00 pm - 6:00 pm. 8:00 pm - 10:00 pm.\n");
                break;
            case Jueves:
                System.out.println("\nCESDE: 8:15 am - 11:15 pm.\nITM: 8:00 pm - 10:00 pm.\n");
                break;
            case Viernes:
                System.out.println("\nCESDE: 8:15 am - 12:15 pm.\nITM: 4:00 pm - 6:00 pm. 6:00 pm - 8:00 pm.\n");
                break;
            default:
                System.out.println("\nFin de semana.\n");
                break;
        }
    }
}
