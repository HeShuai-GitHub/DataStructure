package com.hs.structure.list.linkedStorage.singleCircular;

import com.hs.structure.list.List;
import com.hs.structure.list.linkedStorage.list.LinkedStructure;

/**
 * @author heshuai
 * @title: SequenceListManager
 * @description: 线性表链式存储结构的一般处理方法
 * @date 2021年07月30日 22:30
 */
public class SingularCircularLinkedList implements List {

    private SingularCircularLinkedStruture head;

    private int length;

    private SingularCircularLinkedList() {
        head = new SingularCircularLinkedStruture();
        length = 0;
    }

    /**
     * 初始化
     * @return
     */
    public static SingularCircularLinkedList initList() {
        return new SingularCircularLinkedList();
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
        head = new SingularCircularLinkedStruture();
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
        SingularCircularLinkedStruture node = head.next;
        int i = 0;
        while (null != node) {
            if (node.data == e) return i;
            node = node.next;
            i++;
        }
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
        SingularCircularLinkedStruture node = getNode(index - 1);
        SingularCircularLinkedStruture node_new = new SingularCircularLinkedStruture();
        node_new.data = e;
        node_new.next = node.next;
        node.next = node_new;
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
        SingularCircularLinkedStruture last = getNode(index - 1);
        int data_del = last.next.data;
        last.next = last.next.next;
        length--;
        return data_del;
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
        SingularCircularLinkedStruture node = head.next;
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
     * 获取指定索引下节点
     * @param index
     * @return
     */
    private SingularCircularLinkedStruture getNode(int index) {
        if (index == -1) return head;
        SingularCircularLinkedStruture next = head.next;
        int n = 0;
        while (head != next) {
            if (n == index) return next;
            next = next.next;
            n++;
        }
        return head;
    }
}
