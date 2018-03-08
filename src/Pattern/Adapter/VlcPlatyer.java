package Pattern.Adapter;

/**
 * Created by fly on 2018/3/8.
 */
public class VlcPlatyer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.err.println("Playing vlc file. Name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
