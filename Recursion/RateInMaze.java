public class RateInMaze {
    public static void main(String[] args) {
        int row = 4;
        int col = 6;

        int count = maze(1, 1, row, col);
        System.out.println(count);
    }

    static int maze(int sr, int sc, int er, int ec){
        if(sr > er || sc > ec) return 0;
        if(sr == er && sc == ec) return 1;

        int downWays = maze(sr+1, sc, er, ec);
        int rightWays = maze(sr, sc+1, er, ec);

        int totalWays = downWays + rightWays;

        return totalWays;
    }
}
