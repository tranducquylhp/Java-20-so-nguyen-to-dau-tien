public class Prime {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count<20){
            boolean check = false;
            for (int i = 2; i <= Math.round(Math.sqrt(number)); i++) {
                check = number % i == 0;
                if (check) {
                    break;
                }
            }
            if (!check) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
