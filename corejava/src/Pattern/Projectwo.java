package Pattern;

import java.util.*;

public class Projectwo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Starting Number : ");
        int m = sc.nextInt();
        System.out.print("Enter the Ending Number : ");
        int n = sc.nextInt();
        System.out.print("Enter the Compare Number : ");
        int a = sc.nextInt();

        int x, y, z;

        if (m > n) {
            System.out.println("Give proper starting and ending number");
        } else {
            for (int i = m; i <= n; i++) {
                y = 0;
                z = i;
                while (z > 0) {
                    x = z % 10;
                    z = z / 10;
                    y = y + x;
                }
                if (y == a) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
