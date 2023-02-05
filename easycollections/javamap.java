class Solution{
	public static void main(String []argh)
	{
        Map<String,Integer> np = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            np.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(np.containsKey(s))
                System.out.println(s+"="+np.get(s));
            else
                System.out.println("Not found");
		}
	}
