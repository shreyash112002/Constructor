
import java.util.Scanner;
public class UseAccount3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account ID, balance, name");
        int id = sc.nextInt();
        double bal = sc.nextDouble();
        String name = sc.next();
        Account3 acc1 = new Account3(id,name, bal);
        acc1.showData();

    }
}
