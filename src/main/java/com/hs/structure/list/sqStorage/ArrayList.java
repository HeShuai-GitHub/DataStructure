package com.hs.structure.list.sqStorage;

import com.hs.structure.list.List;

import java.util.Arrays;

/**
 * @author heshuai
 * @title: SequenceListManager
 * @description: 线性表顺序存储结构的一般处理方法
 * @date 2021年07月30日 22:30
 */
public class ArrayList implements List {

    // 线性表数据集
    private int data[];
    // 线性表长度
    private int length;
    
    private ArrayList(){
        init();
    }
    
    /**
     * 初始化
     * @return
     */
    public static   ArrayList initList(){
        return new ArrayList();
    }

    /**
     * 是否为空
     * @return
     */
    @Override
    public  boolean listEmpty(){
        if (length == 0)
            return true;
        return false;
    }

    /**
     * 清空线性表
     */
    @Override
    public  void clearList(){
        init();
    }

    /**
     * 获得元素
     * @param index
     * @return
     */
    @Override
    public  int getElem(int index){
        return data[index];
    }

    /**
     * 返回元素所在线性表中的坐标
     * @param e -1，未在线程表中查询到该元素；
     * @return
     */
    @Override
    public  int locateElem(int e){
        for (int i = 0; i < length; i++) {
            if (data[i] == e)
                return i;
        }
        return -1;
    }

    /**
     * 在特定位置插入一个元素，支持简单的动态扩容
     * @param index 插入下标以0开始
     * @param e
     * @return 成功返回插入的元素，失败返回-1
     */
    @Override
    public  int listInsert(int index, int e){
        dynamicCapacity();
        if (index <= length){
            for (int i = length - 1; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = e;
            length++;
            return data[index];
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
        int delElem = data[index];
        for (int i = index; i < length - 1; i++) {
            data[i] = data[i + 1];
        }
        data[length - 1] = 0;
        length--;
        dynamicCapacity();
        return delElem;
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
        return Arrays.toString(data);
    }

    private void init() {
        length = 0;
        data = new int[16];
    }

    /**
     * 动态调整数组大小，若线性表的length达到数组空间上限，则扩容一倍；
     * 若线性表的length达到数组的容量的四分之一，则释放一半的数组空间
     */
    private  void dynamicCapacity() {
        // 扩容
        if (length == data.length) {
            int[] data_old = data;
            // 对数组空间进行扩容
            int[] data_new = new int[data.length * 2];
            // 只需要对线性表的有效长度copy到新数组中即可
            for (int i = 0; i < length; i++) {
                data_new[i] = data_old[i];
            }
            data = data_new;
        }
        // 释放
        if (data.length != 16 && length == data.length/4) {
            int[] data_old = data;
            // 对数组空间进行释放
            int[] data_new = new int[data.length / 2];
            // 只需要对线性表的有效长度copy到新数组中即可
            for (int i = 0; i < length; i++) {
                data_new[i] = data_old[i];
            }
            data = data_new;
        }
    }

}
