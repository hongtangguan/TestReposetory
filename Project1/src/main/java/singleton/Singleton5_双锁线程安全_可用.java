package singleton;

/**
 * @Auther: ZGS
 * @Date: 2018/10/28 23:34
 * @Description:
 */
public class Singleton5_双锁线程安全_可用 {


    private volatile static Singleton5_双锁线程安全_可用 instance = null;

    private Singleton5_双锁线程安全_可用(){}

    /**
     * 方法内部双重判断, 并且该类实例用volatile修饰, 让线程从主内存中读取该变量.从而达到线程安全.
     */
    public static Singleton5_双锁线程安全_可用 getInstance(){

        if (instance == null) {
            synchronized (Singleton5_双锁线程安全_可用.class){
                if (instance == null) {
                    instance = new Singleton5_双锁线程安全_可用();
                }
            }
        }
        return instance;
    }


}
