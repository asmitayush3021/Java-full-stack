import com.devtiro.dependency.injection.services.GreenPrinter;

public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "green";
    }
}
