package unit19;

public class ComicBook extends Book {
    String characterName;
    public ComicBook(double regularPrice, String publisher, int yearPublished, String characterName) {
        super(regularPrice, publisher, yearPublished);
        this.characterName = characterName;
    }
    public double computeSalePrice() {
        return super.getRegularPrice() * 0.4;
    }
}