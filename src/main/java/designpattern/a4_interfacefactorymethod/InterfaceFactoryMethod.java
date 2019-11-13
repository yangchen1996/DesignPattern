package designpattern.a4_interfacefactorymethod;

/**
 * 抽象工厂
 * @author yc
 */
public class InterfaceFactoryMethod {

    /**
     * 抽象产品 动物类
     */
    interface Animal{
        public void create();
    }

    /**
     * 抽象产品  植物类
     */
    interface  Plant{
        public void create();
    }

    /**
     * 具体产品 马
     */
    static class Horse implements Animal{
        public void create() {
            System.out.println("生产马");
        }
    }

    /**
     * 具体产品 牛
      */
    static class Cattle implements Animal{
        public void create() {
            System.out.println("生产牛");
        }
    }

    /**
     * 具体产品 水果
     */
    static class Fruitage implements Plant{
        public void create() {
            System.out.println("生产水果");
        }
    }

    /**
     * 具体产品 蔬菜
     */
    class Vegetables implements Plant{
        public void create() {
            System.out.println("生产蔬菜");
        }
    }

    /**
     * 抽象工厂 农场类
     */
    interface Farm{
        public Animal newAnimal();
        public Plant newPlant();
    }

    /**
     * 雅安工厂
     */
    class YaFarm implements Farm{
        public Animal newAnimal() {
            return new Cattle();
        }

        public Plant newPlant() {
            return new Vegetables();
        }
    }

    /**
     * 成都工厂
     */
    static class CdFarm implements Farm{
        public Animal newAnimal() {
            return new Horse();
        }

        public Plant newPlant() {
            return new Fruitage();
        }
    }


    public static void main(String[] args) {
        Farm farm = new CdFarm();
        farm.newAnimal().create();
        farm.newPlant().create();

    }
}
