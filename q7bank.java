import java.io.*;
import java.util.*;
public class q7bank extends q7init{
    private int bank_id;
    public q7bank(String bankname, double roi, int bank_id){
        super(bankname, roi);
        this.bank_id = bank_id;
    }
    public void show_roi(int bank_id){
        if(this.bank_id == 0){
            System.out.println("Bank out of service!!");
        }
        else{
            System.out.println(this.bank_id/*+"   "+this.bankname+"   "+roi*/);
        }
    }
    public static void main(String[] args) {
        q7bank bank1 = new q7bank("Bank of Earth", 10.3, 3323);
        q7bank bank2 = new q7bank("Bank of Mars", 22.5, 4426);
        q7bank bank3 = new q7bank("Bank of Jupiter", 18.7, 5109);
        q7bank bank4 = new q7bank("Bank of Saturn", 13.6, 6109);
        q7bank bank5 = new q7bank("Bank of Venus", 10.3, 0);
        bank1.show_roi(bank1.bank_id);
        bank2.show_roi(bank2.bank_id);
        bank3.show_roi(bank3.bank_id);
        bank4.show_roi(bank4.bank_id);
        bank5.show_roi(bank5.bank_id);
        bank5.chng_roi(20);
    }
}