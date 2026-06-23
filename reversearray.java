public class reversearray {
    public static void main(String[] args) {

        // // reversearry
        // int [] arr = {1,2,3,4,5,6,7,8,9,10};

        // for (int i = arr.length-1;i >= 0; i--) 
        // {
        //     System.out.println(arr[i]+ " ");
        // }

    //     // search an element in an array using a loop
    //     int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    //     int search = 12;
    //     boolean found = false;

    //     for (int i=0; i < arr.length; i++ ){
    //         if (arr[i] == search ){
    //             found = true;
    //             break;
    //         }
               
    //     }
    //      {
    //         if (found){
    //             System.out.println("The number is found");
    //         }else{
    //             System.out.println("Number is not found");
    //         }
    // }

    //print only prime numbers from an array

    int []arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for (int i = 0; i< arr.length;i++){
        int num = arr[i];
        int count = 0;

        for(int j= 2;j < num;j++){
            if(num%j == 0){
                count++;
            }
        }

        if(num >1 && count ==0){
            System.out.println(num+ "");
        }
    }

    
}
}
