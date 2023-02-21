import java.util.Scanner;

public class Gravitacija {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nadVisina = scan.nextDouble();
        double pospesek = izracun(nadVisina);
        izpis(nadVisina, pospesek);
    }

    public static double izracun(double nmv) {

        final double C = 6.674 * Math.pow(10, -11);
        final double M = 5.972 * Math.pow(10, 24);
        final double R = 6.371 * Math.pow(10, 6);

        double pospesek = (C*M) / ((R+nmv) * (R+nmv));
        return pospesek;
    }

    public static void izpis(double nadVisina, double gravPosp) {
        System.out.println("nadmorska visina: "+nadVisina + " gravitacijski pospešek: " + gravPosp);

    }
}