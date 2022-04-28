public class VideoFile extends File implements Playable {

  public static final int TV = 0;
  public static final int MOVIE = 1;
  public static final int MUSIC = 2;

  public int type;

  public VideoFile(String name, int type) {
    super(name);
    this.type = type;
  }

  public int type() {
    return type;
  }

  public void play() {
    String genre;
    switch (type) {
      case TV:
        genre = "TV";
        break;
      case MOVIE:
        genre = "Movie";
        break;
      case MUSIC:
        genre = "Music";
        break;
      default:
        genre = "Unknown";
    }
    System.out.println("Playing the file " + name() + " which is a "
                       + genre + " video file");
    
  }
}
