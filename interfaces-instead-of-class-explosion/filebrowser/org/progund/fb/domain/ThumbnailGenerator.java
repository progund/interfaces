package org.progund.fb.domain;

/**
 * Defines a ThumbnailGenerator - it can create a thumbnail as a String.
 */
@FunctionalInterface
public interface ThumbnailGenerator {
  /**
   * Returns a String representing the thumbnail.
   * @return the thumbnail as a String
   */
  public String thumbnail();
}
