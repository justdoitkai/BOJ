import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13118 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String num = br.readLine();
    int[] people = new int[4];
    StringTokenizer st = new StringTokenizer(num, " ");
    for (int i = 0; i < 4; i++) {
      people[i] = Integer.parseInt(st.nextToken());
    }

    num = br.readLine();
    int x = Integer.parseInt(num.split(" ")[0]);

    int result = 0;
    for (int i = 0; i < 4; i++) {
      if (people[i] == x) {
        result = i + 1;
      }
    }

    System.out.println(result);
  }
}