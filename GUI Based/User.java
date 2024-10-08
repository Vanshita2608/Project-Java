public class User {
    
    private String code[] = new String[5];
    private String date[] = new String[5];
    private String ship[] = new String[5];
    private String departure[] = new String[5];
    private String arrival[] = new String[5];
    private double price[] = new double[5];
    private int time[] = new int[5];
    private int seat[] = new int[5];

    // Users stuff
    private String username;
    private String phoneNum;    

    public User() {
        
        code[0]="Do717"; price[0]= 1500; seat[0]=60; date[0]= "12/12/21"; time[0]= 1700; ship[0]= "MH717"; departure[0]= "Mumbai"; arrival[0]= "Berlin";
        code[1]="Do766"; price[1]= 2100; seat[1]=60; date[1]= "12/12/21"; time[1]= 2100; ship[1]= "MH068"; departure[1]= "Mumbai"; arrival[1]= "Lisbon";
        code[2]="Do881"; price[2]= 3300; seat[2]=60; date[2]= "12/12/21"; time[2]= 2000; ship[2]= "MH118"; departure[2]= "Mumbai"; arrival[2]= "Moscow";
        code[3]="Do990"; price[3]= 2500; seat[3]=60; date[3]= "12/12/21"; time[3]= 1700; ship[3]= "MH881"; departure[3]= "Mumbai"; arrival[3]= "Tokyo";
        code[4]="Do321"; price[4]= 2400; seat[4]=60; date[4]= "12/12/21"; time[4]= 2100; ship[4]= "MH552"; departure[4]= "Mumbai"; arrival[4]= "Rio-de-Janeiro";
        
        // User Stuff
        username = "";
        phoneNum = "";
    }
    
    // User setter
    public void setData(String u, String pn) {
    
        username = u;
        phoneNum = pn;
    }
       
    // Flight 
    public int getKey(String code) {
        int key = 5;
        boolean val = false;
        String codes[] = getCode();
       
        if(code.equals("")) {
            val = false;
        } else {
            for(int x=0; x<5; x++) {
                if(codes[x].equalsIgnoreCase(code)) {
                    key = x;
                    val = false;
                    break;
                } else {
                    val=true;
                }
            }        
        }

        if(val) {
            key = 5;
        }
        
        return key;
    }
    
    public String getUsername() {
        
        return username;
    }
    
    public String getPhoneNum() {
        
        return phoneNum;
    }

    public String [] getCode()
    {   
        return code;
    }

    public String [] getDate()
    {
        return date;
    }

    public String [] getShip()
    {
        return ship;
    }
    
    public String [] getDeparture()
    {
        return departure;
    }
    
    public String [] getArrival()
    {
        return arrival;
    }
    
    public double [] getPrice()
    {
        return price;
    }
    
    public int [] getTime()
    {
        return time;
    }
    
    public int [] getSeat()
    {
        return seat;
    }
   
    public String toString() {
        
        String display = "";
        display = display + "<html><table style='border: 1px solid black'><tr><th>Code</th><th>Price (Rs)</th><th>Num Seat</th><th>Date</th><th>Time</th><th>Ship</th><th>Departure</th><th>Arrival</th></tr>";
        
        for(int x=0; x<5; x++) {
            display = display + "<tr><th>" + code[x] + "</th><th>" + price[x] + "</th><th>" + seat[x] + "</th><th>" + date[x] + "</th><th>" + time[x] + "</th><th>" + ship[x] + "</th><th>" + departure[x] + "</th><th>" + arrival[x] + "</th></tr>";
        }
        
        display = display + "</table></html>";
        return display;
    }
}