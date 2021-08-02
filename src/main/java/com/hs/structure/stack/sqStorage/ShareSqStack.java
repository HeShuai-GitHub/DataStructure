package com.hs.structure.stack.sqStorage;

import com.hs.structure.stack.Stack;

import java.util.Arrays;

/**
 * @author heshuai
 * @title: ShareSqStack
 * @description: 两栈同享空间
 * @date 2021年08月02日 21:20
 */
public class ShareSqStack{

    private int[] data;

    private Integer top1;

    private Integer top2;

    public ShareSqStack(int length) {
        data = new int[length];
        top1 = -1;
        top2 = length;
    }

    public void clearStack(int flag) {
        if (flag == 1) {
            top1 = -1;
        }else {
            top2 = data.length;
        }
    }

    public boolean isEmpty(int flag) {
        return length(flag) == 0;
    }

    public int getTop(int flag) {
        if (flag == 1) {
            if (top1 == -1) throw new ArrayIndexOutOfBoundsException("stack Out of Boundary...");
            return data[top1];
        }else {
            if (top2 == data.length) throw new ArrayIndexOutOfBoundsException("stack Out of Boundary...");
            return data[top2];
        }
    }

    public void push(int flag, int e) {
        if (top1 == top2 - 1)
            throw new ArrayIndexOutOfBoundsException("stack full...");
        if (flag == 1) {
            data[++top1] = e;
        }else {
            data[--top2] = e;
        }
    }

    public int pop(int flag) {
        if (flag == 1) {
            if (top1 == -1) throw new ArrayIndexOutOfBoundsException("stack Out of Boundary...");
            return data[top1--];
        }else {
            if (top2 == data.length) throw new ArrayIndexOutOfBoundsException("stack Out of Boundary...");
            return data[top2++];
        }
    }

    public int length(int flag) {
        if (flag == 1) {
            return top1 + 1;
        }else {
            return data.length - top2;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
