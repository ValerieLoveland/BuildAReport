import java.util.Arrays;
import java.util.Scanner;

public class BuildAReport {

   public static void main(String[] args) {
       Scanner reader = new Scanner (System.in);

       int highest = 0;
       int lowest = 0;
       int total = 0;
       double average = 0;
       int numbers[] = new int[7];
       //char wholeName[] = new char[];
       String fName;
       String lName="";
       String lastName;
       String nameSwitch =null;
       String reportTitle = "Report Title";

      ///////////////////////////////////////////////// Karen's section suggestion/////
       String firstIn, firstOut = "";
       Scanner keyboard = new Scanner (System.in);
       System.out.println("Enter your first name: ");
       firstIn = keyboard.next();


       for (int i = 0; i < firstIn.length(); i++)

       {
           if (firstIn.charAt(i) >= 'A' && firstIn.charAt(i) <= 'Z')
               firstOut = firstOut + firstIn.charAt(i);
           if (firstIn.charAt(i) >= 'a' && firstIn.charAt(i) <= 'z')
               firstOut = firstOut + firstIn.charAt(i);
       }

       System.out.println("Your first name is ");
       System.out.println(firstOut);


       System.out.println("What is your first name");
       //this accepts input of anything in a string
       String fname=reader.nextLine();
           fname = fname.replace("0", "");
           fname = fname.replace("1", "");
           fname = fname.replace("2", "");
           fname = fname.replace("3", "");
           fname = fname.replace("4", "");
           fname = fname.replace("5", "");
           fname = fname.replace("6", "");
           fname = fname.replace("7", "");
           fname = fname.replace("8", "");
           fname = fname.replace("9", "");
           fname = fname.replace(" ", "");
           //this takes out spaces and numbers. I feel like there has to be a better way for this
       System.out.println(fname);

       //now for the last name

       System.out.println("What is your last name?");

       for (int i=0; i<7; i++){
                   char n = reader.next().charAt(0);

if ((n >='a' && n<= 'z' || n>='A' && n<='Z')){
    lName=lName + n;
           System.out.println(lName);}else{
    lName=lName + "";
           }



    //we are going to get the 7 numbers now and run them

//for first one make its own logic
     //  highest = numbers[i];
      // lowest = numbers[i];
       System.out.println("What are the seven numbers");//I didn't work out how to accept different inputs in this yet
       for (i=0; i<7; i++){

       numbers[i]= reader.nextInt();
       total=total + numbers[i];

           System.out.println("Running total: "+total);
            average = total/(i+1);
           System.out.println("Running average: "+ average);
           if (numbers[i]> highest){
               highest = numbers[i];}

           else if (numbers[i]< lowest){
               lowest = numbers[i];

           }

           System.out.println("Current highest: "+ highest);
           System.out.println("Current lowest: "+ lowest);
       }
       System.out.println(Arrays.toString(numbers));

   }

   //average = total/7;

}}
