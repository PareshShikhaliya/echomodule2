package org.example.class8;

class Grandparent {
    static {
        System.out.println("Class Grandparent is loaded");
    }
}

class ParentCls extends Grandparent {
    static {
        System.out.println("Class ParentCls is loaded");
    }
}

class ChildCls extends ParentCls {
    static {
        System.out.println("Class ChildCls is loaded");
    }
}

class Grandchild extends ChildCls {
    static {
        System.out.println("Class Grandchild is loaded");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Grandchild grandchild = new Grandchild();
    }
}
