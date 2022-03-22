package assessment;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	ArrayList<Musicplayer> arraylist=new ArrayList<Musicplayer>();
	arraylist.add(new Musicplayer(1,"ennadhan","vijay","abc","def","aaa"));
	arraylist.add(new Musicplayer(2,"sodhanai","karthi","ghi","jkl","bbb"));
	arraylist.add(new Musicplayer(3,"pogumpadhai","karki","mno","pqr","ccc"));
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("select the option:");
		System.out.println("play a song");
		System.out.println("search a song");
		System.out.println("show all songs");
		System.out.println("operate on song database");
		int option =sc.nextInt();
	switch(option)
		{
		case 1:{
			System.out.println("play all song");
		    System.out.println("play songs randomly");
		    System.out.println("play a particular song");
		    
		    
		}
		case 2:System.out.println("");
		       break;
		case 3:System.out.println("show all songs");
		       break;
		case 4:System.out.println("operate on song database");
		       break;
		default:break;
		}
		}while(true);
	}


	

