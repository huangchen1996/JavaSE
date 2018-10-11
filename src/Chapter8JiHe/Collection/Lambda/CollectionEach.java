package Chapter8JiHe.Collection.Lambda;

import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {
    public static void main(String[] args) {
        //创建一个集合
        Collection books = new HashSet();
        books.add("Effective Java");
        books.add("疯狂Java讲义");
        books.add("Java编程思想");
        //调用forEach()方法遍历集合
        books.forEach(obj -> System.out.println("迭代集合元素:" + obj));
    }

}
