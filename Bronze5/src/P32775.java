import java.util.Scanner;

public class P32775 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rail = sc.nextInt();
    int flight = sc.nextInt();

    String RESULT_RAIL = "high speed rail";
    String RESULT_FLIGHT = "flight";

    if (rail > flight) {
      System.out.println(RESULT_FLIGHT);
    } else {
      System.out.println(RESULT_RAIL);
    }
  }
}