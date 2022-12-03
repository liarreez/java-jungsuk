import org.w3c.dom.ls.LSOutput;

public class Operator {

    public static void unaryOperation() {
        int i=5, j=0;

        j = i++;
        System.out.println("i="+i+", j="+j);

        i=5;
        j=0;

        j = ++i;
        System.out.println("i="+i+", j="+j);
    }

    public static void lowerToUpper() {
        char lowerCase = 'a';
        char upperCase = (char) (lowerCase - 32); // 대문자와 소문자 간의 코드값 차이는 10진수로 32이다.
        System.out.println(upperCase);
    }

    public static void autoRound() {
        double pi = 3.141592;
        double shortPi = (int) (pi * 1000 + 0.5) / 1000.0; // 0.5를 더해 형변환 되어 버림이 되어도 반올림이 되도록 한다.
        System.out.println(shortPi);
    }

    public static void equalOperator() {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.printf("%b%n", d==f);
        System.out.printf("%b%n", d2==f);
    }
}
