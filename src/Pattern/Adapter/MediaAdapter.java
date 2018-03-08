package Pattern.Adapter;

/**
 * Created by fly on 2018/3/8.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    @Override
    public void play(String audio, String fileName) {
        if (audio.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else {
            advancedMusicPlayer.playMp4(fileName);
        }
    }

    public MediaAdapter(String audio) {
        if (audio.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlatyer();
        } else {
            advancedMusicPlayer = new Mp4Player();
        }
    }
}
