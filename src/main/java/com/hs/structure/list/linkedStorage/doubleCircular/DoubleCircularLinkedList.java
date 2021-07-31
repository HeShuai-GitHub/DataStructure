package com.hs.structure.list.linkedStorage.doubleCircular;

import com.hs.structure.list.List;

/**
 * @author heshuai
 * @title: SequenceListManager
 * @description: 双向链表的一般处理方法
 * @date 2021年07月30日 22:30
 */
public class DoubleCircularLinkedList implements List {
    
    private DoubleCircularLinkedStructure head;

    private int length;

    private DoubleCircularLinkedList() {
        head = new DoubleCircularLinkedStructure();
        length = 0;
    }

    /**
     * 初始化
     * @return
     */
    public static DoubleCircularLinkedList initList() {
        return new DoubleCircularLinkedList();
    }

    /**
     * 是否为空
     * @return
     */
    @Override
    public  boolean listEmpty() {
        if (length == 0)
            return true;
        return false;
    }

    /**
     * 清空线性表
     */
    @Override
    public  void clearList() {
        head = new DoubleCircularLinkedStructure();
        length = 0;
    }

    /**
     * 获得元素
     * @param index 以0开始
     * @return
     */
    @Override
    public  int getElem(int index) {
        if (index >= length)
            return -1;
        return getNode(index).data;
    }

    /**
     * 返回元素所在线性表中的坐标
     * @param e -1，未在线程表中查询到该元素；
     * @return
     */
    @Override
    public  int locateElem(int e) {
        DoubleCircularLinkedStructure node_next = head.next;
        DoubleCircularLinkedStructure node_last = head.last;
        int n = 0;
        int l = length - 1;
        while (node_next != node_last) {
            if (node_next.data == e) return n;
            if (node_last.data == e) return l;
            node_next = node_next.next;
            node_last = node_last.last;
            n++;
            l--;
        }
        if (node_next.data == e) return n;
        return -1;
    }

    /**
     * 在特定位置插入一个元素
     * @param index 插入下标以0开始
     * @param e
     * @return 成功返回插入的元素，失败返回-1
     */
    @Override
    public  int listInsert(int index, int e){
        if (index > length)
            return -1;
        DoubleCircularLinkedStructure current;
        if (index == length) {
            current = head;
        } else {
            current = getNode(index);
        }
        DoubleCircularLinkedStructure node_last  = current.last;
        DoubleCircularLinkedStructure node_new = new DoubleCircularLinkedStructure();
        node_new.data = e;
        // 前插法
        current.last = node_new;
        node_new.next = current;
        node_last.next = node_new;
        node_new.last = node_last;
        length++;
        return e;
    }

    /**
     * 删除某个元素，返回删除的元素
     * @param index
     * @return 删除的元素
     */
    @Override
    public  int listDelete(int index) {
        if (index >= length)
            return -1;
        DoubleCircularLinkedStructure current = getNode(index);
        current.last.next = current.next;
        current.next.last = current.last;
        length--;
        return current.data;
    }

    /**
     * 返回线性表的长度
     * @return
     */
    @Override
    public  int listLength() {
        return length;
    }

    @Override
    public String toString() {
        StringBuilder ts = new StringBuilder("[");
        DoubleCircularLinkedStructure node = head.next;
        while (head != node) {
            ts.append(node.data + ",");
            node = node.next;
        }
        if (ts.length() == 1){
            ts.append("]");
        }else {
            ts.replace(ts.length() - 1, ts.length(), "]");
        }
        return ts.toString();
    }

    /**
     * 获得指定坐标的元素
     * @param index
     * @return
     */
    private DoubleCircularLinkedStructure getNode(int index) {
        boolean isHeadSear = index < length / 2;
        DoubleCircularLinkedStructure node;
        if (isHeadSear) {
            node = head.next;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = head.last;
            for (int i = length - 1; i > index; i--) {
                node = node.last;
            }
        }
        return node;
    }
}
