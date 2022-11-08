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
                    perimetro=diametro*Math.PI;
                    System.out.println("Perímetro de un círculo con diámetro 6: "+perimetro);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.QUESTION_MESSAGE);
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
        
        do {
            n1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota n°1 del 25%: ","✪✪✪NOTAS✪✪✪",JOptionPane.QUESTION_MESSAGE));
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
        do {
            n2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota n°2 del 25%: ","✪✪✪NOTAS✪✪✪",JOptionPane.QUESTION_MESSAGE));
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
        do {
            n3=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota n°3 del 20%: ","✪✪✪OTAS✪✪✪",JOptionPane.QUESTION_MESSAGE));
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
        do {
            n4=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota n°4 del 30%: ","✪✪✪NOTAS✪✪✪",JOptionPane.QUESTION_MESSAGE));
            if (n4>=0&&n4<=5) {
                n4=n4*p3;    
                r=0;
            } 
            else {
                JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.QUESTION_MESSAGE);
                ++r;
            }
        } while (r>=1);
        def=n1+n2+n3+n4;
        System.out.println("La nota definitiva es: "+def);
        
        return (mensaje);
    }

    static void perimetro() {

    }
}
