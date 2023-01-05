public class Main {
    public static void main(String[] args) {
        operatorEx1();
        operatorEx2();
        operatorEx3();
        operatorEx4();
        operatorEx5();
        operatorEx7();
        operatorEx8();
        operatorEx9();
        operatorEx10();
        operatorEx11();
        operatorEx12();
        operatorEx13();
        operatorEx14();
        operatorEx15();
        operatorEx16();
        operatorEx17();
        operatorEx18();
        operatorEx19();
        operatorEx20();
    }

    public static void operatorEx1(){
        int i=5;
        i++;
        System.out.println(i);

        i=5;
        ++i;
        System.out.println(i);
    }

    public static void operatorEx2(){
        int i=5, j=0;

        j = i++;
        System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);

        i=5;
        j=0;

        j = ++i;
        System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
    }

    public static void operatorEx3(){
        int i=5, j=5;
        System.out.println(i++);
        System.out.println(++j);
        System.out.println("i = " + i + ", j = " + j);
    }

    public static void operatorEx4(){
        int i = -10;
        i = +i;
        System.out.println(i);

        i = -10;
        i = -i;
        System.out.println(i);
    }

    public static void operatorEx5(){
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
    }

    public static void operatorEx6(){
//        byte a = 10;
//        byte b = 20;
//        byte c = a + b; 에러 발생 byte형 변환 필요
//        System.out.println(c);
    }

    public static void operatorEx7(){
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b);
        System.out.println(c);
    }

    public static void operatorEx8(){
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b;
        System.out.println(c);
    }

    public static void operatorEx9(){
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void operatorEx10(){
        int a = 1000000;

        int result1 = a * a / a;
        int result2 = a / a * a;

        System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
        System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
    }

    public static void operatorEx11(){
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d%n", d, a, d - a);
        System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
        System.out.printf("'%c'=%d%n", a, (int)a);
        System.out.printf("'%c'=%d%n", d, (int)d);
        System.out.printf("'%c'=%d%n", zero, (int)zero);
        System.out.printf("'%c'=%d%n", two, (int)two);
    }

    public static void operatorEx12(){
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1 + 1;
        c3 = (char)(c1 + 1);
        c2++;
        c2++;

        System.out.println("i=" + i);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);
    }

    public static void operatorEx13(){
        char c1 = 'a';
//        char c2 = c1+1; // 컴파일 에러
        char c2 = 'a'+1;

        System.out.println(c2);
    }

    public static void operatorEx14(){
        char c = 'a';
        for(int i=0; i<26; i++){
            System.out.print(c++);
        }
        System.out.println();

        c = 'A';
        for(int i =0; i<26; i++){
            System.out.print(c++);
        }
        System.out.println();

        c = '0';
        for(int i =0; i<10; i++){
            System.out.print(c++);
        }
        System.out.println();
    }

    public static void operatorEx15(){
        char lowerCase = 'a';
        char upperCase = (char) (lowerCase-32);
        System.out.println(upperCase);
    }

    public static void operatorEx16(){
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;
        System.out.println(shortPi);
    }

    public static void operatorEx17(){
        double pi = 3.141592;
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;

        System.out.println(shortPi);
    }

    public static void operatorEx18(){
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.println(shortPi);
    }

    public static void operatorEx19(){
        int x = 10;
        int y = 8;

        System.out.printf("%d를 %d로 나누면, %n", x, y);
        System.out.printf("몪은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);
    }

    public static void operatorEx20(){
        System.out.println(-10%8);
        System.out.println(10%-8);
        System.out.println(-10%-8);

    }
}
