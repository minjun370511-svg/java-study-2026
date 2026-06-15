package chapter08;
// 매개변수 다형성과 다운캐스팅
// Driver11이 동물을 처리하고 Dog11인 경우 추가 기능 실행하기
interface Animal11{
    void sound();
}
class Dog11 implements Animal11{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
    public void fetch(){
        System.out.println("공을 물어옵니다.");
    }
}
class Cat11 implements Animal11{
    @Override
    public void sound() {
        System.out.println("야옹");
    }
    public void climb(){
        System.out.println("나무를 탑니다.");
    }
}
class Driver11 {
    void process(Animal11 animal11){
        animal11.sound();
        if(animal11 instanceof Dog11){
            ((Dog11) animal11).fetch();
        }
        if(animal11 instanceof Cat11){
            ((Cat11) animal11).climb();
        }
    }
}
public class Day10_Problem11 {
    public static void main(String[] args) {
        Driver11 driver11 = new Driver11();

        driver11.process(new Dog11());
        driver11.process(new Cat11());
        driver11.process(new Dog11());
    }
}
