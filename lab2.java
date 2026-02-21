import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int price ;
        int quant;
        int totcost;
        System.out.println("Enter the name,price,quant,total cost:");
        name = sc.nextLine();
        price = sc.nextInt();
        quant = sc.nextInt();
        totcost = sc.nextInt();
        System.out.println("your name:"+name);
        System.out.println("price:"+price);
        System.out.println("quentity:"+quant);
        System.out.println("total cost:"+ totcost);
        

        
    }
    
}
