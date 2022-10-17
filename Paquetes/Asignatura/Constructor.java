public class Constructor {
    public static void main(String args[]) {
        Matricula materia1 = new Matricula("lp1020","Lógica de programación","Ingeniero de sistemas","Alba Vélez","504L",6,6);
        Matricula materia2 = new Matricula("lp1020","Lógica de programación",6);
        materia1.informacion();
        materia2.informacion();
    }
}
