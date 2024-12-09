public class PrintLCS {
    static int[][] t;
    public static String getLcs(String a, String b, int m,int n){

        t = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0){
            if(a.charAt(i-1) == b.charAt(j-1)){
                sb.append(a.charAt(i-1));
                i--;
                j--;
            }
            else {
                if(t[i][j-1] > t[i-1][j]){
                    j--;
                }
                else if(t[i-1][j] > t[i][j-1]){
                    i--;
                }
            }
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "acbcf", b = "abcdaf";
        System.out.println(getLcs(a, b, a.length(), b.length()));
    }
}
