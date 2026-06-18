package chapter09;

// 익명 객체 최종 응용
// 프로젝트 평가 결과를 정렬하고 합격 프로젝트를 출력하기
interface ProjectEvaluation20 {
    String getProjectName();

    int getScore();
}

public class Day13_Problem20 {
    public static void main(String[] args) {
        ProjectEvaluation20[] projectEvaluation20s = {new ProjectEvaluation20() {
            @Override
            public String getProjectName() {
                return "AI 챗봇";
            }

            @Override
            public int getScore() {
                return 95;
            }
        }, new ProjectEvaluation20() {
            @Override
            public String getProjectName() {
                return "추천 시스템";
            }

            @Override
            public int getScore() {
                return 88;
            }
        }, new ProjectEvaluation20() {
            @Override
            public String getProjectName() {
                return "객체 탐지";
            }

            @Override
            public int getScore() {
                return 100;
            }
        }, new ProjectEvaluation20() {
            @Override
            public String getProjectName() {
                return "감정 분석";
            }

            @Override
            public int getScore() {
                return 91;
            }
        }, new ProjectEvaluation20() {
            @Override
            public String getProjectName() {
                return "음성 인식";
            }

            @Override
            public int getScore() {
                return 84;
            }
        }};
        for (int i = 0; i < projectEvaluation20s.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < projectEvaluation20s.length; j++) {
                int score = projectEvaluation20s[j].getScore();
                if (score > projectEvaluation20s[maxIndex].getScore()) {
                    maxIndex = j;
                }
            }
            ProjectEvaluation20 temp = projectEvaluation20s[i];
            projectEvaluation20s[i] = projectEvaluation20s[maxIndex];
            projectEvaluation20s[maxIndex] = temp;
        }
        System.out.println("===== 프로젝트 순위 =====");
        System.out.println();
        for (int i = 0; i < projectEvaluation20s.length; i++) {
            String name = projectEvaluation20s[i].getProjectName();
            int score = projectEvaluation20s[i].getScore();
            System.out.println((i + 1) + "위 : " + name + " (" + score + ")");
        }
        System.out.println("===== 우수 프로젝트 =====");
        System.out.println();
        for (int i = 0; i < projectEvaluation20s.length; i++) {
            String name = projectEvaluation20s[i].getProjectName();
            int score = projectEvaluation20s[i].getScore();
            if (score >= 90) {
                System.out.println(name);
            }
        }
        System.out.println();
        System.out.println("최고 프로젝트 : " + projectEvaluation20s[0].getProjectName());
    }
}
