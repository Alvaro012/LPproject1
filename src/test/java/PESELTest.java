import org.junit.Before;
import org.junit.Test;
import java.io.*;
import org.apache.log4j.Logger;
import static org.junit.Assert.*;

public class PESELTest {
    PESEL pesel;
    @Before
    public void setUp(){
        final Logger logger = Logger.getLogger(PESEL.class);
        logger.info("Running test code");
        pesel = new PESEL();
    }
    @Test
    public void peselOperationTest(){

    }
    @Test
    public void WritePeselTest() throws IOException {
        InputStream initialStream = new FileInputStream(new File("C:/Users/Alvaro/IdeaProjects/LPproject1/ReadFile.txt"));
        File targetFile = new File("C:/Users/Alvaro/IdeaProjects/LPproject1/WriteFile.txt");
        OutputStream outStream = new FileOutputStream(targetFile);
        pesel.writePesel();
        assertEquals(initialStream,targetFile);
    }
}