package com.superpower.filebrowser;

public class FBFile {

  private String name;
  
  public FBFile(String name) {
    this.name = name;
  }
  
  public String name() {
    return name;
  }
  
  public String thumbnail() {
    return "[file]";
  }
  
  @Override
  public String toString() {
    return thumbnail() + " " + name;
  }
  
}

