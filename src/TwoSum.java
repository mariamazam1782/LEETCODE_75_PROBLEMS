public class TwoSum {
    public static int partition(int[] num, int low, int high){
        int pivot = num[high];
        int i = low;
        int j = low;
        while (i<=high){
            if(num[i]<=pivot){
                int temp = num[i];
                num[i]=num[j];
                num[j]=temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
    public static void sort(int[]num,int low, int high ){
        if(low<high){
            int p = partition(num,low,high);
            sort(num,low,p-1);
            sort(num,p+1,high);
        }
    }

}