import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeromedio = 0;
        int total = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("total de animales registrados: ");
        int num = scn.nextInt();


        for (int i=0; i < num; i++) {
            System.out.println("edad del animal atendido: " +i+"\n");
            numeromedio = scn.nextInt();
            total=total+numeromedio;
        }
        int medio=(int)(total/num);
        System.out.println("promedio :  "+medio);
    }
}
