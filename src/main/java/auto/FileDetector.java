package auto;

/**
 * Created by nancy.nguyen on 6/18/2015.
 */
import java.io.File;

public abstract interface FileDetector {
    public abstract File getLocalFile(CharSequence[] paramArrayOfCharSequence);
}