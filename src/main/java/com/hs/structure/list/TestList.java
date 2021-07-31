package com.hs.structure.list;


import com.hs.structure.list.linkedStorage.doubleCircular.DoubleCircularLinkedList;
import com.hs.structure.list.linkedStorage.list.LinkedList;
import com.hs.structure.list.linkedStorage.singleCircular.SingularCircularLinkedList;
import com.hs.structure.list.linkedStorage.singleCircular.SingularCircularLinkedStruture;
import com.hs.structure.list.sqStorage.ArrayList;
import org.junit.Test;

/**
 * @author heshuai
 * @title: Test
 * @description: 双向链表和单向链表的区别
 *              单向链表，在插入和删除指定坐标元素时，最好是遍历到指定坐标前一个的位置，使用后插、后删法，这是因为单向链表本身是没有last指针的；
 *              双向链表，可以直接遍历到指定坐标的位置，使用什么方法都可以。在遍历时可以使用二分法。
 * @date 2021年07月31日 10:43
 */
public class TestList {

    /**
     * SingularCircularListTest
     */
    @Test
    public void SingularCircularListTest() {
        List linkedList = SingularCircularLinkedList.initList();
        System.out.println(linkedList.listEmpty());
        for (int i = 0; i < 50; i++) {
            linkedList.listInsert(i, linkedList.listLength());
        }
        System.out.println(linkedList);
        System.out.println(linkedList.listEmpty());
        System.out.println(linkedList.listLength());
        System.out.println(linkedList.getElem(16));
        System.out.println(linkedList.locateElem(10));
        System.out.println(linkedList.listDelete(10));
        System.out.println(linkedList.listLength());
        System.out.println(linkedList);
        for (int i = 0; i < 40; i++) {
            linkedList.listDelete(linkedList.listLength() - 1);
        }
        System.out.println(linkedList);
        linkedList.clearList();
        System.out.println(linkedList);
    }
    /**
     * DoubleCircularListTest
     */
    @Test
    public void DoubleCircularListTest() {
        List linkedList = DoubleCircularLinkedList.initList();
        System.out.println(linkedList.listEmpty());
        for (int i = 0; i < 50; i++) {
            linkedList.listInsert(i, linkedList.listLength());
        }
        System.out.println(linkedList);
        System.out.println(linkedList.listEmpty());
        System.out.println(linkedList.listLength());
        System.out.println(linkedList.getElem(16));
        System.out.println(linkedList.locateElem(10));
        System.out.println(linkedList.listDelete(10));
        System.out.println(linkedList.listLength());
        System.out.println(linkedList);
        for (int i = 0; i < 40; i++) {
            linkedList.listDelete(linkedList.listLength() - 1);
        }
        System.out.println(linkedList);
        linkedList.clearList();
        System.out.println(linkedList);
    }
    /**
     * LinkedList
     */
    @Test
    public void arrayListTest() {
        List linkedList = ArrayList.initList();
        System.out.println(linkedList.listEmpty());
        for (int i = 0; i < 50; i++) {
            linkedList.listInsert(i, linkedList.listLength());
        }
        System.out.println(linkedList);
        System.out.println(linkedList.listEmpty());
        System.out.println(linkedList.listLength());
        System.out.println(linkedList.getElem(16));
        System.out.println(linkedList.locateElem(10));
        System.out.println(linkedList.listDelete(10));
        System.out.println(linkedList.listLength());
        System.out.println(linkedList);
        for (int i = 0; i < 40; i++) {
            linkedList.listDelete(linkedList.listLength() - 1);
        }
        System.out.println(linkedList);
        linkedList.clearList();
        System.out.println(linkedList);
    }

    /**
     * LinkedList
     */
    @Test
    public void linkedListTest() {
        List linkedList = LinkedList.initList();
        System.out.println(linkedList.listEmpty());
        for (int i = 0; i < 50; i++) {
            linkedList.listInsert(i, linkedList.listLength());
        }
        System.out.println(linkedList);
        System.out.println(linkedList.listEmpty());
        System.out.println(linkedList.listLength());
        System.out.println(linkedList.getElem(16));
        System.out.println(linkedList.locateElem(10));
        System.out.println(linkedList.listDelete(10));
        System.out.println(linkedList.listLength());
        System.out.println(linkedList);
        for (int i = 0; i < 40; i++) {
            linkedList.listDelete(linkedList.listLength() - 1);
        }
        System.out.println(linkedList);
        linkedList.clearList();
        System.out.println(linkedList);
    }
}
