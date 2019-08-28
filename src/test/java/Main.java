
import org.com.fisco.WePDRService;

public class Main {

    public static void main(String[] args){

        System.out.println("add: " + WePDRService.add(1, 2));
        System.out.println("hello: " + WePDRService.hello("World"));
        System.out.println("getPerson: " + WePDRService.getPerson("Alice", 12)); 
        
    }
}
