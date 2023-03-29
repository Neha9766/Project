import java.util.Scanner;
class Food
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Pizza Factory");
		System.out.println("Press 1 for : Veg Pizza");
		System.out.println("Press 2 for : Non-veg Pizza");
		System.out.println("Choice: ");
		int Choice = sc.nextInt();

		switch (Choice)
		{
		   case 1:
			{
			   System.out.println("Press 1 for : Deluxe veggies");
			   System.out.println("Press 2 for : Cheese & corn");
			   System.out.println("Press 3 for : Panner Tikka");
			   int a = sc.nextInt();
			   switch(a)
				{
				   case 1:
					{
					   System.out.println("For Deluxe veggies");
					   System.out.println("Press 1 for : Regular:Rs.150");
					   System.out.println("Press 2 for : Medium:Rs.200");
					   System.out.println("Press 3 for : Large:Rs.325");
					   int b = sc.nextInt();
					   switch(b)
						{
						   case 1:
							{
							   System.out.println("Regular:Rs.150");
							}
							break;
							case 2:
							{
							   System.out.println("Medium:Rs.220");
							}
							break;
							case 3:
							{
							   System.out.println("Large:Rs.325");
							}
						}
						System.out.println("Thank you for ordering...!!! Your pizza will be delivered in 20 mins");
					}
					break;
				
					case 2:
					{
					   System.out.println("For Cheese & corn");
					   System.out.println("Press 1 for : Regular:Rs.175");
					   System.out.println("Press 2 for : Medium:Rs.375");
					   System.out.println("Press 3 for : Large:Rs.475");
					   int c = sc.nextInt();
					   switch(c)
						{
						   case 1:
							{
							   System.out.println("Regular:Rs.175");
							}
							break;
							case 2:
							{
							   System.out.println("Medium:Rs.375");
							}
							break;
							case 3:
							{
							   System.out.println("Large:Rs.475");
							}
						}
						System.out.println("Thank you for ordering...!!! Your pizza will be delivered in 20 mins");
					}
					break;
					case 3:
					{
					   System.out.println("For Paneer Tikka");
					   System.out.println("Press 1 for : Regular:Rs.160");
					   System.out.println("Press 2 for : Medium:Rs.290");
					   System.out.println("Press 3 for : Large:Rs.340");
					    int d = sc.nextInt();
					   switch(d)
						{
						   case 1:
							{
							   System.out.println("Regular:Rs.160");
							}
							break;
							case 2:
							{
							   System.out.println("Medium:Rs.290");
							}
							break;
							case 3:
							{
							   System.out.println("Large:Rs.340");
							}
						}
						System.out.println("Thank you for ordering...!!! Your pizza will be delivered in 20 mins");
				}	
				break;
			}
			}
			break;
			case 2:
			{
				System.out.println("Press 1 for: Non-veg Supreme:");
				System.out.println("Press 2 for: chiken Tikka");
				System.out.println("Press 3 for: Pepper Barbecuec Chicken");
				int e = sc.nextInt();
				switch(e)
				{
					case 1:
					{
						System.out.println("For Non-veg Supreme Pizza");
						System.out.println("Press 1 for: Regular:Rs.190");
						System.out.println("Press 2 for: Medium:Rs.325");
						System.out.println("Press 3 for: Large:Rs.425");
						 int f = sc.nextInt();
					     switch(f)
						{
						   case 1:
							{
							   System.out.println("Regular:Rs.190");
							}
							break;
							case 2:
							{
							   System.out.println("Medium:Rs.325");
							}
							break;
							case 3:
							{
							   System.out.println("Large:Rs.425");
							}
						}
						System.out.println("Thank you for ordering...!!! Your pizza will be delivered in 20 mins");
					}
					break;
					case 2:
					{
						System.out.println("For Chicken Tikka");
						System.out.println("Press 1 for: Regular:Rs.210");
						System.out.println("Press 2 for: Medium:Rs.370");
						System.out.println("Press 3 for: Large:Rs.500");
						 int g = sc.nextInt();
					   switch(g)
						{
						   case 1:
							{
							   System.out.println("Regular:Rs.210");
							}
							break;
							case 2:
							{
							   System.out.println("Medium:Rs.370");
							}
							break;
							case 3:
							{
							   System.out.println("Large:Rs.500");
							}
						}
						System.out.println("Thank you for ordering...!!! Your pizza will be delivered in 20 mins");
					}
					break;
					case 3:
					{
						System.out.println("For Pepper Barbecuec Chicken");
						System.out.println("Press 1 for: Regular:Rs.220");
						System.out.println("Press 2 for:Medium:Rs.380");
						System.out.println("Press 3 for:Large:Rs.525");
						 int h = sc.nextInt();
					   switch(h)
						{
						   case 1:
							{
							   System.out.println("Regular:Rs.220");
							}
							break;
							case 2:
							{
							   System.out.println("Medium:Rs.380");
							}
							break;
							case 3:
							{
							   System.out.println("Large:Rs.525");
							}
						}
						System.out.println("Thank you for ordering...!!! Your pizza will be delivered in 20 mins");
					}
					
				}
				break;
			}
		}
	}
}
