class Main{
    static void Head(int n)
    {
        if(n==0)
        return;
        Head(n-1);
        System.out.println(n);
    }
    public static void main(String[] args)
    {
        Head(5);
    }
}
