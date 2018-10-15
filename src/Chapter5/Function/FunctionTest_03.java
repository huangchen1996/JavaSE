package Chapter5.Function;
/**
 * 录入三个数据，录入其中的最大值
 */

import java.util.Scanner;
public class FunctionTest_03 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //创建键盘录入对象
            System.out.println("请输入你的第一个数据");
            int a = sc.nextInt();
            System.out.println("请输入你的第二个数据");
            int b = sc.nextInt();

         boolean result = Compare(a,b);
            System.out.println(result);
    }

    /**
     * 需求:返回三个数中的最大值
     * 两个明确
     *    返回值类型 int
     *    参数列表  int a,int b,int c
     *
     */
    public static boolean Compare(int a,int b){
        //if嵌套解决
        if (a == b){
            return true;
        }else {
            return false;
        }
    }
}
