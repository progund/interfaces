package com.superpower.filebrowser;

public class FBOgg extends FBFile implements FBPlayable {

  public FBOgg(String name) {
    super(name);
  }
  
  public String thumbnail() {
    return "[ogg ]";
  }
  
  public void play() {
    System.out.println("faked playing of file: " + this);
  }
  
}
