/**
 * 标识符:就是给类，接口，方法，变量等起名字的
 *
 * 组成规则:
 * 1英文字母大小写
 * 2数字和字符
 * 3$和_
 *
 * 注意事项:
 * 1不能以数字开头
 */
Public class Identifier_02{
    public static void main(String[] args) {
        //正确做法
        int x = 100;
        //不能以数字开头
        //int 1x = 100;

        //不能是Java中的关键字
       //int public = 100;


        int Public = 100;
    }
}