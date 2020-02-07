package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	public static void main(String[] args) {
		_00_Horoscope h= new _00_Horoscope();
		Zodiac s=Zodiac.PISCES;
		h.zodiac(s);
	}
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	      void zodiac(Zodiac z) {
	    	  switch(z) {
	    	  case ARIES:
	    		  System.out.println("You will get married when you are exactly 25 years, 76 days, 54 minutes, and 12 seconds years old.");
	    		  break;
	    	  case TAURUS:
	    		  System.out.println("You will have a life with lots of ups and downs, so be prepared. ");
	    		  break;
	    	  case GEMINI:
	    		  System.out.println("You will get a new pair of jeans as a gift next Saturday.");
	    		  break;
	    	  case CANCER:
	    		  System.out.println("You will get a 5 new shirts as a gift this coming Friday.");
	    		  break;
	    	  case LEO:
	    		  System.out.println("There is a 75% chance that you might win a lottery in the next few days. ");
	    		  break;
	    	  case VIRGO:
	    		  System.out.println("You will face one of your biggest fears exactly 678900 seconds from now");
	    		  break;
	    	  case LIBRA:
	    		  System.out.println("You will get a new Ipad as a gift on your birthday.");
	    		  break;
	    	  case SCORPIO:
	    		  System.out.println("Very soon you will come home and find a bag with real gold on your bed");
	    		  break;
	    	  case SAGITTARIUS:
	    		  System.out.println("There is a 75% chance that you will earn a trip to 10 different countries of your choice for free.");
	    		  break;
	    	  case CAPRICORN:
	    		  System.out.println("You will face a sad moment in your life, but if you get over it, you will strike crazy rich. ");
	    		  break;
	    	  case AQUARIUS:
	    		  System.out.println("You will soon make a astonishing discovery about one your friends.");
	    		  break;
	    	  case PISCES:
	    		  System.out.println("There is a 75% chance of you having a perfect life. IF YOU ARE BORN FEB 27TH, YOU HAVE A 100% CHANCE OF HAVING A PREFECT LIFE. ");
	    	  }
	    	  
	    	  
	      }
	// 3. Make a main method to test your method
	
}
