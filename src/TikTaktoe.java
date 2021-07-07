import java.util.Arrays;
import java.util.Scanner;

public class TikTaktoe{
	static TikTaktoe classobj=new TikTaktoe();
	
	char[] intArray = new char[10];
	char[] Arrayfinal = Arrays.copyOfRange(intArray, 1, intArray.length);
	
	public  void Makingallempty() {
	for(int i=0;i<=8;i++) {
		Arrayfinal[i]=' ';
	}
	}
	
	public  char input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("CHOOSE WHETHER 'X'OR 'O'");
	    char player=sc.next().charAt(0);
	     return player;
	}
	
	public  void Showboard()
	{
		//System.out.println(Arrayfinal.length);
		  for (int i=0;i<9;i++) {
			  if (Arrayfinal[i]==' ')
			  {
				  System.out.println("The position "+i+" is empty");
			  }
			  else {
				  
				  System.out.println("The position "+i+" is "+Arrayfinal[i]);
			  }
		  } 
	
	}
	
	public char compinput(char player) {
		char comp= ' ';
		if ((player=='X') || (player=='x'))
		{
			 comp='O';
		}
	   else {
		 
		    comp='X';
	}
		return comp;
	}	
	
	public char[] Gameplay( char player)
	{//players gameplay
	
	System.out.println("Enter the position in which you need to place");
	Scanner play=new Scanner(System.in);
	int pos=play.nextInt();
	Arrayfinal[pos]=player;
	System.out.println("the position opted is"+Arrayfinal);
	
	//computers play
	int position=(int) Math.floor((Math.random()*10)%9);
	System.out.println(position);
	System.out.println(Arrayfinal[position]);
	return Arrayfinal;
	}
	
	public static void main(String[] args) {
		classobj.Makingallempty();
		char player=classobj.input();
		classobj.Gameplay(player);
		classobj.Showboard();
		
		
		
		
		
		
	}
}




