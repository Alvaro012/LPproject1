import org.junit.Before
import org.junit.Test

class PESELTest  {
    PESEL pesel;
    @Before
    public void setUp(){
        logger.info("Running test code");
        pesel = new PESEL();
    }
    @Test
    public void peselOperationTest(){

    }
    @Test
    public void WritePeselTest(){
       /* InputStream initialStream = new FileInputStream(new File("C:/Users/Alvaro/IdeaProjects/LPproject1/ReadFile.txt"));
        byte[] buffer = new byte[initialStream.available()];
        initialStream.read(buffer);
        File targetFile = new File("C:/Users/Alvaro/IdeaProjects/LPproject1/WriteFile.txt");
        OutputStream outStream = new FileOutputStream(targetFile);
        outStream.write(buffer);
        */
        InputStream initialStream = new FileInputStream(new File("C:/Users/Alvaro/IdeaProjects/LPproject1/ReadFile.txt"));
        File targetFile = new File("C:/Users/Alvaro/IdeaProjects/LPproject1/WriteFile.txt");
        OutputStream outStream = new FileOutputStream(targetFile);
        pesel.writePesel();
        assertEquals(initialStream,targetFile);
    }
}
