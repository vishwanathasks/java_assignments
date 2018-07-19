//Creating animal class
class animal
{
	public void shout()
	{
		System.out.println("This the parent class");
	}
}
//creating sub classes
class cat extends animal
{
	public void shout()
	{
	    System.out.println("Cat makes the sound meow meow");
	}
}

class dog extends animal
{
	public void shout()
	{
	    System.out.println("Dog makes the sound woof woof");
	}
}

class horse extends animal
{
	public void shout()
	{
	    System.out.println("Horse makes the sound neigh neigh");
	}
}

public class animal_demo
{
    public static void main(String args[])
    {
        animal animal;
        animal=new cat();
        animal.shout();
        animal=new dog();
        animal.shout();
        animal=new horse();
        animal.shout();
        
    }
}
