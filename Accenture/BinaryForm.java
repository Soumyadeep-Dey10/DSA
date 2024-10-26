//package Cheatsheet;
//
//public class BinaryForm {
//    public static int intToBinary(int num){
//      //  String ans = Integer.toBinaryString(num);
//        StringBuilder ans = new StringBuilder();
//        while (num > 0){
//            ans.append((num % 2 != 0) ? "1" : "0");
//            num /= 2;
//        }
//        String ab =  ans.reverse().toString();
//        return Integer.parseInt(ab);
//    }
//    public static int binaryToInt(int num){
//        int sum = 0;
////        String res = Integer.toString(num);
////        int ans = Integer.parseInt(res, 2);
//        String str = Integer.toString(num);
//        for (int i = str.length()-1; i >= 0; i--){
//            int n = Integer.parseC
//            sum += str.charAt(i)*Math.pow(i,2);
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(binaryToInt(1010));
//    }
//}
