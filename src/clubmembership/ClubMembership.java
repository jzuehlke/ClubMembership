package clubmembership;
/**
 *
 * @author Jake Zuehlke
 */
public class ClubMembership 
{
    //Final Project: Student Club Membership Database
    public static void main(String[] args)
    {
        //instantiate object of Roster ArrayList
        Roster theRoster = new Roster();
        
        //instantiate object of UI, begin user interface
        UI theUI = new UI(theRoster);
    } 
}
