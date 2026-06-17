package chapter09;

// 익명 객체 + 배열 + 다형성
// 여러 개의 익명 객체를 배열에 저장하고 실행하기
interface Skill15 {
    void use();
}

public class Day12_Problem15 {
    public static void main(String[] args) {
        Skill15[] skills = {new Skill15() {
            @Override
            public void use() {
                System.out.println("Python 분석 수행");
            }
        }, new Skill15() {
            @Override
            public void use() {
                System.out.println("머신러닝 모델 학습");
            }
        }, new Skill15() {
            @Override
            public void use() {
                System.out.println("LLM 서비스 개발");
            }
        }};
        for (Skill15 skill15 : skills) {
            skill15.use();
        }
    }
}
