# binarySearch 메소드 예제

## binarySearch
- **public static \<T> binarySearch(List<? extends Comparable<? super T>> list, T key)**
  - 성공시 인덱스 값, 실패 시 음의 정수 반환 
  - list
    - Comparable<? super T>> 인터페이스를 구현한 상태 이어야함
    - T : Comparable\<T 또는 T의 상위클래스> 인터페이스를 구현한 상태이어야 함
- **public static \<T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)**
  - binarySearch 메소드 호출시 c를 기준으로 탐색

## 참고
- 윤성우의 열혈 Java 프로그래밍