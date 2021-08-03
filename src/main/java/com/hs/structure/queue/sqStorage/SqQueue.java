package com.hs.structure.queue.sqStorage;

import com.hs.structure.queue.Queue;

/**
 * @author heshuai
 * @title: SqQueue
 * @description: 顺序存储循环队列
 * @date 2021年08月02日 22:28
 */
public class SqQueue implements Queue {

    private int[] data;
    // 队列头的位置
    private int front;
    // 队列尾，即下一个可插入的位置
    private int rear;

    public SqQueue() {
        this.data = new int[16];
        init();
    }

    @Override
    public void clear() {
        this.init();
    }

    @Override
    public boolean isEmpty() {
        return this.length() == 0;
    }

    @Override
    public int getHead() {
        if (this.isEmpty()) throw new ArrayIndexOutOfBoundsException("stack Out of Boundary...");
        return this.data[this.front];
    }

    @Override
    public void enQueue(int e) {
        if (this.data.length == this.length()) throw new ArrayIndexOutOfBoundsException("stack Out of Boundary...");
        this.data[this.rear] = e;
        this.rear = getNextIndex(this.rear);
    }

    @Override
    public int Dequeue() {
        if (this.isEmpty()) throw new ArrayIndexOutOfBoundsException("stack Out of Boundary...");
        int data_del = this.data[this.front];
        this.front = this.getNextIndex(this.front);
        return data_del;
    }

    @Override
    public int length() {
        return (this.data.length - this.front + this.rear) % this.data.length;
    }

    private int getNextIndex(int i) {
        return (i + 1) % data.length;
    }


    private void init() {
        this.front = 0;
        this.rear = 0;
    }
}
