package org.progund.fb.main;

import java.io.File;

import org.progund.fb.domain.FBFile;
import org.progund.fb.util.FBList;
import org.progund.mediaplayer.Playable;


public class FileBrowser {
  public static void main(String[] args) {
    /*
    MP3ThumbnailGenerator mp3Thumb =
      new MP3ThumbnailGenerator();
    FBFile fb1 = new FBFile(new File("annabook.mp3"), mp3Thumb);
    System.out.println(fb1);
    FBFile javaFile =
      new FBFile(new File("FileBrowser.java"),
                 new ThumbnailGenerator() {
                   public String thumbnail() {
                     return "[java]";
                   }
        });
    System.out.println(javaFile);

    FBFile classFile = new FBFile(new File("FileBrowser.class"),
                                  () -> "[class]");
    System.out.println(classFile);
    System.out.println();
    */

    // Directory is either "." or args[0] if an argument is given
    String dir = args.length == 0 ? "." : args[0];
    System.out.println("Listing all files in " + dir);
    for (FBFile fb : FBList.ls(dir)) {
      System.out.println(fb);
    }

    System.out.println();
    System.out.println("Listing all Media files in " + dir);
    for (FBFile fb : FBList.mediaFiles(dir)) {
      System.out.println(fb);
    }

    System.out.println();
    System.out.println("Listing all Text files (.txt | .java) in " + dir +
                       " using a custom file filter:");
    for (FBFile fb : FBList.ls(dir, f ->
                               f.getName().endsWith(".java") ||
                               f.getName().endsWith(".txt"))) {
      System.out.println(fb);
    }

    System.out.println();
    System.out.println("Pretending to be a mediaplayer and playing" +
                       " all playables obtained from FBList.playables():");
    for (Playable playable : FBList.playables(dir)) {
      playable.play();
    }
  }

}
