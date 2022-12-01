import java.util.Scanner;

public class VariableType {
    public static void stringPlus() {
        System.out.println(7 + 7 + "");
        System.out.println("" + 7 + 7);
    }

    public static void scannerInput() {
        Scanner scanner = new Scanner (System.in);

        System.out.print("두자리 정수를 하나 입력해주세요. >");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.printf("num=%d%n", num);
    }
}
