import java.util.Scanner;

public class P9550 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int testCase = sc.nextInt();

    for (int i = 0; i < testCase; i++) {
      int kindOfCandy = sc.nextInt();
      int minimumCandy = sc.nextInt();

      int result = 0;
      for (int j = 0; j < kindOfCandy; j++) {
        int candies = sc.nextInt();
        int kids = candies / minimumCandy;
        result += kids;
      }

      System.out.println(result);
    }

  }
}
