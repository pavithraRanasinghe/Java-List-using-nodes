class Node{
	int data;
	Node next;
	public Node(int data){this.data=data;}	
}
class List{
	Node front;
	public void add(int data){
		Node node = new Node(data);
		if(front == null){
			front = node;
		}else{
			Node temp = front;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	public void remove(){
		Node temp = front;
		while(temp != null){
			if(temp.next.next == null){
				temp.next = null;
			}
			temp = temp.next;
		}
	}

	public void printList(){
			Node temp=front;
			System.out.print("[");
			while(temp!=null){
				System.out.print(temp.data+", ");
				temp=temp.next;
			}
			System.out.println("\b\b]");		
	}

	 public  void remove(int index){  
        Node currNode = front;
        Node prev = null; 
        if (index == 0 && currNode != null) { 
            front = currNode.next; // Changed head 
  
		} 
		int counter = 0; 
		while (currNode != null) { 
  
            if (counter == index) { 
                prev.next = currNode.next; 
                break; 
            } 
            else { 
                prev = currNode; 
                currNode = currNode.next; 
                counter++; 
            } 
        } 
    }
}



class Demo{
	public static void main(String args[]){
		List list=new List();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.printList(); //[10,20,30,40,50]
		
		//list.remove();
		//list.printList(); //[10,20,30,40]
		
		list.remove(2); //public void remove(int index)
		list.printList(); //[10,20,40]
		
		/*list.add(2,300); //public void add(int index, int data)
		list.printList(); //[10,20,300,40]
		
		list.add(new int[]{1,2,3});//public void add(int[] dataArray);
		list.printList(); //[10,20,300,40,1,2,3]
		
		list.add(3,new int[]{400,500,600});//public void add(int index,int[] dataArray);
		list.printList(); //[10,20,300,400,500,600,40,1,2,3]
		
		list.remove(2,5); //public void remove(int startIndex, int endIndex);
		list.printList(); //[10,20,40,1,2,3]
		
		list.addFirst(11);
		list.printList(); //[11,10,20,40,1,2,3]
		
		list.addLast(99);
		list.printList(); //[11,10,20,40,1,2,3,99]
		
		list.removeFirst();
		list.printList(); //[10,20,40,1,2,3,99]
		
		list.removeLast();
		list.printList(); //[10,20,40,1,2,3]*/
	}
}
