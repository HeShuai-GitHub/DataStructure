package com.hs.structure.list;

import com.hs.structure.list.linkedStorage.list.LinkedList;
import com.hs.structure.list.linkedStorage.list.LinkedStructure;

/**
 * @author heshuai
 * @title: List
 * @description: 线性表标准接口
 * @date 2021年07月31日 14:23
 */
public interface List {
    /**
     * 是否为空
     * @return
     */
    public  boolean listEmpty();

    /**
     * 清空线性表
     */
    public  void clearList();

    /**
     * 获得元素
     * @param index 以0开始
     * @return
     */
    public  int getElem(int index);

    /**
     * 返回元素所在线性表中的坐标
     * @param e -1，未在线程表中查询到该元素；
     * @return
     */
    public  int locateElem(int e);

    /**
     * 在特定位置插入一个元素
     * @param index 插入下标以0开始
     * @param e
     * @return 成功返回插入的元素，失败返回-1
     */
    public  int listInsert(int index, int e);

    /**
     * 删除某个元素，返回删除的元素
     * @param index
     * @return 删除的元素
     */
    public  int listDelete(int index);

    /**
     * 返回线性表的长度
     * @return
     */
    public  int listLength();
}
