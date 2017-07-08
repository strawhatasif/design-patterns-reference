package creational.builder.improved;

public class Client {

	public static void main(String[] args){
		
		// setup the director
		QueryBuildDirector director = new QueryBuildDirector();
		String from="client table";
		String where="client name = ...";

		//start building a SQL query
		QueryBuilder builder = new SqlQueryBuilder();
		Query query = director.buildQuery(from, where, builder);

		query.execute();

		builder = new MongoDbQueryBuilder();
		query = director.buildQuery(from, where, builder);

		query.execute();
	}
	
}
