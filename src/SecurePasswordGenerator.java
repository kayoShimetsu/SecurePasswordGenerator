import java.awt.*;


/**
 * Main class to run application.
 *
 * @author IwonaD
 */

public class SecurePasswordGenerator {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });
    }
}
