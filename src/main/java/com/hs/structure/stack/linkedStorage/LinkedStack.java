package com.hs.structure.stack.linkedStorage;

import com.hs.structure.list.linkedStorage.list.LinkedStructure;
import com.hs.structure.stack.Stack;

/**
 * @author heshuai
 * @title: LinkedStack
 * @description: 链式存储实现栈，头插法
 * @date 2021年08月02日 21:08
 */
public class LinkedStack implements Stack {

    private StackStructure top;

    private int length;

    public LinkedStack() {
        init();
    }

    private void init() {
        length = 0;
        top = null;
    }

    @Override
    public void clearStack() {
        init();
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public int getTop() {
        return top.data;
    }

    /**
     * 头插法
     * @param e
     */
    @Override
    public void push(int e) {
        StackStructure element = new StackStructure();
        element.data = e;
        element.next = top;
        top = element;
        length++;
    }

    @Override
    public int pop() {
        int data = top.data;
        top = top.next;
        length--;
        return data;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public String toString() {
        StringBuilder ts = new StringBuilder("[");
        StackStructure node = top;
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
