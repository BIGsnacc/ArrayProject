/*
1. Get info
        1.1.1. Get random value for first element
        1.1.2. Get random value for second element
        1.1.3. Get random value for third element
        1.1.4. Get random value for fourth element
        1.1.5. Get random value for fifth element
    1.2. Get user to replace value at index number 0 and 1
    1.3. Assign value at index number 4 to the value of index number 0
    1.4. Assign value at index number 3 to the value of index number 1
2. Do calculations
        2.1.1. Find random value between 1 and 10 for first element
        2.1.2. Find random value between 1 and 10 for second element
        2.1.3. Find random value between 1 and 10 for third element
        2.1.4. Find random value between 1 and 10 for fourth element
        2.1.5. Find random value between 1 and 10 for fifth element
    2.2. Calculate the sum of all five elements
    2.3. Calculate the average of all five elements
3. Print Results
        3.1.1. Print Random value for the first element
        3.1.2. Print Random value for the second element
        3.1.3. Print Random value for the third element
        3.1.4. Print Random value for the fourth element
        3.1.5. Print Random value for the fifth element
    3.2. Print the sum of all five elements
    3.3. Print the average of all five elements

    3.4. Prompt the user for a number
        3.5.1. Print value for the first element as the user input
        3.5.2. Print value for the second element as the user input
        3.5.3. Print Random value for the third element
        3.5.4. Print Random value for the fourth element
        3.5.5. Print Random value for the fifth element
    3.6. Print the sum of all five elements
    3.7. Print the average of all five elements

        3.8.1. Print value for the first element as the user input
        3.8.2. Print value for the second element as the user input
        3.8.3. Print Random value for the third element
        3.8.4. Print value for the fourth element as what the second element's value is
        3.8.5. Print value for the fifth element as what the first element's value is
    3.9. Print the sum of all five elements
    3.10. Print the average of all five elements
 */

import java.util.Scanner;

public class ArrayProject {

    Scanner scanner = new Scanner(System.in); //Creating of scanner
    private int list[] = new int[5];  //Array itself


    public static void main(String[] args) {    //Main class

        new ArrayProject();

    }


    private ArrayProject() {      //Instance of ArrayProject
        //All of the elements
        list[0] = (int) (Math.random() * 10) + 1;
        list[1] = (int) (Math.random() * 10) + 1;
        list[2] = (int) (Math.random() * 10) + 1;
        list[3] = (int) (Math.random() * 10) + 1;
        list[4] = (int) (Math.random() * 10) + 1;

        printElements();
        //Replacing elements values with the user's number
        replaceValueAt(0);
        replaceValueAt(1);

        printElements();
        //Assigning values of index numbers 4 with 0 and 3 with 1
        list[4] = list[0];
        list[3] = list[1];

        printElements();
    }

    private void replaceValueAt(int indexNumber) {   //Method for user to input a number
        System.out.println("Please enter a number between 1 and 10.");
        int userNumber = scanner.nextInt();
        list[indexNumber] = (userNumber);
    }


    private void printElements(){      //Method for all of the print lines
        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
        System.out.println(list[3]);
        System.out.println(list[4]);
        System.out.println("the sum is: " + list[0] + list[1] + list[2] + list[3] + list[4]);
        System.out.println("The average is: " + (list[0] + list[1] + list[2] + list[3] + list[4]) /5);
        System.out.println(" ");
    }

}