package multilevelinheritanceexample;
public class GrandParent {

    public void work()
    {
        System.out.println("GrandParent Work");
    }
}

class Parent extends GrandParent
{
    @Override
    public void work()
    {
        super.work();
        System.out.println("Parent Work");
    }
}

class Child extends Parent
{
    @Override
    public void work()
    {
        super.work();
        System.out.println("Child Work");
    }
}
