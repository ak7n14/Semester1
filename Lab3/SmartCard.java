
public class SmartCard
{   String Owner;
    boolean StaffStatus;
    //Assigns Default Values to the variables above
    public SmartCard(String name){
            Owner= name;
            StaffStatus= false;
    }
    //Fuunction to return the name of the owner 
       public String getOwner(){
           return Owner;
           
        }
          
    //Function to return the staff status of the card
       public boolean isStaff(){
            return StaffStatus;
        }
        
    //Function to change the staff status of the card
       public void setStaff(boolean state){
            StaffStatus = state;
        }
}
