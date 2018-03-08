package Pattern.Adapter;

/**
 * Created by fly on 2018/3/8.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.err.println("Playing mp4 file.Name: " + fileName);
    }
}
