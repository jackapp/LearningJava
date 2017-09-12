/**
 * Created by ankur on 23/8/17.
 */
public class UniquePaths {

    public static void main(String[] args) {


        boolean visited[][] = new boolean[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                visited[i][j] = false;
            }

        }

        int ans = findPaths(visited, 0, 0);
        System.out.println("Paths possible is:" + ans);

    }

    static int findPaths(boolean[][] visited, int i, int j) {

        if (!isSafe(i, j, visited)) {
            return 0;
        }

        if (i == 3 && j == 3) {
            return 1;
        }

        visited[i][j] = true;
        boolean temp[][] = new boolean[4][4];

        copyToTemp(visited,temp);

        int down = findPaths(temp, i + 1, j);
        copyToTemp(visited,temp);

        int right = findPaths(temp, i, j + 1);
        copyToTemp(visited,temp);

        int left = findPaths(temp, i - 1, j);
        copyToTemp(visited,temp);

        int top = findPaths(temp, i, j - 1);


        return down + top + left + right;

    }

    static boolean isSafe(int i, int j, boolean[][] visited) {

        if (i >= 0 && i <= 3 && j >= 0 && j <= 3 && !visited[i][j]) {
            return true;
        }
        return false;
    }


    static void copyToTemp(boolean [][]visited,boolean [][]temp) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp[i][j] = visited[i][j];

            }

        }

    }
}
