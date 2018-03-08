package Pattern.Adapter;

/**
 * Created by fly on 2018/3/8.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audio, String fileName) {
        if (audio.equalsIgnoreCase("mp3")) {
            System.err.println("Playing mp3 file. Name: " + fileName);
        } else if (audio.equalsIgnoreCase("vlc") || audio.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audio);
            mediaAdapter.play(audio, fileName);
        } else {
            System.err.println("Invalid media. " + audio + "format not supported");
        }
    }
}
