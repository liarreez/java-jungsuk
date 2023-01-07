import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        flowEx1();
        flowEx2();
        flowEx3();
        flowEx4();
        flowEx5();
        flowEx6();
        flowEx7();
        flowEx8();
        flowEx9();
        flowEx10();
        flowEx11();
        flowEx12();
        flowEx13();
        flowEx14();
        flowEx15();
        flowEx16();
        flowEx17();
        flowEx18();
        flowEx19();
        flowEx20();
        flowEx21();
        flowEx22();
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

    public static void flowEx6() {
        System.out.print("현재 월을 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
            case 12: case 1: case 2:
                System.out.println("현재의 계절은 겨울입니다.");
        }
    }

    public static void flowEx7() {
        System.out.print("가위(1).바위(2),보(3) 중 하나를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int) (Math.random() * 3) + 1;

        System.out.println("당신은 "+ user + "입니다.");
        System.out.println("컴은 "+ com + "입니다.");

        switch (user-com) {
            case 2: case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case 1: case -2:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");
                break;
        }
    }

    public static void flowEx8() {
        System.out.print("당신의 주민번호를 입력하세요. (011231-1111222)>");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch (gender) {
            case '1': case '3':
                System.out.println("당신은 남자입니다.");
                break;
            case '2': case '4':
                System.out.println("당신은 여자입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }

    public static void flowEx9() {
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요. (1~100)>");

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        switch (score) {
            case 100: case 99: case 98: case 97: case 96:
            case 95: case 94: case 93: case 92: case 91: case 90:
                grade = 'A';
                break;
            case 89: case 88: case 87: case 86: case 85:
            case 84: case 83: case 82: case 81: case 80:
                grade = 'B';
                break;
            case 79: case 78: case 77: case 76: case 75:
            case 74: case 73: case 72: case 71: case 70:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }

        System.out.println("당신의 학점은 " + grade + "입니다.");
    }

    public static void flowEx10() {
        int score = 0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요. (1~100)>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        switch (score/10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }

    public static void flowEx11() {
        System.out.print("당신의 주민번호를 입력하세요. (011231-1111222)>");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();
        char gender = regNo.charAt(7);

        switch (gender) {
            case '1': case '3':
                switch(gender) {
                    case '1':
                        System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
                        break;
                    case '3':
                        System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
                }
                break;
            case '2': case '4':
                switch(gender) {
                    case '2':
                        System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
                        break;
                    case '4':
                        System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
                }
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }

    public static void flowEx12() {
        for (int i=1; i <= 5; i++)
            System.out.println(i);
        for (int i = 1; i <= 5; i++)
            System.out.print(i);
        System.out.println();
    }

    public static void flowEx13() {
        int sum = 0;

        for(int i=1; i <= 10; i++) {
            sum += i;
            System.out.printf("1부터 %2d 까지의 합: %2d%n",i, sum);
        }
    }

    public static void flowEx14() {
        for (int i=1,j=10; i <= 10; i++,j--) {
            System.out.printf("%d \t %d%n", i, j);
        }
    }

    public static void flowEx15() {
        System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
        System.out.println("----------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n",
                    i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3 );
        }
    }

    public static void flowEx16() {
        for(int i=1; i <= 5; i++) {
            for(int j=1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void flowEx17() {
        int num = 0;

        System.out.print("*을 출력할 라인의 수를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        for(int i=0; i < num; i++) {
            for (int j=0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void flowEx18() {
        for (int i = 2; i<=9; i++) {
            for (int j = 1; j<=9; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i*j);
            }
        }
    }

    public static void flowEx19() {
        for(int i=1; i<=3; i++)
            for (int j=1; j<=3; j++)
                for (int k = 1; k <= 3; k++) {
                    System.out.println(""+i+j+k);
                }
    }

    public static void flowEx20() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                System.out.printf("[%d %d]",i,j);
            }
            System.out.println();
        }
    }

    public static void flowEx21() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                if(i==j) {
                    System.out.printf("[%d, %d]", i, j);
                } else {
                    System.out.printf("%5c",' ');
                }
            }
            System.out.println();
        }
    }

    public static void flowEx22() {
        int [] arr = {10,20,30,40,50};
        int sum = 0;

        for(int i=0;i<arr.length;i++)
            System.out.printf("%d ", arr[i]);
        System.out.println();

        for(int tmp : arr) {
            System.out.printf("%d ",tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum="+sum);

    }
}
