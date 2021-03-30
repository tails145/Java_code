class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkList2 {
    public Node head;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        //第一次插入
        if (head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        //第一次插入
        if (head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //返回长度
    public int length(Node head) {
        if (head == null) {
            return 0;
        }
        Node cur = head;
        int length = 1;
        while (cur.next != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }

    //打印单链表
    public void disPlay(Node head) {
        //单链表为空时
        if (head == null) {
            System.out.println("单链表为空");
            return;
        }
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //返回中间节点
    public int getMid() {
        //单链表为空时
        if (this.head == null) {
            throw new RuntimeException("单链表为空");
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    //返回倒数第k个节点
    public int getBehind(int k) {
        //判断k的合法性
        if (k <= 0 || k > length(this.head)) {
            throw new RuntimeException("输入位置不合法");
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k - 1 != 0) {
            fast = fast.next;
            k--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }

    //以x为基准将链表分为两部分，所有小于x的节点排在大于或等于x的节点之前，且顺序不变
    public Node divide(int k) {
        //head1 存放小于k的节点
        Node head1 = null;
        Node cur1 = null;
        //head2 存放大于k的节点
        Node head2 = null;
        Node cur2 = null;
        Node cur = this.head;
        while (cur != null) {
            if (cur.data < k) {
                //第一次插入
                if (head1 == null) {
                    head1 = cur;
                    cur1 = cur;
                } else {
                    cur1.next = cur;
                    cur1 = cur1.next;
                }
            }
            if (cur.data >= k) {
                //第一次插入
                if (head2 == null) {
                    head2 = cur;
                    cur2 = cur;
                } else {
                    cur2.next = cur;
                    cur2 = cur2.next;
                }
            }
            cur = cur.next;
        }
        //head1为空，直接返回head2
        if (head1 == null) {
            return head2;
        }
        //head1不为空，进行拼接
        cur1.next = head2;
        //cur2不为空，cur2.next需要置为空
        if (cur2 != null) {
            cur2.next = null;
        }
        return head1;
    }

    //排序的链表中，存在重复的节点，删除重复的节点，重复的节点不保留，返回头指针
    public Node deleteSame() {
        Node newHead = new Node(0);
        Node tmp = newHead;
        Node cur = this.head;
        while (cur != null) {
            if ((cur.next != null) && (cur.data == cur.next.data)) {
                while ((cur.next != null) && (cur.data == cur.next.data)) {
                    cur = cur.next;
                }
            } else {
                //第一次插入
                if (newHead.next == null) {
                    newHead.next = cur;
                }
                tmp.next = cur;
                tmp = tmp.next;
            }
            cur = cur.next;
        }
        //判断tmp.next是否为空，不为空则置为空
        if (tmp.next != null) {
            tmp.next = null;
        }
        return newHead.next;
    }

    //输入两个链表，找出他们的第一个公共节点
    public int findSame(Node head1, Node head2) {
        //先计算各自的长度，并使长的链表走到和短的一样的长度
        int i = 0;
        Node cur1 = head1;
        Node cur2 = head2;
        int length1 = this.length(head1);
        int length2 = this.length(head2);
        //head2 链表比head1 长
        if(length2 >= length1) {
            for(i=0;i < length2 - length1;i++) {
                cur2 = cur2.next;
            }
            // head1 链表比head2 长
        } else {
            for(i=0;i < length1 - length2;i++) {
                cur1 = cur1.next;
            }
        }
        //两个链表一起走，当他们的next相同时且不为null时，这个next就是公共节点的引用
        while(cur1 != null) {
            if(cur1.next == cur2.next && cur1.next != null) {
                return cur1.next.data;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        System.out.println("无公共节点");
        return -1;
    }
}


















