public class Mountain {
    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private int size;
    private int cost;
    private String auxdata;

    public Mountain(String ID, String name, String type, String company, String location, int size, int cost, String auxdata) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.company = company;
        this.location = location;
        this.size = size;
        this.cost = cost;
        this.auxdata = auxdata;
    }

    public String info () {
        String str=name;
        str+=" is located in ";
        str+=location;
        str+=" and has a height of ";
        str+=Integer.toString(size);
        str+="m. ";
        return str;
    }
}