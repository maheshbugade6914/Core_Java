package HomeWork02;

public class ChallengeProgram02 {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawAmount = 4999;
        int Remaining =0;
        if(balance >= withdrawAmount ){
            System.out.println("Withdrawal successful.");
            Remaining = balance - withdrawAmount ;
        }
        else {
            System.out.println("Insufficient balance.");
        }
        System.out.println("Remaining balance -: "+ Remaining);
    }
}
