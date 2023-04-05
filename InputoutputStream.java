package file;

import java.io.*;
import java.util.Scanner;

public class InputoutputStream {
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\muniish\\OneDrive\\Desktop\\sample.txt");

        Scanner sc =new Scanner(file);

        while(sc.hasNextLine()){
        System.out.println(sc.nextLine());
}
        }
    }
