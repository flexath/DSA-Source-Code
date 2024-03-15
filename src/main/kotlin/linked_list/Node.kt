package linked_list

data class Node(
    var data: Int,
    var next: Node? = null,
    var prev: Node? = null
)