/**
 * @Auther: yangtengfei
 * @Date: 2018/12/5 14:13
 * @Description:
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactory languageFactory = FactoryProducer.getFactory("Language");

        Language china = languageFactory.getLanguage("China");
        china.sayLanguage();

        Language english = languageFactory.getLanguage("English");
        english.sayLanguage();




        AbstractFactory foodFactory = FactoryProducer.getFactory("Food");

        Food china1 = foodFactory.getFood("China");
        china1.eatFoot();

        Food english1 = foodFactory.getFood("English");
        english1.eatFoot();
    }
}
