package register;
public class register {
    private int instructor_id;
    private String fullname;
    private String email;
    private String password;
    private String confirm_password;
    
    public register(int instructor_id,String fullname,String email,String password,String confirm_password){
        this.instructor_id=instructor_id;
        this.fullname=fullname;
        this.email=email;
        this.password=password;
        this.confirm_password=confirm_password;
    }
    public int getInstructorid(){return instructor_id;}
    public String getFullname(){return fullname;}
    public String getEmail(){ return email;}
    public String getPassword(){return password;}
    public String getConfirmpassword(){return confirm_password;}
}
