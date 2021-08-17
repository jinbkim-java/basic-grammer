# 정의 되있는 함수형 인터페이스 예제

## Predicate\<T>
- **public interface Predicate\<T> { boolean test(T t) }**
- **boolean test(T t)** 메소드 정의에 해당하는 람다식을 전달해야 함

## Supplier\<T>
- **public interface Supplier\<T> { T get() }**
- **T get()** 메소드 정의에 해당하는 람다식을 전달해야 함

## Consumer\<T>
- **public interface Consumer\<T> { void accept(T t) }**
- **void accept(T t)** 메소드 정의에 해당하는 람다식을 전달해야 함

## Function<T, R>****
- **public interface Function\<T, R> { R apply(T t) }**
- **R apply(T t)** 메소드 정의에 해당하는 람다식을 전달해야 함

## 참고
- 윤성우의 열혈 Java 프로그래밍