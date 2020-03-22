/**
 * @author yangtengfei
 * @date 2020/3/22 8:06 下午
 *
 * 适配器
 *
 */
public class PlayerAdapter implements MediaPlay{

    private AdvancedMediaPlayer advancedMediaPlayer;

    public PlayerAdapter(String type) {
        if("Mp4".equals(type)){
            advancedMediaPlayer = new Mp4Player();
        }
        if("Mp5".equals(type)){
            advancedMediaPlayer = new Mp5Player();
        }

    }

    @Override
    public void play(String type) {
        if("Mp4".equals(type)){
            advancedMediaPlayer.playMp4();
        }
        if("Mp5".equals(type)){
            advancedMediaPlayer.playMp5();
        }
    }
}
