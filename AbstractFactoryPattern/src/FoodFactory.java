/**
 * @Auther: yangtengfei
 * @Date: 2018/12/5 14:08
 * @Description:
 */
public class FoodFactory extends AbstractFactory {


    @Override
    Language getLanguage(String language) {
        return null;
    }

    @Override
    Food getFood(String food) {

        if("China".equals(food)){
            return new ChinaFood();
        } else if("English".equals(food)){
            return new EnglishFood();
        } else {
            return null;
        }

    }
}
