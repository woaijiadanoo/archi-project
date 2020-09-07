package com.sishuok.jiangzh.archi.designs.composite.impl;

public class CompositeClient {

    public static void main(String[] args) {
        /*
            - 服装[树枝]
                - 男装[树枝]
                    - 衬衫[树叶]
                    - 牛仔裤[树叶]

                - 女装[树枝]
                    - 吊带裙[树叶]
                    - 眼镜[树叶]
         */

        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");

        Component l1 = new Leaf("衬衫");
        Component l2 = new Leaf("牛仔裤");
        Component l3 = new Leaf("吊带裙");
        Component l4 = new Leaf("眼镜");

        root.addChild(c1);
        root.addChild(c2);

        c1.addChild(l1);
        c1.addChild(l2);
        c2.addChild(l3);
        c2.addChild(l4);

    }

}
