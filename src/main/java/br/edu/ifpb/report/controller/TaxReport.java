package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;
import br.edu.ifpb.report.database.DatabaseConnector;

public class TaxReport extends ReportTemplate{

    private MysqlDatabaseConnector connector = new MysqlDatabaseConnector();

    //Método generate() será realocado para o template
    //Método createDatabaseConnection() realocado para o template
    @Override
    protected DatabaseConnector getConnector() {
        //implementação do método abstrato
    	return new PostgreSQLDatabaseConnector();
    }

    @Override
    public void executeDatabase() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.executeQuery(query);
    }

    @Override
    public void convert() {
        System.out.println("Converting To PDF...");
    }
}
