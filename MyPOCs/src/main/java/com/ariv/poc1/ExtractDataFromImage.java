package com.ariv.poc1;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ExtractDataFromImage {

	public static void main(String[] args) {
		String imageLocation1 = "/Users/al/Downloads/Example.jpeg";
		getImgText(imageLocation1);
	}

	public static String getImgText(String imageLocation) {
		ITesseract instance = new Tesseract();
		try {
			String imgText = instance.doOCR(new File(imageLocation));
			return imgText;
		} catch (TesseractException e) {
			e.getMessage();
			return "Error while reading image";
		}
	}
}
