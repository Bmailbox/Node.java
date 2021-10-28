import java.util.Vector;

public class Node {
    private String name;
    private double coordinate_x;
    private double coordinate_y;
    private String date;
    private String time;
    private boolean status;
   // private Firewall firewall;


    public Node(String node_name,double coor_x, double coor_y, String input_date, String input_time, boolean firewall_status)
    {
        name = node_name;
        coordinate_x = coor_x;
        coordinate_y = coor_y;
        date = input_date;
        time = input_time;
        status = firewall_status;
    }

    //getters
    public String getName() {return name;}
    public double getCoordinate_x() {return coordinate_x;}
    public double getCoordinate_y() {return coordinate_y;}
    public String getDate() {return date;}
    public String getTime() {return time;}
    public boolean getStatus() {return status;}
}
