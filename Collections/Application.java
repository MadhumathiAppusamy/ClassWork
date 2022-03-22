package Collections;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ArrayList arraylist= new ArrayList();
		arraylist.add(new Student("name1",1,20));
        arraylist.add(new Student("name2",2,25));
        arraylist.add(new Student("name3",3,21));
        System.out.println(arraylist);
	}
}
