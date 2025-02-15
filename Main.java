import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        
        System.out.println("Welcome to Pizzamania");
        System.out.println("1.Veg pizza 2.Non veg pizza 3 Deluxe pizza 4 Deluxe nonveg pizza");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            Pizza vegpizza=new Pizza(true);
            vegpizza.ExtraToppings();
            vegpizza.ExtraCheese();
            vegpizza.takeAway();
            vegpizza.getBill();
            break;
            case 2:
            Pizza nonvegpizza=new Pizza(true);
            nonvegpizza.ExtraToppings();
            nonvegpizza.ExtraCheese();
            nonvegpizza.takeAway();
            nonvegpizza.getBill();
            break;
            case 3:
            DeluxPizza dvegpizza=new DeluxPizza(true);
            dvegpizza.basePizzaPrice=550;
            dvegpizza.ExtraToppings();
            dvegpizza.ExtraCheese();
            dvegpizza.takeAway();
            dvegpizza.getBill();
            break;
            case 4:
            DeluxPizza dnonvegpizza=new DeluxPizza(true);
            dnonvegpizza.basePizzaPrice=650;
            dnonvegpizza.ExtraToppings();
            dnonvegpizza.ExtraCheese();
            dnonvegpizza.takeAway();
            dnonvegpizza.getBill();
            break;
            default:
            System.out.println("Sorry enter again");


        }

    }
}

