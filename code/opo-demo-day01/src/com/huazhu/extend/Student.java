package com.huazhu.extend;

public class Student extends people {
    /**
     * ����̳и���
     * ������Ҫnew
     */
    public void WriteName(){
        System.out.println("�ҵ�������" + this.getName() + ",�ҽ���" + this.getAge() + "����" + this.getSex() + "��");
    }

}
