

/*

 */

 // P1NKD0LLAR

public class Counting_money {
/*
    This program will generate a number betwen 1 and 99999
    This number is the price paid for a product, and this program 
    must indicate how many 50€, 20€, 10€, 5€ bill and 2 cents and 1 cent coins
    are needed to pay for the product.
*/
    public static void main(String[] args) {
       
      Tools Random_price = new Tools();  // use the tool that generate
                                        //a random number (in Tools.java)
        int money_first = Random_price.get_random( 1 , 99999 );
        int money = money_first / 100; // part of money without cents
        int cents = money_first % 100; // two last numbers of money_first
        int coin = 50;
        int  bill_coin = 200;
        int number_of_bills_coin = 0 ;
        System.out.println(" Money at first : " + ( (float)money_first /(float)100 ) );
        System.out.println( " Money to fragment " + money );
        
               
        while( money >0 ){
            number_of_bills_coin = money / bill_coin;   
            money =  money - ( number_of_bills_coin * bill_coin );
            System.out.println( " Bills of " + bill_coin + " : " + number_of_bills_coin);
             
            switch( bill_coin ) {
                
                case 200:
                    bill_coin = 100;   break;
                case 100:
                    bill_coin = 50;    break;
                case 50:
                    bill_coin = 20;    break;
                case 20:
                    bill_coin = 10;    break;
                case 10:
                    bill_coin = 5;     break;
                case 5:
                    bill_coin = 2;     break;
                case 2:
                    bill_coin = 1;     break; 
            }
                System.out.println(" Leftover money : " + money);      
            
            
        }
                System.out.println('\n');
        //Decimal part of money_first
        while( cents >0 ){
            number_of_bills_coin = cents / coin;   
            cents =  cents - ( number_of_bills_coin * coin );
            System.out.println( " Coin of : " + coin + " : " + number_of_bills_coin);
             
            switch( coin ) {
                case 50:
                    coin = 20;    break;
                case 20:
                    coin = 10;    break;
                case 10:
                    coin = 5;     break;
                case 5:
                    coin = 2;     break;
                case 2:
                    coin = 1;     break; 
            }
            System.out.println(" Leftover cents " + money);      
            
            
        }
    }
    
}

