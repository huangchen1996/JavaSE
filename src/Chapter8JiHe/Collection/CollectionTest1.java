package Chapter8JiHe.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //添加元素
        ((ArrayList) c).add("Linus");
      //虽然集合里不能放基本类型的值，但Java支持自动装箱
        ((ArrayList) c).add(6);
        System.out.println("c集合的元素个数为:" + c.size());//输出
    //删除元素
        c.remove(6);
        System.out.println("c集合的元素个数为:" + c.size());//输出
        //判断是否包含指定字符串
        System.out.println("c集合是否包含\"Linus\"字符串:"
        + c.contains("Linus"));//输出true
        ((ArrayList) c).add("Effective Java");
        System.out.println("c元素的集合" + c);
        Collection books = new HashSet();
        books.add("Effecive Java");
        System.out.println("c集合是否完全包含books的部分?"
        + c.containsAll(books));//输出false
        //用c集合减去books集合里的元素
        c.removeAll(books);
        System.out.println("c集合的元素:" + c);
        //控制books集合里只剩下c集合里也包含的元素
        books.retainAll(c);
        System.out.println("books集合的元素:" + books );

    }
}
