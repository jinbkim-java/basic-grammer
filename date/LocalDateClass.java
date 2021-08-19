import java.time.LocalDate;
import java.time.Period;


public class LocalDateClass {
  public static void main(String[] args){
    LocalDate today = LocalDate.now();
    System.out.println("today : " + today);

    LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
    System.out.println("X-mas : " + xmas);

    LocalDate eve = xmas.minusDays(1);
    System.out.println("X-mas eve : " + eve);

    Period left = Period.between(today, xmas);
    System.out.println("크리스마스 까지 남은날 : " + left.getMonths() + "월 " + left.getDays() + "일");
  }
}
