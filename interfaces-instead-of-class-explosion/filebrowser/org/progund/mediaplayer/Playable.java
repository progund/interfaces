package org.progund.mediaplayer;

/**
 * A Playable object has a play() method. And this interface allows us
 * to keep that promise, so that other classes can implement this interface
 * and thus qualify to be Playable via their play() method.
 */
public interface Playable {
  public void play();
}
