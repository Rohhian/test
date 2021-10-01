import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        Random randomNum = new Random();
        int firstNumber = randomNum.nextInt(2);
        System.out.println("the random number is " + firstNumber);
        if (firstNumber == 1) {
            System.out.println("hooray something has emerged!");
        } else {
                System.out.println("there is only void...");
            }

        }
    }