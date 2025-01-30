import Classes.AccountReportGenerator;
import Classes.DocumentReportGenerator;
import Interfaces.JsonReportGenerator;

// Класс Main для демонстрации работы
public class Main {
    public static void main(String[] args) {
        JsonReportGenerator accountReport = new AccountReportGenerator();
        System.out.println("Account Report (JSON): " + accountReport.generateJson());

        DocumentReportGenerator documentReport = new DocumentReportGenerator();
        System.out.println("Document Report (XML): " + documentReport.generateXml());
        System.out.println("Document Report (JSON): " + documentReport.generateJson());
    }
}
