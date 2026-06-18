package chapter09;

// 익명 객체 최종 종합
// AI 포트폴리오 프로젝트들을 평가하고 우수 프로젝트 통계와 최고 프로젝트를 출력하기
interface PortfoilioProject21 {
    String getName();

    int getCodeScore();

    int getAIScore();

    int getPresentationScore();
}

public class Day13_Problem21 {
    public static void main(String[] args) {
        PortfoilioProject21[] portfoilioProject21s = {new PortfoilioProject21() {
            @Override
            public String getName() {
                return "AI 챗봇";
            }

            @Override
            public int getCodeScore() {
                return 90;
            }

            @Override
            public int getAIScore() {
                return 95;
            }

            @Override
            public int getPresentationScore() {
                return 88;
            }
        }, new PortfoilioProject21() {
            @Override
            public String getName() {
                return "추천 시스템";
            }

            @Override
            public int getCodeScore() {
                return 86;
            }

            @Override
            public int getAIScore() {
                return 91;
            }

            @Override
            public int getPresentationScore() {
                return 84;
            }
        }, new PortfoilioProject21() {
            @Override
            public String getName() {
                return "객체 탐지";
            }

            @Override
            public int getCodeScore() {
                return 94;
            }

            @Override
            public int getAIScore() {
                return 97;
            }

            @Override
            public int getPresentationScore() {
                return 90;
            }
        }, new PortfoilioProject21() {
            @Override
            public String getName() {
                return "감정 분석";
            }

            @Override
            public int getCodeScore() {
                return 88;
            }

            @Override
            public int getAIScore() {
                return 93;
            }

            @Override
            public int getPresentationScore() {
                return 92;
            }
        }, new PortfoilioProject21() {
            @Override
            public String getName() {
                return "음성 인식";
            }

            @Override
            public int getCodeScore() {
                return 82;
            }

            @Override
            public int getAIScore() {
                return 85;
            }

            @Override
            public int getPresentationScore() {
                return 87;
            }
        }};
        for (int i = 0; i < portfoilioProject21s.length; i++) {
            int codeScore = portfoilioProject21s[i].getCodeScore();
            int aiScore = portfoilioProject21s[i].getAIScore();
            int presentationScore = portfoilioProject21s[i].getPresentationScore();
            int sum = codeScore + aiScore + presentationScore;
            int maxIndex = i;
            for (int j = i + 1; j < portfoilioProject21s.length; j++) {
                int codeScore2 = portfoilioProject21s[j].getCodeScore();
                int aiScore2 = portfoilioProject21s[j].getAIScore();
                int presentationScore2 = portfoilioProject21s[j].getPresentationScore();
                int sum2 = codeScore2 + aiScore2 + presentationScore2;
                if (sum2 > sum) {
                    maxIndex = j;
                }
            }
            PortfoilioProject21 temp = portfoilioProject21s[i];
            portfoilioProject21s[i] = portfoilioProject21s[maxIndex];
            portfoilioProject21s[maxIndex] = temp;
        }
        System.out.println("===== 포트폴리오 프로젝트 순위 =====");
        System.out.println();
        int totalSum = 0;
        for (int i = 0; i < portfoilioProject21s.length; i++) {
            int codeScore = portfoilioProject21s[i].getCodeScore();
            int aiScore = portfoilioProject21s[i].getAIScore();
            int presentationScore = portfoilioProject21s[i].getPresentationScore();
            int sum = codeScore + aiScore + presentationScore;
            String name = portfoilioProject21s[i].getName();
            System.out.println((i + 1) + "위 : " + name + " (" + sum + ")");
            totalSum += sum;
        }
        System.out.println();
        System.out.println("===== 우수 프로젝트 =====");
        System.out.println();
        for (int i = 0; i < portfoilioProject21s.length; i++) {
            int codeScore = portfoilioProject21s[i].getCodeScore();
            int aiScore = portfoilioProject21s[i].getAIScore();
            int presentationScore = portfoilioProject21s[i].getPresentationScore();
            int sum = codeScore + aiScore + presentationScore;
            String name = portfoilioProject21s[i].getName();
            if (sum >= 270) {
                System.out.println(name);
            }
        }
        System.out.println();
        System.out.println("최고 프로젝트 : " + portfoilioProject21s[0].getName());
        double avg = (double) totalSum / portfoilioProject21s.length;
        System.out.println();
        System.out.printf("전체 평균 총점 : %.2f점", avg);
    }
}
