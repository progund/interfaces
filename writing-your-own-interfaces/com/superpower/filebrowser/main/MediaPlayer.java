package com.superpower.filebrowser.main;


import com.superpower.filebrowser.FBPlayable;
import com.superpower.filebrowser.utils.FileList;
import java.util.List;

public class MediaPlayer {

  public static void main(String[] args) {

    String dir = ".";
    if (args.length != 0) {
      dir = args[0];
    }
        
    System.out.println("Playing in " + dir + ":");
    for (FBPlayable p : FileList.listPlayable(dir)) {
      p.play();
    }
        
  }

}
    
