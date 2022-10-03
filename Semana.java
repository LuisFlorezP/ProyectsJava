import javax.swing.JOptionPane;
 
public class Semana {
    public static void main(String[] args) {
        String semana="";
        double def=0, numero=0, perimetro=0, n1=0, n2=0, n3=0, n4=0, p1=0.25, p2=0.2, p3=0.3;
        int fin=0, r=1, cont1=1, cont2=0, mas=0, menos=0, diametro=6;
            JOptionPane.showMessageDialog(null,"✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪\nBIENVENIDO AL SISTEMA DE SOLUCIONES\n✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪","LUCHÍMON S.A.S",JOptionPane.QUESTION_MESSAGE);
        do {
            semana=JOptionPane.showInputDialog(null,"Seleccióne el día de la semana:\n  - Opción 1: Viernes.\n  - Opción 2: Sábado.\n  - Opción 3: Domingo.\n  - Opción 4: Salir del programa.","SEMANA",JOptionPane.QUESTION_MESSAGE);
            switch (semana) {
                case "1":
                    JOptionPane.showMessageDialog(null,"BIENVENIDO AL PROGRAMA NÚMEROS POSITIVOS Y NEGATIVOS","DÍA SEMANA: VIERNES",JOptionPane.QUESTION_MESSAGE);
                    while (cont1<=4) {
                        numero=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese numero N°"+cont1+":","PROGRAMA NÚMEROS POSITIVOS Y NEGATIVOS",JOptionPane.QUESTION_MESSAGE));
                        if (numero<0) {
                            ++menos;
                        }
                        else if (numero>0) {
                            ++mas;
                        }
                       ++cont1;
                    }
                    System.out.println("Cantidad de números positivos: "+mas+"\nCantidad de números negativos: "+menos);
                    mas=0;
                    menos=0;
                    cont1=1;
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null,"BIENVENIDO AL PROGRAMA NOTAS","DÍA SEMANA: SÁBADO",JOptionPane.QUESTION_MESSAGE);
                    do {
                        n1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota n°1 del 25%: ","PROGRAMA NOTAS",JOptionPane.QUESTION_MESSAGE));
                        if (n1>0&&n1<=5) {
                            n1=n1*p1;  
                            r=0;
                        } 
                        else {
                            JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","ERROR",JOptionPane.QUESTION_MESSAGE);
                            ++r;
                        }
                    } while (r>=1);
                        r=0;
                    do {
                        n2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota n°2 del 25%: ","PROGRAMA NOTAS",JOptionPane.QUESTION_MESSAGE));
                        if (n2>0&&n2<=5) {
                            n2=n2*p1; 
                            r=0;
                        } 
                        else {
                            JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","ERROR",JOptionPane.QUESTION_MESSAGE);
                            ++r;
                        }
                    } while (r>=1);
                        r=0;
                    do {
                        n3=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota n°3 del 20%: ","PROGRAMA NOTAS",JOptionPane.QUESTION_MESSAGE));
                        if (n3>0&&n3<=5) {
                            n3=n3*p2;  
                            r=0;
                        } 
                        else {
                            JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","ERROR",JOptionPane.QUESTION_MESSAGE);
                            ++r;
                        }
                    } while (r>=1);
                        r=0;
                    do {
                        n4=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota n°4 del 30%: ","PROGRAMA NOTAS",JOptionPane.QUESTION_MESSAGE));
                        if (n4>0&&n4<=5) {
                            n4=n4*p3;    
                            r=0;
                        } 
                        else {
                            JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","ERROR",JOptionPane.QUESTION_MESSAGE);
                            ++r;
                        }
                    } while (r>=1);
                    def=n1+n2+n3+n4;
                    System.out.println("La nota definitiva es: "+def);
                    n1=0;
                    n2=0;
                    n3=0;
                    n4=0;
                    def=0;
                    r=0;
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null,"BIENVENIDO AL PROGRAMA PERÍMETRO","DÍA SEMANA: DOMINGO",JOptionPane.QUESTION_MESSAGE);
                    perimetro=diametro*Math.PI;
                    System.out.println("Perímetro de un círculo con diámetro 6: "+perimetro);
                    break;
                case "4":
                    ++fin;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","ERROR",JOptionPane.QUESTION_MESSAGE);
                    break;
            }
            System.out.println("");
        } while (fin==0);
    }
}
