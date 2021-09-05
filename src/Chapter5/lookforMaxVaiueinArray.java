package Chapter5;

public class lookforMaxVaiueinArray {

    public static void main(String[] args) {

        int max = 0;
        int[] array = {1, 5, 3, 8, 2};

        for ( int index : array
             ) {
            if( index > max ){
                max = index;
            }

        }

        System.out.println("max : " + max);


    }


}