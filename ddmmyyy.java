impoort java.util.Scanner;
class Main{
  Public static void main(String args[]){
Scanner   sc =  new Scanner (System.in);
        int dd,mm,yyyy;
        int days=0;
         dd = sc.nextInt();
         mm = sc.nextInt();
         yyyy = sc.nextInt();
         switch(mm){
             case 1:days+=31;
             case 2: if( yyyy%4==0 && yyyy%100!=0 || yyyy%400==0){
                 days+=29;
             }else
                 days+=28;
             case 3: days+=30;
             case 4: days+=31;
             case 5: days+=30;
             case 6: days+=31;
             case 7: days+=30;
             case 8: days+=31;
             case 9: days+=30;
             case 10: days+=31;
             case 11: days+=30;
             case 12: days+=31;
         }
         System.out.print(days-dd);
         
    }
}
