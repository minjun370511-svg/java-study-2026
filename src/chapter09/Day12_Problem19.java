package chapter09;

// 익명 객체 + 배열 + 정렬 + 조건 검색
// AI 서비스 평가 결과를 정렬한 후 특정 조건의 모델만 출력하기
interface AIService19 {
    String getName();

    int accuracy();

    int speed();
}

public class Day12_Problem19 {
    public static void main(String[] args) {
        AIService19[] aiService19s = {new AIService19() {
            @Override
            public String getName() {
                return "GPT-5";
            }

            @Override
            public int accuracy() {
                return 96;
            }

            @Override
            public int speed() {
                return 88;
            }
        }, new AIService19() {
            @Override
            public String getName() {
                return "Claude";
            }

            @Override
            public int accuracy() {
                return 92;
            }

            @Override
            public int speed() {
                return 91;
            }
        }, new AIService19() {
            @Override
            public String getName() {
                return "Gemini";
            }

            @Override
            public int accuracy() {
                return 89;
            }

            @Override
            public int speed() {
                return 95;
            }
        }, new AIService19() {
            @Override
            public String getName() {
                return "DeepSeek";
            }

            @Override
            public int accuracy() {
                return 90;
            }

            @Override
            public int speed() {
                return 93;
            }
        }, new AIService19() {
            @Override
            public String getName() {
                return "Llama";
            }

            @Override
            public int accuracy() {
                return 85;
            }

            @Override
            public int speed() {
                return 87;
            }
        }};
        for (int i = 0; i < aiService19s.length; i++) {
            int totalScore1 = aiService19s[i].accuracy() + aiService19s[i].speed();
            int maxIndex = i;
            for (int j = i + 1; j < aiService19s.length; j++) {
                int totalScore2 = aiService19s[j].accuracy() + aiService19s[j].speed();
                if (totalScore2 > totalScore1) {
                    maxIndex = j;
                }
            }
            AIService19 temp = aiService19s[i];
            aiService19s[i] = aiService19s[maxIndex];
            aiService19s[maxIndex] = temp;
        }
        System.out.println("===== AI 서비스 순위 =====");
        System.out.println();
        for (int i = 0; i < aiService19s.length; i++) {
            int totalScore3 = aiService19s[i].accuracy() + aiService19s[i].speed();
            System.out.println((i + 1) + "위 : " + aiService19s[i].getName() + " (" + totalScore3 + ")");
        }
        System.out.println();
        System.out.println("===== 우수 서비스 =====");
        for (AIService19 aiService19 : aiService19s) {
            int totalScore4 = aiService19.accuracy() + aiService19.speed();
            if (totalScore4 >= 180) {
                System.out.println(aiService19.getName());
            }
        }
    }
}
