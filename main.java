import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            int count = 0;
            int value = 1;
            while(value<n){
                count++;
                value*=2;
            }
            if(value == n){
                System.out.println(count+"==>");
            }
            else{
                System.out.print("not power");
            }
        }
        else{
            System.out.print("not power");
        }
    }
}