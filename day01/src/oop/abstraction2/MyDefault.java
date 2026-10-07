package oop.abstraction2;

// class에는 public과 default 딱 두개의 접근제어자만 허용
public class MyDefault {

    // 접근제어자를 생략하면 default
    String msg = "디폴트 인스턴스 변수";

    public void print() {
        System.out.println("public 인스턴스 메서드로 출력한 디폴트 인스턴스 변수");
        System.out.println(this.msg);
    }

}