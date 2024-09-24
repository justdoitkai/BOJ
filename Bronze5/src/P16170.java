import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class P16170 {
  public static void main(String[] args) {
    ZonedDateTime time = ZonedDateTime.now(ZoneId.of("UTC"));

    System.out.println(time.format(DateTimeFormatter.ofPattern("yyyy\nMM\ndd")));
  }
}