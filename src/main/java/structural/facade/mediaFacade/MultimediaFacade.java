package structural.facade.mediaFacade;

public class MultimediaFacade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private ImageLoader imageLoader;

    public MultimediaFacade() {
        audioPlayer = new AudioPlayer();
        videoPlayer = new VideoPlayer();
        imageLoader = new ImageLoader();
    }

    public void playMedia(String fileName, MediaType type) {
        switch (type) {
            case AUDIO -> audioPlayer.playAudio(fileName);
            case IMAGE -> imageLoader.loaderImage(fileName);
            case VIDEO -> videoPlayer.playVideo(fileName);
            default -> System.out.println("Unsupported media: " + fileName);
        }
    }

}
