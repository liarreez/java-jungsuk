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
}
