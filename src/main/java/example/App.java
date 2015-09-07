package example;

import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

/**
 * Hello world!
 */
public class App
{
    public static void main(final String[] args) throws PrinterException, IOException
    {
        System.out.println("file name: " + args[0]);
        final File file = new File(args[0]);
        try (final PDDocument doc = PDDocument.load(file)) {
            doc.print();
        }
    }
}
