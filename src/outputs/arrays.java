package outputs;

public class arrays {
    public static void outputOneD (double[] _data) {
        System.out.println("Outputting data:\n");

        for (int i = 0; i < _data.length; i++) {
            System.out.print(_data[i] + " ");
        }
    }

    public static void outputOneD (int[] _data) {
        System.out.println("Outputting data:\n");

        for (int i = 0; i < _data.length; i++) {
            System.out.println(_data[i] + " ");
        }
    }

    public static void outputOneD (String[] _data) {
        System.out.println("Outputting data:\n");

        for (int i = 0; i < _data.length; i++) {
            System.out.println(_data[i] + " ");
        }
    }

    public static void outputTwoD (double[][] _data) {
        System.out.println("Outputting data:\n");

        for (int i = 0; i < _data.length; i++) {
            for (int j = 0; j < _data[i].length; j++) {
                System.out.print(_data[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void outputTwoD (int[][] _data) {
        System.out.println("Outputting data:\n");

        for (int i = 0; i < _data.length; i++) {
            for (int j = 0; j < _data[i].length; j++) {
                System.out.print(_data[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void outputTwoD (String[][] _data) {
        System.out.println("Outputting data:\n");

        for (int i = 0; i < _data.length; i++) {
            for (int j = 0; j < _data[i].length; j++) {
                System.out.print(_data[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}