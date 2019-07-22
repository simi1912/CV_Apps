public class InsertionSort implements SortAlgo{

    @Override
    public int[] sort(int[] arr){

        int n = arr.length;

        for(int i=0; i<n;i++){

            int toInsert = arr[i];
            int sortedTo = i-1;

            while(sortedTo>=0 && arr[sortedTo]>arr[i]){

                arr[sortedTo+1]=arr[sortedTo];
                sortedTo--;
            }
            arr[sortedTo+1] = toInsert;
        }
        return arr;
    }
}
