import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        flowEx1();
        flowEx2();
        flowEx3();
        flowEx4();
        flowEx5();
    }

    public static void flowEx1() {
        int  x = 0;
        System.out.printf("x=%d 일 때, 참인 것은%n", x);
        if (x == 0) System.out.println("x==0");
        if (x != 0) System.out.println("x!=0");
        if (!(x == 0)) System.out.println("!(x==0)");
        if (!(x != 0)) System.out.println("!(x!=0)");

        x = 1;
        System.out.printf("x=%d 일 때, 참인 것은%n", x);
        if (x == 0) System.out.println("x==0");
        if (x != 0) System.out.println("x!=0");
        if (!(x == 0)) System.out.println("!(x==0)");
        if (!(x != 0)) System.out.println("!(x!=0)");
    }

    public static void flowEx2() {
        int input;

        System.out.println("숫자를 하나 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        if (input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        }

        if (input != 0) {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
            System.out.printf("입력하신 숫자는 %d입니다.", input);
        }
    }

    public static void flowEx3() {
        System.out.println("숫자를 하나 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input==0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }
    }

    public static void flowEx4() {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }

    public static void flowEx5() {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력해주세요.>");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if (score >=90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);
    }
}
