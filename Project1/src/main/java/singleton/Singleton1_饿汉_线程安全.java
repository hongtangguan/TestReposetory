package singleton;

/**
 * @Auther: ZGS
 * @Date: 2018/10/28 22:47
 * @Description:懒汉的单利.  类被加载的时候直接初始化该类的实例.   线程安全
 */
public class Singleton1_饿汉_线程安全 {

    private Singleton1_饿汉_线程安全(){}

    private static final Singleton1_饿汉_线程安全 instance = new Singleton1_饿汉_线程安全();

    private static Singleton1_饿汉_线程安全 getInstance(){
        return instance;
    }

}
