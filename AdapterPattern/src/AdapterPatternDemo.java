/**
 * @author yangtengfei
 * @date 2020/3/22 8:00 下午
 *
 * 适配器模式
 *
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        MediaPlay mediaPlay = new AudioPlayer();

        mediaPlay.play("Mp3");
        mediaPlay.play("Mp4");
        mediaPlay.play("Mp5");


    }
}
