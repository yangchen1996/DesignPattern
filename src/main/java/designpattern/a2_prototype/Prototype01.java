package designpattern.a2_prototype;

/**
 * 原型模式（浅克隆）
 * 实现 Cloneable 接口
 * Java 中的 Object 类提供了浅克隆的 clone() 方法
 */
public class Prototype01 implements Cloneable{
    public Prototype01() {
        System.out.println("具体原型创建成功");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Prototype01)super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype01 prototype01 = new Prototype01();
        Prototype01 prototype02 = (Prototype01)prototype01.clone();
        System.out.println("prototype01==prototype02?"+(prototype01==prototype02));
    }
}
