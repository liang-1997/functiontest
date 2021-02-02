import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.platform.commons.logging.LoggerFactory;


import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        java.lang.String xx="123456";
        java.lang.String s = xx.replaceAll("1", "2");
        System.out.println(s);
    }
}