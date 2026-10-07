import java.util.Scanner;

public class FlowControl3 {

    // try { 예외를 일으킬 가능성이 있는 코드
    // } catch (Exception이름1) {
    //  Exception1의 경우 해결방법
    //  } catch (Exception이름2) {
    //  Exception1의 경우 해결방법 2
    //  } finally {
    //  성공이든 실패든 무조건 해야하는 해결방법 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 기본 input인 키보드의 값을 받아서

        // 1.
        System.out.println("값 입력: ");
        // String num = sc.next();
        String num = null;
        System.out.println(num);

        try {
            // 2. 값이 null인지 확인한다.
            // q, 또는 Q가 들어오면 종료를 누를 거고요. - 문자열로 해결할 수 있는 거 먼저 해결
            if (num != null && (num.equals("q") || num.equals("Q"))) {
                System.out.println("프로그램 종료");
            } else {
                // 3. 숫자이면 형변환 (Integer.~~~)
                int num2 = Integer.parseInt(num);
                // 숫자가 들어오면 -> 양수, 음수, 0을 판별합니다.
                if (num2 > 0) {
                    System.out.println("양수입니다");
                } else if (num2 < 0) {
                    System.out.println("음수입니다");
                } else {
                    System.out.println("0입니다");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 값을 입력함"+ e.getMessage());
        } catch (Exception e) {
            System.out.println("뭐가 됐든 예외 발생함"+ e.getMessage());
        } finally {
            sc.close(); // 사용자 입력 객체를 반납
        }


    }


}
