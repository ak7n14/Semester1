
public class CardLock
{
   SmartCard lastUser;
   boolean lockState;
   boolean studentAccess;
   //Constructor to assign default values to lockState and studentAccess
   public CardLock(){
                lockState = true;
                studentAccess=false;
            }
   //Function to swipe a card save last card and change lockState if its Staff         
   public void swipeCard(SmartCard card){
                lastUser = card;
                
               if (studentAccess || card.isStaff())
                    lockState = false;
               else
                    lockState = true;
            }
  //Function to return the last user              
   public SmartCard getLastCardSeen(){
                return lastUser;
            }
  //Function to check if cardlock is locked or unlocked           
   public boolean isUnlocked(){
                return !lockState;
            }
   //Function for toggle access to student         
    public void toggleStudentAccess(){
                 studentAccess = !studentAccess;
                 
                }
}
