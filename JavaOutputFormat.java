import java.util.Scanner;

public class Solution {
private static void printRowOutlined(String left, int right) {
    System.out.printf("%-15s%03d%n", left, right);
}

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                printRowOutlined(s1, x);
                //Complete this line
            }
            System.out.println("================================");

    }
}



