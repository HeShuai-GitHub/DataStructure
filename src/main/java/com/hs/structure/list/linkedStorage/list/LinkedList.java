package com.hs.structure.list.linkedStorage.list;

import com.hs.structure.list.List;

/**
 * @author heshuai
 * @title: SequenceListManager
 * @description: 线性表链式存储结构的一般处理方法
 * @date 2021年07月30日 22:30
 */
public class LinkedList implements List {
    
    private LinkedStructure head;

    private int length;

    private LinkedList() {
        head = new LinkedStructure();
        length = 0;
    }

    /**
     * 初始化
     * @return
     */
    public static LinkedList initList() {
        return new LinkedList();
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
        head = new LinkedStructure();
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
        LinkedStructure node = head.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

    /**
     * 返回元素所在线性表中的坐标
     * @param e -1，未在线程表中查询到该元素；
     * @return
     */
    @Override
    public  int locateElem(int e) {
        LinkedStructure node = head.next;
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
        LinkedStructure node = head;
        int i = -1;
        while (null != node){
            if (i == index - 1) {
                LinkedStructure node_new = new LinkedStructure();
                node_new.data = e;
                node_new.next = node.next;
                node.next = node_new;
                length++;
                return e;
            }
            node = node.next;
            i++;
        }
        return -1;
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
        LinkedStructure node = head;
        int i = -1;
        while (null != node) {
            if (i == index - 1) {
                int del_data = node.next.data;
                node.next = node.next.next;
                length--;
                return del_data;
            }
            node = node.next;
            i++;
        }
        return -1;
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
        LinkedStructure node = head.next;
        while (null != node) {
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
}
