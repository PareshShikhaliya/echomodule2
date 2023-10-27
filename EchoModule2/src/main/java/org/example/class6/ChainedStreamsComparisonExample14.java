package org.example.class6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ChainedStreamsComparisonExample14 {
    public static void main(String[] args) {
        // Imperative-style approach
        try (
                FileInputStream fileInputStream = new FileInputStream("input.txt");
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                FileWriter fileWriter = new FileWriter("output.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Perform some manipulation on the input line
                String processedLine = line.toUpperCase();

                // Write the processed line to the output file
                bufferedWriter.write(processedLine);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Functional-style approach
        try {
            Path inputPath = Path.of("input.txt");
            Path outputPath = Path.of("output.txt");


            // Read lines from the input file, process them, and write to the output file
           // paresh // PARESH
            Files.lines(inputPath)
                    .map(String::toUpperCase) // Process each line
                    .collect(Collectors.toList()) // Collect processed lines into a list
                    .forEach(line -> writeLine(outputPath, line)); // Write processed lines to output file
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* guess what language this code is ????????????????????
        try {
        val inputPath: Path = Paths.get("input.txt")
        val outputPath: Path = Paths.get("output.txt")

        Files.newBufferedWriter(outputPath, Charsets.UTF_8).use { writer ->
            Files.lines(inputPath)
                .map(String::toUpperCase) // Process each line
                .forEach { line -> writer.write(line + System.lineSeparator()) } // Write processed lines to output file
        }
         } catch (e: IOException) {
            e.printStackTrace()
        }
         */

        /*guess what language this code is ????????????????????
        try {
            val inputPath: Path = Paths.get("input.txt")
            val outputPath: Path = Paths.get("output.txt")

            Using.resource(Files.newBufferedWriter(outputPath, java.nio.charset.StandardCharsets.UTF_8)) { writer =>
              Files.lines(inputPath)
                .map(_.toUpperCase) // Process each line
                .forEach(line => {
                  writer.write(line + System.lineSeparator())
                }) // Write processed lines to output file
            }
          } catch {
            case e: IOException =>
              e.printStackTrace()
          }
        }
         */
    }

    private static void writeLine(Path outputPath, String line) {
        try {
            Files.writeString(outputPath, line + System.lineSeparator(), java.nio.file.StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
