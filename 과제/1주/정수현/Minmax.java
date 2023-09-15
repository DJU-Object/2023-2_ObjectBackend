public class Minmax {
    public static void main(String[] args) {
        int count = 5;
        int[] list = {20, 10, 35, 30, 7};

        int min;
        int max;

        min = list[0];
        max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
            if (list[i] > max) {
                max = list[i];
            }
        }
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }
}