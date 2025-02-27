package tugasp4;

public class tugas2b {
	public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addHead(3.4);
        list.addMid(2.1, 3);
        list.addMid(1.1, 4);
        list.addTail(4.5);
        list.addTail(5.5);

        System.out.println("Element:");
        list.displayElement(); 
    }
}
