package Chapter5.Array;

/**
 * 数组遍历:就是依次输出数组中的每一个元素
 * 注意:数组提供了一个属性length，用于获取数组的长度
 *      格式:数组名.length
 */
public class Array_07_ArrayOperational_01_Traverse {
    public static void main(String[] args) {
        //定义数组
        int [] arr =  {1,2,3,4,5};

        //获取每一个数组
        //如何获取呢?我们知道数组名结合编号(索引)就可以找到数组
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("-----------------------------");

        //虽然这种做法可以，但不是我想要的
        //我们发现代码重复度很高
        //输出语句，数组名都是相同的，仅仅索引是变化的
        //我们就可以使用循环搞定索引值

        for (int x = 0;x < 5; x ++ ){
            //x = 0,1,2,3,4
            System.out.println(arr[x]);
        }
        System.out.println("----------------------------");



        //从0开始我们是明确的，但是为什么到5呢?我们是数了一下数组的个数
        //继续看下个数组如何遍历
        int [] arr2 = {11,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55,22,33,44,55};
        //我们在很多时候，数组的元素不能靠数
        //这个时候，数组就给我们提供了一个属性:length专门用于获取数组的长度
        //格式:数组名.length  返回数组的长度
        System.out.println(arr2.length);
        for (int x = 0;x < arr2.length;x ++){
            System.out.println(arr2[x]);
        }


        System.out.println("-------------------------");
        /**
         * 我们如果想要对多个数组进行遍历，每个数组的遍历我们都把代码写一遍，麻烦
         * 所以可以用方法改进
         * 调用
         */
        printArray(arr);
    }
/**
 * 遍历数组的方法
 *
 * 两个明确:
 *     返回值类型:void
 *     参数列表:int [] arr
 */
public static void printArray(int[] arr) {
    for (int x = 0;x < arr.length;x ++){
        System.out.println(x);
    }
}


}
