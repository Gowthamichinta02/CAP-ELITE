public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
   int acount = 0;
   int bcount = 0;
    for (int i=0;i<apples.size();i++){
        int temp = a+apples.get(i);
        if(temp >=s && temp<=t)
            acount+=1;
    }
    System.out.println(acount);
    for (int i=0;i<oranges.size();i++){
        int temp = b+oranges.get(i);
        if(temp>=s && temp<=t)
            bcount+=1;
    }
    System.out.println(bcount);
  }
