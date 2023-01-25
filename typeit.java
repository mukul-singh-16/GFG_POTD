public class typeit {
    public static void main(String[] args) {
        String s="abcdef";
        System.out.println(minOperation(s));
    }
    public static int minOperation(String s) {
        // code here
        int n=Integer.MAX_VALUE;
        String t1="",t2="";
        for(int i=0;i<s.length();i++)
        {
            t1=t1+s.charAt(i);
            if(i+t1.length()<s.length())
                t2=s.substring(i+1,(i+1+t1.length()));
            else
                t2=s.substring(i+1);
            // System.out.println("t1= "+t1+" t2= "+t2);
            if(t1.equals(t2))
            {
                n=Math.min(n, i+2+(s.length()-(t2.length()*2)));
                // System.out.println(n);
            }
        }
        n=Math.min(n, s.length());
        return n;
    }
}
