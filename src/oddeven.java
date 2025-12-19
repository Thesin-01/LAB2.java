public class oddeven {
    public static void main(String[] args) {
        int even = 0, odd = 0;
        if (args.length != 10) {
            System.out.println("Enter exactly 10 numbers from command line.");
            return;
        }
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of Even numbers = " + even);
        System.out.println("Number of Odd numbers  = " + odd);
    }
}


