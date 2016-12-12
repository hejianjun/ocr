package com.rx;

import net.sourceforge.tess4j.Tesseract1;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.ImageIOHelper;

import javax.imageio.IIOImage;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

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
            File imageFile = new File("C:\\Users\\hejianjun\\Documents\\My Hwdoc Files\\HWPDFOCR80\\IMAGE\\最高人民法院关于印发《人民法院民事裁判文书制作规范》《民事诉讼文书样式》的通知1",
                    "最高人民法院关于印发《人民法院民事裁判文书制作规范》《民事诉讼文书样式》的通知1_00033.pdf");
            List<IIOImage> imageList = ImageIOHelper.getIIOImageList(imageFile);
            Rectangle rectangle = new Rectangle(300, 300, 3000, 4500);
            String result = instance.doOCR(imageList, rectangle);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}
