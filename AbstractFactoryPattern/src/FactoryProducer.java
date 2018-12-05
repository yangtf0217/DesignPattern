/**
 * @Auther: yangtengfei
 * @Date: 2018/12/5 14:10
 * @Description:
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if("Language".equals(choice)){
            return new LanguageFactory();
        } else if("Food".equals(choice)){
            return new FoodFactory();
        } else {
            return null;
        }
    }
}
