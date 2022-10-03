import javax.swing.JOptionPane;
 
public class Semana {
    public static void main(String[] args) {
        // Definir variables
        String semana="";
        double def=0, numero=0, perimetro=0, n1=0, n2=0, n3=0, n4=0, p1=0.25, p2=0.2, p3=0.3;
        int fin=0, r=1, cont1=1, cont2=0, mas=0, menos=0, diametro=6;
            
        // Saludo
        JOptionPane.showMessageDialog(null,"✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪\nBIENVENIDO AL SISTEMA DE SOLUCIONES\n✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪","LUCHÍMON S.A.S",JOptionPane.QUESTION_MESSAGE);
        
        // Ciclo de opción de semana o salir del programa
        do {
            // Selección de menú
            semana=JOptionPane.showInputDialog(null,"Seleccióne el día de la semana:\n  - Opción 1: Viernes.\n  - Opción 2: Sábado.\n  - Opción 3: Domingo.\n  - Opción 4: Salir del programa.","✪✪✪SISTEMA DE SOLUCIONES✪✪✪",JOptionPane.QUESTION_MESSAGE);
            // Opciones
            switch (semana) {
                case "1":
                    // Código del día viernes
                    // Bienvenida
                    JOptionPane.showMessageDialog(null,"BIENVENIDO AL PROGRAMA NÚMEROS POSITIVOS Y NEGATIVOS","✪✪✪DÍA SEMANA: VIERNES✪✪✪",JOptionPane.QUESTION_MESSAGE);
                    // Ciclo para contar los 4 números
                    while (cont1<=4) {
                        // Pedir número
                        numero=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese numero N°"+cont1+":","✪✪✪PROGRAMA NÚMEROS POSITIVOS Y NEGATIVOS✪✪✪",JOptionPane.QUESTION_MESSAGE));
                        // Se suma al contador menos si es menor a 0 o a mas si es mayor a 0
                        if (numero<0) {
                            ++menos;
                        }
                        else if (numero>0) {
                            ++mas;
                        }
                       ++cont1;
                    }
                    // Imprimir el resultado de números positivos y negativos
                    System.out.println("Cantidad de números positivos: "+mas+"\nCantidad de números negativos: "+menos);
                    //Reiniciar variables
                    mas=0; menos=0; cont1=1;
                    break;
                case "2":
                    // Código del día sábado
                    // Bienvenida
                    JOptionPane.showMessageDialog(null,"BIENVENIDO AL PROGRAMA NOTAS","✪✪✪DÍA SEMANA: SÁBADO✪✪✪",JOptionPane.QUESTION_MESSAGE);
                    // Ciclo para nota 1
                    do {
                        // Pedir nota 1
                        n1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota n°1 del 25%: ","✪✪✪PROGRAMA NOTAS✪✪✪",JOptionPane.QUESTION_MESSAGE));
                        if (n1>=0&&n1<=5) {
                            n1=n1*p1;  
                            r=0;
                        } 
                        else {
                            JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.QUESTION_MESSAGE);
                            ++r;
                        }
                    } while (r>=1);
                        r=0;
                    // Ciclo para nota 2
                    do {
                        // Pedir nota 2
                        n2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota n°2 del 25%: ","✪✪✪PROGRAMA NOTAS✪✪✪",JOptionPane.QUESTION_MESSAGE));
                        if (n2>=0&&n2<=5) {
                            n2=n2*p1; 
                            r=0;
                        } 
                        else {
                            JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.QUESTION_MESSAGE);
                            ++r;
                        }
                    } while (r>=1);
                        r=0;
                    // Ciclo para nota 3
                    do {
                        // Pedir nota 3
                        n3=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota n°3 del 20%: ","✪✪✪PROGRAMA NOTAS✪✪✪",JOptionPane.QUESTION_MESSAGE));
                        if (n3>=0&&n3<=5) {
                            n3=n3*p2;  
                            r=0;
                        } 
                        else {
                            JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.QUESTION_MESSAGE);
                            ++r;
                        }
                    } while (r>=1);
                        r=0;
                    // Ciclo para nota 4
                    do {
                        // Pedir nota 4
                        n4=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota n°4 del 30%: ","✪✪✪PROGRAMA NOTAS✪✪✪",JOptionPane.QUESTION_MESSAGE));
                        if (n4>=0&&n4<=5) {
                            n4=n4*p3;    
                            r=0;
                        } 
                        else {
                            JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.QUESTION_MESSAGE);
                            ++r;
                        }
                    } while (r>=1);
                    // Sumar las 4 notas ya con el porcentaje aplicado
                    def=n1+n2+n3+n4;
                    // Imprimir el resultado de la nota definitiva
                    System.out.println("La nota definitiva es: "+def);
                    // Reiniciar variables
                    n1=0; n2=0; n3=0; n4=0; def=0; r=0;
                    break;
                case "3":
                    // Código del día domingo
                    // Bienvenida
                    JOptionPane.showMessageDialog(null,"BIENVENIDO AL PROGRAMA PERÍMETRO","✪✪✪DÍA SEMANA: DOMINGO✪✪✪",JOptionPane.QUESTION_MESSAGE);
                    // Proceso para tener el perimetro con pi
                    perimetro=diametro*Math.PI;
                    // Imprimir el resultado del perímetro
                    System.out.println("Perímetro de un círculo con diámetro 6: "+perimetro);
                    break;
                case "4":
                    // Salir del programa
                    ++fin;
                    break;
                default:
                    // Error de elección de opciones del menú
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.QUESTION_MESSAGE);
                    break;
            }
        } while (fin==0);
        System.out.println();
    }
}
