package Unit_01;

public class P6_Task01_ArraysInJava {

    public static void main(String[] args) {

        // Declaration
        int array1[];

        int[] array2;
        int []array3;

        //Can not do it as we have not provide it any memory/space yet!
        //array1[0] = 1;

        //Initialization, during initialization we have to provide the size of the array
        array1 = new int[6]; //{1,2,3,4};

        //Assigning values to the Java array
        for(int i = 0;i < array1.length;i++)//length is the property of array
            array1[i] = i;

        int array4[] = { 33, 3, 4, 5}; //declaration, instantiation and initialization

        //passing array to method
        arrayAsParameter(array4);

        //passing anonymous array in a method
        arrayAsParameter(new int[] { 33, 3, 4, 5 });

        //Returning Array from the Method
        int[] array5 = arrayAsReturnType();
        System.out.println(array5);

        //ArrayIndexOutOfBoundsException if i<=arr.length
        int arr[] = { 50, 60, 70, 80 };
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        //Multidimensional Array in Java
        int[][] arr6 = new int[3][3];//3 row and 3 column

        int counter = 0;
        for( int i=0 ; i<3 ; i++ ) {
            for( int j=0 ; j<3 ; j++ ) {
                arr6[i][j] = counter;
                counter++;
            }
        }

        for( int i=0 ; i<3 ; i++ ) {
            for( int j=0 ; j<3 ; j++ ) {
                System.out.println(arr6[i][j]);
            }
        }

    }

    static void arrayAsParameter(int arr[]) { //declare empty array as parameter
        for(int i=0 ; i < arr.length;i++ ) { //length is the property of array
            System.out.println(arr[i]);
        }
    }

    //Returning array from the method
    static int[] arrayAsReturnType() {
        int array4[] = { 4,5,6,7 };

        return array4;
    }

}