import java.util.Scanner;
class Fordemo{
	public static void main(String abc[])
	{
		int i,j;
		/*for(i=0;i<=5;i++)
		{
			System.out.println(i);
			if(i == 2)
				//break; op 00112
			     continue; //op 00112334455
			System.out.println(i);
		}*/
		outer:
		for(i=1;i<=4;i++)
		{
			for(j=0;j<=3;j++)
			{
				if(j==3)
					//break outer;//012
				     //continue outer;
				System.out.print(+j);
				
			}
			System.out.println("");
		}
	}
}