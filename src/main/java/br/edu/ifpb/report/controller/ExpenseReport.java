package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends ReportTemplate{

    private PostgreSQLDatabaseConnector connector = new PostgreSQLDatabaseConnector();

    //O método generate será realocado para o template

    //Métodos sobrescritos
    @Override
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    @Override
    public void executeDatabase() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.runQuery(query);
    }
    @Override
    public void convert() {
        System.out.println("Converting To XLS...");
    }

}
