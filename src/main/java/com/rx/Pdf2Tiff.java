package com.rx;

import net.sourceforge.tess4j.util.PdfUtilities;

import java.io.File;
import java.io.IOException;

/**
 * Created by hejianjun on 2016/12/12.
 */
public class Pdf2Tiff {
    public static void main(String[] args) {
        try {
            File inputPdfFile = new File("D:\\", "最高人民法院关于印发《人民法院民事裁判文书制作规范》《民事诉讼文书样式》的通知1.pdf");

            File result = PdfUtilities.convertPdf2Tiff(inputPdfFile);
            System.out.println(result.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
