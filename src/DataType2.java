import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
//ctrl + d : 한줄 복사 ctrl + x : 한줄 삭제
//shift + f10 : 실행
public class DataType2 {
    public static void  main(String[] args){
        // [] : array 방 크기를 고정해놓고 사용하는 참조자료형
        int a = 1;

        // 1. 선언 및 할당
        int[] arr1 = {1, 2, 3};
        // int[] arr1 = {1, 2, 3.14}; // 실수 -> 정수 형변환은 자동으로 안됨
        // double[] arr1 = {1, 2, 3.14}; // 정수 -> 실수 형변환은 자동으로 됨
        //[I@b4c966a

        boolean[] arr3 = {true, false};

        // 2. 선언 먼저 하고 값을 나중에 할당
        int[] arr2 = new int [3]; // arr2는 3칸을 가진 방
        // [0, 0, 0]

        // int, long은 기본값으로 0이 들어있음. double이나 float은 0.0
        // String으로 만든 Array는 기본값으로 null이 들어있음.
        String[] arr4 =new String[3];
        arr4[0] = "가위";
        arr4[1] = "나비";
        arr4[2] = "다람쥐";

        System.out.println(Arrays.toString(arr1));
        // System.out.println(arr1);
        // System.out.println(arr1[0]); // 순서가 0부터 시작
        // System.out.println(arr1[1]);
        // System.out.println(arr1[2]);
        // System.out.println(arr1[3]);  // 방범위를 벗어나면 에러 표시
        // System.out.println(arr1[-1); // 음수 인덱싱도 불가

        // System.out.println(Arrays.toString(arr2)); // 에러가 나지 않음
        arr2[1] = 1;
        arr2[2] = 2;
        System.out.println(Arrays.toString(arr2)); // [0, 1, 2]

        System.out.println(Arrays.toString(arr3)); // [true, false]
        System.out.println(Arrays.toString(arr4)); // [가위, 나비, 다람쥐]

        // array(배열. 방을 나눠서 각 값을 저장하는 참조자료형)을
        // list(값을 순서대로 담는 자료구조, 같은 값을 여러번 담을 수 있습니다. 가변자료형

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        System.out.println(list1); // []
        // list1[0] = 1 ; 직접 접근이 불가
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // System.out.println(list1);
        // System.out.println(list1.get(0)); // 방번호로 조회
        // System.out.println(list1.get(1));
        // System.out.println(list1.get(2));
        // System.out.println(list1.get(-1)); // 음수 호출하면 에러
        // System.out.println(list1.get(5)); // 없는 방 호출하면 에러

        // ArrayList<자료형> 변수명 = new ArrayList<자료형> (); <자료형을 고정해주는 장치 generic>
        // ArrayList 변수명 = new ArrayList (); 자료형에 상관없이 값 할당 가능
        ArrayList list2 = new ArrayList();
        list2.add(3.14);
        list2.add(true);
        list2.add(0);
        list2.add("다람쥐");
        System.out.println(list2);

        // Create-add / Read-get / Update-set(위치, 바꿀값) / Delete-remove(1개삭제), clear(전체삭제)
        ArrayList list3= new ArrayList();
        list3.add("가위");
        list3.add("나무");
        list3.add("다람쥐");
        System.out.println(list3);

        list3.set(1, "다리미");
        System.out.println(list3);

        list3.remove("나무");
        System.out.println(list3);

        list3.remove(1);
        System.out.println(list3);

    }
}




