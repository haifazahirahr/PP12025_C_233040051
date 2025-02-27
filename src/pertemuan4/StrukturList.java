package pertemuan4;

public class StrukturList {
	private Node head;

    public StrukturList() {
        this.head = null;
    }
    public boolean isEmpty() {
    	return head == null;
    }
    
    public void addTail (int data) {
    	Node posNode=null, curNode=null;
    	Node newNode = new Node(data);
    	
    	 if (isEmpty()) {
             head = newNode;
    	 }
    	 else {
    		 curNode = head;
    		 while (curNode != null) {
    			 posNode = curNode; 
    			 curNode = curNode.getNext();
    		 }
    		 posNode.setNext(newNode);
    	 }
    }
    public void displayElement() {
    	Node curNode = head;
    	while (curNode != null) {
    		System.out.print(curNode.getData()+ " ");
    		curNode = curNode.getNext();
    	}
    }
    public void addHead(int data) {
    	Node newNode = new Node(data);
    	if (isEmpty()) {
    		head = newNode;
    	}
    	else {
    		newNode.setNext(head);
    		head = newNode;
    	}
    }
    public void addMid (int data, int position) {
		Node posNode = null, curNode;
		int i=0;
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else{
			curNode = head;
			if(position == 1) {
				newNode.setNext(curNode);
				head = newNode;
			}else {
				i = 1;
			}while (curNode != null && i<position) {
				posNode = curNode;
				curNode = curNode.getNext();
				i++;
			}
			posNode.setNext(newNode);
			newNode.setNext(curNode);
			}
	}
}



