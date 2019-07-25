
public class SortTest {

    /*
    Instructions:
        1. Instantiate the factory
        2. Register a sort algorithm
        3. Get the reference of the object you want to sort with
        4. Optional, You can unregister an algorithm

        Register and use a sort algorithm. Registering the algorithms at run time makes updates of what varies (sort algorithms) easy,
        without changes the already written code.
     */

    public static void main(String[] args){

        int[][] tests = {
                {1,2,3,4,5},
                {5,4,3,2,1},
                {1,1,1,1,0},
                {1,1,1,0,1},
                {1,1,0,1,1},
                {1,0,1,1,1},
                {0,1,1,1,1},
                {1,-1,-100,1,100},
                {1,1,1,1,2},
                {1,1,1,2,1},
                {1,1,2,1,1},
                {1,2,1,1,1},
                {2,1,1,1,1}
        };

        SortFactory factory = new SortFactory();


        factory.registerAlgo("bubble", new BubbleSort());
        factory.registerAlgo("select", new SelectSort());
        factory.registerAlgo("insertion", new InsertionSort());
        factory.registerAlgo("merge", new MergeSort() );

        for(int i=0; i<tests.length; i++){

            int[] result1 = factory.getAlgo("merge").sort(tests[i]);

            for(int tePrint: result1){
                System.out.print(tePrint);
            }
            System.out.println();
        }


//        for(int i = 0; i<result.length; i++){
//            System.out.print(result[i]+" ");
//        }
    }
}
