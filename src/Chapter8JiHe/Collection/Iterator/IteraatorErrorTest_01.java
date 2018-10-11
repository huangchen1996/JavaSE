package Chapter8JiHe.Collection.Iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteraatorErrorTest_01 {
    public static void main(String[] args) {
        //创建集合，添加元素的代码与前一个相同
        Collection books = new HashSet();
        //获取books集合对应的迭代器
        Iterator it = books.iterator();
        while (it.hasNext()){
            String book = (String)it.next();
            System.out.println();
        }
    }
}
