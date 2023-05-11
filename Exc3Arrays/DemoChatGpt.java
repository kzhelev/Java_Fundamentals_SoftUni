package Exc3Arrays;

    public class DemoChatGpt {
        public static void findPairs(int[] arr, int sum) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == sum) {
                        System.out.println(arr[i] + "," + arr[j]);
                    }
                }
            }
        }
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int sum = 5;
            findPairs(arr, sum);
        }
    }

