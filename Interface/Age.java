package Interface;
import java.util.*;

public class Age {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age<0)
		{
		throw new  AgeException ();
		}

	}

}
