class Account{
    private String name;
    private int accountno;
    private int balance;
    Account(String name,int accountno,int balance){
        this.name=name;
        this.accountno=accountno;
        this.balance=balance;
    }
    public String getName(){
        return name;
    }
    public int getAccountno(){
        return accountno;
    }
    public int balance(){
        return balance;
    }
    public void display(){
        System.out.println(accountno+" "+name+" "+balance);
    }
    public void deposit(int x){
        balance+=x;
    }
    public void withdraw(int x){
        if(balance<x){
            System.out.println("Negative Balance Transaction Cancelled");
        }
        else{
            balance-=x;
        }
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int accountno=Integer.parseInt(in.nextLine());
       String name=in.nextLine();
      int n=Integer.parseInt(in.nextLine());
      int balance=0;
      Account a=new Account(name,accountno,balance);
      for(int i=0;i<n;i++){
        String[] arr= in.nextLine().split(" ");
        if(arr[0].equals("Deposit")){
          int k=Integer.parseInt(arr[1]);
          a.deposit(k);
        }
        else if(arr[0].equals("Withdraw")){
          int m=Integer.parseInt(arr[1]);
          a.withdraw(m);
        }
        else if(arr[0].equals("Display")){
  
          a.display();
        }
      }
      
    } 
}
