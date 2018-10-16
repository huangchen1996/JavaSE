package Chapter5.Function.OverLoad;

/**
 * 比较两个数据是否相等，参数类型分别为
 *     两个byte类型，两个short类型，两个int类型，两个long类型
 * 并在main方法中进行测试
 */
public class FunctionOverLoadTest {
    public static void main(String[] args) {
    //测试
        byte a = 3;
        byte b = 4;
        System.out.println("byte is"+compare(a,b));
        //测试
        int a1 = 3;
        int b1 = 4;
        System.out.println("int is"+compare(a1,b1));
        //测试
        long l1 = 3;
        byte l2 = 4;
        System.out.println("byte is"+compare(l1,l2));
    }
    //byte类型
    public static boolean compare(byte a,byte b){
        return a == b;
    }
    //int类型
    public static boolean compare(int a,int b){
        return a == b;
    }
    //long类型
    public static boolean compare(long a,long b){
        return a == b;
    }
}
