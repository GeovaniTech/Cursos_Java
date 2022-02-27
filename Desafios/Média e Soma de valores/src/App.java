public class App {
    public static void main(String[] args) throws Exception {
        int[] nums1 = {4, 5, 6};
        int[] nums2 = {8, 9, 7};

        float m1 = 0;
        float m2 = 0;

        for (int n:nums1) {
            m1 += n;
        }

        for (int n:nums2) {
            m2 += n;
        }

        float soma = (m1 / 3) + (m2 / 3);

        System.out.printf("A soma das duas Arrays é igual a %.2f", soma);

    }
}
