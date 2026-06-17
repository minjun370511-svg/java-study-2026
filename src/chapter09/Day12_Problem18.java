package chapter09;

// 익명 객체 + 배열 + 다형성 + 조건 검색
// AI 모델들의 성능을 평가하고 기준 점수 이상인 모델만 출력하기
interface AIModel18 {
    String getName();

    int getScore();
}

public class Day12_Problem18 {
    public static void main(String[] args) {
        AIModel18[] aiModel18s = {new AIModel18() {
            @Override
            public String getName() {
                return "GPT-5";
            }

            @Override
            public int getScore() {
                return 96;
            }
        }, new AIModel18() {
            @Override
            public String getName() {
                return "Claude";
            }

            @Override
            public int getScore() {
                return 92;
            }
        }, new AIModel18() {
            @Override
            public String getName() {
                return "Gemini";
            }

            @Override
            public int getScore() {
                return 88;
            }
        }, new AIModel18() {
            @Override
            public String getName() {
                return "DeepSeek";
            }

            @Override
            public int getScore() {
                return 90;
            }
        }, new AIModel18() {
            @Override
            public String getName() {
                return "Llama";
            }

            @Override
            public int getScore() {
                return 85;
            }
        }};
        int passCount = 0;
        int passSum = 0;
        System.out.println("합격 모델 목록");
        System.out.println();
        for (AIModel18 aiModel18 : aiModel18s) {
            int score = aiModel18.getScore();
            if (score >= 90) {
                System.out.println(aiModel18.getName() + " : " + score + "점");
                passCount++;
                passSum += score;
            }
        }
        double passAvg = (double) passSum / passCount;
        System.out.println();
        System.out.println("총 " + passCount + "개 모델 통과");
        System.out.printf("통과 모델 평균 점수 : %.2f점", passAvg);

    }
}
