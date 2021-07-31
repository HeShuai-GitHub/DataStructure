package com.hs.structure.list.linkedStorage.doubleCircular;


/**
 * @author heshuai
 * @title: CircularLinkedStructure
 * @description: 双向循环链表
 * @date 2021年07月31日 17:56
 */
public class DoubleCircularLinkedStructure {

    // 数据
    protected int data;
    // 下个节点
    protected DoubleCircularLinkedStructure next;
    // 上个节点
    protected DoubleCircularLinkedStructure last;

    protected DoubleCircularLinkedStructure() {
        data = 0;
        next = this;
        last = this;
    }

}
