
/**
 * Here is the class that is needed to build each "Fragment".
 * The "Fragments" are each of the expenses we want to budget towards.
 * For example, Gas, Food, and Textbooks will each have their own Fragment.
 *
 * @author Jay Trang, Jaehoon Song, Aminah Khan
 * @version 05/05/2021
 */


//Note: needs Fragment code to put all of this data into the UI
//link for Fragment tutorials: https://www.youtube.com/playlist?list=PLrT2tZ9JRrf70K7LrG475BFDYq44_1Kpa
public class BudgetFragment
{
    private String expenseName;
    //amount of money already put aside
    private float moneyPutAside;
    //versus amount of money that needs to be saved
    private float amtMoneyForGoal;
    //counted as how often money needs to be paid for expense
    //for food, it's everyday, so it's 1
    //utilities like internet are monthly, so it's 30
    private int paymentFrequency;       
    
    //make sure each getter is filled in via the textboxes from the UI, not System.in
    public void setData()
    {
    }
    
    public String getName()
    {
        return expenseName;
    }
    public float getBudget()
    {
        return moneyPutAside;
    }
    public float getGoal()
    {
        return amtMoneyForGoal;
    }
    public float percentTowardsGoal()
    {
        return moneyPutAside/amtMoneyForGoal;
    }
    
    //use this getter to sort all the Fragments from low to high by this variable
    public int getFrequency()
    {
        return paymentFrequency;
    }
}
