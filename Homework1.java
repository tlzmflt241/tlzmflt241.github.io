import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int n = 0; n < 5; n++){
            System.out.print("정수를 입력하세요: ");
            int num = sc.nextInt();
            sum += num;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);
        }
    }
}
