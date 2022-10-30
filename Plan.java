import java.util.Scanner;

public class Plan {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String nombre, CA="A", CB="B", CC="C", CP="Particular", carro="Carro", moto="Moto", N="No aplica", cat="", vh="";
        double iva=1.19, factura=0, factura2=0; 
        int vcarro=11000, vmoto=6000, personas=0, categoria=0, vehiculo=0 , vh2=0, fin=0;
    
        System.out.println("\nBIENVENIDOS AL PLAN FindeAll\n");
        System.out.print("Ingresar nombre completo: ");
        nombre=sc.nextLine();
    
        System.out.println("\nCategoria. \nOpcion 1: A \nOpcion 2: B \nOpcion 3: C \nOpcion 4: Particular ");
        System.out.print("Selecionar categoria: ");
        categoria=sc.nextInt();
        if (categoria==1) {
            cat=CA;
        }
        else if (categoria==2) {
            cat=CB;
        }
        else if (categoria==3) {
            cat=CC;
        }
        else if (categoria==4) {
            cat=CP;
        }
        else {
            System.out.println("\nOpcion incorrecta, vuelve a intentar\n");
            fin++;
        }
        
        if (fin==0) {
            System.out.print("\nIngresar cantidad de personas (maximo 4 personas): ");
            personas = sc.nextInt();
            if (personas <= 0) {
                System.out.println("\nOpcion incorrecta, vuelve a intentar\n");
            }
            else if (personas <= 4){
                System.out.println ("\nParqueadero \nOpcion 1: Carro \nOpcion 2: Moto \nOpcion 3: No aplica ");
                System.out.print ("Seleccion parqueadero: ");
                vehiculo = sc.nextInt();
                if (vehiculo==1) { 
                    vh=carro;
                    vh2=vcarro*3;
                }
                else if (vehiculo==2){
                    vh=moto;
                    vh2=vmoto*3;
                }
                else if (vehiculo==3){ 
                    vh=N;
                    vh2=0;
                }
                else {
                    System.out.println ("\nOpcion incorrecta, vuelve a intentar\n");
                    fin++;
                }
            
                if (fin==0) {
                    if (personas<=2) {
                        if (cat==CA){factura=105000+vh2;}
                        else if (cat==CB) {factura=117900+vh2;}
                        else if (cat==CC) {factura=129500+vh2;}
                        else if (cat==CP) {factura=148700+vh2;}
                    }
                    else {
                        if (cat==CA){factura=95800+vh2;}
                        else if (cat==CB) {factura=106200+vh2;}
                        else if (cat==CC) {factura=119100+vh2;}
                        else if (cat==CP) {factura=141900+vh2;}
                    }
                
                    factura2=factura*iva;
                
                    System.out.println("\nNombre del usuario: "+nombre+" ("+cat+")");
                    System.out.println("Cantidad de personas incluidas en el plan: "+personas);
                    System.out.println("Valor total factura sin IVA: $"+factura);
                    System.out.println("Valor total factura con IVA: $"+factura2+"\n");
               
                }   
            }
            else {
                System.out.println("\nOpcion incorrecta, vuelve a intentar\n");
            }
        }
    }   
}
