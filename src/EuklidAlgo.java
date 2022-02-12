import java.util.Scanner;

public class EuklidAlgo {
    public static int gcd(int p, int q){
        if( p == 0)
            return q;
        return gcd(q % p, p);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int p = scanner.nextInt();
        System.out.print("Enter another number: ");
        int q = scanner.nextInt();
        int g = gcd(p,q);

        System.out.println("("+ p + "," + q + ") = " + g);

    }
}
