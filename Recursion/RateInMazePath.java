public class RateInMazePath {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;

        maze(1, 1, row, col, "");
    }

    static void maze(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec)
            return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        // go down
        maze(sr + 1, sc, er, ec, s + "D");

        // go right
        maze(sr, sc + 1, er, ec, s + "R");

    }
}
