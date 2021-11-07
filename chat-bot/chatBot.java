import java.util.Scanner;


public class chatBot {
    final static Scanner scanner = new Scanner(System.in);

    static void greetings(){
        System.out.println("Hello! My name is BOT");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name.");
        String username = scanner.nextLine();
        System.out.println("What a great name you have, " + username + "!");
    }

    static void guessAge(){
        System.out.println("Let me guess your age.");
        System.out.println("Input remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("You are " + age + " help me");
    }

    static void count(){
        System.out.println("I can count");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test you.\n");
        System.out.println("How many cups of coffee did I drink?");
        System.out.println("1. 0");
        System.out.println("2. 1");
        System.out.println("3. 10");
        System.out.println("4. 2");
        while(true) {
            int a = scanner.nextInt();
            if (a == 0) {
                System.out.println("I just wanna some coffee c:");
                break;
            }
            else
                System.out.println("Wrong");
                continue;                
        }
    }

    public static void main(String[] args){
        greetings();
        guessAge();
        count();
        test();
    }
}