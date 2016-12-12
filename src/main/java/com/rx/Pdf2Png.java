package com.rx;

import net.sourceforge.tess4j.util.PdfUtilities;

import java.io.File;

/**
 * Created by hejianjun on 2016/12/12.
 */
public class Pdf2Png {
    public static void main(String[] args) {

        File inputPdfFile = new File("D:\\MB\\", "最高人民法院关于印发《人民法院民事裁判文书制作规范》《民事诉讼文书样式》的通知1.pdf");

        File[] results = PdfUtilities.convertPdf2Png(inputPdfFile);
        for (File result : results) {
            System.out.println(result.getPath());
        }

    }
}
