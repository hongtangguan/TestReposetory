package jvmtest;

/**
 * @Auther: ZGS
 * @Date: 2018/11/1 21:33
 * @Description:
 */
public class JVMTest1 {


    /**
     * i1==i2   false
     *  因为 i1 和 i2 是再堆内存中的两个对象, 开辟的两个空间.  ==比较的
     *  是地址, 所以为false
     */
    static Integer i1 = new Integer(1);
    static Integer i2 = new Integer(1);


    /**
     * 这里a,b都在方法去的常量池中, 是同一个内存地址.
     */
    static Integer a = 1;
    static Integer b = 1;


    public static void main(String[] args) {

        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        System.out.println("////////////////////////////////");

        System.out.println(a==b);


    }
}
