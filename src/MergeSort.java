public class MergeSort implements SortAlgo{

    int[] arr;

    @Override
    public int[] sort(int[] arr){

        this.arr=arr;
        partition(0, this.arr.length-1);
        return this.arr;
    }

    private void partition( int l, int r){

        if(l<r){
            int n = (int) (r+l) / 2;

            partition(l, n);
            partition(n + 1, r);

            int nl = n-l+1;
            int nr = r-n;

            int[] left = new int[nl];
            int[] right = new int[nr];

            for(int i=0; i<=n-l; i++){
                left[i] = arr[l+i];
            }

            for(int i=0; i<r-n; i++){
                right[i]=arr[n+1+i];
            }

            merge(left, right, l, n, r);
        }
    }

    private void merge(int[] left, int[] right, int l, int n, int r){

        int i=l;
        int j=0;
        int k=0;

        while(j<left.length ^ k<right.length){
//

            if(left[j]<right[k]){

                arr[i] = left[j];
                j++;
            }else{
                arr[i]= right[k];
                k++;
            }
            i++;
        }

        if(j == left.length-1){
            while (k<right.length){

                arr[i]=right[k];
                k++;
                i++;
            }
        }else{
            while (j<left.length){

                arr[i]=left[j];
                j++;
                i++;
            }
        }
    }
}