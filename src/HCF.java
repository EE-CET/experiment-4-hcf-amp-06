import java.util.Scanner;

	public class HCF
		{
			public static void main(String [] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter two numbers");
				int a=sc.nextInt();
				int b=sc.nextInt();
				int small, hcf=1;
				if(a>b)
					small=b;
				else
					small=a;
				for(int i=1;i<=small;i++)
				{
					if(a%i==0 && b%i==0)
					{
						hcf=i;
					}
				}
				System.out.println(hcf);
			}
		}