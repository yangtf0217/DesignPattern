/**
 * @Auther: yangtengfei
 * @Date: 2018/12/5 11:50
 * @Description:
 */
public class LanguageFactory extends AbstractFactory {


    @Override
    Language getLanguage(String language) {
        if("China".equals(language)){
            return new ChinaLanguage();
        } else if("English".equals(language)){
            return new EnglishLanguage();
        } else {
            return null;
        }
    }

    @Override
    Food getFood(String food) {
        return null;
    }
}
