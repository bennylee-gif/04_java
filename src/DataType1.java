public class DataType1 {

    public static void main(String[] args){
        // 자료형 방이름 = 값;
        // 정수 : int(4바이트, 기본값) long(8바이트)
        // 기본 자료형이 아닌 자료형으로 방을 팔 때는 구분하기 위해 뒤에 대문자로 자료형의 앞글자를 적어줍니다.
        int a = 1;
        long b = 123_456_789_012_345_678_9L; // 끊어보기 편하게 자리수가 커지면 세자리 수마다 _로 구분합니다.
        // 실수 : float(4바이트) double(8바이트, 기본값)

        float c = 3.14F; // 기본 자료형이 아닌 자료형으로 방을 팔 때는 구분하기 위해 뒤에 대문자로 자료형의 앞글자를 적어줍니다.
        double d = 3.14;

        // 문자(1글자)는 char (2byte) : 자바는 utf-16 인코딩 방식으로 문자열을 정리
        char e = '가'; // ''로 묶어줍니다.

        // String은 char를 순서대로 꿰어놓았기 때문에 String이라고 불리웁니다 ""로 묶어줍니다.
        String f = "가나다";

        // 자바의 boolean 타입(1바이트)은 true, false
        boolean g = true;
        boolean h = false;

        System.out.println(a); // 숫자와 boolean은 호환 불가
        System.out.println(b);
        System.out.println(a+b);

        System.out.println(c);
        System.out.println(d);
        System.out.println(c+d); //정수, 실수끼리 형변환 되나 실수는 부동소수점 방식

        System.out.println(e);
        System.out.println(f);
        System.out.println(e+f);

        System.out.println(g);
        System.out.println(h);

    }
}
