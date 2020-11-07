public class Cat
{
    private String mName;
    static int mAge = 1;
    static int count =0;

    public Cat(String name)
    {
        this.mName = name;
        count++;
    }

    public void meow()
    {
        System.out.println(this.mName + ": Meow Meow !");
    }
}
