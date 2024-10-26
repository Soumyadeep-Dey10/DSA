package Cheatsheet;

//You are playing a game of Toss and Score in the Hillwood City Mall with
//your friends. The
// game consists of the following rules:
//  Toss an unbiased coin multiple times.
//  For each heads you get ? points and for each tails you lose 1 point.
//  The game ends as soon as you get 3 heads in a row, or you toss the coin
//throughtout the
// length of string S.
// You have been given a string S consisting of letters H (for heads) and T (for
//tail
// sequence of result. Your task is to find and results you get on the toss of
//coin N
// integer value representing the final score you get once the game ends.
public class TossACoinProblem {
    public static int find(String str){
        int i = 0, countH = 0, score = 0;
        while (i < str.length()){
            if (str.charAt(i) == 'H'){
                score += 2;
                countH += 1;
            }else {
                countH = 0;
                score -= 1;
            }
            if (countH == 3) {
                System.out.println(score);

            }
            i++;
        }
        return score;
    }
    public static void main(String[] args) {
        find("HTHHTTHTHHHT");
    }
}
