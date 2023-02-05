class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    List<Integer> c=new ArrayList<Integer>(Collections.nCopies(100,0));
    for(Integer i:arr){
        if(c.get(i)!=0){
            c.set(i,c.get(i)+1);
        }
        else{
            c.set(i,1);
        }
    }
     return c;  
    }

}
