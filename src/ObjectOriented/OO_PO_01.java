package ObjectOriented;

/**
 * 面向对象与面向过程的区别
 *
 * 例子:
 *     将大象装进冰箱
 *     面向过程:
 *     A:打开冰箱口
 *     B:装进大象
 *     C:关闭冰箱口
 *
 */
public class OO_PO_01 {
    public static void main(String[] args) {
        open();
        in();
        close();
    }
    public static void open(){
        System.out.println("打开冰箱门");
    }
    public static void in(){
        System.out.println("装进大象");
    }
    public static void close(){
        System.out.println("关闭冰箱门");
    }

}
/**
 * 面向对象
 * 我们怎么才能更符合面向对象的思想呢?
 * A;有哪些类呢?
 *    大象，冰箱，Demo
 *
 * B:每个类有哪些东西?
 * 大象:进去
 * 冰箱:开门，关门
 * Demo:
 * main方法
 *
 * C:类与类直接的关系是什么?
 * Demo中使用大象和冰箱的功能
 *
 */
class Elephant{
      public static void in1(){
          System.out.println("装进大象");
      }
}
class Bridge{
    public static void open1(){
        System.out.println("打开冰箱");
    }
    public static void close1(){
        System.out.println("关闭冰箱");
    }
}
class Demo{
    public static void main(String[] args) {
        Elephant.in1();
        Bridge.close1();
    }
}