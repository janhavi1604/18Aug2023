package mongoproject.mongoclientapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MongoApp obj=new MongoApp();
        obj.createCollection();
       // obj.getCollection();
        //obj.addToCollection("Peter", "Sales");
        //obj.addToCollection("Sam", "Training");
        //obj.UpdateDocuments();
        obj.viewDocumnets();
    }
}
