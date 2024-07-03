// package Pattern;

public class pattern4 {
    public static void Print(int rows) {
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows; j++) {

                if (i == 0 || i == rows - 1) {
                    System.out.print("4");
                } else if (j == 0 || j == rows - 1) {
                    System.out.print("4");
                } else {
                    if (i == 1 || i == rows - 2) {
                        System.out.print("3");
                    } else if (i == 2 || i == rows - 3) {
                        if (j == 1 || j == rows - 2) {
                            System.out.print("2");
                        } else {
                            System.out.print("3");
                        }
                    } else if (i == 3 || i == rows - 4) {
                        if (j == 1 || j == rows - 2) {
                            System.out.print("2");
                        } else if (j == 2 || j == rows - 3) {
                            System.out.print("1");
                        } else {
                            System.out.print("3");
                        }
                    } else {
                        System.out.print("2");
                    }
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int rows= 4;
        Print(rows);

    }
}
