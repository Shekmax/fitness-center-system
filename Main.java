import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int i,j;
        double cal[][]=new double[3][5];
        double sum=0;

        for (i=0;i<3;i++){
            System.out.println("Area"+(i+1)+" :");
            for (j=0;j<5;j++){
                System.out.print("enter rainfall month no "+(j+1)+" :");
                cal[i][j]= sc.nextDouble();
            }
            System.out.println();
        }
        for (i=0;i<3;i++) {
            System.out.println("Area" + (i + 1) + " :");
            sum=0;
            for (j = 0; j < 5; j++) {
                sum+=cal[i][j];

            }
            System.out.println("sum is : "+sum);
            System.out.println();
        }


    }
}