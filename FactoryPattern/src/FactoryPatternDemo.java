/**
 * @Auther: yangtengfei
 * @Date: 2018/12/4 15:13
 * @Description: 测试工厂设计模式
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        PersionFactory persionFactory = new PersionFactory();

        Persion china = persionFactory.getPersion("China");
        china.sayLanguage();

        Persion english = persionFactory.getPersion("English");
        english.sayLanguage();
    }
}
