package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;

public abstract class ReportTemplate {

    abstract protected DatabaseConnector getConnector();
    protected DatabaseConnector connector;

    public void generate() {
        this.createDatabaseConnection();
        this.executeDatabase();
        this.convert();
    }
    abstract void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        this.connector = this.getConnector();
        connector.openConnection();
    }
    abstract void executeDatabase();
    abstract void convert();
}