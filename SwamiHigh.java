//Casai High
//00449414 
//Program Assignment 3

public class SwamiHigh
{
   private String name;
   public String sign;
   private int month, day;
   
   //construtor
   public SwamiHigh(String n, int m, int d)
   {
      name = n;
      month = m;
      day = d;
   }
   
   //no-arg constructor
   public SwamiHigh()
   {
      name = null;
      month = 0;
      day = 0;
   }
   
   //accessor method
   public String getName()
   {
      return name;
   }
   public int getMonth()
   {
      return month;
   }
   public int getDay() 
   {
     return day;
   }
   public String getSign()
   {
        if ((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19))
            sign = "Capricorn";
        else if ((month ==  1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17))
            sign = "Aquarius";
        else if ((month ==  2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19))
            sign = "Pisces";
        else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19))
            sign = "Aries";
        else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20))
            sign = "Taurus";
        else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20))
            sign = "Gemini";
        else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
            sign = "Cancer";
        else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
            sign = "Leo";
        else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22))
            sign = "Virgo";
        else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
            sign = "Libra";
        else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
            sign = "Scorpio";
        else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
            sign = "Sagittarius";
        else
            sign = "Wrong date";
        return sign;   
    }        
        
    //calculate horoscope
    public String calcHoroscope()
    {
    String horoscope = "";
    
    
      if (sign == "Capricorn")
      horoscope = "Ambition is a hallmark of your sign";
      
      else if (sign == "Aquarius")
      horoscope = "You are so independent people struggle to get to know you";
      
      else if (sign == "Pisces")
      horoscope = "Your intuition leads you through life";
      else if (sign == "Aries")
      horoscope = "You are the first sign of the zodiac which makes you very assertive";
     
      else if (sign == "Taurus")
      horoscope = "You are gravitated to beautiful things";
      
      else if (sign == "Gemini")
      horoscope = "You are the most mysterious sign";
      
      else if (sign == "Cancer")
      horoscope = "Life will begin to turn around for you";
     
      else if (sign == "Leo")
      horoscope = "Loyalty is your strongest characteristic";
      
      else if (sign == "Virgo")
      horoscope = "You are very analytical";
      
      else if (sign == "Libra")
      horoscope = "You are an honorable person and always fights for what is right";
      
      else if (sign == "Scorpio")
      horoscope = "You are a person of few words";
      
      else if (sign == "Sagittarius") 
      horoscope = "You enjoy life in the fast lane";
      
      else 
      horoscope = "Invalid input";
       
  
    return horoscope;
  }
      
   //mutator methods
  public void setMonth(int mon)
  {
    month = mon;
  }
  public void setDay(int da)
  {
    day = da;
  }
  public void setName(String na)
  {
    name = na;
  }
  public void changeBirthday()
  {
    if(month <= 6)
    {
       month += 3;
    }
    else
    {
       month -= 6;
    }
    if (day <= 5)
    {
       day += 3;
    }
    else
    {
       day -= 5;
    }
   
  }  
}
    