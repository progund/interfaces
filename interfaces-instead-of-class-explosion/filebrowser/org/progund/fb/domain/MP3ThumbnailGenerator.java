package org.progund.fb.domain;

/**
 * <p>Example of a concrete ThumbnaeilGenerator class.</p>
 *
 * <p>Normally, we'd use a lambda expression or an anonymous inner
 * class when creating a ThumbnailGenerator for an FBFile. This class
 * should be considered a syntactic example on how to implement the
 * ThumbnailGenerator interface.</p>
 *
 * <p>We could create a reusable MP3 thumbnail generator this way instead:
 * <br>
 * <pre>
 * ThumbnailGenerator mp3ThumbGen = new ThumbnailGenerator() {
 *   public String thumbnail() {
 *     return "[mp3]";
 *   }
 * };
 * </pre><br>
 * Or using a lambda expression:
 * <pre>
 * ThumbnailGenerator mp3ThumbGen = () -> "[mp3]";
 * </pre>
 * </p>
 */
public class MP3ThumbnailGenerator implements ThumbnailGenerator {

  /**
   * Returns a String representing the thumbnail for an MP3 file.
   * @return the thumbnail as a String, namely <code>[MP3]</code>
   */
  @Override
  public String thumbnail() {
    return "[MP3]";
  }
}
