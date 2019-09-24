package asd;

interface Parent//父类接口
{
    public void simpleCall();
}
class Child_A implements Parent
{
    public void simpleCall()
    {
    //具体的实现细节；
    	System.out.println("study");
    }
}
 
class Child_B implements Parent
{
    public void simpleCall()
    {
    //具体的实现细节；
    	System.out.println("read");
    }
}

public class Ploymorphism {
	public static void main(String[] args) {
		Parent pa = new Child_A();
		pa.simpleCall();
	}

}
