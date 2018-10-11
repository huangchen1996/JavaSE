package Chapter8JiHe.Collection.Iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        //创建集合，添加元素的代码与前一个程序相同
        Collection books = new HashSet();
        //获取books集合对应的迭代器
        Iterator it = books.iterator();
        while (it.hasNext()){
            //it.next()方法返回的数据类型是Object类型，因此需要强制类型转换
            String  book = (String)it.next();
            System.out.println(book);
            if (book.equals("Effective Java")){
                //从集合中删除上一次next()方法返回的元素
                it.remove();
            }
            //对book变量赋值，不会改变集合元素本省
            book = "测试字符串";

        }
        System.out.println(books);
    }
}
