package lesson19;

import java.io.File;
import java.io.FileFilter;

public class Main4 {

    public static void main(String[] args) {
        File statDir = new File("C:\\testJava\\sdf");
        File[] files = statDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getName().endsWith(".png")){
                    return true;
                }
                return false;
            }
        });
        for (File f : files){
            System.out.println(f.getName());
        }
    }
}
