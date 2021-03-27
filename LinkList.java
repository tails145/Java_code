class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkList {
    public Node head;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        //第一次插入
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //打印单链表
    public void display() {
        if (head == null) {
            System.out.println("链表为空");
            return;
        }
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        //第一次插入
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node tmp = this.head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    //查找是否含关键词key在单链表当中
    public boolean contains(int key) {
        Node tmp = this.head;
        while (tmp != null) {
            if (tmp.data == key) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    //得到单链表的长度
    public int size() {
        int size = 0;
        Node tmp = this.head;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }
        return size;
    }

    //任意位置插入，第一个下标为0
    public void addIndex(int data, int num) {
        if (num < 0 || num > (this.size())) {
            throw new RuntimeException("输入位置不合法");
        }
        Node node = new Node(data);
        if (num == 0) {
            node.next = this.head;
            this.head = node;
            return;
        }
        Node tmp = this.head;
        for (int i = 0; i < num - 1; i++) {
            tmp = tmp.next;
        }
        node.next = tmp.next;
        tmp.next = node;
    }

    //删除第一次出现key的节点
    public void remove(int key) {
        if (head == null) {
            throw new RuntimeException("链表中不存在节点！");
        }
        //key在第一个节点时
        if (this.head.data == key) {
            if (this.head.next != null) {
                this.head = this.head.next;
                return;
            }
        }
        Node tmp1 = this.head;
        Node tmp = this.head.next;
        while (tmp != null) {
            if (tmp.data == key) {
                tmp1.next = tmp.next;
                return;
            }
            tmp1 = tmp1.next;
            tmp = tmp.next;
        }
    }

    //删除所有出现key的节点
    public void removeAll(int key) {
        if (head == null) {
            throw new RuntimeException("链表中不存在节点！");
        }
        //key在第一个节点时
        while (this.head.data == key) {
            this.head = this.head.next;
            if (head == null) {
                return;
            }
        }
        Node tmp1 = this.head;
        Node tmp = this.head.next;
        while (tmp != null) {
            if (tmp.data == key) {
                //删除时进行的处理
                tmp1.next = tmp.next;
            } else {
                //无需删除时进行的处理
                tmp1 = tmp1.next;
            }
            tmp = tmp.next;
        }
    }
}
