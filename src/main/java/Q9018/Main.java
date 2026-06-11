package Q9018;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.print("두 개의 수를 입력하시오. ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();

        System.out.printf("%d + %d = %d\n",num,num1,num+num1);
        System.out.printf("%d - %d = %d\n",num,num1,num-num1);
        System.out.printf("%d * %d = %d\n",num,num1,num*num1);
        System.out.printf("%d / %d = %d\n",num,num1,num/num1);
        System.out.printf("%d %% %d = %d\n",num,num1,num%num1);
    }
}
