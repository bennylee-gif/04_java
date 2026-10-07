package oop.abstraction2;

public class Main {
    public static void main(String[] args) {
        // 자료형   변수명  = 새로운방에 판  생성자
        Computer desktop1 = new Desktop();

        // 템플릿메서드 : 이미 정해진 순서대로 동작하는 로직이라면 순서를 적은 메서드를
        desktop1.run();

    }
}