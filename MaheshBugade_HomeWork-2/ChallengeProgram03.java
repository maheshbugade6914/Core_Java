package HomeWork02;

public class ChallengeProgram03 {
    public static void main(String[] args) {
        int number=19;
        if((number % 3 == 0)&& (number % 5 == 0)) {
            System.out.println("The Number is divisible by 3 & 5");
        }
        else if (number % 5 == 0){
                System.out.println("The Number is divisible by 5");
            }
        else if ((number % 3 == 0)) {
            System.out.println("The Number is divisible by 3");
        }
        else {
            System.out.println("The Number is not divisible by 3 & 5 ");
        }


    }
}
