//importing required packages
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class INGNepal {
    
    //P==PartTimeStaffHire F==FullTimeStaffHire
    private JFrame frame;
    private JLabel lblP, lblF;
    private JLabel lblVacancyNumberP1,lblVacancyNumberP2, lblVacancyNumberF1, lblVacancyNumberF2, lblVacancyNumberT;
    private JLabel lblDesignationP, lblDesignationF;
    private JLabel lblJobTypeP, lblJobTypeF;
    private JLabel lblSalaryP, lblSalaryF;
    private JLabel lblWorkingHourP, lblWorkingHourF;
    private JLabel lblStaffNameP, lblStaffNameF;
    private JLabel lblQualificationP, lblQualificationF;
    private JLabel lblJoiningDateP, lblJoiningDateF;
    private JLabel lblAppointedByP, lblAppointedByF;
    private JLabel lblShiftsP;
    private JLabel lblWagesPerHourP;
    
    private JTextField txtfVacancyNumberP1, txtfVacancyNumberP2, txtfVacancyNumberF1, txtfVacancyNumberF2, txtfVacancyNumberT;
    private JTextField txtfDesignationP, txtfDesignationF;
    private JTextField txtfJobTypeP, txtfJobTypeF;
    private JTextField txtfSalaryP, txtfSalaryF;
    private JTextField txtfWorkingHourP, txtfWorkingHourF;
    private JTextField txtfStaffNameP, txtfStaffNameF;
    private JTextField txtfQualificationP,txtfQualificationF;
    private JTextField txtfJoiningDateP, txtfJoiningDateF;
    private JTextField txtfAppointedByP, txtfAppointedByF;
    private JTextField txtfShiftsP;
    private JTextField txtfWagesPerHourP;
    private JButton btnAddP, btnAddF;
    private JButton btnAppointP, btnAppointF;
    private JButton btnDisplayP, btnDisplayF;
    private JButton btnTerminate;
    private JButton btnClearP, btnClearF;
    
    
    ArrayList<StaffHire>staffList = new ArrayList<>();  //creating an arraylist of staff in staffHire arraylist
    
    public void setComponentsOfStaffHire(){
        
       frame = new JFrame("INGNepal");
       frame.setSize(820,820);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
        
       //Form for the FullTime Employee
       lblF = new JLabel ("For Full Time StaffHire");   
       lblF.setBounds(320,10,180,20);
       frame.getContentPane().add(lblF);
        
        
        //Attributes of FullTimeStaffHire with initializing of differnet Labels,TextFields and Buttons
       lblVacancyNumberF1 = new JLabel("Vacancy Number: ");
       lblVacancyNumberF1.setBounds(80,40,150,30);
       frame.getContentPane().add(lblVacancyNumberF1);
        
       txtfVacancyNumberF1 = new JTextField();
       txtfVacancyNumberF1.setBounds(200,40,150,30);
       frame.getContentPane().add(txtfVacancyNumberF1);
        
       lblDesignationF = new JLabel("Designation: ");
       lblDesignationF.setBounds(430,40,150,30);
       frame.getContentPane().add(lblDesignationF);
        
       txtfDesignationF = new JTextField();
       txtfDesignationF.setBounds(540,40,150,30);
       frame.getContentPane().add(txtfDesignationF);
        
       lblJobTypeF = new JLabel("JobType: ");
       lblJobTypeF.setBounds(80,80,150,30);
       frame.getContentPane().add(lblJobTypeF);
        
       txtfJobTypeF = new JTextField();
       txtfJobTypeF.setBounds(200,80,150,30);
       frame.getContentPane().add(txtfJobTypeF);
        
       lblWorkingHourF = new JLabel("WorkingHours: ");
       lblWorkingHourF.setBounds(430,80,150,30);
       frame.getContentPane().add(lblWorkingHourF);
        
       txtfWorkingHourF = new JTextField();
       txtfWorkingHourF.setBounds(540,80,150,30);
       frame.getContentPane().add(txtfWorkingHourF);
        
       lblSalaryF = new JLabel("Salary: ");
       lblSalaryF.setBounds(80,120,150,30);
       frame.getContentPane().add(lblSalaryF);
        
       txtfSalaryF = new JTextField();
       txtfSalaryF.setBounds(200,120,150,30);
       frame.getContentPane().add(txtfSalaryF);
       
       lblStaffNameF = new JLabel("Staff Name: ");
       lblStaffNameF.setBounds(80,160,150,30);
       frame.getContentPane().add(lblStaffNameF);
        
       txtfStaffNameF = new JTextField();
       txtfStaffNameF.setBounds(200,160,150,30);
       frame.getContentPane().add(txtfStaffNameF);
        
       lblJoiningDateF = new JLabel("Joining Date: ");
       lblJoiningDateF.setBounds(430,160,150,30);
       frame.getContentPane().add(lblJoiningDateF);
        
       txtfJoiningDateF = new JTextField();
       txtfJoiningDateF.setBounds(540,160,150,30);
       frame.getContentPane().add(txtfJoiningDateF);
        
       lblQualificationF = new JLabel("Qualification: ");
       lblQualificationF.setBounds(80,200,150,30);
       frame.getContentPane().add(lblQualificationF);
        
       txtfQualificationF = new JTextField();
       txtfQualificationF.setBounds(200,200,150,30);
       frame.getContentPane().add(txtfQualificationF);
        
       lblAppointedByF = new JLabel("Appointed By: ");
       lblAppointedByF.setBounds(430,200,150,30);
       frame.getContentPane().add(lblAppointedByF);
        
       txtfAppointedByF = new JTextField();
       txtfAppointedByF.setBounds(540,200,150,30);
       frame.getContentPane().add(txtfAppointedByF);
        
       lblVacancyNumberF2 = new JLabel("Vacancy Number: ");
       lblVacancyNumberF2.setBounds(80,240,150,30);
       frame.getContentPane().add(lblVacancyNumberF2);
       
       txtfVacancyNumberF2 = new JTextField();
       txtfVacancyNumberF2.setBounds(200,240,150,30);
       frame.getContentPane().add(txtfVacancyNumberF2);
       
       btnAddF = new JButton ("Add Vacancy");
       btnAddF.setBounds(540, 120, 150, 30);
       frame.getContentPane().add(btnAddF);
       btnAddF.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent fps) {  //Action is performed by using Action Listener
                addVacancyF();
            };
       });

       btnAppointF = new JButton("Appoint");
       btnAppointF.setBounds(540,240,150,30);
       frame.getContentPane().add(btnAppointF);
       btnAppointF.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent fps) { //Action is performed by using Action Listener
               appointF();
            };
       });
        
       btnDisplayF = new JButton("Display");
       btnDisplayF.setBounds(100,280,150,30);
       frame.getContentPane().add(btnDisplayF);
       btnDisplayF.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent fps) { //Action is performed by using Action Listener
               DisplayF();
            };
       });
        
       btnClearF = new JButton("Clear");
       btnClearF.setBounds(540,280,150,30);
       frame.getContentPane().add(btnClearF);
       btnClearF.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent fps) { //Action is performed by using Action Listener
               clearF();
            };
       });
        
     
       //Form for the PartTime Employee
       lblP = new JLabel ("For Part Time StaffHire");   
       lblP.setBounds(320,320,180,20);
       frame.getContentPane().add(lblP);
        
       //Attributes of PartTimeStaffHire with initializing of different Labels, TextField and Buttonns
       lblVacancyNumberP1 = new JLabel("Vacancy Number: ");
       lblVacancyNumberP1.setBounds(80,360,150,30);
       frame.getContentPane().add(lblVacancyNumberP1);
        
       txtfVacancyNumberP1 = new JTextField();
       txtfVacancyNumberP1.setBounds(200,360,150,30);
       frame.getContentPane().add(txtfVacancyNumberP1);
        
       lblDesignationP = new JLabel("Designation: ");
       lblDesignationP.setBounds(430,360,150,30);
       frame.getContentPane().add(lblDesignationP);
        
       txtfDesignationP = new JTextField();
       txtfDesignationP.setBounds(540,360,150,30);
       frame.getContentPane().add(txtfDesignationP);
        
       lblJobTypeP = new JLabel("JobType: ");
       lblJobTypeP.setBounds(80,400,150,30);
       frame.getContentPane().add(lblJobTypeP);
        
       txtfJobTypeP = new JTextField();
       txtfJobTypeP.setBounds(200,400,150,30);
       frame.getContentPane().add(txtfJobTypeP);
        
       lblWorkingHourP = new JLabel("WorkingHours: ");
       lblWorkingHourP.setBounds(430,400,150,30);
       frame.getContentPane().add(lblWorkingHourP);
        
       txtfWorkingHourP = new JTextField();
       txtfWorkingHourP.setBounds(540,400,150,30);
       frame.getContentPane().add(txtfWorkingHourP);
        
       lblSalaryP = new JLabel("Salary: ");
       lblSalaryP.setBounds(80,440,150,30);
       frame.getContentPane().add(lblSalaryP);
        
       txtfSalaryP = new JTextField();
       txtfSalaryP.setBounds(200,440,150,30);
       frame.getContentPane().add(txtfSalaryP);
        
       lblWagesPerHourP = new JLabel("Wages Per Hour: ");
       lblWagesPerHourP.setBounds(430,440,150,30);
       frame.getContentPane().add(lblWagesPerHourP);
        
       txtfWagesPerHourP = new JTextField();
       txtfWagesPerHourP.setBounds(540,440,150,30);
       frame.getContentPane().add(txtfWagesPerHourP);
        
       lblShiftsP = new JLabel("Working Shift: ");
       lblShiftsP.setBounds(80,480,150,30);
       frame.getContentPane().add(lblShiftsP);
        
       txtfShiftsP = new JTextField();
       txtfShiftsP.setBounds(200,480,150,30);
       frame.getContentPane().add(txtfShiftsP);
        
       lblVacancyNumberP2 = new JLabel("Vacancy Number: ");
       lblVacancyNumberP2.setBounds(80,520,150,30);
       frame.getContentPane().add(lblVacancyNumberP2);
        
       txtfVacancyNumberP2 = new JTextField();
       txtfVacancyNumberP2.setBounds(200,520,150,30);
       frame.getContentPane().add(txtfVacancyNumberP2);
        
       lblJoiningDateP = new JLabel("Joining Date: ");
       lblJoiningDateP.setBounds(430,520,150,30);
       frame.getContentPane().add(lblJoiningDateP);
        
       txtfJoiningDateP = new JTextField();
       txtfJoiningDateP.setBounds(540,520,150,30);
       frame.getContentPane().add(txtfJoiningDateP);
        
       lblQualificationP = new JLabel("Qualification: ");
       lblQualificationP.setBounds(80,560,150,30);
       frame.getContentPane().add(lblQualificationP);
        
       txtfQualificationP = new JTextField();
       txtfQualificationP.setBounds(200,560,150,30);
       frame.getContentPane().add(txtfQualificationP);
        
       lblAppointedByP = new JLabel("Appointed By: ");
       lblAppointedByP.setBounds(430,560,150,30);
       frame.getContentPane().add(lblAppointedByP);
        
       txtfAppointedByP = new JTextField();
       txtfAppointedByP.setBounds(540,560,150,30);
       frame.getContentPane().add(txtfAppointedByP);
        
       lblStaffNameP = new JLabel("StaffName: ");
       lblStaffNameP.setBounds(80,600,150,30);
       frame.getContentPane().add(lblStaffNameP);
       
       txtfStaffNameP = new JTextField();
       txtfStaffNameP.setBounds(200,600,150,30);
       frame.getContentPane().add(txtfStaffNameP);
       
       lblVacancyNumberT = new JLabel("Vacancy Number: ");
       lblVacancyNumberT.setBounds(430,600,150,30);
       frame.getContentPane().add(lblVacancyNumberT);
       
       txtfVacancyNumberT = new JTextField();
       txtfVacancyNumberT.setBounds(540,600,150,30);
       frame.getContentPane().add(txtfVacancyNumberT);
       
       btnAddP = new JButton ("Add Vacancy");
       btnAddP.setBounds(540, 480, 150, 30);
       frame.getContentPane().add(btnAddP);
       btnAddP.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent fps) { //Action is performed by using Action Listener
               addVacancyP();
            };
        });
       
       btnAppointP = new JButton("Appoint");
       btnAppointP.setBounds(440,640,100,30);
       frame.getContentPane().add(btnAppointP);
       btnAppointP.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent fps) { //Action is performed by using Action Listener
               appointP();
            };
       });
        
        btnTerminate = new JButton("Terminate");
        btnTerminate.setBounds(240, 640, 100, 30);
        frame.getContentPane().add(btnTerminate);
        btnTerminate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent fps) { //Action is performed by using Action Listener
                terminate();
            };
       });
        
       btnDisplayP = new JButton("Display");
       btnDisplayP.setBounds(110,640,100,30);
       frame.getContentPane().add(btnDisplayP);
       btnDisplayP.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent fps) { //Action is performed by using Action Listener
               DisplayP();
            };
       });
        
       btnClearP = new JButton("Clear");
       btnClearP.setBounds(580,640,100,30);
       frame.getContentPane().add(btnClearP);
       btnClearP.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent fps) { //Action is performed by using Action Listener
               clearP();
            };
       });

        frame.setLayout(null);
        frame.setVisible(true);
    }
        
    //Method for adding new FullTimeStaff vacancynumber
    public void addVacancyF() {
        int vacancyNumber, workingHour, salary;
        String designation, jobType;
        String VacancyNumber = txtfVacancyNumberF1.getText();
        String Salary = txtfSalaryF.getText();
        String WorkingHour = txtfWorkingHourF.getText();
        String Designation = txtfDesignationF.getText();
        String JobType = txtfJobTypeF.getText();
            
        if(VacancyNumber.trim().equals("") || Salary.trim().equals("") || WorkingHour.trim().equals("") || Designation.trim().equals("") || JobType.trim().equals("")){
            JOptionPane.showMessageDialog(frame, "Please!!!!Fill all the blank fields");
        } else{
            try{
                vacancyNumber = Integer.parseInt(VacancyNumber);
                salary = Integer.parseInt(Salary);
                workingHour = Integer.parseInt(WorkingHour);
                designation = Designation;
                jobType = JobType;
                }
                catch(NumberFormatException NOE){
                JOptionPane.showMessageDialog(frame, NOE.getMessage(), "Not acceptable value!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            for(StaffHire shl: staffList){
                if(shl instanceof FullTimeStaffHire){
                    FullTimeStaffHire fullTimeSH = (FullTimeStaffHire) shl;
                    if(fullTimeSH.getVacancyNumber() == vacancyNumber){
                        JOptionPane.showMessageDialog(frame, "This vacancy number is already exists");
                        return;
                    }
                }
            }
            
            FullTimeStaffHire fullTimeStaffObj = new FullTimeStaffHire(vacancyNumber, designation, jobType, salary, workingHour);
            staffList.add(fullTimeStaffObj);
            JOptionPane.showMessageDialog(frame, "Staff is successfully added!!!");
        }
    }
        
      //method for appoint button for fulltimestaffhire
    public void appointF(){
        int vacancyNumber;
        String staffName, joiningDate, appointedBy, qualification;
        String VacancyNumber = txtfVacancyNumberF2.getText();
        String StaffName = txtfStaffNameF.getText();
        String Qualification = txtfQualificationF.getText();
        String JoiningDate = txtfJoiningDateF.getText();
        String AppointedBy = txtfAppointedByF.getText();
        
        if(VacancyNumber.trim().equals("") || StaffName.trim().equals("") || JoiningDate.trim().equals("") || Qualification.trim().equals("") || AppointedBy.trim().equals("")){
            JOptionPane.showMessageDialog(frame, "Please!! Fill all the blank fields");
        } else{
            try{
                vacancyNumber = Integer.parseInt(VacancyNumber);
                qualification = Qualification;
                joiningDate = JoiningDate;
                appointedBy = AppointedBy;
                staffName = StaffName;
            } catch(NumberFormatException NOE){
                JOptionPane.showMessageDialog(frame, NOE.getMessage(), "Not acquired value!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            for(int i = 0; i < staffList.size(); ++i){
                StaffHire shl = staffList.get(i);
                if(shl instanceof FullTimeStaffHire){
                    FullTimeStaffHire fullTimeSH = (FullTimeStaffHire) shl;
                    if(fullTimeSH.getVacancyNumber() == vacancyNumber){
                        fullTimeSH.appointFullTimeStaffHire(staffName, joiningDate, qualification, appointedBy);
                        JOptionPane.showMessageDialog(frame, "Staff is appointed Sucessfully!!");
                        break;
                    } else{
                        JOptionPane.showMessageDialog(frame, "Not a Valid Vacancy Number!!");
                    }
                }
            }
        }
    }
    
    //method for clear button for fulltimestaffhire
    public void clearF(){
        txtfVacancyNumberF1.setText(null);
        txtfVacancyNumberF2.setText(null);
        txtfDesignationF.setText(null);
        txtfSalaryF.setText(null);
        txtfJoiningDateF.setText(null);
        txtfJobTypeF.setText(null);
        txtfQualificationF.setText(null);
        txtfAppointedByF.setText(null);
        txtfWorkingHourF.setText(null);
        txtfStaffNameF.setText(null);
        JOptionPane.showMessageDialog(frame, "Details cleared successfully!!");
    }
    
    //method for display button for fulltimestaffhire
    public void DisplayF(){
        for(StaffHire shl : staffList){
            if(shl instanceof FullTimeStaffHire){
                FullTimeStaffHire fullTimeSH = (FullTimeStaffHire) shl;
                System.out.println("Details are given below:");
                fullTimeSH.display();
            }
        }
    }
        
    //method for addVacancy button for parttimestaffhire
    public void addVacancyP(){
        int vacancyNumber, wagesPerHour, workingHour;
        String jobType, designation, shifts;
        String VacancyNumber = txtfVacancyNumberP1.getText();
        String WagesPerHour = txtfWagesPerHourP.getText();
        String Shifts = txtfShiftsP.getText();
        String WorkingHour = txtfWorkingHourP.getText();
        String JobType = txtfJobTypeP.getText();
        String Designation = txtfDesignationP.getText();
        
        if(VacancyNumber.trim().equals("") || JobType.trim().equals("") || Designation.trim().equals("") || WorkingHour.trim().equals("") || WagesPerHour.trim().equals("") || Shifts.trim().equals("")){
            JOptionPane.showMessageDialog(frame, "Please!!! Fill all the blank fields");
        } else{
            try{
                vacancyNumber = Integer.parseInt(VacancyNumber);
                wagesPerHour = Integer.parseInt(WagesPerHour);
                workingHour = Integer.parseInt(WorkingHour);
                designation = Designation;
                shifts = Shifts;
                jobType = JobType;
            } catch(NumberFormatException NOE){
                JOptionPane.showMessageDialog(frame, NOE.getMessage(), "Not acceptable value!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            for(StaffHire shl: staffList){
                if(shl instanceof PartTimeStaffHire){
                    PartTimeStaffHire partTimeSH = (PartTimeStaffHire) shl;
                    if(partTimeSH.getVacancyNumber() == vacancyNumber){
                        JOptionPane.showMessageDialog(frame, "This vacancy number is already exists");
                        return;
                    }
                }
            }
            
            PartTimeStaffHire partTimeStaffObj = new PartTimeStaffHire(vacancyNumber, designation, jobType, workingHour, wagesPerHour, shifts);
            staffList.add(partTimeStaffObj);
            JOptionPane.showMessageDialog(frame, "Staff is successfully added!!!");
        }
    }
    
    //method for appoint button for parttimestaffhire
    public void appointP(){
        int vacancyNumber;
        String staffName, joiningDate, qualification, appointedBy;
        String VacancyNumber = txtfVacancyNumberP2.getText();
        String JoiningDate = txtfJoiningDateP.getText();
        String Qualification = txtfQualificationP.getText();
        String StaffName = txtfStaffNameP.getText();
        String AppointedBy = txtfAppointedByP.getText();
        
        if(VacancyNumber.trim().equals("") || JoiningDate.trim().equals("") || Qualification.trim().equals("") || StaffName.trim().equals("") || AppointedBy.trim().equals("")){
            JOptionPane.showMessageDialog(frame, "Please!!! Fill all the blank fields");
        } else{
            try{
                vacancyNumber = Integer.parseInt(VacancyNumber);
                qualification = Qualification;
                appointedBy = AppointedBy;
                staffName = StaffName;
                joiningDate = JoiningDate;
            } catch(NumberFormatException NOE){
                JOptionPane.showMessageDialog(frame, NOE.getMessage(), "Not acceptable value!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            for(int i = 0; i < staffList.size(); ++i){
                StaffHire shl = staffList.get(i);
                if(shl instanceof PartTimeStaffHire){
                    PartTimeStaffHire partTimeSH = (PartTimeStaffHire) shl;
                    if(partTimeSH.getVacancyNumber() == vacancyNumber){
                        partTimeSH.appointPartTimeStaffHire(staffName, joiningDate, qualification, appointedBy);
                        JOptionPane.showMessageDialog(frame, "Staff appointed Sucessfully!!!");
                        break;
                    } else{
                        JOptionPane.showMessageDialog(frame, "Not a Valid Vacancy Number!!!");
                    }
                }
            }
        }
    }
    
    //method for terminate button
    public void terminate(){
        int vacancyNumber;
        String VacancyNumber = txtfVacancyNumberT.getText();
        if(VacancyNumber.trim().equals("")){
            JOptionPane.showMessageDialog(frame, "Please!!! Fill the required empty field");
        } else{
            try{
                vacancyNumber = Integer.parseInt(VacancyNumber);
            } catch(NumberFormatException NOE){
                JOptionPane.showMessageDialog(frame, NOE.getMessage(), "Not acceptable value!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            boolean found = false;
            for(int i = 0; i < staffList.size(); ++i){
                StaffHire shl = staffList.get(i);
                if(shl instanceof PartTimeStaffHire){
                    PartTimeStaffHire partTimeSH = (PartTimeStaffHire) shl;
                    if(partTimeSH.getVacancyNumber() == vacancyNumber){
                        partTimeSH.terminate();
                        staffList.remove(partTimeSH);
                        JOptionPane.showMessageDialog(frame, "Staff terminated successfully!!!");
                        found = true;
                        break;
                    } else{
                        JOptionPane.showMessageDialog(frame, "Not a Valid Vacancy Number!!!");
                    }
                }
            }
            if (found == false){
                JOptionPane.showMessageDialog(frame, "Invalid Vacancy Number!!!");
            }
        }
    }
    
    //method for clear button for parttimestaffhire
    public void clearP(){
        txtfVacancyNumberP1.setText(null);
        txtfVacancyNumberP2.setText(null);
        txtfVacancyNumberT.setText(null);
        txtfDesignationP.setText(null);
        txtfAppointedByP.setText(null);
        txtfJobTypeP.setText(null);
        txtfQualificationP.setText(null);
        txtfJoiningDateP.setText(null);
        txtfStaffNameP.setText(null);
        txtfWagesPerHourP.setText(null);
        txtfWorkingHourP.setText(null);
        txtfShiftsP.setText(null);
        JOptionPane.showMessageDialog(frame, "Details are cleared successfully!!");
    }
    
    //method for display button for part time staff hire
    public void DisplayP(){
        for(StaffHire shl : staffList){
            if(shl instanceof PartTimeStaffHire){
                PartTimeStaffHire partTimeSH = (PartTimeStaffHire) shl;
                System.out.println("Details are given below:");
                partTimeSH.display();
            }
        }
    }
   

    
       public static void main(String[] args){
        new INGNepal().setComponentsOfStaffHire();
    }
}
        
        
       
        
    
    
    
    
    
    
    
   
    
    
    