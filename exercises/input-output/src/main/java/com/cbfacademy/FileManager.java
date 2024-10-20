package com.cbfacademy;

import java.io.IOException;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;

public class FileManager {

    // method to read a file and return its contents line by line
    public List<String> readFile(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename));
    }

    // method to copy content from one file to another
    public void copy(String inputFile, String outputFile) throws IOException {
        Files.copy(Paths.get(inputFile), Paths.get(outputFile), StandardCopyOption.REPLACE_EXISTING);
    }

    // method to reverse the lines of a file and write them to a new file
    public void reverseLines(String inputFile, String outputFile) throws IOException {
        // read all the lines from the input file
        List<String> lines = Files.readAllLines(Paths.get(inputFile));

        // and reverse the order of the lines
        Collections.reverse(lines);

        // write the reversed lines to the output file
        Files.write(Paths.get(outputFile), lines);
    }
}
