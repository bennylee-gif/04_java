package oop.capsulation;

import oop.abstraction2.MyDefault;
import oop.abstraction2.MyProtectd;

// MyProtected을 상속받은 자식클래스
public class MyMyPublic extends MyDefault {

    void pprint() {
        // System.out.println(this.msg); // 자식클래스에서 부모클래스 default 인스턴스 변수를 가져와서 쓸 수 없기 때문에
    }
}