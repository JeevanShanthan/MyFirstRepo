import java.util.HashSet;
import java.util.Set;
class Demo
{
	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>();
		hashset.add("A");
		hashset.add("B");
		boolean r1 = hashset.add("C");
		System.out.println(r1);
		boolean r2 = hashset.add("C");
		System.out.println(r2);
		System.out.println(hashset);
		System.out.println("set Contains C or not? : " + hashset.contains("C"));
		hashset.remove("A");
		System.out.println("Set removes after ? : " + hashset);
		for (String item : hashset) {
			System.out.println(item);
		}
	}
}