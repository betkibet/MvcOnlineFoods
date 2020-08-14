package com.clc;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PrintPdf {
	public void printPdfDoc() {
		PDDocument doc = new PDDocument();
		PDPage page = new PDPage();
		doc.addPage(page);
		
		try {
			PDPageContentStream contentStream = new PDPageContentStream(doc, page);
			contentStream.setFont(PDType1Font.COURIER, 12);
			contentStream.beginText();
			contentStream.showText("Hey over there, this is a pdf");
			contentStream.endText();
			contentStream.close();
			doc.save("firstpdf.pdf");
			doc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
