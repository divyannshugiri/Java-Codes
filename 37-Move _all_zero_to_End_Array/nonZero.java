class NonZero {
    static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap values
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++; // Move to the next position for non-zero elements
                
            }
        }
   
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
        for(int num : arr)
        {
            System.out.println(num + "");
        }
       
        }
    }

