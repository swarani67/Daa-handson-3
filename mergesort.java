public class merge {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 7, 1, 3, 2, 6};
        System.out.println(array);
        PrintArray(array);
        Merge(array);
        System.out.println(array);
        PrintArray(array);
    }
    private static void merge(int[] array, int[] t, int pre, int inter, int suc) {
        for (int a = pre; a <= suc; a++) {
            t[a] = array[a];
        }

        int a = pre;
        int b = inter + 1;
        int c = pre;

        while (a <= inter && b <= suc) {
            if (t[a] <= t[b]) {
                array[c] = t[a];
                a++;
            } else {
                array[c] = t[b];
                b++;
            }
            c++;
        }

        while (a <= inter) {
            array[c] = t[a];
            c++;
            a++;
        }
    }
    private static void Merge(int[] array, int[] t, int pre, int suc) {
        if (pre < suc) {
            int mid = pre + (suc - pre) / 2;
            Merge(array, t, pre, mid);
            Merge(array, t, mid + 1, suc);
            merge(array, t, pre, mid, suc);
        }
    }
    private static void PrintArray(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static void Merge(int[] array) {
        if (array == null || array.length <= 1)
            return;

        int[] temp = new int[array.length];
        Merge(array, temp, 0, array.length - 1);
    }

}

