public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
     int max=scores.get(0),min=scores.get(0);
     int c1=0,c2=0;
     List<Integer> result = new ArrayList<>();
     for(int i=1;i<scores.size();i++){
         if(scores.get(i)>max){
             max=scores.get(i);
             c1++;
         }
         if(scores.get(i)<min){
             min=scores.get(i);
             c2++;
         }
     }
     result.add(c1);
     result.add(c2);
     return result;
    }
