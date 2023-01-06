import java.util.Scanner;

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
        operatorEx21();
        operatorEx22();
        operatorEx23();
        operatorEx24();
        operatorEx25();
        operatorEx26();
        operatorEx27();
        operatorEx28();
        operatorEx29();
        operatorEx30();
        operatorEx31();
        operatorEx32();
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

    public static void operatorEx21(){
        System.out.printf("10 == 10.0f \t %b%n", 10==10.0f);
        System.out.printf("'0' == 0 \t %b%n", '0'== 0);
        System.out.printf("'A' == 65 \t %b%n", 'A'== 65);
        System.out.printf("'A' == 'B' \t %b%n", 'A' > 'B');
        System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 != 'B');
    }

    public static void operatorEx22(){
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.printf("10.0 == 10.0f \t %b%n", 10.0==10.0f);
        System.out.printf("0.1 == 0.1f \t %b%n", 0.1==0.1f);
        System.out.printf("f == %19.17f%n", f);
        System.out.printf("f == %19.17f%n", d);
        System.out.printf("f == %19.17f%n", d2);
        System.out.printf("d == f %b%n", d==f);
        System.out.printf("d == f %b%n", d==d2);
        System.out.printf("d == f %b%n", d2==f);
        System.out.printf("(float)d == f %b%n", (float)d==f);
    }

    public static void operatorEx23(){
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
        System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
        System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
    }

    public static void operatorEx24(){
        int x = 0;
        char ch = ' ';

        x = 15;
        System.out.printf("x=%2d, 10 < x && x < 20 = %b%n", x, 10 < x && x < 20);

        x = 6;
        System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 = %b%n", x, x%2==0||x%3==0&&x%6!=0);
        System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 = %b%n", x, (x%2==0||x%3==0)&&x%6!=0);

        ch='1';
        System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n", ch, '0' <= ch && ch <='9');

        ch='a';
        System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b%n", ch, 'a' <= ch && ch <='z');

        ch='A';
        System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' =%b%n", ch, 'A' <= ch && ch <='Z');

        ch='q';
        System.out.printf("ch='%c', ch=='q' || ch=='Q' =%b%n", ch, ch=='q' || ch=='Q');
    }

    public static void operatorEx25(){
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.println("문자를 하나 입력하세요.>");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9'){
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }
        if(('a'<= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')){
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }
    }

    public static void operatorEx26(){
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
        System.out.printf("a=%d, b=%d%n", a, b);
    }

    public static void operatorEx27(){
        boolean b = true;
        char ch ='C';

        System.out.printf("b=%b%n", b);
        System.out.printf("!b=%b%n", !b);
        System.out.printf("!!b=%b%n", !!b);
        System.out.printf("!!!b=%b%n", !!!b);
        System.out.println();

        System.out.printf("ch=%c%n", ch);
        System.out.printf("ch<'a' || ch>'z'=%b%n", ch < 'a' || ch > 'z');
        System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<=ch && ch<='z'));
        System.out.printf(" 'a'<=ch && ch<='z'=%b%n", 'a'<=ch && ch<='z');
    }

    public static void operatorEx28(){
        int x = 0xAB, y = 0xF;

        System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
        System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
        System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
        System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
        System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
        System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));

    }
    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length() - 32);
    }

    public static void operatorEx29(){
        byte p = 10;
        byte n = -10;

        System.out.printf(" p =%d \t%s%n", p, toBinaryString(p));
        System.out.printf(" ~p =%d \t%s%n", ~p, toBinaryString(~p));
        System.out.printf(" ~p+1 =%d \t%s%n", ~p+1, toBinaryString(~p+1));
        System.out.printf(" ~~p =%d \t%s%n", ~~p, toBinaryString(~~p));
        System.out.println();
        System.out.printf(" n =%d%n", n);
        System.out.printf("~(n-1)=%d%n", ~(n-1));
    }

    public static void operatorEx30(){
        int dec = 8;
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
        System.out.println();

        dec = -8;
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
        System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
        System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
        System.out.println();

        dec = 8;
        System.out.printf("%d >> %2d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
        System.out.printf("%d >> %2d = %4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec >> 32));
    }

    public static void operatorEx31(){
        int dec = 1234;
        int hex = 0xABCD;
        int mask = 0xF;

        System.out.printf("hex=%X%n", hex);
        System.out.printf("%X%n", hex & mask);

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask);

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask);

        hex = hex >> 4;
        System.out.printf("%X%n", hex & mask);
    }

    public static void operatorEx32(){
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x;
        absY = y >=0 ? y : -y;
        absZ = z >=0 ? z : -z;

        signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
        signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
        signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');

        System.out.printf("x=%c%d%n", signX, absX);
        System.out.printf("y=%c%d%n", signY, absY);
        System.out.printf("z=%c%d%n", signZ, absZ);
    }
}
