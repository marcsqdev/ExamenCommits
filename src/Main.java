import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion,base,altura,area;
    Scanner sc=new Scanner(System.in);

        System.out.println("1. Area del triangulo");
        System.out.println("1. Area del circulo");
        System.out.println("1. Area del cono");
        System.out.println("1. Area del cilindro");

        System.out.println("Escoge una opcion");
        opcion=sc.nextInt();

        if (opcion>=1 && opcion<=4){


            switch(opcion){
                case 1:
                    System.out.println("Introduce la base del triangulo");
                    base=sc.nextInt();
                    System.out.println("Introduce la altura del triangulo");
                    altura=sc.nextInt();

                    area=(base*altura)/2;

                    System.out.println("El area del triangulo es: "+area);

            }

        }else
            System.out.println("La opcion introducida no corresponde con ninguna de las opciones");
    }
}