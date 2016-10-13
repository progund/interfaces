package com.superpower.filebrowser.main;

import java.util.List;

import com.superpower.filebrowser.FBPlayable;

public class MediaPlayer {

    public static void main(String[] args) {

        String dir = ".";
        if ( args.length!=0) {
            dir = args[0];
        }
        
        System.out.println("Playing in " + dir + ":");
        for (FBPlayable p : FileList.listPlayable(dir)) {
            p.play();
        }
        
    }

}
    
