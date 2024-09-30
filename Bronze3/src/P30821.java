import java.util.Scanner;

public class P30821 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    long result = 1;
    for (int i = 0; i < 5; i++) {
      result *= (num - i);
    }

    result /= 120;
    System.out.println(result);
  }
}
