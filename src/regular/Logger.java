package regular;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class Logger {
    public static void writer(String message) throws IOException {
        Path path = Paths.get("Message.txt");
        try {
            Files.write(path,
                    message.getBytes(),
                    StandardOpenOption.APPEND,
                    StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new IOException("Не удалось записать в файл !", e);
        }
    }
}
