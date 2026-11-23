import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class pwList{
    Map<String, String> log = new HashMap<>();
}

public class Homework8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        pwList list = new pwList();
        list.log.put("myId", "myPass");
        list.log.put("myId2", "myPass2");
        list.log.put("myId3", "myPass3");
        boolean check = false;

        while(!check){
            String id = "";
            String pw = "";

            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            id = sc.nextLine().trim();
            if(!list.log.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            System.out.print("password : ");
            pw = sc.nextLine().trim();
            if(!list.log.get(id).equals(pw)){
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            System.out.println("id와 비밀번호가 일치합니다.");
            check = true;
        }
    }
}
