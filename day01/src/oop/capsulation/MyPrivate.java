package oop.capsulation;

public class MyPrivate {

    private String msg = "프라이빗 변수";

    private void print() {
        System.out.println("private 메서드로 출력한 private 변수");
        System.out.println(this.msg);
    }

    public void pprint() {
        print(); // private 메서드인 print를 동작시키는 역할
    }
}