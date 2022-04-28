package org.progund.fb.domain;

import java.io.File;

/**
 * Represents a file browser file object -
 * an object representing a file to be listed in a file browswer.
 *
 * <p>Such a file object has a File (representing the actual file
 * in the filesystem) and a ThumbnailGenerator which can produce
 * a String thumbnail representation, e.g. "[mp3]".
 */
public class FBFile {
  /**
   * This FBFile's file object - the file it represents.
   */
  protected File file;

  /**
   * This FBFile's thumbnail generator - the object it uses to
   * generate its thumbnail.
   */
  protected ThumbnailGenerator thumbGen;

  /**
   * Constructs a new FBFile.
   * @param file - The File this FBFile represents
   * @param thumbGen - The ThumbnailGenerator this FBFile uses
   *                   to generate its thumbnail
   */
  public FBFile(File file, ThumbnailGenerator thumbGen) {
    this.file = file;    
    this.thumbGen = thumbGen;
  }

  /**
   * Returns this FBFile's name as a String.
   * @return This FBFile's name as a String
   */
  public String name() {
    return file.getName();
  }

  /**
   * Returns this FBFile's thumbnail as a String.
   * @return This FBFile's thumbnail as a String
   */
  public String thumbnail() {
    return thumbGen.thumbnail();
  }

  /**
   * Returns a String representation of this FBFile on the format
   * <code>[thumbnail text] [name]</code>
   *
   * <p>for instance:<br>
   * <code>[mp3] mama_im_coming_home.mp3</code>
   */
  public String toString() {
    return thumbnail() + " " + name();
  }
}
