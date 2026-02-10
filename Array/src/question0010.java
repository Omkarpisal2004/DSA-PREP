
        public class question0010 {

            public static void main(String[] args) {
                String str = "I am here";
                System.out.println("normal :" +str);
                System.out.println( " reversed" +reversePreserveSpace(str));
            }

            public static String reversePreserveSpace(String str) {
                char[] arr = str.toCharArray();
                int left = 0, right = arr.length - 1;

                while (left < right) {

                    // Skip spaces from left
                    if (arr[left] == ' ') {
                        left++;
                    }
                    // Skip spaces from right
                    else if (arr[right] == ' ') {
                        right--;
                    }
                    // Swap characters
                    else {
                        char temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;
                        left++;
                        right--;
                    }
                }
                return new String(arr);
            }
        }


