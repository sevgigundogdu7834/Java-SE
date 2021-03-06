package _02_equals;

import java.util.Objects;

public class Tree {

    private int treeLength;
    private int treeAge;
    private String treeName;

    public Tree(int treeLength, int treeAge, String treeName) {
        this.treeLength = treeLength;
        this.treeAge = treeAge;
        this.treeName = treeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return treeLength == tree.treeLength &&
                treeAge == tree.treeAge &&
                Objects.equals(treeName, tree.treeName);
    }


    public int getTreeLength() {
        return treeLength;
    }

    public void setTreeLength(int treeLength) {
        this.treeLength = treeLength;
    }

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }




}
