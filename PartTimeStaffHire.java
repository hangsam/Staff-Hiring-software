public class PartTimeStaffHire extends StaffHire {
    private int workingHour;
    private int wagesPerHour; // hours per day;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts; // Morning, Day, evening working shifts
    private boolean joined;
    private boolean terminated;
    
     //Constructor with 6 parameters
    public PartTimeStaffHire(int vacancyNumber,String designation , String jobType , int workingHour, int wagesPerHour , String shifts )
    {
            super(designation,jobType, vacancyNumber);
            this.workingHour = workingHour;
            this.wagesPerHour = wagesPerHour;
            this.shifts= shifts;
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joined = false;
            this.terminated = false;
    }
     
    //Getter method for workingHour
    public int getWokingHour()
    {
        return workingHour;
    }
    
    //Setter method for workingHour
    public void  setWorkingHour(int workingHour)
    { 
        this.workingHour=workingHour;
    }
    
    //Getter method for wagesPerHour
    public int getWagesPerHour()
    {
        return wagesPerHour;
    }
    
    //Setter method for wagesPerHour
    public void  setWagesPerHour(int wagesPerHour)
    { 
       this.wagesPerHour=wagesPerHour;
    }
    
    //Getter method for staffName
    public String getStaffName()
    {
        return staffName;
    }
    
    //Setter method for staffName
    public void  setStaffName(String staffName)
    { 
       this.staffName=staffName;
    }
    
    //Getter method for joiningDate
    public String getJoiningDate()
    {
        return joiningDate;
    }
    
    //Setter method for joiningDate
    public void  setJoiningDate(String joiningDate)
    { 
       this.joiningDate=joiningDate;
    }
    
    //Getter method for qualification
    public String getQualification()
    {
        return qualification;
    }
    
    //Setter method for qualification
    public void  setQualification(String qualification)
    { 
       this.qualification=qualification;
    }
    
    //Getter method for appointedBy
    public String getAppointedBy()
    {
        return appointedBy;
    }
    
    //Setter method for appointedBy
    public void  setAppointedBy(String appointedBy)
    { 
       this.appointedBy=appointedBy;
    }
    
    //Getter method for shifts
    public String getShifts()
    {
        return shifts;
    }
    
    //Getter method for joined
    public boolean getJoined()
    {
        return joined;
    }
    
    //Setter method for joined
    public void  setJoined(boolean joined)
    { 
       this.joined= joined;
    }
    
    //Getter method for terminated
    public boolean getTerminated()
    {
        return terminated;
    }
    
    //This is a method for knowing shifts of staffs
    public void setShifts(String newShifts)
    {
       if(joined==false)
       {
            this.shifts=newShifts;
       }
        else
       {
            System.out.println("StaffName"+staffName);
       }
    }
    
    
    //This is a method to hire the staff containing 4 parameters.
    //This method is used to hire newFullTimestaff 
    public void appointPartTimeStaffHire(String staffName, String joiningDate,String qualification,String appointedBy)
    {  
        if(joined ==true){
            System.out.println("He/She is already joined" + getStaffName()+ "in the Date: "+ getJoiningDate());
            
        
        }else{
            //if staff is not joined
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            terminated=false;
            joined=true;
        }  
    }
    
    //This is the method to terminate the staff.
    public void terminate()
    {
        if(terminated==true){
            System.out.println("It seems that staff is already terminated");
        }else{
            //if staff is not terminated
            this.staffName="";
            this.qualification="";
            this.joiningDate="";
            this.appointedBy="";
            this.terminated=true;
            this.joined=false;
        }
    }
    
    //this is a display() method overrided from super class StaffHire
    //Display method of 'PartTimestaff' Class
    public void display()
    {
       super.display();
       if(joined==true)
       {
          
           System.out.println("StaffName:"+staffName);
           System.out.println("WagesPerHour:"+wagesPerHour);
           System.out.println("WorkingHour:"+workingHour);
           System.out.println("JoiningDate:"+joiningDate);
           System.out.println("Qualification:"+qualification);
           System.out.println("AppointedBy:"+appointedBy);
           System.out.println("Shifts:"+shifts);
           System.out.println("IncomePerDay:"+workingHour * wagesPerHour);
        }
    }
}

           

     
     
        
   
  
    


    
   