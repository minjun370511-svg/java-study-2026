package chapter12;

// String 클래스
// 주민등록번호에서 성별 정보 추출하기
class Person05 {
    String ssn;

    Person05(String ssn) {
        this.ssn = ssn;
    }

    public String getGender() {
        char gender = ssn.charAt(7);
        if (gender == '1' || gender == '3') {
            return "남성";
        } else if (gender == '2' || gender == '4') {
            return "여성";
        } else {
            return "알 수 없음";
        }
    }
}

public class Day15_Problem05 {
    public static void main(String[] args) {
        Person05 p1 = new Person05("990101-1234567");
        Person05 p2 = new Person05("020505-4234567");
        Person05 p3 = new Person05("030303-5234567");
        System.out.println(p1.getGender());
        System.out.println(p2.getGender());
        System.out.println(p3.getGender());
    }
}
