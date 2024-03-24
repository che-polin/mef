import java.util.Scanner;

public class ghhghgh {
    public static void main(String[] args) {
        //7.9a
        for (int a = 10; a <= 99; a++) {
            int sum = 0;
            int copyA = a;

            while (copyA > 0) {
                sum += copyA % 10;
                copyA += copyA / 10;
            }
            if (sum % 13 == 0) {
                System.out.println(a);
            }
        }
        //7.9б
        for (int b = 10; b <= 99; b++) {
            int sum = 0;
            int copyB = b;
            while (copyB > 0) {
                sum = copyB % 10;
                copyB = copyB / 10;
            }
            if (sum + sum * sum == copyB) {
                System.out.println(b);
            }
        }
        // 7.10
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи n: ");
        int n = scanner.nextInt();
        for (int a = 10; a <= 99; a++) {

            if (a % n == 0 || a == n || a / 10 == n || a % 10 == n) {
                System.out.println(a);
            }
        }
        //7.11a
        for (int a = 100; a <= 999; a++) {
            int kvadrat = a * a;
            int lastTri = kvadrat % 1000;
            if (lastTri == a) {
                System.out.println(a);
            }
        }
        //7.11б
        for (int a = 100; a <= 999; a++) {
            if (a % 7 == 0) {
                int sum = 0;
                int copyA = a;
                while (copyA > 0) {
                    sum += copyA % 10;
                    copyA += copyA / 10;
                }
                if (sum % 7 == 0) {
                    System.out.println(a);
                }
            }
        }
        //7.13a
        System.out.print("Введите p: ");
        int p = scanner.nextInt();
        for (int delitel = 1; delitel <= p; delitel++) {
            if (n % delitel == 0) {
                System.out.println("делитель: " + delitel);
            }
        }
    }
}



