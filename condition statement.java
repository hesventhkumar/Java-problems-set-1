class Main{
public static void main(String args []){
int num= sc.nextInt();
        if (num%3==0 && num%5==0) {
            System.out.print("foobar");
        }
        else if (num%3==0 ) {
            System.out.print("foo");
        }
        else if (num%5==0) {
            System.out.print("bar");
        }
}
}
