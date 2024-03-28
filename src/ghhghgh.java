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

        int sum = 0;
        for (int w = 31; w < 100; w++) {
            if (w % 3 == 0) {
                int lastCifra = w % 10;

                if (lastCifra == 2 || lastCifra == 4 || lastCifra == 8) {
                    sum += w;
                }
            }
        }
        System.out.println(sum);

        //7.13б
        System.out.print("Введите z: ");
        int z = scanner.nextInt();
        int summa = 0;
        for (int delitel = 1; delitel <= z; delitel++) {
            if (z % delitel == 0) {
                summa += delitel;
            }
        }
        System.out.println(summa);

        //7.13в
        System.out.print("Введите e: ");
        int e = scanner.nextInt();
        int summa2 = 0;
        for (int delitel = 1; delitel <= e; delitel++) {
            if ((e % delitel == 0) && (delitel % 2 == 0)) {
                summa2 += delitel;
            }
        }
        System.out.println(summa2);

        //7.13г
        System.out.print("Введите e: ");
        int ep = scanner.nextInt();
        int summa3 = 0;
        for (int delitel = 1; delitel <= ep; delitel++) {
            if ((ep % delitel == 0)) {
                summa3 += 1;
            }
        }
        System.out.println(summa3);

        //7.13д
        System.out.print("Введите e: ");
        int es = scanner.nextInt();
        int summa4 = 0;
        for (int delitel = 1; delitel <= es; delitel++) {
            if ((es % delitel == 0) && (delitel % 2 != 1)) {
                summa4 += 1;

            }
        }
        System.out.println(summa4);


        //7.13е
        System.out.print("Введите e: ");
        int pop = scanner.nextInt();
        int summa5 = 0;
        int kolvoChetnihDel = 0;
        for (int delitel = 1; delitel <= pop; delitel++) {
            if ((pop % delitel == 0)) {
                summa5 += 1;
                if (delitel % 2 == 0) {
                    kolvoChetnihDel += 1;
                }
            }
        }
        System.out.println("Кол-во делителей: " + summa5);
        System.out.println("Кол-во четных делителй: " + kolvoChetnihDel);

        //7.13ж
        System.out.print("Введите e: ");
        int ese = scanner.nextInt();
        System.out.print("Введите d: ");
        int d = scanner.nextInt();
        int summa6 = 0;
        for (int delitel = 1; delitel <= ese; delitel++) {
            if ((ese % delitel == 0) && (delitel > d)) {
                summa6 += 1;

            }
        }
        System.out.println(summa6);


    }
}



