package singleton;

/**
 * @Auther: ZGS
 * @Date: 2018/10/28 22:49
 * @Description:  懒汉, 线程不安全
 */
public class Singleton2_懒汉线程不安全 {

    private static Singleton2_懒汉线程不安全 instance = null;

    private Singleton2_懒汉线程不安全(){

    }

    private static Singleton2_懒汉线程不安全 getInstance(){
        if (instance == null) {
            instance =  new Singleton2_懒汉线程不安全();
        }
        return instance;
    }


}
