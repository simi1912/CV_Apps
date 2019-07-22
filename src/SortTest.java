
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

        int[] test = {-5,3,0,1};

        SortFactory factory = new SortFactory();

        factory.registerAlgo("insertion", new InsertionSort() );

        SortAlgo bubbleSort = factory.getAlgo("insertion");

        int[] result = bubbleSort.sort(test);


        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }

    }
}
