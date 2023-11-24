package org.tpmaven;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class FirstPdfTest {

    @Test
    void testAddMetaData() throws IOException, DocumentException {

        // Call the addMetaData method
        Document document = new Document();
        FirstPdf.addMetaData(document);

        // Add your assertions here
        assertTrue(true);
    }

    // Add more tests for other methods as needed
}