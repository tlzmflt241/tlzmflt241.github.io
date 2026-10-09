import java.util.Scanner;

class calc2{
    int gcd(int a, int b){
        if(b == 0) {return a;}
        else if(a > b){return gcd(b, a%b);}
        else {return gcd(a, b%a);}
    }
}

public class Homework4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        calc2 calc = new calc2();



        System.out.print("두 수를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("두 수의 최대공약수는 %d입니다.", calc.gcd(num1, num2));

    }
}
