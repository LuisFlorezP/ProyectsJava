import javax.swing.JOptionPane;

public class Supermercado {
    public static void main(String[] args) {
        // Definir variables
        String cliente="", cedula="", opcion="";
        int propina=0, puntos=0, cF=0, cL=0, cV=0, fin1=0, fin2=0;
        int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0, c7=0, c8=0, c9=0;
        double subtotal=0, factura=0, impuestoIVA=0, valorPro=0, iva=0.19, empleados=0;
        double p1=4000, p2=3000, p3=60000, p4=5000, p5=10000, p6=2000, p7=2500, p8=3000, p9=2000, t1=0, t2=0, t3=0, t4=0, t5=0, t6=0, t7=0, t8=0, t9=0;

        // Saludo
        JOptionPane.showMessageDialog(null, "♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣\nBIENVENIDO AL SUPERMERCADO LUCHINI\n♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.INFORMATION_MESSAGE);

        do {
            // Facturar o cerrar sistema
            cliente=JOptionPane.showInputDialog(null,"Seleccionar opción:\n   - Opción 1: Realizar factura.\n   - Opción 2: Cerrar sistema de facturación.",JOptionPane.QUESTION_MESSAGE);
            
            // Opciones
            switch (cliente) {
                case "1":
                    // Facturación
                    
                    // Pedir cédula
                    cedula=JOptionPane.showInputDialog(null,"Ingresar cedula del cliente:","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE);  
                    // Pedir puntos
                    puntos=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar la cantidad de puntos que lleva","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE));
                    
                    // Ciclo de productos
                    do {
                        // Selección de producto o finalizar
                        opcion=JOptionPane.showInputDialog(null,"Seleccionar producto:\n   - Opción 1: Arroz.\n   - Opción 2: Frutas.\n   - Opción 3: Botella de vino.\n   - Opción 4: Lácteos.\n   - Opción 5: Carne.\n   - Opción 6: Verduras.\n   - Opción 7: Rollo de papel higiénico.\n   - Opción 8: Bloque de jabón.\n   - Opción 9: Gomitas.\n   - Opción 10: Finalizar selección de productos.","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE);
                       
                        // Opciones
                        switch (opcion) {
                            case "1":
                                // Arroz
                                c1=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de bolsas de arroz:","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE));
                                t1=p1*c1;
                                factura+=t1;
                                break;
                            case "2":
                                // Frutas
                                c2=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de kg de frutas:","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE));
                                cF+=c2;
                                t2=p2*c2;
                                factura+=t2;
                                break;
                            case "3":
                                // Botella de vino
                                c3=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de botellas de vino:","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE));
                                t3=p3*c3;
                                factura+=t3;
                                break;
                            case "4":
                                // Lácteos
                                c4=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de unidades de lacteos:","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE));
                                cL+=c4;
                                t4=p4*c4;
                                factura+=t4;
                                break;
                            case "5":
                                // Carne
                                c5=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de libras de carne:","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE));
                                t5=p5*c5;
                                factura+=t5;
                                break;
                            case "6":
                                // Verduras
                                c6=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de kg de verduras:","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE));
                                cV+=c6;
                                t6=p6*c6;
                                factura+=t6;
                                break;
                            case "7":
                                // Rollo de papel higiénico
                                c7=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de rollos:","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE));
                                t7=p7*c7;
                                factura+=t7;
                                break;
                            case "8":
                                // Bloque de jabon
                                c8=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de bloques de jabon:","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE));
                                t8=p8*c8;
                                factura+=t8;
                                break;
                            case "9":
                                // Gomitas
                                c9=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de bolsas de gomitas:","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE));
                                t9=p9*c9;
                                factura+=t9;
                                break;
                            case "10":
                                // Salir del menú
                                ++fin2;
                                subtotal=factura;
                                break;
                            default:
                                // Error de selección
                                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                                break;
                        }
                    } while (fin2==0);

                    // Verificar puntos
                    if (factura>=200000) {
                        // Puntos Frutas
                        if (cF>=5) { 
                            puntos+=12; 
                            JOptionPane.showMessageDialog(null,"SUMA 12 PUNTOS POR LAS FRUTAS","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.INFORMATION_MESSAGE);
                        }
                        // Puntos Lácteos
                        if (cL>=4) { 
                            puntos+=8; 
                            JOptionPane.showMessageDialog(null,"SUMA 8 PUNTOS POR LOS LÁCTEOS","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.INFORMATION_MESSAGE);
                        }
                        // Puntos Verduras
                        if (cV>=6) { 
                            puntos+=10; 
                            JOptionPane.showMessageDialog(null,"SUMA 10 PUNTOS POR LAS VERDURAS","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }

                    // Descuento del iva o factura normal
                    if (puntos>=100) {
                        JOptionPane.showMessageDialog(null,"ALCANZÓ EL TOPE DE 100 PUNTOS, NOSOTROS CORREMOS EN ESTA FACTURA CON EL VALOR DEL IVA, ¡FELICIDADES!","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.INFORMATION_MESSAGE);
                        puntos=0;
                    }
                    else {
                        impuestoIVA=factura*iva;
                        factura+=impuestoIVA;
                    }

                    // Propina
                    propina=JOptionPane.showConfirmDialog(null,"¿Desea dejarle propina a los empleados?");
                    if (propina==0) {
                        valorPro=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar el valor de la propina:","♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.QUESTION_MESSAGE));
                        empleados=valorPro/9;
                        JOptionPane.showMessageDialog(null,"Contamos con 9 empleados, el cliente da propina con valor $"+valorPro+".\nPor ende a cada empleado se le dara un valor de $"+empleados,"♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    // Factura final
                    JOptionPane.showMessageDialog(null,"FACTURA.\n\n   - Cédula cliente: "+cedula+
                    ".\n   - Puntos acumulados: "+puntos+
                    ".\n   - Propina: $"+valorPro+
                    ".\n   - Subtotal factura: $"+subtotal+
                    ".\n   - IVA: $"+impuestoIVA+
                    ".\n   - Total: $"+factura,"♣♣♣SUPERMERCADO LUCHINI♣♣♣",JOptionPane.INFORMATION_MESSAGE);

                    // Reiniciar variables
                    fin2=0; factura=0; cF=0; cL=0; cV=0;
                    break;
                case "2": 
                    // Cerrar sistema
                    ++fin1;
                    break;
                default:
                    // Error de selección
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (fin1==0);
    }
}
