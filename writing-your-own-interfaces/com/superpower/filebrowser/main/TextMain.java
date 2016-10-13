package com.superpower.filebrowser.main;

import java.util.List;

import com.superpower.filebrowser.utils.FileList;
import com.superpower.filebrowser.FBFile;
import com.superpower.filebrowser.FBDir;
import com.superpower.filebrowser.FBJavaFile;

public class TextMain {

    public static void main(String[] args) {

        String dir = ".";
        if ( args.length!=0) {
            dir = args[0];
        }
        
        List<FBFile> files = FileList.list(dir);

        for (FBFile f : files) {
            System.out.println(f.thumbnail() + " " + f.name());
        }
        
    }

}
    
