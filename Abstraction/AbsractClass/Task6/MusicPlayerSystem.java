// Scenario 6: Music Player Application
// Develop an abstract class called "MediaPlayer" with abstract methods like "play" and "stop." Implement derived classes like "AudioPlayer" and "VideoPlayer" that provide specific implementations for these abstract methods.

abstract class MediaPlayer {
    String device_name;

    MediaPlayer(String device_name) {
        this.device_name = device_name;
    }

    void display() {
        System.out.println("\nMediaplayer Name:" + device_name);
    }

    abstract void play();

    abstract void stop();
}

class AudioPlayer extends MediaPlayer {
    AudioPlayer(String device_name) {
        super(device_name);
    }

    @Override
    void play() {
        System.out.println("Audio is playing!!");
    }

    @Override
    void stop() {
        System.out.println("Audio is now stop!!");
    }
}

class VideoPlayer extends MediaPlayer {
    VideoPlayer(String device_name) {
        super(device_name);
    }

    @Override
    void play() {
        System.out.println("Video is playing!!");
    }

    @Override
    void stop() {
        System.out.println("Video is now stop!!");
    }
}
public class MusicPlayerSystem {
    public static void main(String[] args) {
        AudioPlayer a = new AudioPlayer("AudioPlayer");
        a.display();
        a.play();
        a.stop();

        VideoPlayer v = new VideoPlayer("VideoPlayer");
        v.display();
        v.play();
        v.stop();
    }
}
