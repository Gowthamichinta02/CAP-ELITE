public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
     int ways=0,sum=0;
     for(int i=0;i<=s.size()-m;i++){
         for(int j=i;j<i+m;j++){
             sum+=s.get(j);
         }
         if(sum==d)
            ways+=1;
            sum=0;
     }
     return ways;
    }
}
