import javax.swing.JOptionPane;

public class Aleatorio {
    static String nombre="", documento="", nomGanador="", docGanador="", premio1="Smart TV", premio2="Laptop", premio="";
    static int opPremio, eleccion=0, ganador=0, fin=0, finRifa=0, fallo=0, cont=1;
    static double numeroA=0, aleatorio=0;
    public static void main(String args[]) {
        int inicio=0;
        
        JOptionPane.showMessageDialog(null,"☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸\nBIENVENIDO AL PROGRAMA DE ADIVINAR NÚMERO\n☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸☸","LUCHINI S.A.S",javax.swing.JOptionPane.INFORMATION_MESSAGE);

        do {
            inicio=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccionar opción:\n   - Opción 1: Adivinar número entre 3 personas.\n   - Opción 2: Salir programa.","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));  
            switch (inicio) {
                case 1:
                    aleatorio=Math.random();
                    aleatorio=aleatorio*10;
                    numeroA=Math.round(aleatorio);
                    Inicio();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Saliendo...","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (inicio!=2);
    }

    public static void Inicio() {
        int personas=0, p1=0, p2=0, p3=0;

        do {
            opPremio=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccionar opción de premio para la rifa:\n   - Opción 1: Smart TV.\n   - Opción 2: Laptop.","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));
            if (opPremio==1) {
                premio=premio1;
                ++fin;
            }
            else if (opPremio==2) {
                premio=premio2;
                ++fin;
            }
            else {
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (fin==0);
        fin=0;
        while (fin<3) {
            personas=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccionar opción:\n   - Opción 1: Números de la persona N°1.\n   - Opción 2: Números de la persona N°2.\n   - Opción 3: Números de la persona N°3.","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));
            switch (personas) {
                case 1:
                    if (p1==0) {
                        Persona1();
                        ++p1; ++fin;
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"La primer persona ya ingresó sus respectivos números.","(∩ ͡° ͜ʖ ͡°)⊃",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 2:
                    if (p2==0) {
                        Persona2();
                        ++p2; ++fin;
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"La segunda persona ya ingresó sus respectivos números.","(∩ ͡° ͜ʖ ͡°)⊃",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 3:
                    if (p3==0) {
                        Persona3();
                        ++p3; ++fin;
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"La tercera persona ya ingresó sus respectivos números.","(∩ ͡° ͜ʖ ͡°)⊃",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        Resultado();
    }

    public static void Persona1() {
        nombre=JOptionPane.showInputDialog(null,"Ingresar nombre completo:","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
        documento=JOptionPane.showInputDialog(null,"Ingresar número de documento de identidad:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
        for (cont=1;cont<=3;cont++) {
            eleccion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar número entero del 1 al 10:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));
            if (eleccion==numeroA&&ganador==0) {
                nomGanador=nombre;
                docGanador=documento;
                ++ganador;
                ++fallo;
            }
        }
        if (fallo==0) {
            ++finRifa;
        }
    }

    public static void Persona2() {
        nombre=JOptionPane.showInputDialog(null,"Ingresar nombre completo:","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
        documento=JOptionPane.showInputDialog(null,"Ingresar número de documento de identidad:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
        for (cont=1;cont<=3;cont++) {
            eleccion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar número entero del 1 al 10:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));
            if (eleccion==numeroA&&ganador==0) {
                nomGanador=nombre;
                docGanador=documento;
                ++ganador;
                ++fallo;
            }
        }
        if (fallo==0) {
            ++finRifa;
        }
    }

    public static void Persona3() {
        nombre=JOptionPane.showInputDialog(null,"Ingresar nombre completo:","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
        documento=JOptionPane.showInputDialog(null,"Ingresar número de documento de identidad:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE);
        for (cont=1;cont<=3;cont++) {
            eleccion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar número entero del 1 al 10:","☸☸☸ADIVINAR NÚMERO☸☸☸",JOptionPane.QUESTION_MESSAGE));
            if (eleccion==numeroA&&ganador==0) {
                nomGanador=nombre;
                docGanador=documento;
                ++ganador;
                ++fallo;
            }
        }
        if (fallo==0) {
            ++finRifa;
        }
    }

    public static void Resultado() {
        if (ganador==1) {
            JOptionPane.showMessageDialog(null,"FELICIDADES, TENEMOS UN GANADOR","☸☸☸FELICITACIONES☸☸☸",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"   - Nombre ganador: "+nomGanador+".\n   - Documento ganador: "+docGanador+".\n   - Premio: "+premio+".\n   - Número de la rifa: "+numeroA+".","☸☸☸GANADOR☸☸☸",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (finRifa==3) {
            JOptionPane.showMessageDialog(null,"FIN DE LA RIFA","☸☸☸FIN ADIVINAR NÚMERO☸☸☸",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
