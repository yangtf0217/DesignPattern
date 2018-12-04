/**
 * @Auther: yangtengfei
 * @Date: 2018/12/4 15:10
 * @Description: 第三步：创建工厂
 */
public class PersionFactory {

    public Persion getPersion(String persion){
        if(persion==null||persion.length()<=0){
            return null;
        }

        if("China".equals(persion)){
            return new ChinaPsersion();
        } else if("English".equals(persion)){
            return new EnglishPersion();
        } else {
            return null;
        }
    }
}
