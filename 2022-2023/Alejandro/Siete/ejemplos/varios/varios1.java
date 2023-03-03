package varios;

import java.util.Arrays;

public class varios1 {

    public static void main(String[] args) {

        int[] a = new int[20];
        System.out.println(Arrays.toString(a));

        Arrays.fill(a, 23);
        System.out.println(Arrays.toString(a));

        Arrays.fill(a, 3, 12, -5);
        System.out.println(Arrays.toString(a));

        Arrays.sort(a, 2, 8);
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        int pos = Arrays.binarySearch(a, 23);
        System.out.println("indicce " + pos);

    }

}