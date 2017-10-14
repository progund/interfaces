package org.progund.fb.domain;

import org.progund.mediaplayer.Playable;
/**
 * <p>An FBMediaFile adds functionality to an FBFile by making it
 * Playable (having a play() method).</p>
 *
 * <p>You can say that this class decorates an FBFile by making it Playable.
 * </p>
 *
 * <p>You create an FBMediaFile by calling this class' constructor with
 * the argument of the FBFile to be decorated:<br>
 * <pre>
 * FBMediaFile mediafile = new FBMediaFile(someFBFile);
 * </pre>
 * </p>
 */
public class FBMediaFile extends FBFile implements Playable {

  /**
   * The wrapped FBFile object reference.
   */
  private FBFile fbFile;

  /**
   * Constructs a new FBMediaFile, wrapping an existing FBFile, given as
   * argument.
   * @param fbFile The FBFile to wrap inside this new FBMediaFile
   */
  public FBMediaFile(FBFile fbFile) {
    super(fbFile.file, fbFile.thumbGen);
    this.fbFile = fbFile;
  }

  /**
   * Returns this FBMediaFile's name as a String, using the wrapped FBFile's
   * own name() method.
   */
  @Override
  public String name() {
    return fbFile.name();
  }

  /**
   * Returns this FBMediaFile's thumbnail as a String using the
   * wrapped FBFile's own thumbnail() method.
   * @return This FBMediaFile's thumbnail as a String
   */
  @Override
  public String thumbnail() {
    return fbFile.thumbnail() + " \u25B6";
  }

  /**
   * Returns a String representation of this FBMediaFile
   * @return This FBMediaFile as a String
   */
  @Override
  public String toString() {
    // This will cause our own version of thumbnail()
    // to be used in super.toString()
    return super.toString();
  }

  /**
   * <p>Implements the play method from the Playable interface.</p>
   *
   * <p>We are Playable, so we must have a play() method.</p>
   */
  @Override
  public void play() {
    System.out.println("Playing: " + this);
  }
}
