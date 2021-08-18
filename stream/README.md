# Stream 예제

## Stream 연산과정에 필요한 3가지
1. 질의 대상이 되는 소스
2. 파이프 라인에 해당하는 중간 연산자
3. 파이프 라인을 종료하고 결과를 출력하는 최종 연산자

## Stream 생성
- **public static \<T> Stream\<T> stream(T[] array)**
  - 배열에 저장된 데이터를 대상으로 스트림 생성
- **default Stream\<E> stream()**
  - 컬렉션 인스턴스를 대상으로 스트림 생성
- **static \<T> Stream\<T> of(T t)**
  - 데이터를 인자로 직접 전달하여 스트림 생성

## Filtering
- **Stream\<T> filter(Predicate<? super T> predicate)**
- **boolean test(T t)** 메소드 정의에 해당하는 람다식을 전달해야 함
- 스트림을 구성하는 데이터 일부를 조건에 따라 걸러냄

## Mapping
- **R apply(T t)** 메소드 정의에 해당하는 람다식을 전달해야 함
- 기존의 스트림을 기반으로 매핑된 새로운 스트림 생성
- **\<R> Stream\<R> map(Function<? super T, ? extends R> mapper)**
  - apply 메소드가 반환하는 대상으로 자동적으로 stream이 성성되고 반횐됨
- **Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)**
  - apply 메소드가 반환하는 대상으로 스트림을 생성하고 이를 반환해야 함

## Reduction
- **T reduce(T identity, BinaryOperator\<T> accumlator)**
- accumlator에 **T apply(T t1, T t2)** 메소드 정의에 해당하는 람다식을 전달해야 함
- 데이터를 축소하는 연산

## 스트림의 연결
- **static \<T> Stream\<T> concat(Stream<? extends T> a, Stream<? extends T> b)**
- 두개의 스트림을 연결하여 하나의 스트림 생성

## 정렬
- **Stream\<T> sorted(Comparator<? super T> comparator)**
- **int compareTo(T o)** 메소드에 정의에 해당하는 람다식을 전달해야 함

## 루핑
- 스트림을 이루는 모든 데이터 각각을 대상으로 특정 연산을 진행하는 행위
- **void forEach(Consumer<? super T> action)**
  - 최종 연산자에 해당됨
- **Stream\<T> peek(Consumer<? super T> action)**
  - 중간 연산자에 해당됨

## Match
- **boolean allMatch(Predicate<? super T> predicate)**
  - 스트림의 데이터가 조건을 모두 만족하는지
- **boolean anyMatch(Predicate<? super T> predicate)**
  - 스트림의 데이터가 조건을 하나라도 만족하는지
- **boolean noneMatch(Predicate<? super T> predicate)**
  - 스트림의 데이터가 조건을 모두 만족하지 않는지

## collect
- 파이프라인을 통해 걸러진 데이터를 최종 연산 과정에서 별도로 저장하기 위해 사용
- **\<R> R collect(Supplier\<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)**
  - supplier : 데이터를 저장할 저장소 반환
  - accumulator : supplier를 통해 생성된 객체(R), 스트림(T)
  - combiner : 데이터를 하나로 묶는 과정

## 참고
- 윤성우의 열혈 Java 프로그래밍