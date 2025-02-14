public class Main {
    
    public static int binaryToDecimal(int number){
        int sum = 0, i = 0;
        while(number > 0){
            int digit = number % 10;
            if(digit == 1){
                sum += Math.pow(2, i);
            }
            number /= 10;
            i++;
        }
        return sum;
    }
    
     public static int decimalToBinary(int number) {
        StringBuilder sb = new StringBuilder();

        while (number > 0) {
            int rem = number % 2;
            sb.append(rem);  // Append remainder (binary digit)
            number /= 2;
        }

        return Integer.parseInt(sb.reverse().toString());  // Reverse and convert to int
    }


    public static void main(String[] args) {
       System.out.println(decimalToBinary(13));
    }
}

