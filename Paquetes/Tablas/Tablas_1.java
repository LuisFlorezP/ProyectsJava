import javax.swing.JOptionPane;

public class Tablas_1 {
    public static void main(String[] args) {
        // Definir variables
        String menu="";
        int numero=0, resul=0, cont=1, cont2=1, fin=0, t1=0, t2=0, t3=0, t4=0, t5=0, t6=0, t7=0, t8=0, t9=0, t10=0;
        // Saludo 
        JOptionPane.showMessageDialog(null,"☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯\nBIENVENIDO AL PROGRAMA DE LAS TABLAS DE MULTIPLICAR\n☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯☯","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);
        // Ciclo para ir a la opción tablas o cerrar sistema
        do {
            // Ingresar opción del menú
            menu=JOptionPane.showInputDialog(null,"Seleccionar opción:\n   - Opción 1: Tablas de multiplicas hasta el 10.\n   - Opción 2: Salir del programa.","☯☯☯TABLAS DE MULTIPLICAR☯☯☯",JOptionPane.QUESTION_MESSAGE);
            // Opciones
            switch (menu) {
                case "1":
                    // Tabla de multiplicar
                    // Ingresar número para el proceso
                    numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar el número al que desea sacarle su tabla de multiplicar hasta el 10:","☯☯☯TABLAS DE MULTIPLICAR☯☯☯",JOptionPane.QUESTION_MESSAGE));
                    // Ciclo para los 10 resultados
                    while (cont<=10) {
                        // Multiplicación del número con las 10 opciones
                        resul=numero*cont;
                        cont++;
                        // Condiciones para asignar los 10 resultados
                        if (cont2==1) {
                            t1=resul; cont2++;
                        }
                        else if (cont2==2) {
                            t2=resul; cont2++; 
                        }
                        else if (cont2==3) {
                            t3=resul; cont2++;
                        }
                        else if (cont2==4) {
                            t4=resul; cont2++; 
                        }
                        else if (cont2==5) {
                            t5=resul; cont2++; 
                        }
                        else if (cont2==6) {
                            t6=resul; cont2++; 
                        }
                        else if (cont2==7) {
                            t7=resul; cont2++; 
                        }
                        else if (cont2==8) {
                            t8=resul; cont2++; 
                        }
                        else if (cont2==9) {
                            t9=resul; cont2++; 
                        }
                        else if (cont2==10) {
                            t10=resul; cont2++; 
                        }
                    }
                    // Imprimir el resultado de toda la tabla de multiplicación 
                    JOptionPane.showMessageDialog(null,"Resultado tablas de multiplicar del: "+numero+".\n   - Resultado "+numero+" X 1: "+t1+"\n   - Resultado "+numero+" X 2: "+t2+"\n   - Resultado "+numero+" X 3: "+t3+"\n   - Resultado "+numero+" X 4: "+t4+"\n   - Resultado "+numero+" X 5: "+t5+"\n   - Resultado "+numero+" X 6: "+t6+"\n   - Resultado "+numero+" X 7: "+t7+"\n   - Resultado "+numero+" X 8: "+t8+"\n   - Resultado "+numero+" X 9: "+t9+"\n   - Resultado "+numero+" X 10: "+t10,"☯☯☯TABLAS DE MULTIPLICAR☯☯☯",JOptionPane.INFORMATION_MESSAGE);
                    // Reiniciar variables
                    cont=1; cont2=1; numero=0; resul=0;
                    break;
                case "2":
                    // Cerrar sistema
                    ++fin;
                    break;
                default:
                    // Error de selección
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (fin==0);
    }
}