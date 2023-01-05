public class Main {
    public static void main(String[] args) {
        operatorEx1();
        operatorEx2();
        operatorEx3();
        operatorEx4();
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
}
