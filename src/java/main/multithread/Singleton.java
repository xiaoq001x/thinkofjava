package main.multithread;

/**
 * @author 肖强
 * @Time 2017/2/13 17:14
 */
public class Singleton {
    public static volatile Singleton singleton;

    /**
     * 构造函数私有，禁止外部实例化
     */
    private Singleton() {
    }


    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (singleton) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}