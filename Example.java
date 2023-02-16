public class Example {
    private int var;
    public Example ()
    {
        this.var=10;
    }
    public Example(int num)
    {
        this.var=num;
    }
    public int getValue()
    {
        return var;
    }
    public static void main(String[] args)
    {
        Example obj=new Example(9);
        System.out.println("ver is "+obj.getValue());
    }
}
