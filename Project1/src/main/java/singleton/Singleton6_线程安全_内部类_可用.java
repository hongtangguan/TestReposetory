package singleton;

/**
 * @Auther: ZGS
 * @Date: 2018/10/28 23:44
 * @Description:
 *
 * 推荐使用, 线程安全.
 *
 */
public class Singleton6_线程安全_内部类_可用 {


    private Singleton6_线程安全_内部类_可用(){}

    public static class innerClass{
        private static Singleton6_线程安全_内部类_可用 instance = new Singleton6_线程安全_内部类_可用();
    }

    private static Singleton6_线程安全_内部类_可用 getInstance(){
        return innerClass.instance;
    }
}
