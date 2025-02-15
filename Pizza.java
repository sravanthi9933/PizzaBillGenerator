import java.util.*;

import javax.xml.validation.SchemaFactory;
public class Pizza {
    public int price;
  public boolean veg;
  public int extraCheesePrice=100;
      public int extraToppingsPrice=150;
       public int backPackPrice=20;
public int basePizzaPrice;
        private boolean isExtraCheeseAdded=false;
        private boolean isExtraToppingsAdded=false;
        private boolean isOptedforTakeAway=false;
        Scanner sc=new Scanner(System.in);
  
    public Pizza(boolean veg)
    {
        this.veg=veg;
        if(this.veg)
        {
            this.price=300;
        }
        else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }

    public void ExtraCheese()
    {
        System.out.println("Extra cheese(y/n)?=>");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'y':
            isExtraCheeseAdded=true;
            this.price+=extraCheesePrice;
            break;
            case 'n':
             isExtraCheeseAdded=false;
             break;
        }
        
    }
    public void ExtraToppings()
    {
        System.out.println("Want Extra Toppings (y/n)?=>");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'y':
            isExtraToppingsAdded=true;
            this.price+=extraToppingsPrice;
            break;
            case 'n':
             isExtraToppingsAdded=false;
             break;
        }
    }
        public void takeAway()
        {
        System.out.println("Want takeAway (y/n)?=>");
        char ch=Character.toLowerCase(sc.next().charAt(0));
        switch(ch){
            case 'y':
           isOptedforTakeAway=true;
            this.price+=backPackPrice;
            break;
            case 'n':
             isOptedforTakeAway=false;
             break;
        }
    }
    public void getBill()
    {
        String bill=" ";
        System.out.println("Pizza"+basePizzaPrice);
        if(isExtraCheeseAdded)
        {
            bill+="Extra Cheese:"+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded)
        {
            bill+="ExtraToppings:"+extraToppingsPrice+"\n";
        }
        if(isOptedforTakeAway)
        {
            bill+="TakeAway:"+backPackPrice+"\n";
        }
        bill+="\n Total amount"+this.price+"\n";
        System.out.println(bill);
        System.out.println("\n\nThankYou visit Again");
        System.out.println("===========================================");
    }
    public static void main(String args[])
    {
        
        
    }
}


    

