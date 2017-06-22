package EstruturasDeDados.ListasVinculadas;

//classe pra representar um nó
class ListNode {
	
	Object data;
	ListNode nextNode; // acessado pela List

	ListNode(Object object) {
		this(object,null);
	}
	
	//cria object e referencia o próximo listNode.
	ListNode(Object object, ListNode node)
	{
		data = object;
		nextNode = node;
	}
	
	Object getObject(){
		return data;
	}
	
	ListNode getNext(){
		return nextNode;
	}

}
