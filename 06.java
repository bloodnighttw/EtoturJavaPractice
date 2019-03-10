
public class Main
{

public static void main(String[] args){
	   int i=0;
	   int[] roads= {0,1,2,1,2,1,2,1,2,1,2,1,9};
	   while(roads[i]!=9) {	
		   

		
		   System.out.println("Forward");
		   System.out.println("Turn Left");
		   System.out.println("Forward");
		   System.out.println("Turn Right");
		   i=i+2;
		   //因為每前進一步就s(這邊是i)要+1  有兩個前進   所以+2
	   }

	   
   }
}

