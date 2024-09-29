import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9325 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());
    for (int i = 0; i < testCase; i++) {
      int carPrice = Integer.parseInt(br.readLine());
      int options = Integer.parseInt(br.readLine());

      if (options > 0) {
        for (int j = 0; j < options; j++) {
          StringTokenizer st = new StringTokenizer(br.readLine());
          int optNum = Integer.parseInt(st.nextToken());
          int optPrice = Integer.parseInt(st.nextToken());

          carPrice += optNum * optPrice;
        }
      }

      System.out.println(carPrice);
    }
  }
}
