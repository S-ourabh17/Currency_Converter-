import gui.MainFrame;
import services.ConverterService;

public class Main {
    public static void main(String[] args) {
        new ConverterService().start();  // multithreading example
        new MainFrame();                // launch GUI
    }
}
