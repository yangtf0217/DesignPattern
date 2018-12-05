/**
 * @Auther: yangtengfei
 * @Date: 2018/12/5 11:48
 * @Description:
 */
public abstract class AbstractFactory {
    abstract Language getLanguage(String language);

    abstract Food getFood(String food);
}
