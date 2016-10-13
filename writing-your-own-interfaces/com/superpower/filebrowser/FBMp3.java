package com.superpower.filebrowser;

public class FBMp3 extends FBFile implements FBPlayable {

    public FBMp3(String name) {
        super(name);
    }

    public String thumbnail() {
        return "[mp3 ]";
    }

    public void play() {
        System.out.println("faked playing of file: " + this);
    }
    
}
