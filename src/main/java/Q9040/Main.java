package Q9040;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int num = 0;
        while(i<11){
            num +=i;
            i++;

        }
        System.out.println("1부터 10까지의 합 = " + num);
        System.out.println("while문이 끝난 후의 num의 값 = " + i);
    }
}