package oops.inheritance;

public class MusicTest {
    public static void main(String[] args) {

        //Parent class reference = child class object
        MusicService musicService = new MusicServiceImpl();

        //only present in Parent class ---> access from Parent class

        //only present  in child class --> CTE

        //Present in both child and parent ---> variable from parent class ---> mnethod from child class
        System.out.println(musicService.musicId);//from parent class --> 1
        musicService.addMusic();//from parent class -->
    }
}
