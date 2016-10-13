public class AudioFile extends File implements Playable{

  public static final int MUSIC = 0;
  public static final int SPEECH= 1;

  public int type;

  public AudioFile(String name, int type){
    super(name);
    this.type=type;
  }

  public int type(){
    return type;
  }

  public void play(){
    System.out.println("Playing the file " + name() +
                       " which is a " + 
                       (type==MUSIC?"music":"speech")+
                       " file");
  }
}
