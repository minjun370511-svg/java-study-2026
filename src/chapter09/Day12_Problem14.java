package chapter09;

// 익명 객체 + 필드 활용
// AIProject14 클래스가 익명 객체를 필드에 저장하고 프로젝트를 실행하기
interface ProjectTask14 {
    void execute();
}

class AIProject14 {
    String projectName;
    ProjectTask14 task;

    AIProject14(String projectName) {
        this.projectName = projectName;
        task = new ProjectTask14() {
            @Override
            public void execute() {
                System.out.println("프로젝트 시작 : " + projectName);
                System.out.println("데이터 수집 완료");
                System.out.println("모델 학습 완료");
                System.out.println("프로젝트 종료");
            }
        };
    }

    void startProject() {
        task.execute();
    }
}

public class Day12_Problem14 {
    public static void main(String[] args) {
        AIProject14 project14 = new AIProject14("AI 챗봇 개발");
        project14.startProject();
    }
}
