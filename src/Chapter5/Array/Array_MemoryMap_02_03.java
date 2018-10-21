package Chapter5.Array;

public class Array_MemoryMap_02_03 {
    /**
     * 定义两个数组，分别输出两个数组各自的数组名及元素值
     * 每个数组元素重新赋值，再次分别输出两个数组各自的数组名及元素值
     *
     */
    public static void main(String[] args) {

        //定义第一个数组
        int [] arr = new int[2];

        //定义第二个数组
        int [] arr2 = new int[3];



        //输出数组名和元素值
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("----------------------------");



        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);


        //给元素重新赋值
        arr[1] = 20;


        arr2[1] = 30;
        arr2[0] = 40;


        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("----------------------------");



        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
