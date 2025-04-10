class Student{
    private String name;
    private String year;
    private String regNo;
    private String branch ;
    private String type;
    private static int no = 1;
    private static int No = 501;
    
   Student(String year,String name,String branch,String type){
     this.name = name;
     this.year = year;
     this.branch = branch;
     this.type = type;
     
    generateRegistrationNo();
    }
    
   public  String getName(){
         return this.name;
    }
   public String getBranch(){
         return this.branch;
   }
    public String getRegistrationNo(){
         return this.regNo;
   }
    public String getType(){
         return this.type;
   }
   
    private String takeBranchCode(String branch){
       String branchCode = "";
      if(branch.equalsIgnoreCase("Information Technology") ||branch.equalsIgnoreCase("IT")){
           branchCode = "IT";
        }else if(branch.equalsIgnoreCase("Computer Science") || branch.equalsIgnoreCase("cse") || branch.equalsIgnoreCase("Computer Science Engineering")){
           branchCode = "CS";
        }else if(branch.equalsIgnoreCase("Textile Engineering")){
           branchCode = "TT";
        }else if(branch.equalsIgnoreCase("Electronics and Telecommunication Engineering") || branch.equalsIgnoreCase("extc") || branch.equalsIgnoreCase("entc")){
           branchCode = "EC";
        }else if(branch.equalsIgnoreCase("Civil Engineering")){
           branchCode = "CE";
        }else{
           branchCode = branch.substring(0,2);
        }
        
      return branchCode;
    }
    private void generateRegistrationNo(){
        String branchCode = takeBranchCode(branch);
       if(type.equalsIgnoreCase("regular")){
       
          this.regNo = year+"B"+branchCode.substring(0,2)+String.format("%03d",no);
           no++;
        }else if(type.equalsIgnoreCase("DSY")){
        
          this.regNo = year+"B"+branchCode.substring(0,2)+No;
           No++;
        }
    }
    public String toString(){
       return "Name:"+name+"\nAdmission year:"+year+"\nBranch:"+branch+"\nStudent Type:"+type+"\nRegistration No:"+regNo;
    }
  
  public static void main(String[] args){
      String year = args[0];
      String name = args[1];
      String branch = args[2];
      String type = args[3];
    Student s1 = new Student(year,name,branch,type);
    System.out.println(s1);
   }
}
