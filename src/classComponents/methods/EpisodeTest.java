package classComponents.methods;

public class EpisodeTest {
    void process(){
        //instance method of Episode class
        Episode episode = new Episode();
        episode.m1();
        //static method of Episode class
        Episode.m2();
    }

    public static void main(String[] args) {
        //instance method of Episode class
        Episode episode = new Episode();
        episode.m1();

        //static method of Episode class
        Episode.m2();
    }
}
