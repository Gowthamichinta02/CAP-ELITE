class Person{
    private String firstname;
    private String lastname;
    private int id;
    Person(String firstname,String lastname,int id){
        this.firstname=firstname;
        this.lastname=lastname;
        this.id=id;
    }
    public void result(){
        System.out.println("Name: "+lastname+", "+firstname);
        System.out.println("ID: "+id);
    }
}
class Student extends Person{
    private int scores[]=new int[100];
    Student(String firstname,String lastname,int id,int scores[]){
        super(firstname,lastname,id);
        this.scores=scores;
    }
    public String calculate(){
        int sum=0,avg=0;
        for(int mark:scores){
            sum+=mark;
        }
        avg=sum/scores.length;
        if (avg >= 90 && avg <= 100){
            return "O";
            }
        else if (avg >= 80 && avg < 90) {
            return "E";
            }
        else if (avg >= 70 && avg < 80){
            return "A";
            }
        else if (avg >= 55 && avg < 70) {
            return "P";
            }
        else if (avg >= 40 && avg < 55) {
            return "D";
            }
        else{
            return "T";
            }
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String firstName=in.next();
        String lastName=in.next() ;
        int id=in.nextInt();
        int total=in.nextInt() ;
        int[] testScores=new int[total];
        for (int i = 0; i < total; i++) {
            testScores[i] = in.nextInt();
            }
        Student s = new Student(firstName, lastName, id, testScores);
        s.result() ;
        System.out.println("Grade: "+s.calculate()) ;
    }
}
