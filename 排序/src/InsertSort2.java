public class InsertSort2 {
    public static void sort(int[] arr){
        int pos,temp;
        for(int i=1;i<arr.length;i++){
            pos = i;
            while(pos!=0&&arr[pos]<arr[pos-1]){
                temp = arr[pos];
                arr[pos] = arr[pos-1];
                arr[pos-1] = temp;
                pos--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        sort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
