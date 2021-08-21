# File System 예제

## ByteBuffer
- **static ByteBuffer	allocate(int capacity)**
  - 바이트 버퍼 객체 생성
- **Buffer flip()**
  - 버퍼에 저장된 데이터를 읽을 수 있는 상태로 변경
- **Buffer clear()**
  - 버퍼 비우기

## FileChannel
- **static FileChannel open(Path path, OpenOption... options)**
  - 파일을 읽고 쓰기 위한 채널 생성
- **abstract int read(ByteBuffer dst)**
  - 채널에서 데이터를 읽고 버퍼 dst에 저장
- **abstract int write(ByteBuffer src)**
  - 버퍼 src에 저장된 데이터를 채널로 전송
- **Buffer position(int newPosition)**
  - 채널의 포지션 이동
- **int	position()**
  - 채널의 포지션 반환

## 참고
- 윤성우의 열혈 Java 프로그래밍