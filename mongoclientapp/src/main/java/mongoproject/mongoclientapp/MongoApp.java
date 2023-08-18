package mongoproject.mongoclientapp;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.conversions.Bson;
public class MongoApp {
	
	MongoClient client;
	MongoDatabase db;
	MongoCollection<Document> collection;
	public static final String COLLECTION_NAME="employee_collection";
	public MongoApp()
	{
		try {
		client=new MongoClient("localhost",27017);
		db=client.getDatabase("payroll");
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
		
		
}
	
	public void createCollection()
	{
		try
		{
			db.createCollection(COLLECTION_NAME);
		}
		catch(Exception e)
		{
			System.out.println(e);	
			}
	}
	
	public void getCollection()
	{
		collection=db.getCollection(COLLECTION_NAME);
		
		
	}
	public void addToCollection(String employeeName,String  department)
	{
		Document doc=new Document();
		doc.put("employename", employeeName);
		doc.put("department", department);
		collection.insertOne(doc);
		
	}
	
	public void viewDocumnets()
	{
		FindIterable<Document> iterable=collection.find();
		for(Document d:iterable)
		{
			System.out.println(d);
		}
		
	}
	
	public void UpdateDocuments()
	{
		Document query=new Document().append("employeename", "Sam");
		try
		{
			Bson updates=Updates.combine(Updates.set("department", "Marketing"));
			UpdateResult updateresult =collection.updateOne(query, updates);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}