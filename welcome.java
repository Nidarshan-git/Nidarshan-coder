abstract class A
{
    public void add()
    {
        int a=10;
        int b=20;
        System.out.println(a+b);
    }

    public abstract void subtract();
}

class B extends  A
{
    @Override
    public void subtract()
    {
        int c=50;
        int d=20;
        System.out.println(c-d);
    }

}

class welcome{
    public static void main(String[] args)
     {
        B b1=new B();
        b1.add();
        b1.subtract();

        
    }
}