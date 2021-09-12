package lesson3;

public class lesson3 {
    public static void main(String[] args) {
        System.out.println("Result № 1");
        element0and1();
        System.out.println();
        System.out.println("Result  № 2");
        massif100(100);
        System.out.println();
        System.out.println("Result № 3");
        multiply(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        System.out.println();
        System.out.println("Result № 4");
        fillDiagonal();
        System.out.println();
        System.out.println("Result № 5");
        retLenArr(4,2);

    }

    //Задание 1. С помощью цикла и условия заменить 0 на 1, 1 на 0.
    public static void element0and1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    //Задание 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100.
    public static int[] massif100(int size) {
         int[] arr = new int[size];
         for (int i = 0; i < arr.length; i++){
            arr [i] = i+1;
             System.out.print(arr[i] + " ");
        }
        System.out.println();
            return arr;

    }

    //Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.
        public static void multiply(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] *= 2;
                }
                System.out.print(arr[i] + " ");
            }
    }
    //Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n]
    public static void fillDiagonal() {
        int[][] matrix = {
                {2, 6, 7},
                {8, 5, 3},
                {4, 9, 1}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
                System.out.println(matrix[i][j] + "");
            }
            System.out.println();
        }
    }
    //Задание 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
        public static int[] retLenArr (int len, int initialValue) {
            int[] arr = new int[len];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
            }
            return arr;
    }
}






