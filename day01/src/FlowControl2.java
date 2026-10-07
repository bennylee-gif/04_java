public class FlowControl2 {
    public static void main(String[] args) {

        // 기본자료형은 == 으로 값 자체를 비교 가능하나
        // 문자열은 참조자료형이므로 ==으로는 메모리 주소에 대한 비교가 됨.

        // String Pool: 자바가 메모리를 아끼기 위해 문자열을 변수가 달라도 '공유'하는 공동의 메모리
        // 이 때문에 문자열은 == 이 아니라
        //                equals라는 메서드로 값 자체를 비교합니다.

        // 문자열로 들어온 숫자를 받아서 1과 1이 아닌 값을 판별하는 간단한 조건문
        // != 는 같지 않음, ==은 같음
        String num = null;

        String comparedNum = new String("1234-567");
        // 값이 null이 아니고, 1인지 확인
        // if ~ else ~ if else 양수이면 양수,

        // NPE (NULL POINTER EXCEPTION: 참조자료형인데 메모리 주소가 비어있음. 그래서 값없음과 값 비교할 수 없음)
        // if (num.equals(comparedNum) && num != null) {

        // && 앞에 NULL 여부를 확인해 놓으면 ||
        if ( num != null && num.equals(comparedNum)) { // 에러 방지 (단락평가)
            // if ( num != null & num.equals(comparedNum)) { // 앞 조건도 뒤 조건도 모두 보기 때문에 NPE
            System.out.println("결과값이 같습니다");
        } else {
            System.out.println("같지 않습니다.");
        }


    }
}