package pertemuan2;

public class tes4b {
public static void main(String[] args) {
		
		// Membuat urutan Node
		Node n1 = new Node (2);
		Node n2 = new Node (3);
		Node n3 = new Node (5);
		Node n4 = new Node (7);
		Node n5 = new Node (9);
		
		// Membuat relasi urutan Node
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		
		// Menampilkan Node 
		Node p = n1;
		while(p != null)
		{
			System.out.printf("%d", p.getNilai());
			p = p.getNext();
		}

	}
}
