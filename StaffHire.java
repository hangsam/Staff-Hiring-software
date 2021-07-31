public class StaffHire{
    private String designation;
    private String jobType;
    private int vacancyNumber;
    
    //Constructor with 3 parameters for StaffHire class
    public StaffHire(String designation, String jobType, int vacancyNumber)
    {
        this.designation=designation;
        this.jobType=jobType;
        this.vacancyNumber=vacancyNumber;
    }
    
    //Getter method for designation
    public String getDesignation()
    {
        return designation;
    }
    
    //Setter method for designation
    public void setDesignation(String designation)
    {
        this.designation=designation;
    }
    
    //Getter method for jobtype
    public String getjobType()
    {
        return jobType;
    }
    
    //Setter method for jobtype
    public void getJobType(String jobType)
    {
        this.jobType=jobType;
    }
  
    //Getter method for vacancyNumber
    public int getVacancyNumber()
    {
        return vacancyNumber;
    }
    
    //Setter method for vacancyNumber
    public void  setVacancyNumber(int vacancyNumber)
    { 
       this.vacancyNumber=vacancyNumber;
    }
    
    //Display method for 3 variables
    public void display()
    {
        System.out.println("Designation:"+designation);
        System.out.println("JobType:"+jobType);
        System.out.println("Vacancy Number"+vacancyNumber);
    }
}

            
    
    
    

    