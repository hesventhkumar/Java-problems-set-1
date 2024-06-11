import java.util.Scanner;
class Main{
  public static void main(String args[]){
    if(year%4==0){
     if (year%100==0){
            if (year%400==0)
                System.out.print(" is a leap year");
                                                                           // LEAP YEAR OR NOT A LEAP YEAR USIN NESTED IF
            else
                System.out.print(" is not a leap year");


        }
        else
            System.out.print(" is a leap year");
    }
        else
                System.out.print(" is not a leap year");
}
}
