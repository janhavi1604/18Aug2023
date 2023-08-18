package mongoproject.MongoCasestudy;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	mongoprac obj=new mongoprac();
        //obj.createCollection();
       obj.getCollection();
       //obj.addToCollection(1,1,1,56,25);
       //obj.addToCollection(2,2,2,25,30);
       obj.UpdateDocuments();
       obj.viewDocumnets();
    }
}
