package singleton;

/**
 * @Auther: ZGS
 * @Date: 2018/10/28 22:49
 * @Description:  懒汉, 线程不安全
 */
public class Singleton3_懒汉线程安全_不推荐 {

    private static Singleton3_懒汉线程安全_不推荐 instance = null;

    private Singleton3_懒汉线程安全_不推荐(){

    }

    /**
     * 再获取实例的方法上加synchronized, 同步该方法.
     *      但是这么写效率会很低.  第一个线程进来创建好实例后.   每个线程进来都要同步,效率低.
     * @return
     */
    public synchronized static Singleton3_懒汉线程安全_不推荐 getInstance(){
        if (instance == null) {
            instance =  new Singleton3_懒汉线程安全_不推荐();
        }
        return instance;
    }


}
