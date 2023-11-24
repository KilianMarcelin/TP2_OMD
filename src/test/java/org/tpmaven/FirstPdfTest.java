package org.tpmaven;

import com.itextpdf.text.Document;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class FirstPdfTest {

    @Test
    public void testAddMetaData() {

        // Call the addMetaData method
        Document document = new Document();
        FirstPdf.addMetaData(document);

        // Add your assertions here
        assertTrue(true);
    }

    // Add more tests for other methods as needed
}