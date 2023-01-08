import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        arrayEx1();
        arrayEx2();
        arrayEx3();
        arrayEx4();
        arrayEx5();
        arrayEx6();
        arrayEx7();
        arrayEx8();
        arrayEx9();
        arrayEx10();
        arrayEx11();
        arrayEx12();
        arrayEx13();
        arrayEx14();
        arrayEx15();
        arrayEx16(args);
        arrayEx17(args);
        arrayEx18();
        arrayEx19();
        multiArrEx1();
        multiArrEx2();
        multiArrEx3();
        multiArrEx4();

    }

    public static void arrayEx1() {
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k+2] + score[4];

        for(int i=0; i < 5; i++) {
            System.out.printf("score[%d]:%d%n", i, score[i]);
        }
        System.out.printf("tmp:%d%n", tmp);
//        System.out.printf("score[%d]:%d%n", 7, score[7]); index의 범위를 벗어난 값
    }

    public static void arrayEx2() {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[] {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i=0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }
        for (int i=0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random()*10) + 1;
        }
        for (int i=0; i < iArr1.length; i++) {
            System.out.print(iArr1[i]+",");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }

    public static void arrayEx3() {
        int[] arr = new int[5];

        for(int i=0; i < arr.length; i++)
            arr[i] = i + 1;
        System.out.println("[변경전]");
        System.out.println("arr.length:"+arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.println("arr["+i+"]:"+arr[i]);

        int[] tmp = new int[arr.length*2];

        for(int i=0; i < arr.length; i++)
            tmp[i] = arr[i];

        arr = tmp;

        System.out.println("[변경후]");
        System.out.println("arr.length:"+arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.println("arr["+i+"]:"+arr[i]);

    }

    public static void arrayEx4() {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length+num.length];
        System.arraycopy(abc,0,result,0,abc.length);
        System.arraycopy(num,0,result,abc.length,num.length);
        System.out.println(result);

        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }

    public static void arrayEx5() {
        int sum = 0;
        float avearage = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i=0; i < score.length; i++) {
            sum += score[i];
        }
        avearage = sum / (float)score.length;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avearage);
    }

    public static void arrayEx6() {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for(int i=1; i < score.length; i++) {
            if(score[i] > max) {
                max = score[i];
            } else if(score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("최대값 :"+max);
        System.out.println("최소값 :"+min);
    }

    public static void arrayEx7() {
        int[] numArr = new int[10];

        for (int i=0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i=0; i < 100; i++) {
            int n = (int) (Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        for (int i=0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }

    public static void arrayEx8() {
        int[] ball = new int[45];

        for(int i=0; i <ball.length; i++)
            ball[i] = i+1;

        int temp = 0;
        int j = 0;

        for(int i=0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for (int i = 0; i < 6; i++)
            System.out.printf("ball[%d]=%d%n", i , ball[i]);
    }

    public static void arrayEx9() {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for(int i=0; i < arr.length; i++) {
            int tmp = (int)(Math.random() * code.length);
            arr[i] = code[tmp];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayEx10() {
        int[] numArr = new int[10];

        for (int i=0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random()*10));
        }
        System.out.println();

        for (int i=0; i < numArr.length-1; i++) {
            boolean changed = false;
            for (int j=0; j < numArr.length-1-i; j++) {
                if(numArr[j] > numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true;
                }
            }
            if (!changed) break;

            for (int k = 0; k < numArr.length; k++)
                System.out.print(numArr[k]);
            System.out.println();
        }
    }

    public static void arrayEx11() {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i=0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();
        for (int i=0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }
        for (int i=0; i < numArr.length; i++) {
            System.out.println(i + "의 개수 :"+ counter[i]);
        }
    }

    public static void arrayEx12() {
        String[] names = {"Kim", "Park", "Yi"};

        for (int i = 0; i < names.length; i++)
            System.out.println("names["+i+"]:"+names[i]);

        String tmp = names[2];
        System.out.println("tmp:"+tmp);
        names[0] = "Yu";

        for (String str : names)
            System.out.println(str);
    }

    public static void arrayEx13() {
        char[] hex = {'C', 'A', 'F', 'E'};

        String[] binary = {"0000", "0001", "0010", "0011"
                ,"0100", "0101", "0110", "0111"
                ,"1000", "1001", "1010", "1011"
                ,"1100", "1101", "1110", "1111"};
        String result="";

        for (int i=0; i < hex.length; i++) {
            if(hex[i] >= '0' && hex[i] <= '9') {
                result += binary[hex[i]-'0'];
            } else {
                result += binary[hex[i]-'A'+10];
            }
        }
        System.out.println("hex:"+ new String(hex));
        System.out.println("binary:"+result);
    }

    public static void arrayEx14() {
        String src = "ABCDE";

        for(int i=0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt("+i+"):"+ch);
        }
        char [] chArr = src.toCharArray();
        System.out.println(chArr);
    }

    public static void arrayEx15() {
        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-.", "-..", "."
                , "..-.", "--.", "....", "..", ".---"
                , "-.-", ".-..", "--", "-.", "---"
                , ".--.", "--.-", ".-.", "...", "-"
                , "..-", "...-", ".--", "-..-", "-.--"
                , "--.."};
        String result="";

        for (int i=0; i < source.length(); i++) {
            result+=morse[source.charAt(i)-'A'];
        }
        System.out.println("source:"+source);
        System.out.println("morse:"+result);
    }

    public static void arrayEx16(String[] args) {
        System.out.println("매개변수의 개수:"+args.length);
        for(int i=0; i<args.length; i++) {
            System.out.println("args["+i+"] = \"" + args[i] + "\"");
        }
    }

    public static void arrayEx17(String[] args) {
        if (args.length != 3) {
            System.out.println("usage: java arrayEx17 NUM1 OP NUM2");
            System.exit(0);
        }
        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("지원되지 않는 연산입니다.");
        }
        System.out.println("결과:"+result);
    }

    public static void arrayEx18() {
        int[][] score = {
                  { 100, 100, 100}
                , { 20, 20, 20}
                , { 30, 30, 30}
                , { 40, 40, 40}
        };
        int sum = 0;

        for(int i=0; i < score.length; i++) {
            for (int j=0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
            }
        }
        for (int[] tmp : score) {
            for (int i : tmp) {
                sum += i;
            }
        }
        System.out.println("sum="+sum);
    }

    public static void arrayEx19() {
        int[][] score = {
                { 100, 100, 100}
                , { 20, 20, 20}
                , { 30, 30, 30}
                , { 40, 40, 40}
                , { 50, 50, 50}
        };
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("==============================");

        for(int i=0; i < score.length;i++) {
            int sum = 0;
            float avg = 0.0f;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d", i+1);

            for (int j=0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }
            avg = sum / (float) score[i].length;
            System.out.printf("%5d %5.1f%n", sum, avg);
        }
        System.out.println("===============================");
        System.out.printf("총점: %3d %4d %4d%n", korTotal, engTotal, mathTotal);
    }

    public static void multiArrEx1() {
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
                //1  2  3  4  5  6  7  8  9
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
                { 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
                { 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
                { 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
        };

        for(int i=1;i<SIZE;i++)
            board[0][i] = board[i][0] = (char) (i+'0');

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.printf("좌표를 입력하세요.(종료는 00)>");
            String input = scanner.nextLine();

            if(input.length()==2) {
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';

                if (x==0 && y==0)
                    break;
            }

            if(input.length()!=2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';
            for (int i = 0; i < SIZE; i++)
                System.out.println(board[i]);
            System.out.println();
        }
    }

    public static void multiArrEx2() {
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<SIZE;i++)
            for(int j=0;j<SIZE;j++)
                bingo[i][j] = i*SIZE + j + 1;

        for(int i=0;i<SIZE;i++) {
            for(int j=0;j<SIZE;j++) {
                x = (int)(Math.random() * SIZE);
                y = (int)(Math.random() * SIZE);

                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }

        do {
            for(int i=0;i<SIZE;i++) {
                for (int j = 0; j < SIZE; j++)
                    System.out.printf("%2d ", bingo[i][j]);
                System.out.println();
            }
            System.out.println();

            System.out.printf("1~%d의숫자를 입력하세요.(종료:0)>", SIZE*SIZE);
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            outer:
            for(int i=0;i<SIZE;i++) {
                for(int j=0;j<SIZE;j++) {
                    if(bingo[i][j]==num) {
                        bingo[i][j] = 0;
                        break outer;
                    }
                }
            }
        } while(num!=0);
    }

    public static void multiArrEx3() {
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] m2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        final int ROW = m1.length;
        final int COL = m2[0].length;
        final int M2_ROW = m2.length;

        int[][] m3 = new int[ROW][COL];

        for(int i=0;i<ROW;i++)
            for(int j=0;j<COL;j++)
                for(int k=0;k<M2_ROW;k++)
                    m3[i][j] += m1[i][k] * m2[k][j];

        for(int i=0;i<ROW;i++) {
            for(int j=0;j<COL;j++) {
                System.out.printf("%3d ", m3[i][j]);
            }
            System.out.println();
        }
    }

    public static void multiArrEx4() {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<words.length;i++) {
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
            }
        }
    }
}
