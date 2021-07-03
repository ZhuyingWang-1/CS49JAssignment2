package edu.sjsu.assignment2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class MyFile {
    public static void main(String[] args) throws FileNotFoundException {
       writePrimes("src/edu/sjsu/assignment2/file1","src/edu/sjsu/assignment2/file2");
    }

    public static void writePrimes(String file1, String file2) throws FileNotFoundException {
        // Construct a file object with the filename
        File file= new File(file1);
        PrintWriter out = new PrintWriter(file2);
        // scan the file
        Scanner reader = new Scanner(file);// print all lines in the file
        String line;
        while(reader.hasNextLine()) {
            line = reader.nextLine();
            Scanner scan = new Scanner(line);
            scan.useDelimiter(",");

            while (scan.hasNext()) {
                if(scan.hasNextInt()) {
                    int i = scan.nextInt();
                    if (isPrime(i)) {
                        out.println(i);
                        out.flush();
                    }
                }
                if(scan.hasNext())scan.next();
            }
            scan.close();
        }
        // close the scanner object after doner
        reader.close();
        out.close();
    }
    public static boolean isPrime(int i){
        if(i==0||i==1) return false;
        else{
            for(int j=2;j<=i/2;j++){
                if(i%j==0) return false;
            }
            return true;
        }
    }
}


