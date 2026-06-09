package chapter06;

//Getter를 활용한 상태 문자열 반환
//학생의 평균 점수에 따라 결과를 "합격" 또는 "불합격" 문자열로 반환하는 메서드를 작성하시오.
//계산된 평균이 60점 이상이면 "합격", 아니면 "불합격"을 반환하시오.
class Student12 {
    private int kor;
    private int eng;
    private int math;

    Student12(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }

    String getResult() {
        double avg = getAverage();
        if (avg >= 60) {
            return "합격";
        } else {
            return "불합격";
        }
    }
}

public class Day06_Problem18 {
    public static void main(String[] args) {
        Student12 student = new Student12(90, 80, 100);

        System.out.println(student.getAverage());
        System.out.println(student.getResult());
    }
}
