int a=0;
      int mid=p/2;
      if(n%2==0){
           a=(n-p+1)/2;
      }
          else{
              a= (n-p)/2;
          }
      int k=Math.min(a,mid);
      return k;
    }
   
