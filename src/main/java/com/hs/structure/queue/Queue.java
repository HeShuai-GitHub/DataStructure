package com.hs.structure.queue;

/**
 * @author heshuai
 * @title: Queue
 * @description: 队列通用接口
 * @date 2021年08月02日 22:24
 */
public interface Queue {
    /**
     * 清空队列
     */
    public void clear();

    /**
     * 返回队列是否为空
     * @return
     */
    public boolean isEmpty();

    /**
     * 返回队列头
     * @return
     */
    public int getHead();

    /**
     * 进队列
     * @param e
     */
    public void enQueue(int e);

    /**
     * 出队列
     * @return
     */
    public int Dequeue();

    /**
     * 队列的长度
     * @return
     */
    public int length();
}
