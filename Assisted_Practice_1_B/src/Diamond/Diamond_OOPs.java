package Diamond;
interface First 
{  
    default void show() 
    { 
        System.out.println("This is First Default"); 
    } 
} 
interface Second 
{  
	default void show() 
    { 
        System.out.println("This is Second Default"); 
    } 
}  
public class Diamond_OOPs implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        Diamond_OOPs ob = new Diamond_OOPs(); 
        ob.show(); 
    } 
}
