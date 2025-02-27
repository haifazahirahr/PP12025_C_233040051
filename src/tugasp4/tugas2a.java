package tugasp4;


public class tugas2a {
	public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addHead(2.1);
        list.addMid(3.4,5);
        list.addTail(4.5);

        System.out.println("Element:");
        list.displayElement(); 
    }

}
