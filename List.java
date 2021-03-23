import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        //创建并初始化顺序表
        myList List = new myList();
        List.InitList();
        List.add(1,10);
        List.add(1,20);
        List.add(1,30);
        List.add(1,60);
        List.disPlay();
        List.changePos(2,100);
        List.disPlay();
        List.getData(3);
        List.deletePos(3);
        List.disPlay();
        int ret = List.findData(60);
        System.out.println(ret);
        List.findData(120);
    }
}

class myList {
    public int[] elem;//数组
    public int usedSize;//当前使用长度
    public final int intCapacity = 10;//初始容量
    public void InitList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
        System.out.println("顺序表创建完成");
    }
    //判断数组容量是否已满isFull()
    private boolean isFull() {
        if(this.usedSize == intCapacity) {
            return true;
        }
        return false;
    }
    //判断pos位置是否合法
    private boolean checkPos(int pos) {
        if(pos < 0 || pos > usedSize + 1) {
            return false;
        }
        return true;
    }
    //插入元素
    public void add(int pos, int data) {
        if(isFull()) {
            //扩容
            this.elem = Arrays.copyOf(this.elem,2*usedSize);
            System.out.println("扩容完成");
        }
        //判断输入的插入位置pos是否合法
        if(!checkPos(pos)) {
            System.out.println("输入的插入位置不合法");
            return;
        }
        //元素后移
        for(int i = usedSize - 1;i >= pos - 1;i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos - 1] = data;
        this.usedSize++;
    }
    //打印顺序表
    public void disPlay() {
        for(int i = 0;i < usedSize;i++) {
            System.out.print(" " + this.elem[i]);
        }
        System.out.println();
        System.out.println("打印完成");
    }
    //获取 pos 位置的元素
    public int getData(int pos) {
        //判断pos位置是否合法
        if(!checkPos(pos)) {
            System.out.println("输入位置不存在元素");
            return -1;
        }
        return this.elem[pos-1];
    }
    //改变pos位置的元素
    public void changePos(int pos,int data) {
        //判断pos位置是否合法
        if(!checkPos(pos)) {
            System.out.println("输入位置不存在元素");
            return;
        }
        this.elem[pos-1] = data;
        System.out.println("改变完成");
    }
    //删除pos位置的元素
    public void deletePos(int pos) {
        //判断pos位置是否合法
        if(!checkPos(pos)) {
            System.out.println("输入位置不存在元素");
            return;
        }
        for(int i = pos - 1;i < usedSize - 1;i++) {
            this.elem[i] = this.elem[i+1];
            usedSize--;
            System.out.println("删除完成");
        }
    }
    //找data，并输出其位置
    public int findData(int data) {
        for(int i = 0;i < usedSize;i++) {
            if(this.elem[i] == data) {
                return i+1;
            }
        }
        System.out.println("找不到该元素");
        return -1;
    }
}

