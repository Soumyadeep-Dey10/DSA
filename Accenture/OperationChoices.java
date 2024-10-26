package Cheatsheet;

public class OperationChoices {
    public static void run(int a, int b, int c){
      switch (c){
          case 1 :
              System.out.println(a + b);
              break;

          case 2 :
              System.out.println(a - b);
              break;

          case 3 :
              System.out.println(a * b);
              break;


          case 4 :
              System.out.println(a / b);
              break;

      }

    }
    public static void main(String[] args) {
        run(20, 15, 2);
    }
}
