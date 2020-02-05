package com.epam.newyeargift;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	    	int a=3;
    	    	FlavouredCandies f=new FlavouredCandies();
    	    	f.weight();
    	    	f.candy(a);
    	    	Sweets s;
    	    	Done d=new Done();
    	    	s=d;
    	    	s.print();
    	    }
    	}
    	class Chocolates {
    		void weight() {
    			System.out.println("Chocolates");
    		}

    	}
    	interface Sweets  {
    		void print();

    	}
    	class Candies extends Chocolates {
    		void weight() {
    			super.weight();
    			System.out.println("Candies");
    		}
    		
    	}
    	class FlavouredCandies extends Candies {
    		int candy(int x) {
    			switch(x)
    			{
    			case 1: int l=20;
    				System.out.println("Lemon"+"weight= "+l+"gms");
    				break;
    			case 2: int b=30;
    			    System.out.println("Banana"+"weight= "+b+"gms");
    			    break;
    			case 3: int d=25;
    			    System.out.println("FLavour = Orange "+"weight= "+d+"gms");
    			    break;
    			case 4: int h=30;
    			    System.out.println("Apple"+"weight= "+h+"gms");
    			    break;
    			default:
    				System.out.println("Option no available");
    			}
    			return 0;
    		}
    		
    	}
    	class Done implements Sweets {
    		public void print() {
    			System.out.println("Sweets");
    		}
    	} 