import java.util.Scanner;

class data{
    private int ac_no;
    private String name;
    private float ammount;
    protected void set_ac_no(int ac_no){
        this.ac_no = ac_no;
    }
    protected int get_ac_no(){
        return ac_no;
    }
    protected void set_name(String name){
        this.name = name;
    }
    protected String get_name(){
        return name;
    }
    protected void set_amt(float ammount){
        this.ammount = ammount;
    }
    protected float get_amt(){
        return ammount;
    }
    protected void checkbalance(){
        System.out.println("your account balance: "+ammount);
    }
    protected float deposit(float amt){
        ammount = ammount+amt;
        return ammount;
    }
    protected void withdraw(float amt){
        if(ammount <= amt){
            System.out.println("balance is inceficint");
        }else{
            ammount = ammount-amt;
        }
    }
}
class atm{
    public static void main(String[] args) {
        dataobjectmethod();
    }
    public static void dataobjectmethod(){
        Scanner sn = new Scanner(System.in);
        String s,y_n;
        data obj = new data();
        /*System.out.println("Enter account number: ");
        obj.set_ac_no(sn.nextInt());
        System.out.println("Enter your name: ");
        obj.set_name(sn.next());*/
        System.out.println("Enter ammount: ");
        obj.set_amt(sn.nextFloat());
        System.out.println("money withdraw/deposit key enter(w/d)");
        s = sn.next();
        switch(s){
            case "w":
            System.out.println("Enter withdraw ammount: ");
            obj.withdraw(sn.nextFloat());
            System.out.println("success...");
            break;
            case "d":
            System.out.println("Enter diposit ammount: ");
            obj.deposit(sn.nextFloat());
            System.out.println("success...");
            break;
        }
        System.out.println("if check your balance (y/n)");
        y_n = sn.next();
        if(y_n.equals("y")){
            obj.checkbalance();
        }
        else if(y_n.equals("n")){
            System.out.println("Thanks for visiting");
        }
    }
}