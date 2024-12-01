import java.util.Scanner;

public class P21300 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int TYPE_OF_CONTAINER = 6;
    int CONTAINER_PRICE = 5;
    int count = 0;

    for (int i = 0; i < TYPE_OF_CONTAINER; i++) {
      count += sc.nextInt();
    }

    System.out.println(count * CONTAINER_PRICE);
  }
}
