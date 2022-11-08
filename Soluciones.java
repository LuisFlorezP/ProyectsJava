import javax.swing.JOptionPane;
 
public class Soluciones {
    public static void main(String[] args) {
        String resul1="", resul2="", resul3="";
        int menu=0;
            
        JOptionPane.showMessageDialog(null,"✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪\nBIENVENIDO AL SISTEMA DE SOLUCIONES\n✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪✪","LUCHÍMON S.A.S",JOptionPane.INFORMATION_MESSAGE);
        do {
            menu= Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Números positivos y negativos.\n   - Opción 2: Definitiva de notas.\n   - Opción 3: Perímetro.\n   - Opción 4: Salir del programa.","✪✪✪SISTEMA DE SOLUCIONES✪✪✪",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    JOptionPane.showMessageDialog(null,"BIENVENIDO AL PROGRAMA NÚMEROS POSITIVOS Y NEGATIVOS","✪✪✪NÚMEROS✪✪✪",JOptionPane.INFORMATION_MESSAGE);
                    resul1=numeros();
                    JOptionPane.showMessageDialog(null,resul1,"✪✪✪NÚMEROS✪✪✪",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"BIENVENIDO AL PROGRAMA NOTAS","✪✪✪NOTAS✪✪✪",JOptionPane.INFORMATION_MESSAGE);
                    resul2=notas();
                    JOptionPane.showMessageDialog(null,resul2,"✪✪✪NOTAS✪✪✪",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"BIENVENIDO AL PROGRAMA PERÍMETRO","✪✪✪PERÍMETRO✪✪✪",JOptionPane.QUESTION_MESSAGE);
                    //perimetro=diametro*Math.PI;
                    //System.out.println("Perímetro de un círculo con diámetro 6: "+perimetro);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (menu!=4);
    }

    static String numeros() {
        String mensaje="";
        int cuenta=1, mas=0, menos=0;
        double numero=0;

        mensaje="Detalle de números ingresados.\n";
        while (cuenta<=4) {
            numero=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese numero N°"+cuenta+":","✪✪✪NÚMEROS✪✪✪",JOptionPane.QUESTION_MESSAGE));
            if (numero<0) {
                menos++;
            }
            else if (numero>0) {
                mas++;
            }
           cuenta++;
        }
        mensaje+="   - Cantidad de números positivos: "+mas+".\n   - Cantidad de números negativos: "+menos+".";

        return (mensaje);
    }

    static String notas() {
        String mensaje="";
        double nota=0, total=0;

        mensaje="Nota definitiva: ";
        for (int ct=1;ct<=4;ct++) {
            do {
                nota=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota N°"+ct+" del 25%: ","✪✪✪NOTAS✪✪✪",JOptionPane.QUESTION_MESSAGE));
                if (nota>=0&&nota<=5) {
                    total+=nota;
                } 
                else {
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                }
            } while (nota<0||nota>5);
        }
        total=total/4;
        total*=10;
        total=Math.round(total);
        total/=10;
        mensaje+=total+".";
        
        return (mensaje);
    }

    static void perimetro() {

    }
}
