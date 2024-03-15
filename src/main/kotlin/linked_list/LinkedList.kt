package linked_list

import java.lang.NullPointerException

class LinkedList {

    private var head: Node? = null

    fun insertAtLast(data: Int) {
        val node = Node(data, null)

        if (head == null) {
            head = node
            return
        }
        var temp = head
        while (temp?.next != null) {
            temp = temp.next
        }
        temp?.next = node
    }

    fun insertAtFirst(data: Int) {
        val node = Node(data, null)

        if (head == null) {
            head = node
            return
        }
        node.next = head
        head = node
    }

    fun insertAt(data: Int, position: Int) {
        val node = Node(data,null)

        if(position == 1) {
            node.next = head
            head = node
            return
        }

        var temp = head
        for(i in 0..<position-2) {
            temp = temp?.next
        }
        node.next = temp?.next
        temp?.next = node
    }

    fun deleteAt(position:Int) {
        if(position == 1) {
            head = head?.next
            return
        }

        var temp = head
        for(i in 0..<position-2) {
            temp = temp?.next
        }

        if (temp?.next == null) {
            throw NullPointerException()
        }

        temp.next = temp.next?.next
    }

    fun traverse() {
        var temp = head
        while (temp != null) {
            print("${temp.data} ,")
            temp = temp.next
        }
    }

    fun isEmpty(): Boolean {
        return head == null
    }
}