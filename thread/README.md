# Thread 예제

## Thread
- **static Thread currentThread()**
  - 현재의 쓰레드 반환
- **void	start()**
  - 쓰레드 생성 및 실행
- **String getName()**
  - 쓰레드 이름 반환
- **void join()**
  - 쓰레드의 실행이 완료되기를 기다림

## Synchronization
- Synchronized 메소드, 블록
  - Synchronized 메소드, 블록에는 한 쓰레드의 접근만을 허용

## Executors
- **static ExecutorService newSingleThreadExecutor()**
  - 쓰레드 풀 안에 하나의 쓰레드만 생성
- **static ExecutorService newFixedThreadPool(int nThreads)**
  - 쓰레드 풀 안에 인자 만큼의 쓰레드 생성

## ExecutorService
- **\<T> Future\<T>	submit(Callable\<T> task)**
  - 쓰레드 풀에 작업 전달
- **void shutdown()**
  - 쓰레드 폴과 그 안에 존재하는 쓰레드 소멸
- **boolean awaitTermination(long timeout, TimeUnit unit)**
  - 쓰레드 풀에 전달된 작업이 끝나기를 기다림

## ReentrantLock
- **void lock()**
  - 한 쓰레드만 들어갈수 있도록 문 닫기
- **void unlock()**
  - 다음 쓰레드가 들어갈 수 있도록 문 열기

## 참고
- 윤성우의 열혈 Java 프로그래밍