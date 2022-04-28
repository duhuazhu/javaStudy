/** 文档注释
 * @author duhuazhu
 * @version v1.0
 */
class VariableTest {
    public static void main(String[] args) {
        int MyNumber;
        MyNumber =  10;

        long MyNumber1 = 20L;
        double MyNumber2 = 20.3;
        float MyNumber3 = 12.3F;

        //字符  只能声明一个字符
        char c1 =  'a';

        double d1 = 12.9;
        int i1 = (int)d1; // 截取操作
        System.out.println(i1);

        System.out.println(MyNumber);



        //char 类型  加法会变成 编码字符运算
        //string 类型的计算  都会变成string
    }

}