import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P30876 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());
    int[][] slot = new int[num][2];

    StringTokenizer st;
    for (int i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      slot[i][0] = Integer.parseInt(st.nextToken());
      slot[i][1] = Integer.parseInt(st.nextToken());
    }

    int min = 1001;
    int idx = -1;
    for (int i = 0; i < num; i++) {
      if (min > slot[i][1]) {
        min = slot[i][1];
        idx = i;
      }
    }

    System.out.println(slot[idx][0] + " " + slot[idx][1]);
  }
}