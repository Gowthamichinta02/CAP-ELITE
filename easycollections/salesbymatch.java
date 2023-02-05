  public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
      Collections.sort(ar);
      int c=0;
      int i=0;
      while(i<n-1){
          if(ar.get(i)==ar.get(i+1)){
             c++;
             i+=2;
          }
          else{
              i++;
          }
      }
      return c;
    }

}
