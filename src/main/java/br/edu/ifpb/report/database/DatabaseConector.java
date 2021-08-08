package br.edu.ifpb.report.database;

public interface DatabaseConnector {

	  public void openConnection();
	  public void runQuery(String query);

}