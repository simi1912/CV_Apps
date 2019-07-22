public class BubbleSort implements SortAlgo {

    @Override
    public int[] sort(int[] arr) {

        int n = arr.length;

        for( int i=0; i<n; i++){

            for( int j=0; j<n-1-i;j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
