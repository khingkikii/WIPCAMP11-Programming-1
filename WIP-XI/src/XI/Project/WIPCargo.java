/*
 * WIP XI Computer Programing 
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = 0;
        int limit = 20;
        int menu = 0;
        int amount = 0;
        while(true){
            System.out.println("1.Add\n2.Remove\n3.Check");
            System.out.println("menu : ");
            menu = sc.nextInt();
            if (menu == 1) {
                if (item >= limit) {
                    System.out.println("ไอเท็มเต็มแล้ว");
                } else {
                    amount = sc.nextInt();
                }

                if (item + amount > limit) {
                    System.out.println("ไอเท็มเกินลิมิต");
                }else{
                    item += amount;
                    System.out.println("Item: " + item);
                    System.out.println("Limit: " + limit);
                }
            } else if (menu == 2) {
                if (item == 0) {
                    System.out.println("ไม่มีไอเท็มในโกดัง");
                } else{
                    amount = sc.nextInt();
                    if(amount <= item){
                        item -= amount;
                        System.out.println("Item: " + item);
                        System.out.println("Limit: " + limit);
                    }else{
                        System.out.println("ไอเท็มไม่เพียงพอ");
                    }
                }

            } else if (menu == 3) {
                System.out.println("Item: " + item);
                System.out.println("Limit: " + limit);
            }
        }
    }
}