package manager.food.assignment.entity;

public class Food {
    private int id;
    private String name;
    private String category;
    private String description;
    private String thumbnail;
    private double price;
    private String sdate;
    private String fdate;
    private String status;


    public Food() {
    }

    public Food(int id, String name, String category, String description, String thumbnail, double price, String sdate, String fdate, String status) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.thumbnail = thumbnail;
        this.price = price;
        this.sdate = sdate;
        this.fdate = fdate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getFdate() {
        return fdate;
    }

    public void setFdate(String fdate) {
        this.fdate = fdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
