package models;

public class Customer {
    public String name;
    public int id;
    public Room customer_room;

    public void CustomerPrint()
    {
        System.out.println("ID khách hàng:");
        System.out.println(this.id);
        System.out.println(" "+this.id+" Họ và tên :"+this.name);

        System.out.println(" "+this.id+" Số phòng thuê :"+this.customer_room.id);
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void setCustomerRoom(Room customer_room)
    {
        this.customer_room = customer_room;
    }
    public Room getCustomerRoom()
    {
        return customer_room;
    }
}


//customer_service => findbyId => updateById(id,room) => deleteById
//room_service => findById => updateById => deleteById => maxById => minById