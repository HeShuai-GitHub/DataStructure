package com.hs.structure.stack;

/**
 * @author heshuai
 * @title: Stack
 * @description: 栈抽象方法
 * @date 2021年08月02日 19:55
 */
public interface Stack {
    /**
     * 清空栈
     */
    public void clearStack();

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty();

    /**
     * 获得栈顶元素
     * @return
     */
    public int getTop();

    /**
     * 将元素压栈
     * @param e
     */
    public void push(int e);

    /**
     * 将栈顶元素返回并且删除
     * @return
     */
    public int pop();

    /**
     * 返回栈的长度
     * @return
     */
    public int length();

}
