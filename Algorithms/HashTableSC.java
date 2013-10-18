import java.util.ArrayList;


public class HashTableSC {

	private int capacity;
	private ArrayList<String>[] bucket;
	private int size;


	public HashTableSC(int capacity){
		this.capacity = capacity;
		for(int i = 0; i< capacity; i++)
			bucket[i] = new ArrayList<String>();
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	// returns hash code for String s
	// hashing options: 0 - addHash, 1 - polynomialHash, anything else - BPHash
	private int hash (String s, int option){
		if (option == 0)
			return addHash(s);
		else if (option == 1) 
			return polynomialHash(s);
		else return BPHash(s);
	}
	
	private int addHash(String s){
		int h = 0;
		for (int i = 0; i < s.length(); i++) h += s.charAt(i);
		return h % capacity;
	}
	
	private int polynomialHash(String s){
		int h = 0;
		for (int i = 0; i < s.length(); i++) 
			h = h * 31 + 17 * s.charAt(i);
		return h % capacity;
	}
	
	private int BPHash (String s){
		int h = 0;
		for (int i = 0; i < s.length(); i++) 
			h = h<<7 ^ s.charAt(i);
		return h % capacity;
	}

	public void insert (String s, int option){
		int key = hash(s,option);
		if (bucket[key].contains(s))
			System.out.println("Object exists");
		else
			{bucket[key].add(s);
			size++;
			}
	}

	public boolean find(String s, int option){
		int key = hash(s,option);
		return bucket[key].contains(s);
	}
	
	public void remove(String s, int option){
		int key = hash(s, option);
		if (bucket[key].remove(s) != true) 
			System.out.println("Item does not exist.");
	}
		
}
