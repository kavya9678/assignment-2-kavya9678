/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
import problem1.mybst.MyBinarySearchTree;
public class MyMain {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(100);
        bst.insert(30);
        bst.insert(45);
        bst.insert(15);
        bst.insert(17);
        bst.insert(15);
        bst.insert(10);
        bst.insert(5);
        bst.diaplay(bst.getRoot(), bst.getMlevel());
        bst.d2();

}
