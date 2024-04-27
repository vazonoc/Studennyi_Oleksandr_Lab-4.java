import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Виклик методу main з кожного класу в зазначеному порядку
        Exercise_1.main(args);
        Exercise_2_1.main(args);
        Exercise_2_2.main(args);
        Exercise_2_3.main(args);
        Exercise_2_4.main(args);
        Exercise_2_5.main(args);
        Exercise_3.main(args);
        Exercise_4.main(args);

    }
}
 class Exercise_1 {
    public static void main(String[] args) {
        int[] a = new int[50];
        int[] b = new int[50];
        for (int i = 0; i < 50; i++) {
            a[i] = i * 2;
            System.out.print("Номер:  " + (i + 1) + ";");
            System.out.print("      Масив заповнений парними числами: ");
            System.out.println(a[i]);
        }

        for (int i = 0; i < 50; i++) {
            b[i] = i * 2 + 1;
            System.out.print("Номер:  " + (i + 1) + ";");
            System.out.print("       Масив заповнений непарними числами: ");
            System.out.println(b[i]);
        }
    }
}


class Exercise_2_1 {
    public static void main(String[] args) {
        int i = 0;        int a[] = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        while (i < a.length) {            i++;
            System.out.println(a[i] + " ");        }
        int i = 0;
        int[] a = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        while (i < a.length) {
            System.out.println(a[i] + " ");
            i++;
        }
    }
}


class Exercise_2_2 {
    public static void main(String[] args) {
        int a[] = {2,17,13,6,22,31,45,66,100,-18};
        for (int i = 0; i <a.length ; i++)
        {
            System.out.println(a[i]+ " ");
        int[] a = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        for (int num : a) {
            System.out.println(num + " ");
        }
    }
}




 class Exercise_2_3 {
    public static void main(String[] args) {
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        int i = 1;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i += 2;
        }
    }
}


 class Exercise_2_4 {
    public static void main(String[] args) {
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }
    }
}


class Exercise_2_5{
    public static void main(String[] args) {
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}



 class Exercise_3 {
    public static void main(String[] args) {
        int n = 5;
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("Масив: " + Arrays.toString(array));
        System.out.println("Сума елементів масиву: " + sum);
    }
}


class Exercise_4 {
    public static void main(String[] args) {
        int[] a = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] = -a[i];
            }
        }
        System.out.println("Змінений масив: " + Arrays.toString(a));
    }
}