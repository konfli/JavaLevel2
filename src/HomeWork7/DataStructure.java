package HomeWork7;

public class DataStructure {
    public static void main(String[] args) {
        DirectionalList directionalList = new TwoDirectionalList();
        directionalList.add("val1");
        directionalList.add("val2");
        directionalList.add("val3");
        directionalList.add("val4");
        System.out.println(directionalList.size());

        TwoDirectionalList.Node first = (TwoDirectionalList.Node) directionalList.getFirst();

        System.out.println(first.getVal());
        System.out.println(first.getNext().getPrev().getVal());
        System.out.println(first.getNext().getVal());
        System.out.println(first.getNext().getNext().getVal());
        System.out.println(first.getNext().getNext().getNext().getVal());
        System.out.println(first.getNext().getNext().getNext().getNext());

        System.out.println("Removed? - " + directionalList.remove("val3"));
        System.out.println("Removed? - " + directionalList.remove("val6"));

        System.out.println(directionalList.size());
        System.out.println(first.getVal());
        System.out.println(first.getNext().getVal());
        System.out.println(first.getNext().getNext().getVal());

    }
}
