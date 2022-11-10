import javax.swing.JOptionPane;

public class Nota{
    public static void main(String[] args) {
        String resul1="", resul2="", resulN="";
        int menu;

        JOptionPane.showMessageDialog(null,"■━■━■━■━■━■━■━■━■━■━■\nBIENVENIDO AL PROGRAMA NOTA\n■━■━■━■━■━■━■━■━■━■━■","LUCHINI S.A.S",JOptionPane.INFORMATION_MESSAGE);

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"   - Opción 1: Promedio de 2 notas.\n   - Opción 2: Promedio de 3 notas.\n   - Opción 3: Promedio de notas indicadas.\n   - Opción 4: Cerrar sistema.","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
            switch (menu) {
                case 1:
                    resul1=promedio1();
                    JOptionPane.showMessageDialog(null,resul1,"■━■━■NOTA■━■━■",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    resul2=promedio2();
                    JOptionPane.showMessageDialog(null,resul2,"■━■━■NOTA■━■━■",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    resulN=promedioN();
                    JOptionPane.showMessageDialog(null,resulN,"■━■━■NOTA■━■━■",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema...","LUCHINI S.A.S",JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while(menu!=4);    
    }

    static String promedio1() {
        String mensaje="";
        double total=100, p1=0, p2=0, n1=0, n2=0, def=0;
        int fin=0;

        mensaje="Promedio de las 2 notas ingresadas: ";
        do {
            p1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar el porcentaje (valor entre 1% y 99%) de la primer nota:","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
            if (p1>=1&&p1<=99) {
                fin++;
            }
            else {
                JOptionPane.showMessageDialog(null,"Valor incorrecto, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (fin==0);
        p2=total-p1;
        do {
            n1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar la primer nota (valor entre 0 y 5):","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
            if (n1>=0&&n1<=5) {
                fin++;
            }
            else {
                JOptionPane.showMessageDialog(null,"Valor incorrecto, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (fin==1);
        do {
            n2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar la segunda nota (valor entre 0 y 5):","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
            if (n2>=0&&n2<=5) {
                fin++;
            }
            else {
                JOptionPane.showMessageDialog(null,"Valor incorrecto, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (fin==2);
        n1*=p1;
        n2*=p2;
        def=(n1+n2)/10;
        def=Math.round(def);
        def/=10;
        mensaje+=def+".";

        return (mensaje);
    }
    
    static String promedio2() {
        String mensaje="";
        double total=100, p1=0, p2=0, p3=0, n1=0, n2=0, n3=0, def=0;

        mensaje="Promedio de las 3 notas ingresadas: ";
        p1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar el porcentaje (valor entre 1% y 99%) de la primer nota:","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
        p2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar el porcentaje (valor entre 1% y "+(total-p1)+"%) de la segunda nota:","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
        p3=total-p1-p2;
        n1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar la primer nota (valor entre 0 y 5):","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
        n2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar la segunda nota (valor entre 0 y 5):","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
        n3=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar la tercer nota (valor entre 0 y 5):","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
        n1*=p1;
        n2*=p2;
        n3*=p3;
        def=(n1+n2+n3)/10;
        def=Math.round(def);
        def/=10;
        mensaje+=def+".";       

        return (mensaje);
    }

    static String promedioN() {
        String mensaje="";
        int cant=0, fin=0;
        double nota=0, total=100, por=1, def=0;

        do {
            cant=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar la cantidad de notas que desea utilizar (valor mayor a 0):","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
            if (cant<=0) {
                JOptionPane.showMessageDialog(null,"Valor incorrecto, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            }
        } while (cant<=0);
        mensaje="Promedio de las "+cant+" notas ingresadas: ";
        for (int ct=1;ct<cant;ct++) {
            do {
                nota=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar la nota N°"+ct+" (valor entre 0 y 5):","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
                if (nota>=0&&nota<=5) {
                    fin++;
                }
                else {
                    JOptionPane.showMessageDialog(null,"Valor incorrecto, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                }
            } while (fin==0);
            do {
                por=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar el porcentaje de la nota N°"+ct+" (valor entre 1% y "+total+"%):","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
                if (por>=1&&por<total) {
                    total-=por;
                    fin++;
                }
                else {
                    JOptionPane.showMessageDialog(null,"Valor incorrecto, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
                }
            } while (fin==1);
            def+=nota*por;
            fin=0;
        }
        do {
            nota=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresar la nota N°"+cant+" (valor entre 0 y 5):","■━■━■NOTA■━■━■",JOptionPane.QUESTION_MESSAGE));
            if (nota>=0&&nota<=5) {
                fin++;
            }
            else {
                JOptionPane.showMessageDialog(null,"Valor incorrecto, vuelva a intentarlo.","❌❌❌ERROR❌❌❌",JOptionPane.ERROR_MESSAGE);
            } 
        } while (fin==0);
        def+=nota*total;        
        def/=10;
        def=Math.round(def);
        def/=10;
        mensaje+=def+"."; 

        return (mensaje);
    }
}
