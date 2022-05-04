package lesson19;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyWithApapche implements CopyUtils{
    @Override
    public void copy(String from, String to) {
        File fromFile = new File(from);
        File toFile = new File(to);

        try {
            FileUtils.copyFile(fromFile, toFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
