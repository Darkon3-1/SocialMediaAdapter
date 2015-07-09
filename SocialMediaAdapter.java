package socialmedia;

/**
 * Created by David on 7/8/2015.
 */
public class SocialMediaAdapter implements SocialMediaEntry  {

    YouTubeVideo video;

    public SocialMediaAdapter (YouTubeVideo video) { this.video = video; }
    public String getUser() { return video.getAuthor(); }
    public String getPostText() { return video.getTitle() + ", " + video.getDescription(); }
}
