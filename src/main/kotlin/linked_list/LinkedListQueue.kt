package linked_list

class LinkedListQueue {

    private var front: Node? = null
    private var rear: Node? = null

    fun enqueue(data: Int) {
        val node = Node(data, null)

        if (front == null) {
            front = node
            rear = node
            return
        }
        rear?.next = node
        rear = node
    }

    fun dequeue(): Int {
        if (isEmpty()) {
            return -1
        }
        if(front == rear) {
            front = null
            rear = null
        }

        val dequeueValue = front
        front = front?.next
        return dequeueValue?.data!!
    }

    fun isEmpty(): Boolean {
        return front == null
    }

    fun front(): Int {
        return front?.data!!
    }

    fun traverse() {
        var temp = front
        while (temp != null) {
            print("${temp.data} ,")
            temp = temp.next
        }
    }
}