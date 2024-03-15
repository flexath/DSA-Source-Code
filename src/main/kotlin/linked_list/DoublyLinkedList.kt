package linked_list

class DoublyLinkedList {

    private var head: Node? = null

    fun insertAtFirst(data: Int) {
        val node = Node(data, null, null)
        if (head == null) {
            head = node
            return
        }
        head?.prev = node
        node.next = head
        head = node
    }

    fun insertAtLast(data: Int) {
        val node = Node(data, null, null)
        if(head == null) {
            head = node
            return
        }

        var temp = head
        while (temp?.next != null) {
            temp = temp.next
        }

        temp?.next = node
        node.next = null
        node.prev = temp
    }

    fun traverse() {
        var temp = head
        while (temp != null) {
            print("${temp.data} ,")
            temp = temp.next
        }
    }

    fun reverse() {
        var temp = head
        while (temp?.next != null) {
            temp = temp.next
        }

        while(temp != null) {
            print("${temp.data} ,")
            temp = temp.prev
        }
    }

    fun isEmpty(): Boolean {
        return head == null
    }
}