// Program to guess the two numbers of user imagined by using the given clues by the user

import java.util.*;

class GuessNum 
{
    public static void main(String[] args)
    {
        boolean ch=true;
        int i=0;
        int j=0;
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to play a game?(true/false)");
        boolean a=sc.nextBoolean();
        if(a==true)
        {
           while(ch)
           {
            System.out.println("Then first imagine two  different numbers ");

            System.out.println("\nIf you have imagined then say true or false");
            boolean b=sc.nextBoolean();
            if(b==true)
            {
                System.out.println("Then add that two numbers and enter the result of that additon");
                int c=sc.nextInt();
                System.out.println("Then multiply  that two numbers and enter the result of that multiplication");
                int d=sc.nextInt();
                
                
       outer :  for(i=1;i<10000;i++)
                {
                    
                    for(j=i+1;j<10000;j++)
                    {
                       if((i+j==c) & (i*j==d))
                       {
                         flag=true;
                        System.out.println("The two numbers according to your given clue are\n "+ i +"\n" +j); 
                         System.out.println("**********************************");
                        break outer;
                       }

                    }

                }  
                       if(flag==false)
                            System.out.println("There is no matching numbers to your given clues "+"\n"+"Please recheck the calculation and try again");
                       
                    
                  
                
            }
                
            System.out.println("Do you want to repeat again?(True/False)");
            ch=sc.nextBoolean();
        }
        }
         System.out.println("End of the program");
    }
}