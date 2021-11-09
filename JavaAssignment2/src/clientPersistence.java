abstract class Persistence
{
	abstract void persist();
}
class FilePersistence extends Persistence
{
	void persist()
	{
		System.out.println("data is being saved in file");
	}
}
class DatabasePersistence extends Persistence
{
	void persist()
	{
		System.out.println("data is being saved in database");
	}
}

public class clientPersistence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FilePersistence f=new FilePersistence();
		DatabasePersistence d= new DatabasePersistence();
		f.persist();
		d.persist();
		
	}

}
