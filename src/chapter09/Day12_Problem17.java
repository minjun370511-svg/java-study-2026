package chapter09;

// 익명 객체 + 배열 + 정렬 + 최고 점수 찾기
// AI 모델 평가 결과를 익명 객체 배열에 저장하고 순위를 출력하기
interface ModelScore17 {
    int score();

    String modelName();
}

public class Day12_Problem17 {
    public static void main(String[] args) {
        ModelScore17[] modelScore17 = {new ModelScore17() {
            @Override
            public int score() {
                return 96;
            }

            @Override
            public String modelName() {
                return "GPT-5";
            }
        }, new ModelScore17() {
            @Override
            public int score() {
                return 92;
            }

            @Override
            public String modelName() {
                return "Claude";
            }
        }, new ModelScore17() {
            @Override
            public int score() {
                return 88;
            }

            @Override
            public String modelName() {
                return "Gemini";
            }
        }, new ModelScore17() {
            @Override
            public int score() {
                return 85;
            }

            @Override
            public String modelName() {
                return "Llama";
            }
        }, new ModelScore17() {
            @Override
            public int score() {
                return 90;
            }

            @Override
            public String modelName() {
                return "DeepSeek";
            }
        }};
        for (int i = 0; i < modelScore17.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < modelScore17.length; j++) {
                if (modelScore17[j].score() > modelScore17[i].score()) {
                    maxIndex = j;
                }
            }
            ModelScore17 temp = modelScore17[i];
            modelScore17[i] = modelScore17[maxIndex];
            modelScore17[maxIndex] = temp;
        }
        System.out.println("===== AI 모델 순위 =====");
        System.out.println();
        for (int i = 0; i < modelScore17.length; i++) {
            System.out.println((i + 1) + "위 : " + modelScore17[i].modelName() + " (" + modelScore17[i].score() + "점)");
        }
        System.out.println();
        System.out.println("최고 점수 모델 : " + modelScore17[0].modelName());
    }
}
