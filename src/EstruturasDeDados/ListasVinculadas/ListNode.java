package EstruturasDeDados.ListasVinculadas;

//classe pra representar um n�
class ListNode {
	
	Object data;
	ListNode nextNode; // acessado pela List

	ListNode(Object object) {
		this(object,null);
	}
	
	//cria object e referencia o pr�ximo listNode.
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
