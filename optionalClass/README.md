# Optional class 예제

## static <T> Optional<T> of(T value)
- Optional 객체 생성
- 비어있는 객체 생성 불가능

## static <T> Optional<T> ofNullable(T value)
- Optional 객체 생성
- 비어있는 객체 생성 가능

## boolean isPresent()
- Optional 객체에 내용물이 존재 하면 true, 아니면 false 반환

## T get()
- Optional 객체의 내용물 반환

## void ifPresent(Consumer<? super T> consumer)
- **void accept(T t)** 메소드 정의에 해당하는 람다식을 ifPresent의 인자로 전달
- ifPrㅇesent가 호출되었을 때, Optional 객체가 저장하고 있는 내용물이 있으면 accept 메소드 호출

## \<U> Optional\<U> map(Function<? super T,? extends U> mapper)
- **U apply(T t)** 메소드 정의에 해당하는 람다식을 map 인자로 전달
- apply 메소드가 반환하는 대상을 자동적으로 Optional 객체에 담아서 반환됨

## T orElse(T other)
- Optional 객체가 비어있을때 호출됨

## static \<T> Optional\<T>	empty()
- 빈 Optional 객체 생성

## <U> Optional<U> flatMap(Function<? super T,Optional<U>> mapper)
- **U apply(T t)** 메소드 정의에 해당하는 람다식을 flatMap 인자로 전달
- apply 메소드가 반환하는 대상을 Optional 객체로 직접 감싸서 반환해야 함

## 참고
- 윤성우의 열혈 Java 프로그래밍