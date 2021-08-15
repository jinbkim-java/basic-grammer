# sort 메소드 예제

## sort
- public static <T extends Comparable\<? super T>> void sort(List\<T> list)
  - T는 Comparable\<T 또는 T의 상위클래스> 인터페이스를 구현한 상태이어야 함
- public static \<T> void sort(List\<T>, Comparator<? super T> c)
  - sort 메소드 호출 시에 정렬의 기준을 결정 할 수 있음

## 참고
- 윤성우의 열혈 Java 프로그래밍