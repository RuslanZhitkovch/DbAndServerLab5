public class Book
{
    private int id;
    private String title;
    private String author;
    private int price;
    private int amount;

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Book(int id, String title, String author, int price, int amount)
    {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.author = author;
        this.price = price;

    }

    public Book()
    {
    }

    public Book( String title, String author, int price, int amount)
    {

        this.title = title;
        this.amount = amount;
        this.author = author;
        this.price = price;

    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "| id: " + id
                + " | title: " + title
                + " | author: " + author
                + " | price: " + price
                + " | amount: " + amount
                + " |";

    }
}
