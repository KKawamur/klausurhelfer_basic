package FunktionHandler;

import java.util.Objects;

public class FunktionTree {
    private FunktionTree leftChild = null;
    private FunktionTree rightChild = null;
//    private double value;
    private String input;



    public FunktionTree(String string){
        input = string;
    }

    public FunktionTree(String string, FunktionTree leftChild, FunktionTree rightChild){
        input = string;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }


    public void addNode(String string){
        switch (string){
            case "+","-":{
                if(leftChild == null) {
                    leftChild = new FunktionTree(this.input);
                } else {
                    leftChild = new FunktionTree(this.input,leftChild,rightChild);
                    rightChild = null;
                }
                input = string;
                break;
            }
            case "*","/":{
                if(leftChild == null) {
                    leftChild = new FunktionTree(this.input);
                    input = string;
                } else if(Objects.equals(input, "*") || Objects.equals(input, "/")){
                    FunktionTree tmpTree = new FunktionTree(input,leftChild,rightChild);
                    input = string;
                    rightChild = null;
                    leftChild = tmpTree;
                } else if (rightChild != null){
                    FunktionTree tmpTree = rightChild;
                    rightChild = new FunktionTree(string,tmpTree,null);
                }
                break;
            }
            default:{
                if(leftChild == null) {
                    leftChild = new FunktionTree(string);
                }
                else if (rightChild == null) {
                    rightChild = new FunktionTree(string);
                }
                else
                    rightChild.addNode(string);
            }
        }
    }

    public void print(){
        if(leftChild != null){
            leftChild.print();
        }
        System.out.print(input);
        if(rightChild!=null){
            rightChild.print();
        }
    }

    public static void main(String [] args){
        FunktionTree root = new FunktionTree("2");
        root.addNode("/");
        root.addNode("5");
        root.addNode("+");
        root.addNode("3");
        root.addNode("*");
        root.addNode("4");
        root.addNode("/");
        root.addNode("6");



        root.print();
    }
}
