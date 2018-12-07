import java.lang.reflect.Constructor;

/**
 * @Auther: yangtengfei
 * @Date: 2018/12/7 14:19
 * @Description:
 */
public class SingletonDemo {

    public static void main(String[] args) throws Exception {
        SingleObject singleObject1 = SingleObject.getSingleObject();
        SingleObject singleObject2 = SingleObject.getSingleObject();
        System.out.println(singleObject1==singleObject2);


        Class<SingleObject> singleObjectClass = SingleObject.class;
        Constructor<SingleObject> constructor = singleObjectClass.getDeclaredConstructor();
        SingleObject singleObject3 = constructor.newInstance();
        SingleObject singleObject4 = constructor.newInstance();
        System.out.println(singleObject3==singleObject4);

    }
}
