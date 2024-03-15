package linked_list

class LinkedListStack {

    private var head: Node? = null

    fun push(data: Int) {
        val node = Node(data, null)

        if (head == null) {
            head = node
            return
        }
        node.next = head
        head = node
    }

    fun pop(): Int {
        if (isEmpty()) {
            return -1
        }
        val popValue = head?.data
        head = head?.next
        return popValue!!
    }

    fun isEmpty(): Boolean {
        return head == null
    }

    fun peek(): Int {
        return head?.data!!
    }

    fun traverse() {
        var temp = head
        while (temp != null) {
            print("${temp.data} ,")
            temp = temp.next
        }
    }
}