package br.edu.ifpb.report.controller;

public abstract class ReportTemplate {

    public void generate() {
        this.createDatabaseConnection();
        this.executeDatabase();
        this.convert();
    }
    abstract void createDatabaseConnection();
    abstract void executeDatabase();
    abstract void convert();
}