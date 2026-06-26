package HomeWork02;

public class ChallangeProgram01 {
    public static void main(String[] args) {
        int units = 180;
        int Bill =0;
        if(units >=100){
            Bill = ((100 * 5)+(units -100 )*8);
        }
        else
        {
            Bill = (units *5);
        }
        System.out.println(Bill);
    }
}
