package auto;

/**
 * Created by nancy.nguyen on 6/18/2015.
 */


import java.io.File;
import java.util.logging.Logger;

public class LocalFileDetector implements FileDetector {
    private static final Logger log = Logger.getLogger(LocalFileDetector.class
            .getName());

    public File getLocalFile(CharSequence[] keys) {
        StringBuilder builder = new StringBuilder();
        for (CharSequence chars : keys) {
            builder.append(chars);
        }

        String filepath = builder.toString();

        if (filepath.isEmpty()) {
            return null;
        }

        File file = new File(filepath);

        File parentDir = file.getParentFile();
        if (parentDir == null) {
            parentDir = new File(".");
        }
        File toUpload = new File(parentDir, file.getName());

        log.fine(new StringBuilder().append("Detected local file: ")
                .append(toUpload.exists()).toString());

        return (((toUpload.exists()) && (toUpload.isFile())) ? toUpload : null);
    }

}
