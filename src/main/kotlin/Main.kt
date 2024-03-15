import linked_list.LinkedListQueue


fun main(args: Array<String>) {
    val stack = LinkedListQueue()

    stack.enqueue(10)
    stack.enqueue(3)
    stack.enqueue(7)

    stack.traverse()

    stack.enqueue(2)
    println()
    stack.traverse()

    println()

    println(stack.dequeue())
    stack.traverse()
}