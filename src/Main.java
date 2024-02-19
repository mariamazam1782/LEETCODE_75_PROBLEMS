public class Main {
    public static void main(String[] args) {
        int[] num = {5, 2, 8, 1, 7, 4, 6, 3};
        TwoSum.sort(num,0,num.length-1);
        System.out.println("Array after sorting");
        display(num);
        int target = 10;
        for(int i =0;i< num.length-1;i++){
            int r = target-i;

            int beg = 0; int end = num.length-1;
            while (beg<=end){
                int mid = (beg+end)/2;
                if(r==num[mid]){
                    System.out.println(i);
                    System.out.println(mid);
                    break;
                } else if (r<num[mid]) {
                    beg = mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
    }
    public static void display(int[] num){
        for(int i =0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}