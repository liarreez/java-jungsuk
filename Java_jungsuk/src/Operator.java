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
}
