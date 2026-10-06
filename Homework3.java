import java.util.Scanner;

class calc{

    public int maxValue(int[] arr){
        int maxNum = arr[0];
        for(int z=1; z < arr.length; z++){
            if(arr[z] > maxNum){
                maxNum = arr[z];
            }
        }
        return maxNum;
    }
    public int minValue(int[] arr){
        int minNum = arr[0];
        for(int z=1; z<arr.length; z++){
            if(arr[z] < minNum){
                minNum = arr[z];
            }
        }
        return minNum;
    }
}

public class Homework3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int i = sc.nextInt();
        int[] arr = new int[i];

        System.out.print("수를 입력하세요: ");
        for(int x = 0; x < i; x++){
            arr[x] = sc.nextInt();
        }

        calc c = new calc();
        System.out.printf("최대값: %d\n", c.maxValue(arr));
        System.out.printf("최소값: %d", c.minValue(arr));
    }

}
