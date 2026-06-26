package HomeWork02;

public class proGram08 {
    public static void main(String[] args){
        int firstNumber = 12;
        int secondNumber = 65;
        int thirdNumber = 43;
        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("First is  largest number");
        }
        else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("Second is largest number");
        }
        else {
            System.out.println("Third is largest number");
        }
    }
}
