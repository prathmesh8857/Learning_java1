public class array {

    public static void main(String[] args) {
        // int []arr = {1,2,3,4,5};

        // //datatype arrayname = new datatype[size];


        // int []numbers = new int[5];

        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // numbers[3] = 40;
        // numbers[4] = 50;//this line will throw an arrayinderout of boundexception bcoz the aaray size is 5 and the last index is 4.

        // for (int i = 0; i<5; i++) {
        //     System.out.println(numbers[i]);
        // }


        // //enhance for loop

        // for (int num : numbers){
        //     System.out.println(num);
        // }

        // //datatype arrayname = new datatype [size]
        // //new keyword used for allocate new mamory
        // int []arr = {1,2,3,4,5};
        // System.out.println(arr.length);

        int[][] jagged = new int[3][4]; 

        jagged[0][0] = 1;
        jagged[0][1] = 2;
        jagged[0][2] = 3;

        jagged[1][0] = 4;
        jagged[1][1] = 5;

        jagged[2][0] = 6;
        jagged[2][1] = 7;
        jagged[2][2] = 8;
        jagged[2][3] = 9;

        for (int i = 0; i < jagged.length; i++){
            for(int j = 0; j < jagged[i].length; j++){
                System.out.print(jagged[i][j] +" ");
            }
            System.out.println();
        }




    }
    
}
