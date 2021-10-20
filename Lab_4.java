import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {
        int n;
        Scanner in = null;

        do {
            System.out.print("Укажите количество элементов массива: ");
            in = new Scanner(System.in);
            if (!(in.hasNextInt())) {
                System.out.println("Количество элементов должно быть целым положительным числом.\n");
                n = 0;
            }
            else
                n = in.nextInt();
        } while (n <= 0);

        int[] x = new int[n];

        System.out.println("Ввод элементов массива:");
        int i = 0;
        while (i < n) {
            System.out.print("[" + (i + 1) + "]: ");
            in = new Scanner(System.in);
            if (!(in.hasNextInt())) {
                System.out.println("Элемент массива должен быть целым числом.\n");
                i--;
            }
            else
                x[i] = in.nextInt();
            i++;
        }

        int k = 0;
        double s = 0;
        System.out.println("\nИсходный массив:");
        for (int j = 0; j < n; j++) {
            System.out.print("[" + x[j] + "] ");
            if (x[j] < 0) {
                k++;
                s += x[j];
            }
        }

        if (k == 0)
            System.out.println("\nОтрицательные элементы отсутствуют");
        else
            System.out.println("\nСреднее значение среди отрицательных элементов: " + (s / k));
    }
}

