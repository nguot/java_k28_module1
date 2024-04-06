package models;

public class Room {
    public int bedrooms;
    public int id;
    public int time;
    public int price;

    public void RoomPrint()
    {
        System.out.println("Số phòng :");
        System.out.println(this.id);
        System.out.println(" "+this.id+" số phòng ngủ :"+this.bedrooms);

        System.out.println(" "+this.id+" thời gian thuê :"+this.time);

        System.out.println(" "+this.id+" giá thuê :"+this.price);

    }
    public void setBedrooms(int bedrooms)
    {
        this.bedrooms = bedrooms;
    }
    public int getBedrooms()
    {
        return bedrooms;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }

    public void setTime(int time)
    {
        this.time = time;
    }
    public int getTime()
    {
        return time;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }
}
