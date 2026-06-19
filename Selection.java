import java.time.DayOfWeek;

public class Selection {
    
    public static void main(String[] args) {
        //only if statement
        //  int age = 2; 
        //  if (age >= 18) {
        //     System.out.println("you are an adult. ");
        //  }else{
        //      System.out.println("you are child. ");
        //  }

        //if else statement
        // int age = 2; 
        // if (age >= 18) {
        //     System.out.println("you are an adult. ");
        //  }else if(age >=16 && age < 18){
        //     System.out.println("you are child. ");
        //  }else {
        //     System.out.println("you are minor");
        //  }

        //if else if else statement
        // int marks = 78;
        // if (marks >= 85){
        //     System.out.println("Grade is A.");
        // }else if(marks >=35 && marks < 55){
        //     System.out.println("Grade is C.");
        // }else {
        //     System.out.println("Grade is B.");
        // }

        //nested if else loop

        // int age = 8;
        // boolean hasLicense = true;

        // if(age >=18){
        //     if (hasLicense){
        //         System.out.println("You are eligibal to drive car.");
        //     } else {
        //         System.out.println("You are not eligibal to drive the car.");
        //     }

        // } else {
        //     System.out.println("You are child.");
        // }


        //ternary operator
        //EX1
        // int age = 25;
        // String result = (age >= 18) ? "Adult" : "Minor";
        // System.out.println(result);

        // int marks = 75;
        // String grade = (marks >= 90) ? "A" //after question mark value is true
        //             : (marks >= 80) ? "B"  //before colen values are false
        //             :(marks >= 70) ? "C"
        //             :(marks >= 60) ? "d" : "F";
        // System.out.println("Grade: " + grade);  
        
        
        //switch case
        
        // int day = 2;
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sonday");
        //         break;
        //     default:
        //         System.out.println("Invalid Day");
        //         break;
        // }


        // int value = 5;

        // switch (value) {
        //     case 1 ->
        //     System.out.println("Value was 1");
        //     case 2,3 -> 
        //     System.out.println("Value was 2 or 3");
        //     default -> 
        //     System.out.println("Value was not 1,2 or 3");
            
        // }

        //switch as expression
        int value = 5;

        int result = switch (value) {
            case 1 ->
            1;
            case 2,3 ->
            2;
            default ->
            0;
        };


    }
}
