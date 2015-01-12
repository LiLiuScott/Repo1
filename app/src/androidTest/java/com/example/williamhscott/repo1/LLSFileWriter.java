package com.example.williamhscott.repo1;

import android.os.Environment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Henry on 1/11/2015.
 */
public class LLSFileWriter {

    private File newFile;

    public static void write(String filename, String text){
        File sdcard = Environment.getExternalStorageDirectory();
        File newFile = new File(sdcard.getAbsolutePath() + "/journal/" + text);
        try{
            BufferedWriter mWriter = new BufferedWriter(new FileWriter(newFile));
            mWriter.write(text);
            mWriter.close();
        } catch(IOException e){
        // Failed to write for some reason
        }
    }

}
