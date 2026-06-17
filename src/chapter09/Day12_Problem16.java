package chapter09;

// 익명 객체 + 배열 + 점수 계산
// 여러 평가 결과를 익명 객체로 저장하고 최종 통계 구하기
interface Evaluation16 {
    int score();
}

class Student16 {
    String name;
    Evaluation16 evaluation16;

    Student16(String name, Evaluation16 evaluation16) {
        this.name = name;
        this.evaluation16 = evaluation16;
    }

    int getScore() {
        return evaluation16.score();
    }
}

public class Day12_Problem16 {
    public static void main(String[] args) {
        Student16[] student16s = {new Student16("김민준", new Evaluation16() {
            @Override
            public int score() {
                return 95;
            }
        }), new Student16("이서준", new Evaluation16() {
            @Override
            public int score() {
                return 87;
            }
        }), new Student16("박지훈", new Evaluation16() {
            @Override
            public int score() {
                return 100;
            }
        }), new Student16("최유진", new Evaluation16() {
            @Override
            public int score() {
                return 72;
            }
        })};
        int sum = 0;
        Student16 max = student16s[0];
        for (Student16 student16 : student16s) {
            sum += student16.getScore();
            System.out.println(student16.name + " : " + student16.getScore() + "점");
            if (student16.getScore() > max.getScore()) {
                max = student16;
            }
        }
        double avg = (double) sum / student16s.length;
        System.out.println();
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("최고점 : " + max.getScore());
    }
}