package designpattern.a3_factorymethod;

/**
 * 工厂方法
 * @author yc
 */
public class FactoryMethod01 {
    /**
     * 抽象产品
     */
    public static interface Product{
        public void show();
    }

    /**
     * 产品1
     */
    public static class Product01 implements Product{
        public void show() {
            System.out.println("产品1创建成功");
        }
    }

    /**
     * 产品2
     */
    public static class Product02 implements Product{
        public void show() {
            System.out.println("产品2创建成功");
        }
    }

    /**
     * 抽象工厂
     */
    public interface AbstractFactory{
        public Product newProduct();
    }

    /**
     * 工厂1
     */
    public static class Factory1 implements AbstractFactory{
        public Product newProduct() {
            System.out.println("工厂1生成");
            return new Product01();
        }
    }

    /**
     * 工厂2
     */
    public static class Factory2 implements AbstractFactory{
        public Product newProduct() {
            System.out.println("工厂2生成");
            return new Product02();
        }
    }

    public static void main(String[] args) {
        AbstractFactory af = new Factory1();
        Product product = af.newProduct();
        product.show();
    }

}
