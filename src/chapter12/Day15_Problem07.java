package chapter12;

// String 클래스
// 이메일 주소에서 아이디와 도메인 분리하기
class EmailInfo07 {
    String email;

    EmailInfo07(String email) {
        this.email = email;
    }

    public String getId() {
        int idx = email.indexOf("@");
        return email.substring(0, idx);
    }

    public String getDomain() {
        int idx = email.indexOf("@");
        return email.substring(idx + 1);
    }
}

public class Day15_Problem07 {
    public static void main(String[] args) {
        EmailInfo07 email1 = new EmailInfo07("minjun@gmail.com");
        EmailInfo07 email2 = new EmailInfo07("java_study@naver.com");
        System.out.println(email1.getId());
        System.out.println(email1.getDomain());

        System.out.println();

        System.out.println(email2.getId());
        System.out.println(email2.getDomain());
    }
}
