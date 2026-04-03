import com.devtiro.dependency.injection.services.RedPrinter;

public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "red";
    }
}
