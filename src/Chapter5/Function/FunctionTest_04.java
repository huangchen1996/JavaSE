package Chapter5.Function;
import java.util.Scanner;
public class FunctionTest_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字");
        int a  = sc.nextInt();
        System.out.println("输入第二个数字");
        int b =sc.nextInt();
        System.out.println("输入第三个数字");
        int c = sc.nextInt();
        int result = getMax(a,b,c);
        System.out.println(result);
    }
   public static int getMax(int a,int b,int c) {
              if (a >  b){
                  if (a > c){
                      return a;
                  }else {
                      return c;
                  }
              }else {
                  if (b > c){
                      return b;
                  }else {
                      return c;
                  }

              }
   }
}
