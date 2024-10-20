package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {


    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("Filename is null or empty.");
        }

        // check if the filename ends with ".java"
        return filename.endsWith(".java");
    }

    // method to map file extensions to 1 (true), 0 (false) or -1 (exception)
    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> result = new HashMap<>();

        for (String filename : filenames) {
            try {
                // check the filename and map 1 for true, 0 for false
                boolean isJava = check(filename);
                result.put(filename, isJava ? 1 : 0);
            } catch (FilenameException e) {
                // map -1 in case a exception occurs
                result.put(filename, -1);
            }
        }

        return result;
    }
}
