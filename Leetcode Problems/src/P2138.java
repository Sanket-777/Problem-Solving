class P2138 {
    public static void main(String[] args) {

        System.out.println(divideString("sank",3,'x'));
    }
    static String[] divideString(String s, int k, char fill) {
    while (s.length()%3 != 0)
    {
        s =s + fill;
    }
    System.out.println(s.length());
    String [] ans = new String[s.length()/k];
    int i= 0;
    int start = 0;
    int end = start + k ;
    while (i < ans.length )
    {
        ans[i++] = s.substring(start,end);
        start = end ;
        end  += k ;
    }
     return  ans;
    }
}
