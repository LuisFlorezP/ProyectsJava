import javax.swing.JOptionPane;

public class Plan_3 {
    public static void main(String[] args){
        String nombre, carro="Carro", moto="Moto", N="No aplica", vh="" ,cat="", categoria, personas, vehiculo, facturaM;
        double iva=1.19, factura=0, factura2=0; 
        int vcarro=11000, vmoto=6000, vh2=0;
        
        JOptionPane.showMessageDialog(null,"BIENVENIDOS AL PLAN FindeAll");
        nombre=JOptionPane.showInputDialog("Ingresar nombre completo: ");
        categoria=JOptionPane.showInputDialog("Categorías.\n-Opción A.\n-Opción B.\n-Opción C.\n-Opción P (Particular).");
        personas=JOptionPane.showInputDialog("Personas para el plan.\n-Opción 1: Una (1) persona.\n-Opción 2: Dos (2) personas.\n-Opción 3: Tres (3) personas.\n-Opción 4: Cuatro (4) personas.");
        vehiculo=JOptionPane.showInputDialog("Vehículo para el parqueadero.\n-Opción 1: Carro.\n-Opción 2: Moto.\n-Opción 3: No aplica.");
    
        switch (vehiculo) {
            case "1": case "carro": case "Carro":
                vh=carro;
                vh2=vcarro*3;
                break;
            case "2": case "moto": case "Moto":
                vh=moto;
                vh2=vmoto*3;
                break;
            case "3": case "no aplica": case "No aplica": case "No":
                vh=N;
                vh2=0;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción incorrecta. Vuelva a intentar."); break; 
        }
        
        switch (personas) {
            case "1": case "2":
                switch (categoria) {
                    case "a": case "A":
                        factura=105000+vh2;
                        cat="A";
                        break;
                    case "b": case "B": 
                        factura=117900+vh2;
                        cat="B";
                        break;
                    case "c": case "C":
                        factura=129500+vh2;
                        cat="C";
                        break;    
                    case "p": case "P": case "Particular": case "particular":
                        factura=148700+vh2;
                        cat="Particular";
                        break;
                    default: 
                        JOptionPane.showMessageDialog(null,"Opción incorrecta. Vuelva a intentar."); break; 
                }
            break;
            case "3": case "4":
                switch (categoria) {
                    case "a": case "A":
                        factura=95800+vh2;
                        cat="A";
                        break;
                    case "b": case "B": 
                        factura=106200+vh2;
                        cat="B";
                        break;
                    case "c": case "C":
                        factura=119100+vh2;
                        cat="C";
                        break;    
                    case "p": case "P": case "Particular": case "particular":
                        factura=141900+vh2;
                        cat="Particular";
                        break;
                    default: 
                        JOptionPane.showMessageDialog(null,"Opción incorrecta. Vuelva a intentar."); break; 
                }
            break;
            default:
                JOptionPane.showMessageDialog(null,"Opción incorrecta. Vuelva a intentar."); break; 
        }
        
        factura2=factura*iva;
        
        facturaM="Nombre del usuario: "+nombre+". ("+cat+")\nCantidad de personas incluidas en el plan: "+personas+".\nValor total factura sin IVA: $"+factura+".\nValor total factura con IVA: $"+factura2+".";
        JOptionPane.showMessageDialog(null,facturaM,"PLAN FAMILIAR",JOptionPane.INFORMATION_MESSAGE);
    }
}
