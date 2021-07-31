package com.hs.structure.list.linkedStorage.singleCircular;


/**
 * @author heshuai
 * @title: SingularCircularLinkedStruture
 * @description: 单循环链表结构
 * @date 2021年07月31日 19:18
 */
public class SingularCircularLinkedStruture {

    // 数据
    protected int data;
    // 下个节点
    protected SingularCircularLinkedStruture next;

    protected SingularCircularLinkedStruture() {
        this.next = this;
        this.data = 0;
    }
}
