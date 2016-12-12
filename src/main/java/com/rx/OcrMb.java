package com.rx;

import net.sourceforge.tess4j.Tesseract1;
import net.sourceforge.tess4j.TesseractException;

import java.awt.*;
import java.io.File;

/**
 * Created by hejianjun on 2016/12/9.
 */
public class OcrMb {
    static final String language = "chi_sim";
    static final Tesseract1 instance = new Tesseract1();
    static final String datapath = "src/main/resources";

    public static void main(String[] args) {
        try {
            instance.setDatapath(new File(datapath).getPath());
            instance.setLanguage(language);
            File imageFile = new File("D:\\MB\\","workingimage001.png");
            Rectangle rectangle = new Rectangle(300, 300, 3000, 4500);
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}
