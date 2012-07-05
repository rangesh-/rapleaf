
/**
 * TODO Put here a description of what this class does.
 *
 * @author rangesh.
 *         Created Jul 1, 2012.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class yodle {
private static int heightOfTree = 100;
private final String fileName = "C:/Users/rangesh/workspace/triangle.txt";
private int[][] tree;

public int maxValue() throws IOException {
readTree();

for (int i = yodle.heightOfTree - 2; i >= 0; i--)
for (int j = 0; j <= i; j++)
tree[i][j] += tree[i + 1][j] > tree[i + 1][j + 1] ? tree[i + 1][j] : tree[i + 1][j + 1];

return tree[0][0];
}

private void readTree() throws IOException {
tree = new int[yodle.heightOfTree][];

BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
for (int i = 0; i < yodle.heightOfTree; i++) {
tree[i] = new int[i + 1];
String[] values = bufferedReader.readLine().split(" ");
for (int j = 0; j <= i; j++)
tree[i][j] = Integer.parseInt(values[j]);
}
}

public static void main(String[] args) throws IOException {
System.out.println(new yodle().maxValue());
}
}