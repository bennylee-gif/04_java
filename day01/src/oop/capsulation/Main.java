package oop.capsulation;

import oop.abstraction2.MyDefault;
import oop.abstraction2.MyProtectd;
import oop.abstraction2.MyPublic;

/**
 * 패키지는 서랍장(텅빈 폴더), 클래스는 서랍 한 칸 한 칸, 변수/메서드는 서랍에 들어있는 구체적인 물건/동작
 * 클래스를 만든다는건 주제 단위로 뭔가를 적어놓겠다 -> class에는 public, default만 허용
 * 접근 제어자	같은 클래스의 멤버	같은 패키지의 멤버	자식 클래스의 멤버	그 외의 영역
 * public             	○	          ○	            ○	           ○
 * protected	        ○	          ○	            ○	           X
 * default	            ○	          ○          	X	           X
 * private	            ○	          X         	X              X
 */
public class Main {
    public static void main(String[] args) {
        MyPublic myPublic = new MyPublic();
        MyPublic.pprint(); // 클래스 메서드
        System.out.println(MyPublic.hello); // 클래스 변수
        myPublic.print(); // 인스턴스 메서드
        System.out.println(myPublic.msg); // 인스턴스 변수

        System.out.println("자식클래스==========================");
        MyMyPublic myPublic2 = new MyMyPublic();
        // MyMyPublic.pprint(); // 클래스 메서드
        // System.out.println(MyMyPublic.hello); // 클래스 변수
        myPublic2.print(); // 인스턴스 메서드를 통해 외부 패키지의 default 변수에 있는 값을 확인
        // System.out.println(myPublic2.msg); // 인스턴스 변수

        System.out.println("myProtected =================== ");
        MyProtectd myProtectd = new MyProtectd();
        MyProtectd.pprint(); // 클래스 메서드
        //  System.out.println(myProtectd.hello); // 클래스 변수
        myProtectd.print(); // 인스턴스 메서드
        //  System.out.println(myProtectd.msg); // 인스턴스 변수

        System.out.println("myDefault==================== ");
        MyDefault myDefault = new MyDefault(); // 클래스가 default이므로 외부 패키지에서 접근 불가
        // System.out.println(myDefault.msg);
        myDefault.print();

        MyPrivate myPrivate = new MyPrivate();
        // private 변수와 private 메서드 모두 확인 불가
        myPrivate.pprint();

    }
}