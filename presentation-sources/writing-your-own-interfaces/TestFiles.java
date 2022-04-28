public class TestFiles {
  
  public static void main(String[] args) {
    Playable[] files = {
      new AudioFile("Space oddity.mp3", AudioFile.MUSIC),
      new AudioFile("Cortez the killer.ogg", AudioFile.MUSIC),
      new AudioFile("Dagens eko.mp3", AudioFile.SPEECH),
      new VideoFile("Twin peaks.mp4", VideoFile.TV),
      new VideoFile("The shining.mkv", VideoFile.MOVIE)
    };
    for (Playable file : files) {
      playFile(file);
    }
    
  }

  // Stupid simulation of a media player
  // capable of playing any Playable file
  // like AudioFile and MusicFile
  static void playFile(Playable p) {
    p.play();
  }
}
