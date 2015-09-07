package example;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

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
            final PrinterJob job = PrinterJob.getPrinterJob();
            job.setPageable(new PDFPageable(doc));
            job.print();
        }
    }
}
