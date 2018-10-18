package MavenApi.pack.Topic;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;

public class File2 {

    public static void main(String[] args) throws IOException 
    {
    	File file = new File("C:\\Users\\yashkumar.thakur\\Documents\\Ideathon");
        // For getting only ".PDF" files 
        File[] files = file.listFiles((dir, name) -> name.toLowerCase().endsWith(".pdf"));
        for(File f: files){
            System.out.println(f.getName());
        
        try (PDDocument document = PDDocument.load(new File(file+"/"+f.getName()))) {

            document.getClass(); 
            if (!document.isEncrypted()) {
			
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);
                int page_no=0;

                PDFTextStripper tStripper = new PDFTextStripper();
                
                String pdfFileInText = tStripper.getText(document);
                //System.out.println("Text:" + st);

				// split by whitespace
                String lines[] = pdfFileInText.split("\\r?\\n");
                for (String line : lines) {
                    System.out.println(page_no+":"+line);
                    page_no ++;
                }

            }
        } 	//new

        }

    }
}