# File System 예제

## Paths
- **static Path get(URI uri)**
  - 파일 정보를 담고 있는 객체 반환

## Path
- **Path getRoot()**
  - 루트 디렉토리 반환
- **Path getParent()**
  - 부모 디렉토리 반환
- **Path getFileName()**
  - 파일 이름 반환
- **boolean	isAbsolute()**
  - 절대경로 인지 아닌지
- **Path toAbsolutePath()**
  - 절대경로 정보로 수정된 객체 생성 및 반환

## Files
- **static Path	createFile(Path path, FileAttribute<?>... attrs)**
  - 지정한 경로에 빈 파일 생성, 경로가 유효하지 않거나 파일이 존재하면 예외 발생
- **static Path	createDirectory(Path dir, FileAttribute<?>... attrs)**
  - 지정한 경로에 디렉토리 생성, 경로가 유효하지 않으면 예외 발생
- **static Path	createDirectories(Path dir, FileAttribute<?>... attrs)**
  - 지정한 경로의 모든 디렉토리 생성
- **static Path	write(Path path, byte[] bytes, OpenOption... options)**
  - 파일에 데이터 쓰기
  - options
    - APPEND : 파일의 끝에 데이터를 추가
    - CREATE : 파일이 존재하지 않으면 생성
    - CREATE_NEW : 새 파일을 생성. 이미 파일이 존재하면 예외발생.
    - TRUNCATE_EXISTING : 쓰기 위해 파일을 여는데 파일이 존재하면 덮어씀
    - 기본옵션 : CREATE, TRUNCATE_EXISTING
- **static byte[]	readAllBytes(Path path)**
  - 파일의 데이터 읽기
- **static Path	copy(Path source, Path target, CopyOption... options)**
  - 파일 복사
  - options
    - REPLACE_EXISTING : 이미 파일이 존재한다면 해당 파일로 대체
    - COPY_ATTRIBUTES : 파일의 속성까지 복사
- **static Path	move(Path source, Path target, CopyOption... options)**
  - 파일 이동
  - options : copy와 동일

## 참고
- 윤성우의 열혈 Java 프로그래밍