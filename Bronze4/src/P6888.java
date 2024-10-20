import java.util.Scanner;

public class P6888 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int startYear = sc.nextInt();
    int endYear = sc.nextInt();
    int ALL_POSITION_CHANGE = 60;

    while (startYear <= endYear) {
      System.out.println("All positions change in year " + startYear);
      startYear += ALL_POSITION_CHANGE;
    }
  }
}
