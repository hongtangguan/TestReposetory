package jvmtest;

/**
 * @Auther: ZGS
 * @Date: 2018/11/1 21:40
 * @Description:
 */
public class JVMTest2 {


    public static void main(String[] args) {

        /**
         * stu是对Student对象的引用, 放入栈中, 只想堆中的内存地址.
         * new 出来的Student对象放入堆中, 并持有方法区中Student类型信息的引用
         */
        Student stu = new Student("stu");

        /**
         * 执行add()方法是, 根据stu定位到堆中的对象实例,再根据堆中持有的位于方法区的
         * Student类型信息, 获得add()字节码, 执行此方法.
         */
        stu.add();


    }


}
