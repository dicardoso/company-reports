package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ReportTemplate;

public class ReportService {

    public void generateReport(ReportTemplate report) {
        // Remove condicionais não mais necessárias
        report.generate();
    }

}
