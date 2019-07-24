public class MergeSort implements SortAlgo{

    int[] arr;

    @Override
    public int[] sort(int[] arr){


        this.arr=arr;

       partition(arr, 0, this.arr.length-1);

        return this.arr;

    }

    private void partition(int[] arr, int l, int r){

        if(l==r){

            int n = (r-l) / 2;

            partition(arr, l, n);
            partition(arr, n + 1, r);

            int nl = n+1;
            int nr = r-n;

            int[] left = new int[nl];
            int[] right = new int[nr];

            for(int i =l; i<=n; i++){
                left[i] = arr[l+i];
            }

            for(int i=n+1; i<r-n; i++){
                right[i-(n+1)]=arr[n+1+i];
            }

            merge(left, right, l, n, r);
        }
    }

    private void merge(int[] left, int[] right, int l, int n, int r){

        int i=0;
        int j=0;
        int k=0;

        while(i<left.length || i<right.length){

            if(left[i]<right[i]){
                arr[l+i] = left[j];
                j++;
            }else{
                arr[l+i]= right[k];
                k++;
            }
            i++;
        }

        if(j==0){
            while (k<right.length){

                arr[l+i]=right[k];
                k++;
            }
        }else{
            while (j<left.length){

                arr[l+i]=left[j];
                j++;
            }
        }
    }

}
