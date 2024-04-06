package models;

public class User {
    public String user_name;
    public String password;
    public int id;

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId() {return id;}

    public void setUserName(String user_name)
    {
        this.user_name = user_name;
    }
    public String getUserName()
    {
        return user_name;
    }

    public void setPassword(String password)
    {
        this.user_name = password;
    }
    public String getPassword()
    {
        return password;
    }
}
