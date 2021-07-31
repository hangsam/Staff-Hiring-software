public class FullTimeStaffHire extends StaffHire {
    
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    // Constructor with five parameters
    public FullTimeStaffHire(int vacancyNumber,String designation, String jobType, int salary, int workingHour) 
    {
        super(designation, jobType, vacancyNumber);
        this.salary=salary;
        this.workingHour=workingHour;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined=false;
    }
    
    //Getter method for salary
    public int getSalary()
    { 
        return salary;
    }
    
    //Getter method for workingHour
    public int getWorkingHour()
    {
        return workingHour;
    }
    
    //Getter method for staffName
    public String getStaffName()
    {
        return staffName;
    }
    
    //Getter method for joiningDate
    public String getJoiningDate()
    {
        return joiningDate;
    }
    
    //Getter method for qualification
    public String getQualification()
    { 
        return qualification;
    }
    
    //Getter method for appointedBy
    public String getAppointedBy()
    {
        return appointedBy;
    }
    
    //Getter method for joined
    public boolean getJoined()
    {
        return false;
    }
    
    //Setter Method for variable 'salary'
    public void setSalary(int newSalary)
    {
        if (joined==false) {
        this.salary=newSalary;
        
    }
    else
    {
        System.out.println("Staff is already joined. Salary can't be change");
    }
    }
    
    //Setter method for workingHour
    public void setWorkingHour(int newWorkingHour)
    {
        this.workingHour = newWorkingHour;
    }
    
    //Setter method for staffName
    public void setStaffName(String staffName)
    {
        this.staffName =staffName;
    }
    
    //Setter method for joiningDate    
    public void setJoiningDate(String joiningDate)
    {
        this.joiningDate = joiningDate;
    }
    
    //Setter method for qualification
    public void setQualification(String qualification)
    {
       this.qualification = qualification;
    }
    
    //Setter method for appointedBy
    public void setAppointedBy(String appointedBy)
    {
        this.appointedBy = appointedBy;
    }
    
    //Setter method for joined
    // a method to appoint fulltimestaffhire
    public void appointFullTimeStaffHire(String staffName,String joiningDate,String qualification,String appointedBy)
    {
        if (joined==false)
        {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.workingHour=workingHour;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
        }
        else
        {
           System.out.println("you have been joined Mr./Mrs."+getStaffName());
           System.out.println("you joindDate"+getJoiningDate());
        }
    }
    
    //this is a display() method overrided from super class
    //this method displays the variables with suitable anotations
    public void display()
    {
        super.display();
        if (joined==true){
            System.out.println("StaffName is"+staffName);
            System.out.println("Salary is" +salary);
            System.out.println("Working hour is" +workingHour);
            System.out.println("Qualification is" +qualification);
            System.out.println("AppointedBy is" +appointedBy);
            System.out.println("Joining date is" +joiningDate);
        }
    }
}
            
 

    
 
        
        
    