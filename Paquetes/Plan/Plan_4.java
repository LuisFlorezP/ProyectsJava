import javax.swing.JOptionPane;

public class Plan_4 {
    public static void main(String[] args){
        String nombre, documento, categoria, vehiculo, factura;
        int menu, personas, valorV;
        
        JOptionPane.showMessageDialog(null,"BIENVENIDOS AL PROGRAMA PLAN FAMILIAR","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);
        
        
        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Facturación.\n   - Opción 2: Ventas.\n   - Opción 3: Cerrar sistema.\nIngresar opción:","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    nombre=JOptionPane.showInputDialog(null,"Ingresar nombre completo: ","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE);
                    documento=JOptionPane.showInputDialog(null,"Ingresar documento de identidad: ","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE);
                    categoria=categoria();
                    personas=personas();
                    vehiculo=vehiculo();
                    valorV=valorV(vehiculo);
                    factura=facturacion(nombre,documento,categoria,personas,vehiculo,valorV);
                    JOptionPane.showMessageDialog(null,factura,"❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.INFORMATION_MESSAGE); break;
                case 2:
                    ventas();
                    break;
                case 3: 
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE); break;
                default: 
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE); break;
            }
        } while (menu!=3);
    }

    static String categoria() {
        String cat;
        
        do {
            cat=JOptionPane.showInputDialog(null,"   - Opción A: Categía A.\n   - Opción B: Categoría B.\n   - Opción C: Categoría C.\n   - Opción P: Particular.\nIngresar letra de categoría:","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE);
            if (cat.equals("A")||cat.equals("B")||cat.equals("C")||cat.equals("P")) {
                JOptionPane.showMessageDialog(null,"¡CATEGORÍA ASIGNADA!","✅✅✅EXITOSO✅✅✅",JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (!cat.equals("A")&&!cat.equals("B")&&!cat.equals("C")&&!cat.equals("P"));

        return (cat);
    }

    static int personas() {
        int per=0;

        do {
            per=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Una (1) persona.\n   - Opción 2: Dos (2) personas.\n   - Opción 3: Tres (3) personas.\n   - Opción 4: Cuatro (4) personas.\nIngresar cantidad de personas:","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE));
            
            if (per==1||per==2||per==3||per==4) {
                JOptionPane.showMessageDialog(null,"PERSONAS ASIGNADAS!","✅✅✅EXITOSO✅✅✅",JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (per!=1&&per!=2&&per!=3&&per!=4);

        return (per);
    }

    static String vehiculo() {
        String veh="";
        int menu;

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Carro.\n   - Opción 2: Moto.\n   - Opción 3: No aplica.\nIngresar opción de vehículo:","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                veh="Carro."; break;
            case 2:
                veh="Moto."; break;
            case 3:
                veh="N/A."; break;
            default:
                JOptionPane.showMessageDialog(null,"Opción incorrecta. Vuelva a intentar.","❌❌❌ERROR❌❌❌s",JOptionPane.ERROR_MESSAGE); break; 
            }
        } while (menu!=1&&menu!=2&&menu!=3);

        return (veh);
    }

    static int valorV(String veh) {
        int valor=0;

        switch (veh) {
            case "Carro.":
                valor=11000*3;
                break;
            case "Moto.":
                valor=6000*3;
                break;
            case "N/A.":
                valor=0;
                break;
        }

        return (valor);
    }

    static String facturacion(String nom, String doc, String cat, int per, String veh, int valor) {
        String mensaje="";
        int factura=0;
        double facturaIva=0, iva=1.19;

        switch (per) {
            case 1: case 2:
                switch (cat) {
                    case "A":
                        factura=105000+valor; 
                        facturaIva=factura*iva; break;
                    case "B": 
                        factura=117900+valor; 
                        facturaIva=factura*iva; break;
                    case "C":
                        factura=129500+valor; 
                        facturaIva=factura*iva; break;
                    case "P":
                        factura=148700+valor; 
                        facturaIva=factura*iva; break;
                } break;
            case 3: case 4:
                switch (cat) {
                    case "A":
                        factura=95800+valor; 
                        facturaIva=factura*iva; break;
                    case "B": 
                        factura=106200+valor; 
                        facturaIva=factura*iva; break;
                    case "C":
                        factura=119100+valor; 
                        facturaIva=factura*iva; break;
                    case "P":
                        factura=141900+valor; 
                        facturaIva=factura*iva; break;
                } break;
        }
        
        mensaje="DATOS DE LA FACTURA.\n   - Nombre cliente: "+nom+". ("+cat+")\n   - Documento de identidad: "+doc+".\n   - Personas para el plan: "+per+".\n   - Vehículo: "+veh+"\n   - Total a pagar sin IVA: "+factura+".\n   - Total a pagar con IVA: "+facturaIva+".";
        return (mensaje);
    }

    static void ventas() {
        int menu;
        double sd1L=Math.round(Math.random()*60), sd1M=Math.round(Math.random()*60), sd1MM=Math.round(Math.random()*60), sd1J=Math.round(Math.random()*60), sd1V=Math.round(Math.random()*60), sd1S=Math.round(Math.random()*60), sd1D=Math.round(Math.random()*60);
        double sd2L=Math.round(Math.random()*60), sd2M=Math.round(Math.random()*60), sd2MM=Math.round(Math.random()*60), sd2J=Math.round(Math.random()*60), sd2V=Math.round(Math.random()*60), sd2S=Math.round(Math.random()*60), sd2D=Math.round(Math.random()*60);
        double sede1[]={sd1L,sd1MM,sd1MM,sd1J,sd1V,sd1S,sd1D}, sede2[]={3};

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Máximas ventas de cada sede.\n   - Opción 2: Mínimas ventas de cada sede.\n   - Opción 3: Recaudo total de cada sede.\n   - Opción 4: Recaudo total por día de cada sede.\n   - Opción 5: Similitud de ventas por día de cada sede.\n   - Opción 6: Totalidad de ventas.\n   - Opción 7: Menú anterior.\nIngresar opción:","❃❃❃PLAN FAMILIAR❃❃❃",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1: 
                    max(sede1,sede2);
                    System.out.println(sede1[0]+" "+sede1[1]+" "+sede1[2]+" "+sede1[3]+" "+sede1[4]+" "+sede1[5]+" "+sede1[6]);
                    break;
                case 2: 
                
                    break;
                case 3: 

                    break;
                case 4: 
                
                    break;
                case 5: 
                
                    break;
                case 6: 
                
                    break;
                case 7: break;
                default: 
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE); break;
            }
        } while (menu!=7);
    }

    static void max(double sede1[], double sede2[]) {
        
    }

    static void min(int sede1[], int sede2[]) {

    }

    static void total(int sede1[], int sede2[]) {

    }

    static void dia(int sede1[], int sede2[]) {
        
    }

    static void similitud(int sede1[], int sede2[]) {
        
    }

    static void general(int sede1[], int sede2[]) {
        
    }
}
