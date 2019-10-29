class Home {
    public static void main (String [] zzz) {
        int code [] = {1, 2, 3, 9, 11, 13, 17, 25, 57, 90, 110};
        int num = 17;
        String answer = "No";
        int left = 0;
        int right = code.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(code[mid] < num) {
                left = mid + 1;
            }
            if(code[mid] > num) {
                right = mid - 1;
            }
            if(code[mid] == num) {
                answer = "Yes";
                break;
            }
        }
        System.out.println(answer);
    }
}
