package designpattern.a1_singleton;

/**
 * 单例模式（饿汉式）
 */
public class Singleton02 {
    /**
     * 保证类加载时就创建一个实例
     */
    private static final Singleton02 singleton02 = new Singleton02();

    private Singleton02() {}

    public static Singleton02 getSingleton02(){
        return singleton02;
    }
}
