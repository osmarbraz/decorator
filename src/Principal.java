
import com.decorator.CompressionDecorator;
import com.decorator.DataSource;
import com.decorator.DataSourceDecorator;
import com.decorator.EncryptionDecorator;
import com.decorator.FileDataSource;

public class Principal {

    public static void main(String[] args) {
        String salaryRecords = "Nome,Salario\nJohn Smith,100000\nSteven Jobs,912000";
        
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Entrada ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Codificado -------------");
        System.out.println(plain.readData());
        System.out.println("- Decodificado -----------");
        System.out.println(encoded.readData());
    }
}
