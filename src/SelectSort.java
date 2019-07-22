public class SelectSort implements SortAlgo {

    @Override
    public int[] sort(int[] arr){

        int n = arr.length;

        for( int i=0; i<n; i++){

            int minIndex = i;

            for(int j=i+1; j<n; j++){

                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }
}
