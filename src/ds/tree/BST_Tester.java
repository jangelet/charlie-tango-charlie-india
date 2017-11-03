package trees.refbased;

public class BST_Tester {

	public static void main(String[] args) {
		BinarySearchTree <Person, String> bst = new BinarySearchTree<Person, String>();
		
		Person [] people = new Person[10];
		String [] names = {"John","Zack", "Jack","Kobe","Steve", "Marie", "Jessica", "Danaya"};
		
		for(int i=0; i<people.length; i++){
			String id = "IDA1"+i+i+i;
			int age = (int)(Math.random() * 100);
			String fn = names[i % names.length];
			people[i] = new Person(id,age,fn);
			System.out.println(people[i]);
			//then we can insert... 
			bst.insert(people[i]);
		}

		System.out.println("FOUND IDA1111"+ bst.retrieve("IDA1111"));
		System.out.println("FOUND IDA1555"+ bst.retrieve("IDA1555"));

		System.out.println("FOUND IDA1955"+ bst.retrieve("IDA1955"));
		

	}

}
