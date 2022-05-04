package lesson19;

import java.io.File;

public class Main3 {
    public static void main(String[] args) {
        File startDir = new File("C:\\testJava\\sdf");
        if(!startDir.exists()){
            startDir.mkdirs();
        }
    }
}
