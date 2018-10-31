package singleton;

/**
 * @Auther: ZGS
 * @Date: 2018/10/28 23:25
 * @Description:
 *
 *
 *
 */
public class Singleton4_懒汉枷锁_不可用 {

    private static Singleton4_懒汉枷锁_不可用 instance = null;

    private Singleton4_懒汉枷锁_不可用(){}

    /**
     *
     * 这样写也不是绝对的线程安全.
     *
     */

    private static Singleton4_懒汉枷锁_不可用 getInstance(){

        if (instance == null) {//当两个线程同时走到这里的时候, 一个线程把另一个线程的
                                //CPU执行权抢走.  就会产生两个实例.
            synchronized (Singleton4_懒汉枷锁_不可用.class) {
                instance = new Singleton4_懒汉枷锁_不可用();
            }
        }
    return instance;
    }


}
