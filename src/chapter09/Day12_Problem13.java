package chapter09;

// 익명 객체 종합 활용
// Mission13 클래스가 MissionAction13 익명 객체를 받아 여러 미션을 실행하고 성공 횟수를 계산하기
interface MissionAction13 {
    boolean execute();
}

class Mission13 {
    String name;
    MissionAction13 action13;

    Mission13(String name, MissionAction13 action13) {
        this.name = name;
        this.action13 = action13;
    }

    boolean runMission() {
        System.out.println("미션 시작 : " + name);
        boolean result = action13.execute();
        if(result){
            System.out.println("미션 결과 : 성공");
        }else{
            System.out.println("미션 결과 : 실패");
        }
        System.out.println();
        return result;
    }
}

public class Day12_Problem13 {
    public static void main(String[] args) {
        Mission13[] mission13s = {new Mission13("데이터 정제", new MissionAction13() {
            @Override
            public boolean execute() {
                System.out.println("데이터 정제 완료");
                return true;
            }
        }), new Mission13("모델 학습", new MissionAction13() {
            @Override
            public boolean execute() {
                System.out.println("모델 학습 완료");
                return true;
            }
        }), new Mission13("결과 배포", new MissionAction13() {
            @Override
            public boolean execute() {
                System.out.println("배포 실패");
                return false;
            }
        })};
        int successCount=0;
        for(Mission13 mission13:mission13s){
            if(mission13.runMission()){
                successCount++;
            }
        }
    }
}
