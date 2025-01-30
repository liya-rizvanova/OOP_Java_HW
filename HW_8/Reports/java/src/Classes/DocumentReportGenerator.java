package Classes;

import Interfaces.JsonReportGenerator;
import Interfaces.XmlReportGenerator;

// Класс генерации отчетов по документам (поддерживает XML и JSON)
public class DocumentReportGenerator implements XmlReportGenerator, JsonReportGenerator {

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
