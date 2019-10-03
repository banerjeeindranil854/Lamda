package java_projects;

interface FuncInterface 
{ 
    // An abstract function 
    void abstractFun(int x); 
  
    // A non-abstract (or default) function 
    default void normalFun() 
    { 
       System.out.println("Hello"); 
    } 
} 
public class InterfaceExample {
	public static void main(String[] arg) {
		FuncInterface fac=(int z) ->System.out.println(z*10);
				fac.abstractFun(3);	
				fac.normalFun();
	}
	
}


