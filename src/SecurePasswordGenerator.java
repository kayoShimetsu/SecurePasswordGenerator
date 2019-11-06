import java.awt.EventQueue;

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
