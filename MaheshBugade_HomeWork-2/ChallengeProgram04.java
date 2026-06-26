package HomeWork02;

public class ChallengeProgram04 {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        char operator = '/';
        switch (operator){
            case '+':
                System.out.println("Addition :"+a+b);
                break;
            case '-':
                System.out.println("Subtraction :"+ (a-b));
                break;
            case '/':
                System.out.println("Division :"+a/b);
                break;
            case '%':
                System.out.println("Remainder :"+a%b);
                break;
        }
    }
}
