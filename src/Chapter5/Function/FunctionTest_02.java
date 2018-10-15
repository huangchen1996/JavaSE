package Chapter5.Function;
/**
 * 键盘录入两个数据，返回其中较大的值
 */
import java.util.Scanner;
public class FunctionTest_02 {
    public static void main(String[] args) {
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据");
        int b = sc.nextInt();

        int result = getMax(a,b);
        System.out.println("较大的值是:"+result);
    }

    /**
     * 需求:两个值中的较大值
     * 两个明确:
     * 返回值类型:int
     * 参数列表:int a,int b
     */
    public static int getMax(int a,int b) {
        //if语句实现
        if (a > b){
            return a;
        }else {
            return b;
        }

    }

}
