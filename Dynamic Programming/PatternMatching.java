public class PatternMatching {
    private static int[][] t;
    public static boolean isMatching(String text1, String text2){
        int m = text1.length(), n = text2.length();
        t = new int[m+1][n+1];
        return lcs(text1, text2, m, n) == Math.min(m, n);
    }
    public static int lcs(String text1, String text2, int m, int n){

        for(int i = 0; i < m+1; i++){
            for(int j = 0; j < n+1; j++){
                if(i ==0 || j == 0) t[i][j] = 0;
            }
        }

        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                }else{
                    t[i][j] = Math.max((t[i-1][j]),
                            (t[i][j-1]));
                }
            }
        }
        return t[m][n];
    }

    public static void main(String[] args) {
        String s1 = "AXY", s2 = "ADXCPY";
        System.out.println(isMatching(s1, s2));
    }
}
