class Start {
    public static void main(String [] args) {
        int code [] = {1, 2, 3, 9, 11, 13, 17, 25, 57, 90, 110};
        int num = 90;
        BinarySearch bs = new BinarySearch();
        System.out.println(num + " " + bs.Search(code, num));
    }
}
class BinarySearch {
    public static String Search(int code[], int num){
        String answer = "Not Found";
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
                answer = "Found";
                break;
            }
        }
        return answer;
    }
}
