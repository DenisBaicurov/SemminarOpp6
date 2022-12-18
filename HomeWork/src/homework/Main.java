public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister persister = new Persister(user);
		NameOutput nameOutput=new NameOutput(user);
           nameOutput.report();
           persister.save();

	}
}