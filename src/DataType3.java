import java.util.*;

public class DataType3 {
    // 접근제어자 함수의메모리상위치 리턴값 함수명(입력값의자료형 입력값을부를공갈문자) { }
    public static void main(String[] args) {
        // Map: key로 value에 접근하는 dict와 같은 자바의 자료형
        // Array, List 는 방 순서대로 값을 찾습니다
        // Map 방에 바로 접근 (빠름) -> 검색,삽입,삭제가 빈번한 데이터의 경우에는 속도 면에서 우월
        // key - value 둘 다 메모리에 저장하기 때문에 array보다 용량은 큽니다.
        // key가 같으면 value가 바뀜. 중복 불가
        // {'name':'김연지', 'age':'25'}
        //         List<String> list4 = new ArrayList<>();
        //        list4.add("감나무");
        //        System.out.println(list4);

        // 인터페이스(자료구조)<key자료형, value자료형> 변수명 = new 구현체<>();
        // 인터페이스: 구체적 내용은 적혀있지 않고 구현체에 실제로 적혀있어야 하는 내용들을 점검표로만 적어줍니다.
        //  부모클래스                      자식클래스
        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("가", "가위"); // create
        // 나, 나비 / 다, 다람쥐
        map1.put("나", "나비");
        map1.put("다", "다람쥐");
        System.out.println(map1); // {가=가위}

        // 다, 다리미
        // map1.put("다", "다리미"); // update: map은 key의 중복이 불가하므로 이미 있는 key의 자리는 value만 변경
        map1.replace("다", "다리미");
        System.out.println(map1);

        // 나라는 키를 삭제
        System.out.println(map1.remove("나"));
        System.out.println(map1);

        // 가 라는 키가 있는지 확인해보시고
        System.out.println(map1.get("가")); // 있으면 해당 key의 value를 리턴
        // 라 라는 키가 있는지 확인해보시고
        System.out.println(map1.get("라")); // 없으면 null을 리턴
        System.out.println(map1.getOrDefault("라", "없음")); // 있으면 해당 key의 value를 없으면 두번째 값을 리턴

        System.out.println(map1.containsKey("라")); // false
        System.out.println(map1.entrySet());

        // Set - 중복을 허용하지 않는 자료형
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set1);

        // enum : 상수처럼 변하지 않는 고정된 값만 선택 가능한 자료형
        Map<Language, Integer> map2 = new HashMap();
        map2.put(Language.JAVA, 3); // String으로 받았다면 소문자, 대문자, 한글 가리지 않고 마구 들어왔을텐데
        // enum 으로 고정해놓은 값으로만 들어오도록 key의 자리를 막아놨기 때문에
        System.out.println(map2);

    }
}

enum Language {
    JAVA, JAVASCRIPT, HTML, CSS
}
