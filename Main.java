import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.print("Please enter the value that you've wanted : ");
        int a = value.nextInt();
        System.out.println();
        System.out.print("Please enter the second value that you've wanted : ");
        int b = value.nextInt();
        System.out.println();
        value.close();
        //  creating num =  sum of right triangle's sides lengths square.
        double num = (a * a) + (b * b);
        // creating a temporary value
         double temp;
         double sqrt = num / 2;
        // do-while loop is a loop that the do part works even if the condition is wrong.
         do{
             temp = sqrt;
             sqrt = (temp + (num / temp)) / 2;
         }while ((temp-sqrt) != 0);
         /* in this loop we used an equation which is sqrtn+1=(sqrtn+(num/sqrtn))/2.0
         sqrtn = tempt = num/2 this equation is used for finding square roots in math.*/

        System.out.println(sqrt);







    }
}