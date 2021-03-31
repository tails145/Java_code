class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkList3 {
    Node head = null;
    public void addFirst(int data, Node head) {
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    }

    public void disPlay(Node head) {
        if(head == null) {
            throw new RuntimeException("单链表为空");
        }
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void addLast(int data, Node head) {
        Node node = new Node(data);
        //第一次插入
        if(head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //反转链表
    public Node reverse(Node head) {
        Node newHead = null;
        Node cur = head.next;
        head.next = null;
        Node curNext = cur;
        while(cur != null) {
            curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return newHead;
    }

    public Node getMid(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //判断链表是否为回文结构
    public boolean check(Node head) {
        if(head == null) {
            throw new RuntimeException("链表为空");
        }
        Node before = head;
        //走到中间的节点
        Node mid = getMid(head);
        //从中间节点开始把后面的链表反转,此时behind在链表尾
        Node behind = reverse(mid);
        //头 尾 一起走
        while(before != null && before.next != null) {
            if(before.data != behind.data) {
                return false;
            }
            before = before.next;
            behind = behind.next;
        }
        return true;
    }

    //判断链表是否有环
    public boolean checkAnnular(Node head) {
        if(head == null) {
            return false;
        }
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast.data == slow.data) {
                return true;
            }
        }
        return false;
    }

    //返回链表的环的起点，若没有环，则返回null
    public Node getOrigin(Node head) {
        if(checkAnnular(head) == false) {
            return null;
        }
        //找到相遇的节点，从该节点和头同时开始走，相遇的节点就是环的起点
        Node fast = head;
        Node slow = head;
        Node cur = null;
        Node tmp = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast.data == slow.data) {
                cur = fast;
            }
        }
        while(tmp != cur) {
            tmp = tmp.next;
            cur = cur.next;
        }
        return tmp;
    }
}
