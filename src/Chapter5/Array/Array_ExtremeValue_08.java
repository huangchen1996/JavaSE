package Chapter5.Array;

/**
 * 数组获取最值（获取数组中的最大值最小值）
 * 分析:
 *    A:定义一个数组，并对数组的元素进行静态初始化
 *    B:从数组中任意的找一个元素作为参照物(一般取第一个)，默认它就是最大值
 *    C:然后遍历其他的元素，依次获取和参照物进行比较，如果大就留下如果小就离开
 *    D:最后参照物里面保存的就是最大值
 */
public class Array_ExtremeValue_08 {
    public static void main(String[] args) {
        //定义一个数组
        int [] arr = {23,12,32,12,41};
        //获取数组中最大的值
        //从数组中任意的找一个元素作为参照物
        int max = arr[0];
        //然后遍历元素
        for (int x = 1;x < arr.length;x ++){
            //依次获取和参照物进行比较，如果大就留下，如果小就离开
            if (arr[x] > max){
                max = arr[x];
            }

        }
        //最后参照物里面保存的就是最大值
        System.out.println("max:"+max);







        //获取数组中最小的值
        //从数组中找到一个数作为参照物
        int min = arr[0];
        for (int x = 1;x < arr.length;x ++){
            if (min > arr[x]){
                min = arr[x];
            }
        }
        System.out.println("min:"+min);
    }
}
