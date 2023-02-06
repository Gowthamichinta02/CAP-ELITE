public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    int c = 0;
    Collections.sort(ar);
    int i=0;
    while(i < n - 1) {
        if(ar.get(i) == ar.get(i+1)) {
            c++;
            i+=2;
        }
        else {
            i++;
        }
    }
    return c;
    }
