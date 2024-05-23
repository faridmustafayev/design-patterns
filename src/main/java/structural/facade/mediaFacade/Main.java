package structural.facade.mediaFacade;

public class Main {
    public static void main(String[] args) {

        MultimediaFacade facade = new MultimediaFacade();
        facade.playMedia("song.audio", MediaType.AUDIO);
        facade.playMedia("song.video", MediaType.VIDEO);
        facade.playMedia("picture.png", MediaType.IMAGE);

    }
}
