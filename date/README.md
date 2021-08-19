# 시각과 날짜 클래스 예제

## Instant
- **static Instant now()**
  - 현재 시각 정보가 담긴 Instant 객체 생성
- **long getEpochSecond()**
  - 1970-01-01 00:00:00 기준으로 지나온 시간을 초단위로 계산한 결과

## LocalDate
- **static LocalDate now()**
  - 오늘의 날짜 정보를 담은 LocalDate 객체 생성
- **static LocalDate	of(int year, int month, int dayOfMonth)**
  - 지정한 날짜 정보를 담은 LocalDate 객체 생성

## LocalTime
- **static LocalTime now()**
  - 현재 시각 정보가 담긴 LocalTime 객체 생성
- **static LocalTime	of(int hour, int minute, int second)**
  - 지정한 시각 정보를 담은 LocalTime 객체 생성

## LocalDateTime
- **static LocalDateTime now()**
  - 현재 시각 정보와 날짜 정보가 담긴 LocalDateTime 객체 생성
- **static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)**
  - 지정한 시각 정보와 날짜 정보가 담긴 LocalDateTime 객체 생성
- **boolean	isBefore(ChronoLocalDateTime<?> other)**
  - 날짜와 시각이 other 보다 이전인지 아닌지
- **boolean	isAfter(ChronoLocalDateTime<?> other)**
  - 날짜와 시각이 other 보다 이후인지 아닌지
- **LocalDate	toLocalDate()**
  - LocalDateTime 객체에서 날짜 정보를 담은 LocalDate 객체 반환
- **LocalTime	toLocalTime()**
   - LocalDateTime 객체에서 시각 정보를 담은 LocalTime 객체 반환

## Duration
- **static Duration	between(Temporal startInclusive, Temporal endExclusive)**
  - 시각 차 정보를 담은 Duration 객체 생성
- **long toSeconds()**
  - 초 단위의 시각 차를 계산한 결과

## Period
- **static Period	between(LocalDate startDateInclusive, LocalDate endDateExclusive)**
  - 날짜 차 정보를 담은 Period 객체 생성
- **int	getMonths()**
  - 월 단위의 날짜 차를 계산한 결과
- **int	getDays()**
  - 일 단위의 날짜 차를 계산한 결과

## 참고
- 윤성우의 열혈 Java 프로그래밍