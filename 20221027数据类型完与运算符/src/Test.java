public class Test {
    public static void main(String[] args) {
        boolean flg =  (true == true) ? true == true ? false : false:true;
        System.out.println(flg);
        int a = 10;
    }

    public static void main12(String[] args) {
        int a = -1;
        //无符号右移
        System.out.println(a >>> 1);
    }

    public static void main11(String[] args) {
        int a = 10;
        //System.out.println(!(a == 10));
        int b = 2;
        //此时 & 符号 如果左右两边都是布尔类型 那么也相当于逻辑运算
        //System.out.println(a == 1 & b == 2);
        //此时的 & 不能进行短路求值
        System.out.println(a == 2 & (1/0) == 0);
    }

    public static void main10(String[] args) {
        int a = 1;
        int b = 2;
        //逻辑或(短路或) 当左侧表达式为真 右侧表达式因为不被执行所以不会报错(算数异常)
        System.out.println(a == 1 || (1/0) == 0);

//        System.out.println(a == 1 && b == 2);
//        System.out.println(a == 2 && b == 2);
        //逻辑与(短路与) 当左侧表达式为假 右侧表达式因为不被执行所以不会报错(算数异常)
        System.out.println(a == 2 && (1/0) == 0);
    }

    public static void main9(String[] args) {
        System.out.println(1 < 5);
        System.out.println(1 <= 5);
        System.out.println(1 > 5);
        System.out.println(1 >= 5);
        System.out.println(1 != 5);
        System.out.println(1 == 5);
        int a = 10;
        //System.out.println(3 < a < 100);//true<100 error
    }

    public static void main8(String[] args) {
        int a = 10;
        //int b = a++;//b = a; a = a+1;
        int b = ++a;//a = a+1; b = a;
        System.out.println(a);
        System.out.println(b);
        //不是很重要,可以看Java的汇编,记住结论就行
        int i = 10;
        i = i++;
        System.out.println(i);
    }

    public static void main7(String[] args) {
        int a = 10;
        a += 1;//a = a + 1
        System.out.println(a);

        short sh = 12;
        //sh = sh + 2;//err 2默认int型,需将2强转
        sh += 2;//理解为 帮我们进行了类型的转换
        System.out.println(sh);
    }

    public static void main6(String[] args) {
        //两侧操作数类型不一致时,向类型大的提升
        System.out.println(10%3);
        System.out.println(10%-3);
        System.out.println(-10%3);
        System.out.println(-10%-3);
        //取模不能有小数,但是Java中允许
        System.out.println(11.5%2);//1.5
    }

    public static void main5(String[] args) {
        System.out.println(5/2);//2
        System.out.println((float) 5/2);//2.5
        System.out.println(5/(float)2);
        System.out.println((float)(5/2));
    }

    public static void main4(String[] args) {
        //将字符串转化为整数
        //学习使用引用数据类型,查找类中的方法并使用
        String str = "12345";
        //以下两个其实本质上没有区别,valueOf底层调用的还是parseInt,CTRL单击可查看
        int ret = Integer.valueOf(str);
        int ret3 = Integer.parseInt(str);

        System.out.println(ret+1);
        //将字符串转化为小数浮点型
        String str2 = "1.25";
        double ret2 = Double.valueOf(str2);
        System.out.println(ret2+1);
    }

    public static void main3(String[] args) {
        //将整数转换为字符串
        int a = 12345;
        String aa = a+"";
        System.out.println("--->" + aa);
        //通过点号 来调用类中的方法
        String ret = String.valueOf(a);
        System.out.println(ret);

        float f = 12.5f;
        String ret2 = String.valueOf(f);
        System.out.println(ret2);
    }

    public static void main2(String[] args) {
        //String不是包装类
        //包装类->基本数据类型对应的类类型
        //数据类型包括:
        //1.基本数据类型:8个
        //2.引用数据类型:String(不属于包装类)
        //             Byte(属于包装类,包装类是引用数据类型中的一种)
        //             数组/接口
        //             ...
        //(可以把包装类理解为8个基本数据类型的"加大版本")
        String str1 = "hello";
        String str2 = "world";
        //在字符串当中, 如果两个字符串进行相加,那么它是拼接的意思
        System.out.println(str1+str2);
        int a = 10;
        int b = 20;
        //字符串拼接任何类型时结果就是字符串
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a+b = " + a+b);
        System.out.println("a+b = " + (a+b));
        //运算从左向右,先整型运算后拼接字符串
        System.out.println(a+b + "是a+b的和");
    }

    public static void main1(String[] args) {
        String str = "hello";
        System.out.println(str);
        int a = 10;
        System.out.println(a);
    }
}
