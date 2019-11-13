package designpattern.a5_builder;

public class Builder01 {
    /**
     * 产品角色:包含多个组成部件的复杂对象
     */
    class Product{
        private String partA;
        private String partB;
        private String partC;
        public void setPartA(String partA) {
            this.partA = partA;
        }
        public void setPartB(String partB) {
            this.partB = partB;
        }
        public void setPartC(String partC) {
            this.partC = partC;
        }
        public void show(){
            System.out.println("修建完毕");
        }
    }

    /**
     * 抽象建造者：
     */
    abstract class Builder{
        /**
         * 创建产品对象
         */
        protected Product product = new Product();
        public abstract void buildPartA();
        public abstract void buildPartB();
        public abstract void buildPartC();

        public Product getProduct() {
            return product;
        }
    }

    /**
     * 具体建造者1：实现抽象建造者接口
     */
    class ConcreteBuilder1 extends Builder{
        @Override
        public void buildPartA() {
            product.setPartA("A1");
        }
        @Override
        public void buildPartB() {
            product.setPartB("B1");
        }
        @Override
        public void buildPartC() {
            product.setPartC("C1");
        }
    }
    /**
     * 具体建造者2：实现抽象建造者接口
     */
     class ConcreteBuilder2 extends Builder{
        @Override
        public void buildPartA() {
            product.setPartA("A2");
        }
        @Override
        public void buildPartB() {
            product.setPartB("B2");
        }
        @Override
        public void buildPartC() {
            product.setPartC("C2");
        }
    }

    /**
     * 指挥者:调用建造者中的方法完成复杂对象的创建。
     */
    class Director{
        private Builder builder;
        public Director(Builder builder){
            this.builder = builder;
        }
        public Product construct(){
            builder.buildPartA();
            builder.buildPartB();
            builder.buildPartC();
            return builder.getProduct();
        }
    }

    public void main(String[] args) {
        Builder builder = new ConcreteBuilder2();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
