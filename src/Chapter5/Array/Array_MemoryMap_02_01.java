package Chapter5.Array;

/**
 * 定义一个数组，输出该数组的名称和数组元素值
 * 给数组元素赋值，再次输出该数组的名称和数组元素值
 */
public class Array_MemoryMap_02_01 {
    public static void main(String[] args) {
    //定义一个数组
    int [] arr = new int[3];
    //输出数组名称
        System.out.println(arr);
        //输出数组元素值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("---------------------");

        //给数组元素赋值
        arr[0] = 100;
        arr[2] = 500;

        //输出数组元素名称


        System.out.println(arr);

        //输出数组元素值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
