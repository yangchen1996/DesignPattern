package designpattern.a1_singleton;

/**
 * 单例模式（懒汉式）
 */
public class Singleton01 {

    /**
     * 确保该实例在线程种同步
     */
    private static volatile Singleton01  singleton01= null;

    /**
     * 确保该实例不能被外部实例化
     */
    private Singleton01() {}

    /**
     * 使用synchronized确保同步调用
     * @return
     */
    public static synchronized Singleton01  getSingleton01(){
        if(singleton01 == null){
            return new Singleton01();
        }
        return singleton01;
    }
}
