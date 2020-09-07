package com.sishuok.jiangzh.archi.designs.composite.demo.v1;

public class V1CompositeClient {

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
        V1Composite root = new V1Composite("服装");
        V1Composite c1 = new V1Composite("男装");
        V1Composite c2 = new V1Composite("女装");

        V1Leaf l1 = new V1Leaf("衬衫");
        V1Leaf l2 = new V1Leaf("牛仔裤");
        V1Leaf l3 = new V1Leaf("吊带裙");
        V1Leaf l4 = new V1Leaf("眼镜");

        // 维护树状结构图
        root.addChildComposite(c1);
        root.addChildComposite(c2);

        c1.addChildLeaf(l1);
        c1.addChildLeaf(l2);
        c2.addChildLeaf(l3);
        c2.addChildLeaf(l4);

        // 从根节点开始打印输出
        root.printStruct("");

    }

}
