import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ch2VarEx1();
        ch2VarEx2();
        stringEx();
        printEx1();
        printEx2();
        scannerEx();
    }

    public static void ch2VarEx1() {
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }

    public static void ch2VarEx2(){
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x:"+ x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:"+ x + " y:" + y);
    }

    public static void stringEx(){
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " "); // "7 "
        System.out.println(" " + 7); // " 7"
        System.out.println(7 + ""); // "7"
        System.out.println("" + 7); // "7"
        System.out.println("" + ""); // ""
        System.out.println(7 + 7 + ""); // "14"
        System.out.println("" + 7 + 7); // "77"
    }

    public static void printEx1(){
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex);
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("octNum=%s, %d%n", Integer.toBinaryString((binNum)), binNum);

    }

    public static void printEx2(){
        String url = "www.codecohbo.com";

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n", d);

        System.out.printf("[12345678901234567890] %n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]%n", url);
        System.out.printf("[%.8s]%n", url);
    }

    public static void scannerEx(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 :" + input);
        System.out.printf("num=%d%n", num);
    }
}
