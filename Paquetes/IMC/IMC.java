import java.util.Scanner;

public class IMC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nivel="", ciclo="", recom="";
        int edad=0, menu=0, fin=0;
        double peso=0, estatura=0, imc=0;
               
        do {
            System.out.println("\nÍNDICE DE MASA CORPORAL-IMC:\n      1. Calcular IMC.\n      2. Interpretar su IMC básico.\n      3. Interpretar su IMC detallado.\n      4. Salir.");
            System.out.print("SELECCIONE UNA OPCIÓN: ");
            menu=sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("\nIngresar la edad en años: ");
                    edad=sc.nextInt();
                    System.out.print("Ingresar la estatura en metros: ");
                    estatura=sc.nextDouble();
                    System.out.print("Ingresar el peso en kg: ");
                    peso=sc.nextDouble();
                    Construc datos = new Construc(edad,peso,estatura);
                    imc=datos.calculo();
                    ++fin;
                    break;
                case 2:
                    if (fin!=0) {
                        if (imc<18.5) {
                            nivel="Bajo peso.";
                            recom="\nConsuma alimentos ricos en nutrientes.\nBusque atención de un profesional de la nutricion o la medicina.";
                        }
                        else if(imc>=18.5&&imc<25) {  
                            nivel="Normal o saludable.";
                            recom="\nConsuma alimentos de cinco a seis veces al dia.\n Beba liquido antes y después de las comidas.\n Ejercicio tres veces por semana.";
                        }
                        else if (imc>=25&&imc<30) {
                            nivel="Sobrepeso.";
                            recom="\nBeba minimo 2 litros de agua al dia.\nEvite consumir alimentos fritos,ultraprocesados o con exceso de grasa.";
                        }
                        else if (imc>=30) {
                            nivel="Obesidad.";
                            recom="\nBeba minimo 3 litros de agua al día.\nConsuma fruta y verduras.\nEvite consumir alimentos altos en azucár y calorías, fritos ultraprocesados o con exceso de grasa.";
                        }

                        Construc datos1 = new Construc(imc,nivel);
                        datos1.basico(); 
                    }
                    else {
                        System.out.println("\nNo has digitado tus datos.");
                    }              
                    break;
                case 3:
                    if (fin!=0) {
                        if (edad>=12&&edad<=17) {
                            ciclo="Adolescente.";
                        }
                        else if (edad>=18&&edad<=26) {
                            ciclo="Joven.";
                        }
                        else if (edad>=27&&edad<=59) {
                            ciclo="Adulto.";
                        }
                        else if (edad>=60) {
                            ciclo="Adulto mayor.";
                        }
                        else {
                            ciclo="Edad no valida.";
                        } 

                        Construc datos2 = new Construc(imc,nivel,ciclo,recom);
                        datos2.detallado();
                    }
                    else {
                        System.out.println("\nNo has digitado tus datos.");
                    }
                    break;
                case 4:
                    System.out.println();
                    break;
                default:
                    System.out.println("\nOpción incorrecta vuelva a intentarlo.");
                    break;
            }
        } while (menu!=4);        
    }
}
