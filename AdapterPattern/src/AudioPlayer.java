/**
 * @author yangtengfei
 * @date 2020/3/22 7:58 下午
 *
 * 最低级播放器
 */
public class AudioPlayer implements MediaPlay{

    private PlayerAdapter playerAdapter;

    @Override
    public void play(String type) {
        if("Mp3".equals(type)){
            System.out.println("mp3 play: a.mp3");
        }
        if("Mp4".equals(type)||"Mp5".equals(type)){
            playerAdapter = new PlayerAdapter(type);
            playerAdapter.play(type);
        }


    }
}
