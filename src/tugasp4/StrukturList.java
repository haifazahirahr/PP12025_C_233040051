package tugasp4;

public class StrukturList {
	private Node head;
	 {
	        this.head = null;
	    }
	    public boolean isEmpty() {
	    	return head == null;
	    }
	    
	    public void addTail (double data) {
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
	    public void addHead(double data) {
	    	Node newNode = new Node(data);
	    	if (isEmpty()) {
	    		head = newNode;
	    	}
	    	else {
	    		newNode.setNext(head);
	    		head = newNode;
	    	}
	    }
	    public void addMid (double data, double position) {
			Node posNode = null, curNode;
			double i=0;
			
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


