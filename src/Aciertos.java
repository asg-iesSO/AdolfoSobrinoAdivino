import java.util.Scanner;

public class Aciertos {

    public static void main(String[] args) {
        int n = 0,cont = 0;
        // Aqui restamos el minimo al maximo +1 para que el random siempre sea desde el 1 hasta el 40 y luego
        // le sumamos 10 para que cumpla la condicion de ser siempre de 10 a 50
        int x = (int) ((50 -10 +1) *Math.random()+10);

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
