import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        Random randomNum = new Random();
        int firstNumber = randomNum.nextInt(5);
        System.out.println("the random number is " + firstNumber);
        if (firstNumber != 0) {
            System.out.println("hooray something has emerged!");
        } else {
                System.out.println("there is only void...");
            }
        
        int[] array = {11,12,13,14,15};
        System.out.println(array[firstNumber]);

        }
    }