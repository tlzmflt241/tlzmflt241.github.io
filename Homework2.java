import java.util.Scanner;

class Student {
    // 1. 캡슐화를 위해 멤버 변수는 private으로 선언하는 것이 좋습니다.
    private long studentID; // 학번
    private String name;    // 이름
    private String major;   // 전공
    private long number;    // 전화번호

    // 2. 학번 Getter & Setter
    public long getStudentID() {
        return studentID;
    }
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    // 3. 이름 Getter & Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 4. 전공 Getter & Setter
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    // 5. 전화번호 Getter & Setter
    public long getNumber() {
        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }

    // 6. 전화번호 출력용 포맷팅 메서드 (작성해주신 로직 활용)
    public String getFormattedNumber() {
        // 맨 앞 0이 잘린 숫자에 다시 0을 붙여서 문자열로 만듦
        String numStr = "0" + Long.toString(this.number);

        String part1 = numStr.substring(0, 3);
        String part2 = numStr.substring(3, 7);
        String part3 = numStr.substring(7);

        return part1 + "-" + part2 + "-" + part3;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3명의 학생 객체를 담을 수 있는 배열 생성
        Student[] students = new Student[3];

        // 1. 3명의 학생 정보 입력받기
        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            students[i] = new Student(); // 배열 각 칸에 새 Student 객체 생성

            // sc.next()는 띄어쓰기를 기준으로 문자열을 하나씩 가져옵니다.
            // 요구사항에 맞춰 문자열을 숫자로 변환(파싱)하여 변수에 담습니다.
            long id = Long.parseLong(sc.next());
            String name = sc.next();
            String major = sc.next();
            long number = Long.parseLong(sc.next());

            // Setter를 통해 객체에 데이터 저장
            students[i].setStudentID(id);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setNumber(number);
        }

        // 2. 입력된 정보 모두 출력하기
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            // 출력 형식에 맞춰서 데이터 출력 (이름과 전공 사이 띄어쓰기 적용)
            System.out.printf("%d번째 학생: %d %s %s %s\n",
                    (i + 1),
                    students[i].getStudentID(),
                    students[i].getName(),
                    students[i].getMajor(),
                    students[i].getFormattedNumber());
        }

        sc.close(); // Scanner 사용 종료
    }
}