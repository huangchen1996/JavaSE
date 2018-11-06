package ObjectOriented.Object_Function.hashCode;

/**
 * Object类的方法
 *         public int hashCode():返回该对象的哈希码值
 *          注意:哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关，但是不是实际地址值，但是你可以理解为地址值
 */
public class StudentTest {
    public static void main(String[] args) {
    Student s1 = new Student();//356573597
        System.out.println(s1.hashCode());
        Student s2 = new Student();
        System.out.println(s2.hashCode());//1735600054
        Student s3 = s1;
        System.out.println(s3.hashCode());//356573597
    }


}
