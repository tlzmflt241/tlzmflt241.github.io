import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Homework9 {
    public static void main(String[] args) {
        Map<String, String> log = new HashMap<String, String>();
        try(Scanner sc = new Scanner(new FileInputStream("db.txt"))) {
            while(sc.hasNextLine()){
                String line = sc.nextLine().trim();
                if(line.equals("")) continue;
                String[] parts = line.split("[<>]+");
                for (String pair : parts){
                    if(pair.equals("")) continue;
                    String[] kv = pair.split(":");
                    log.put(kv[0].trim(), kv[1].trim());
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("db.txt 파일이 존재하지 않습니다.");
            return;
        }
        boolean check = false;
        Scanner login = new Scanner(System.in);
        while (!check) {
            String id = "";
            String pw = "";

            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            id = login.nextLine().trim();
            if (!log.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            System.out.print("password : ");
            pw = login.nextLine().trim();
            if (!log.get(id).equals(pw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            System.out.println("id와 비밀번호가 일치합니다.");
            check = true;
        }
        login.close();
    }
}


