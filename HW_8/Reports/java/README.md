Этот код нарушает Принцип Разделения Интерфейсов (ISP) из SOLID.

public class AccountReportGenerator implements ReportGenerator {

    @Override
    public String generateXml() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String generateJson() {
        String report = "";
        // todo Logic
        return report;
    }
}
public class DocumentReportGenerator implements ReportGenerator {

    @Override
    public String generateXml() {
        String report = "";
        // todo Logic
        return report;
    }

    @Override
    public String generateJson() {
        String report = "";
        // todo Logic
        return report;
    }
}
public interface ReportGenerator {
    String generateXml();
    String generateJson();
}
