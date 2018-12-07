/**
 * @Auther: yangtengfei
 * @Date: 2018/12/7 14:10
 * @Description:  线程安全，防反射，懒汉式
 */
public class SingleObject {

    private static SingleObject singleObject;

    private static boolean flag = false;  //防反射

    private SingleObject() throws Exception {  //构造器私有化
        if(!flag){
            flag = true;
        } else {
            throw new Exception("单例被破坏");
        }
    };

    public static SingleObject getSingleObject() throws Exception {
        if(singleObject==null){
            synchronized (SingleObject.class){
                if (singleObject==null){
                    singleObject = new SingleObject();
                }
            }
        }
        return singleObject;
    }

}
