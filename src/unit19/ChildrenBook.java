package unit19;

public class ChildrenBook extends Book{
    int age;
    public ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {
        super(regularPrice, publisher, yearPublished);
        this.age = age;
    }
    public double computeSalePrice() {
        return super.getRegularPrice() * 0.3;
    }
}