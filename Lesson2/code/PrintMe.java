public class PrintMe {
    public static void main(String[] args) {
        int i;
        for (i = 0; i<10; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");
        }
        System.out.println("---------------------------");
        while(true) {
            int j = 0;
            if (j % 2 == 0)
                System.out.println(j + " is even");
            else
                System.out.println(j + " is odd");
            j++;
            if (j > 9)
                break;
        }
    }
}