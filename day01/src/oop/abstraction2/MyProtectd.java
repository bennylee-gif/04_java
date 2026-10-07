package oop.abstraction2; // package 끼리 공유 가능

// 클래스 변수, 클래스 메서드
// 인스턴스 변수, 인스턴스 메서드
// 클래스는 멤버변수,메서드를 담는 더 큰 서랍이기 때문에 접근 제어자로 public과 default만 허용합니다.
public class MyProtectd {

    // 클래스 변수
    protected static String hello = "protected 클래스 변수";

    public static void pprint() {
        System.out.println("public 클래스 메서드를 통해 protected 클래스 변수를 출력 ");
        System.out.println(hello); // 퍼블릭 클래스 메서드를 통해 출력
    }

    protected String msg = "protected 인스턴스 변수";
    public void print() {
        System.out.println("public 인스턴스 메서드를 통해 protected 변수를 출력 ");
        System.out.println(this.msg);
    }
}