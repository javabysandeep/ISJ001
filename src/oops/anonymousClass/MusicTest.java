package oops.anonymousClass;

public class MusicTest {
    public static void main(String[] args) {
        //1. using subclass separately
        MusicService musicService = new MusicServiceImpl();
        musicService.play();

        //2, anonymous class way
        MusicService reference = new MusicServiceImpl() {
            @Override
            void play() {
                System.out.println("playing with anonymous subclass");
            }
        };
        reference.play();
    }
}
