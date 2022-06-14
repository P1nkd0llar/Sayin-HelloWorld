

/*
Some tools for java programs.
 */

 // @author narss

public class Tools {
    /*
        TOOL 1. RANDOM NUMBER GENERATOR
        Function that will generate
        a random number within a given range.
        It will return the generated value.
    */
    
    public int get_random( int min , int max ){
        int random = (int)Math.floor( Math.random()*(max-min+1)+min );
        return random;
    }

    public void write( String that ){
        System.out.println( that );
    }
    
    
    
    
    
    public void escribe( int that ){
        System.out.println( " The score is : "  +  that );
    }    
    public void escribe( int that , String message ){
        System.out.println( message  +  that );
    } 

    /* 
         TOOL 2. FACTORIAL
         Gets the factorial of a given number. 
         Receives an integer
         Returns (return) a long with the factorial 
         value calculated. 
    */
    public long factorial( int the ){
        long result = 1;
        
        for( int k = 1 ; k <= the ; k++ ){
            result = result * k; // result *= k
        }
        
        return result;
    }
    
   
    public boolean pair( int data ){
        boolean my_bias = false; // my prejudice
        
         // I will investigate the data/fact because maybe I am wrong
        if( data%2 == 0 ) {
            my_bias = true;
        }
        
        return my_bias;
    }
    
    /* *****************************************************************
       * odd: This method is based on pair.
       * It does it because an odd number is not pair.
       ***************************************************************** */
    public boolean not_pair( int data ){
        return !pair( data );
    }  
 
    
    public boolean prime( int num ){ // prime number?
        boolean prime = true; 
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                i = num;
            }
        }
        return prime;
    }


    public int  how_is( int data ){
        int discovered = 0;
        
        // 1 if it is positive, a 2 if it is 0 or a 3 if it is negative
        switch( data ){
            case 0 :    discovered = 2;
                        break;
            default:    discovered = 3;
                        if( data > 0 ){
                            discovered = 1;
                        }
        }
        return discovered;
    }
    
}
