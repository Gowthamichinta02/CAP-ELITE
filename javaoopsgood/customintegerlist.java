class IntegerList{
    private List<Integer> list;
    private int size;
    public IntegerList(int size){
        this.size=size;
        list=new ArrayList<>(size);
    }
    public void add(int value){
        if(list.size()==size)
            System.out.println("can't add, list is full");
        else
            list.add(value);
    }
    public void toString(int i){
       
            System.out.println(i+" : "+list.get(i));
        
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int capacity = Integer.parseInt(in.nextLine());
        IntegerList nums=new IntegerList(capacity);
        while(in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            nums.add(num);
        }
        for(int i=0;i<capacity;i++){
        nums.toString(i);
        }
    }
}
