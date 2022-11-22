/**
 * @Author
 * @Description:
 */
public class HelloWorld {
    public static void main(String[] args) {
        //byte赋值整数不会报错是因为
        //编译器会检查,如果字面值的范围是在自己表示的范围内则不会报错
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a+b);//小于4个字节的在运算的时候,会提升为4个字节
    }


    public static void main10(String[] args) {
        int a = 10;
        long b = 20L;
        int c = (int)(a+b);//a提升为8个字节 然后和b参与运算->8个字节的结果
        long d = a+b;

//        b = a;
    }


    //0是假 非0 是真 在Java中 真只有一个true 假 只有一个false
    //不能强制类型转换 它也不是整数 不能进行数值上的运算
    public static void main9(String[] args) {
        //JVM 没有明确其大小
        boolean flg = true;
        System.out.println(flg);
    }


    public static void main8(String[] args) {
        //字符类型是2个字节
        char ch = 'a';
        System.out.println(ch);
        char ch2 = '美';
        System.out.println(ch2);
        //Java中的字符可以存放整型
        char ch3 = 79;
        System.out.println(ch3);

    }


    public static void main7(String[] args) {
        float f = 12.5f;
        System.out.println(f);
    }


    public static void main6(String[] args) {
        //8个字节
        double d = 12.500;
        System.out.println(d);

        double num = 1.1;
        System.out.println(num*num);
        //小数其实没有精确的 只能说 精确到某一位上

//        System.out.printf("%.2f\n",d);
//        System.out.printf("%f",d);
        //小数不讨论最大最小值,没有意义
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);
//        int a = 1;
//        int b = 2;
//        System.out.println(a/b);
    }

    public static void main5(String[] args) {
        //1个字节 8个比特位 -2^7 2^7-1   -128 127
        byte a = 10;
        System.out.println(a);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

    }
    public static void main4(String[] args) {
        //2个字节 16bit -2^15 2^15-1
        short sh = 10;
        System.out.println(sh);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
    }


    public static void main3(String[] args) {
    //8个字节
        long a = 10L;
        System.out.println(a);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
    public static void main2(String[] args) {
        /*
    1.a是整型变量    此时a占用4个字节[和平台是多少位没有关系]
    16位平台
    32位平台
    64位平台
    4个字节->32位
    bit byte kb mb gb tb pb
     */
        int a = 10;
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    //m main psvm 出现提示之后 回车即可
    public static void main1(String[] args) {
        final  int a = 10;//类似于C里的const
        //sout
        System.out.println("hello world");
    }
}
