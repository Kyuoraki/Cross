public class Main {
    public static void main(String[] args) {
        String[][] crossMark = new String[7][10];
        for (int i = 0; i < crossMark.length; i++) {
            for (int j = 0; j < crossMark[i].length; j++) {
                if (j == i || j == crossMark.length - 1 - i) crossMark[i][j] = "X";
                else crossMark[i][j] = " ";
                System.out.print(crossMark[i][j]);
            }
            System.out.println();
        }
    }
}