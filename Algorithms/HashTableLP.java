
public class HashTableLP {

	private int capacity;
	private String[] bucket;
	private int size;


	public HashTableLP(int capacity){
		this.capacity = capacity;
		bucket = new String[capacity];
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
		if (size == capacity)
			System.out.println("Memory full");
		else{
			int step = 0;
			while (bucket[(hash(s,option) + step) % capacity] != null)
				step++;
			bucket[hash(s,option) + step] = s;	
			size++;
			}
	}

	
	
	private int findPosition(String s, int option){
		if (this.isEmpty()) 
			return -1;
		else{
			for (int step = 0; step < capacity; step++)
				if (bucket[(hash(s,option) + step) % capacity].equals(s))
					return (hash(s,option) + step) % capacity;
			return -1;
		}
	}
	
	public boolean find(String s, int option){
		return findPosition(s, option) != -1;
	}
	
	public void remove(String s, int option){
		int position = findPosition(s, option);
		if (position == -1) 
			System.out.println("Item does not exist.");
		else {
			bucket[position] = null;
			size--;
		}
		
	}
	
	
	
	
}
