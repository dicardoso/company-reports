package br.edu.ifpb;

import br.edu.ifpb.report.service.ReportService;
import br.edu.ifpb.report.contoller.ExpenseReport;
import br.edu.ifpb.report.contoller.TaxReport;

public class Main {

    public static void main(String[] args) {
        ReportService reportService = new ReportService();
        reportService.generateReport(new ExpenseReport());
        reportService.generateReport(new TaxReport());
    }

}
