package excercises;
import java.util.Scanner;

/**
 * @author AM312792
 *
 */

public class DelgadosChoiceLoop
{

	public static void main(String[] args) 
	{
		tacoTruck();
		menu();
		orderingMenu();

		
		
	}
	public static void orderingMenu()
	{
		
String burrito, taco, pop, churros, tamales, tacoSalad, chipsSalsa, taquitos, chimichanga, potatoOle;
		
double burritoPrice = 1.99; //Burrito
double burritoOrdered = 0;
		
double tacoPrice = 0.99; //Taco
double tacoOrdered = 0;
		
double popPrice = 0.99; //Pop (Mt. Dew)
double popOrdered = 0;
		
double churrosPrice = 2.00; //Churro
double churrosOrdered = 0;
		
double tamalesPrice = 1.50; //Tamales
double tamalesOrdered = 0;
		
double tacoSaladPrice = 2.50; //Taco Salad
double tacoSaladOrdered = 0;
		
double chipsSalsaPrice = 1.00; //Chips & Salsa
double chipsSalsaOrdered = 0;
		
double taquitosPrice = 1.50; //Taquitos
double taquitosOrdered = 0;
		
double chimichangaPrice = 2.00; //Chimichanga
double chimichangaOrdered = 0;
		
double potatoOlePrice = 1.50; //Potato Ole
double potatoOleOrdered = 0;
	
double totalPrice = 0;
double totalPriceWithTax;
int orderNumber;          //Tax / total price / Menu Number
int userEntry = 0;

		
		
Scanner inputDevice = new Scanner(System.in);

System.out.print("Hello welcome to Delgados Tacos. \n");
System.out.print("Would you like to make an order, press enter?");
inputDevice.nextLine();

while(userEntry < 11)
{
	System.out.println("                                                                 ");
	System.out.print("Please select a menu number. >>>> ");
	orderNumber = inputDevice.nextInt();
	
		
	if(orderNumber == 1)
	{
		System.out.print("I see you like tacos, how many would you like >>>> ");
		tacoOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		System.out.println("You ordered " + tacoOrdered + " Tacos");
		System.out.println("                                                                 ");
	}
		
	else if(orderNumber == 2)
	{
			System.out.print("I see you like burritos, how many would you like >>>> ");
			burritoOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			System.out.println("You ordered " + burritoOrdered + " Burritos");
			System.out.println("                                                                 ");
	}
		
	else if(orderNumber == 3)
	{
			System.out.print("I see you like Mt. Dew, how many cans would you like >>>> ");
			popOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			System.out.println("You ordered " + popOrdered + " can(s) of Mt. Dew");
			System.out.println("                                                                 ");
	}
	
	else  if(orderNumber == 4)
	{
			System.out.print("I see you like Churros, how many would you like >>>> ");
			churrosOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			System.out.println("You ordered " + churrosOrdered + " Churros");
			System.out.println("                                                                 ");
	}
		
	else if(orderNumber == 5)
	{
			System.out.print("I see you like Tamales, how many would you like >>>> ");
			tamalesOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			System.out.println("You ordered " + tamalesOrdered + " Tamales");
			System.out.println("                                                                 ");
	}
	
	else if(orderNumber == 6)
	{
			System.out.print("I see you like Taco Salad, how many containers would you like >>>> ");
			tacoSaladOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			System.out.println("You ordered " + tacoSaladOrdered + " containers of Taco Salads");
			System.out.println("                                                                 ");
	}
		
	else if(orderNumber == 7)
	{
			System.out.print("I see you like Chips & Salsa, how many containers would you like >>>> ");
			chipsSalsaOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			System.out.println("You ordered " + chipsSalsaOrdered + " containers of Chips & Salsa");
			System.out.println("                                                                 ");
	}
		
	else if(orderNumber == 8)
	{
			System.out.print("I see you like Taquitos, how many would you like >>>> ");
			taquitosOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			System.out.println("You ordered " + taquitosOrdered + " Taquitos");
			System.out.println("                                                                 ");
	}
		
	else if(orderNumber == 9)
	{
			System.out.print("I see you like Chimichanga, how many would you like >>>> ");
			chimichangaOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			System.out.println("You ordered " + chimichangaOrdered + " Chimichangas");
			System.out.println("                                                                 ");
	}
		
	else if(orderNumber == 10)
	{
			System.out.print("I see you like Potato Oles, how many containers of would you like >>>> ");
			potatoOleOrdered = inputDevice.nextDouble();
			inputDevice.nextLine();
			System.out.println("You ordered " + potatoOleOrdered + " containers of Potato Oles");
			System.out.println("                                                                 ");
	}
	System.out.print("Type a number greater than 11 to quit ");
	userEntry = inputDevice.nextInt();
}

System.out.println("                                                                 ");

totalPrice = (tacoPrice * tacoOrdered) + (burritoPrice * burritoOrdered) + (popPrice * popOrdered) + (churrosPrice * churrosOrdered) 
		+ (tamalesPrice * tamalesOrdered) + (tacoSaladPrice * tacoSaladOrdered) + (chipsSalsaPrice * chipsSalsaOrdered) 
		+ (taquitosPrice * taquitosOrdered) + (chimichangaPrice * chimichangaOrdered) + (potatoOlePrice * potatoOleOrdered);

System.out.println("You ordered " + tacoOrdered + " tacos, " + burritoOrdered + " burritos, " + popOrdered + " cans of Mt. Dew, " + churrosOrdered + " churros, " 
		+ tamalesOrdered + " tamales, " + tacoSaladOrdered + " containers of taco salad, \n" + chipsSalsaOrdered + " containers of chips & salsa, " + taquitosOrdered + " taquitos, " 
		+ chimichangaOrdered + " chimichangas " + potatoOleOrdered + " potato oles, for a total of $" + totalPrice + "0");

System.out.println("                                                                 ");

totalPriceWithTax = totalPrice * 1.075;
System.out.println("Your Grand total (with tax) is $" + totalPriceWithTax);
		

		



		

		
	}
public static void menu()
{
	System.out.println("                                             ");
	System.out.println("                                             ");
	System.out.println("  *|~|~|~|~|~|~|~|~|~|~|~|~|~|~|~|~|~|~|~ *  ");
	System.out.println("  |                                       |  ");
	System.out.println("  ~                                       ~  ");
	System.out.println("  |                                       |  ");
	System.out.println("  ~                                       ~  ");
	System.out.println("  |                                       |  ");
	System.out.println("  ~  1         Tacos | price | $0.99      ~  ");
	System.out.println("  |  2       Burrito | price | $1.99      |  ");
	System.out.println("  ~  3       Mt. Dew | price | $0.99      ~  ");
	System.out.println("  |  4       Churros | price | $2.00      |  ");
	System.out.println("  ~  5       Tamales | price | $1.50      ~  ");
	System.out.println("  |  6    Taco Salad | price | $2.50      |  ");
	System.out.println("  ~  7 Chips & Salsa | price | $1.00      ~  ");
	System.out.println("  |  8      Taquitos | price | $1.50      |  ");
	System.out.println("  ~  9   Chimichanga | price | $2.00      ~  ");
	System.out.println("  |  10   Potato Ole | price | $1.50      |  ");
	System.out.println("  ~                                       ~  ");
	System.out.println("  |                                       |  ");
	System.out.println("  ~                                       ~  ");
	System.out.println("  |                                       |  ");
	System.out.println("  ~                                       ~  ");
	System.out.println("  *~|~|~|~|~|~|~|~|~|~|~|~|~|~|~|~|~|~|~| *  ");
	System.out.println("                                             ");
	System.out.println("                                             ");
		

}	
public static void tacoTruck()
{
	System.out.println("                              sss                                                                                                 ");
	System.out.println("                             s   s                                                                                                ");
	System.out.println("                            s     s                                                                                               ");
	System.out.println("                           s       s                                                                                              ");
	System.out.println("                 sssssssssssssssssssssssssssss                                                                                    ");
	System.out.println("               ssssssssss           sssssssssss                                                                                   ");
	System.out.println("   ***********************************************************                                                                    ");
	System.out.println("   *         _____  ____     ___    ___                      *                                                                    ");
	System.out.println("   *           |   |____|   |      |   |                     *                                                                    ");
	System.out.println("   *           |   |    |   |___   |___|                     *                                                                    ");
	System.out.println("   *                                                         *                                                                    ");
	System.out.println("   *         ****************************                    *                                                                    ");
	System.out.println("   *         *          ooo             *                    *                                                                    ");
	System.out.println("   *         *         o   o            *                    *                                                                    ");
	System.out.println("   *         *          ooo V           *                    ****************                                                     ");
	System.out.println("   *         *           | /            *                    *     *         *                                                    ");
	System.out.println("   *         *          /|              *                    *     *          *                                                   ");
	System.out.println("   *         ****************************                    *     *           *                                                  ");
	System.out.println("   *                                                         *     *************                                                  ");
	System.out.println("   *                                                         *                 *                                                  ");
	System.out.println("   *                                                         *                 *                                                  ");
	System.out.println("   *                                                         *                 *                                                  ");
	System.out.println("   *                                                         *******************                                                  ");
	System.out.println("   *********ooooo**************************ooooo*************                                                                     ");
	System.out.println("          oo     oo                      oo     oo                                                                                ");
	System.out.println("         oo       oo                    oo       oo                                                                               ");
	System.out.println("          oo     oo                      oo     oo                                                                                ");
	System.out.println("            ooooo                          ooooo                                                                                  ");
	}
}
