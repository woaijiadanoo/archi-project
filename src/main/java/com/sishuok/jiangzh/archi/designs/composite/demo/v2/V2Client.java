package com.sishuok.jiangzh.archi.designs.composite.demo.v2;

public class V2Client {

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
        V2Component root = new V2Composite("服装");
        V2Component c1 = new V2Composite("男装");
        V2Component c2 = new V2Composite("女装");

        V2Component l1 = new V2Leaf("衬衫");
        V2Component l2 = new V2Leaf("牛仔裤");
        V2Component l3 = new V2Leaf("吊带裙");
        V2Component l4 = new V2Leaf("眼镜");

        // 维护树状结构图
        root.addChild(c1);
        root.addChild(c2);

        c1.addChild(l1);
        c1.addChild(l2);
        c2.addChild(l3);
        c2.addChild(l4);

        // 从根节点开始打印输出
        root.printStruct("");

    }

}
