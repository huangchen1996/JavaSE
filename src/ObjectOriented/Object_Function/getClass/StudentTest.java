package ObjectOriented.Object_Function.getClass;

/**
 * Object类的方法
 *         public final Class getClass():返回Object的运行时类
 *             Class类的方法:
 *                   public string getName():以String的形式返回此Class对象所表示
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        Class c = s.getClass();
        String str = c.getName();
        System.out.println(str);//ObjectOriented.Object_Function.getClass.Student

        //链式编程
        String str2 = s.getClass().getName();
        System.out.println(str2);
    }


}
