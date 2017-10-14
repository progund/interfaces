package org.progund.fb.util;

import org.progund.fb.domain.FBFile;
import org.progund.fb.domain.FBMediaFile;
import org.progund.mediaplayer.Playable;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * A utility class for generating lists of various types of FBFiles etc.
 */
public class FBList {

  /**
   * Prevent instantiation - this class should only be used
   * for its static methods.
   */
  private FBList() { }
  
  private static String[] mediaSuffices = {
    "ogg",
    "mp3",
    "avi",
    "wma",
    "mkv",
    "webm",
    "wmv",
    "oggv",
    "wav",
    "midi"
  };
  
  /**
   * Decide if a File is a media file, using a list of known suffices.
   *
   * @param f The file to check
   * @return true if the file's suffix is a known media file suffix, false
   * otherwise
   */
  private static boolean isMedia(File f) {
    return Arrays.asList(mediaSuffices).contains(suffix(f).toLowerCase());
  }

  /**
   * Get the suffix of a File.
   *
   * @param f The file to get the suffix from
   * @return The suffix of this file's name or an empty String if no
   * suffix exists (the filename doesn't contain a dot).
   */
  private static String suffix(File f) {
    if (! f.getName().contains(".")) {
      return "";
    }
    String[] parts = f.getName().split("\\.");
    String suffix = parts[parts.length -1];
    return suffix;
  }

  /**
   * Returns a List&lt;FBFile&gt; from the files in a given directory.
   * 
   * This method works a bit like the <code>ls</code> command, it lists files.
   * @param dir The directory to list
   * @return A List&lt;FBFile&gt; with files from the given directory
   */
  public static List<FBFile> ls(String dir) {
    return ls(dir, (f) -> true);
  }

  /**
   * Returns a List&lt;Playable&gt; from the files in a given directory.
   * 
   * @param dir The directory to list
   * @return A List&lt;Playable&gt; with only the Playable files from the
   * given directory
   */
  public static List<Playable> playables(String dir) {
    List<Playable> playables = new ArrayList<>();
    for (FBFile fb : mediaFiles(dir)) {
      playables.add(new FBMediaFile(fb));
    }
    return playables;
  }
  
  /**
   * Returns a List&lt;FBFile&gt; from the media files in a given directory.
   * 
   * This method works a bit like the <code>ls</code> command, it lists files
   * but it filters on the suffices of known media files.
   * @param dir The directory to list
   * @return A List&lt;FBFile&gt; with media files from the given directory
   */
  public static List<FBFile> mediaFiles(String dir) {
    return ls(dir, (f) -> isMedia(f));
  }
  
  /**
   * Returns a List&lt;FBFile&gt; from the files in a given directory,
   * filtered on some FileFilter.
   * 
   * @param dir The directory to list
   * @param filter The FileFilter to use
   * @return A List&lt;FBFile&gt; with files satisfying the filter
   * from the given directory
   */
  public static List<FBFile> ls(String dir, FileFilter filter) {
    List<FBFile> files = new ArrayList<>();
    
    for (File f : new File(dir).listFiles(filter)) {
      if (f.isDirectory()) {
        files.add(new FBFile(f, () -> "[dir]"));
      } else {
        if (f.getName().contains(".")) {
          files.add(new FBFile(f, () -> "[" + suffix(f) + "]"));
        } else {
          files.add(new FBFile(f, () -> "[file]"));
        }
      }
    }
    return files;
  }
}
