import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeClass {
  public static void main(String[] args){
    LocalDateTime now = LocalDateTime.now();
    System.out.println("현재시각 : " + now);

    LocalDateTime flight1 = LocalDateTime.of(2021, 9, 1, 10, 30);
    System.out.println("비행기1 출발시간 : " + flight1);

    LocalDateTime flight2 = LocalDateTime.of(2021, 10, 2, 11, 40);
    System.out.println("비행기2 출발시간 : " + flight2);

    LocalDateTime fastFlight;
    if (flight1.isBefore(flight2))
      fastFlight = flight1;
    else
      fastFlight = flight2;
    System.out.println("두 비행기 중 빠른 출발시간인 내 출발시간 : " + fastFlight);

    Period day = Period.between(now.toLocalDate(), fastFlight.toLocalDate());
    System.out.println("출발시간 까지 남은 날짜 : " + day);

    Duration time = Duration.between(now.toLocalTime(), fastFlight.toLocalTime());
    System.out.println("출발시간 까지 남은 시간 : " + time);
  }
}
