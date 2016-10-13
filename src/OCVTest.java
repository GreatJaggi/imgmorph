import org.opencv.core.Core;
import org.opencv.core.Mat;

/**
 * Created by jugs on 10/13/16.
 */
public class OCVTest {
    public static void main(String []args)  {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat mat = new Mat();
        System.out.println(mat);
    }
}
