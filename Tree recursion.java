class Main
{
    static void Tree(int n)
    {
        if(n==0)
        return;
       
       
        System.out.println(n);
         Tree(n-1);
          Tree(n-1);
    }
    public static void main(String args[])
    {
       Tree(5); 
    }
}
