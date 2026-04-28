class Main{
    static void Tail(int n)
    {
        if(n==0)
        return;
        System.out.println(n);
        Tail(n-1);
    }
    public static void main(String[] args)
    {
        Tail(5);
    }
}
