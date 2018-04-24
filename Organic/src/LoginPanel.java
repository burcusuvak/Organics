import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginPanel {
    public ArrayList<User> users= new ArrayList<>();
    public SuperAdmin admin =new SuperAdmin();
    private User user ;
    public LoginPanel()
    {
        CSVReaderUser();        
    }
    
    public void loginOrRegister(){
    	String uName,uPas;
    	System.out.println("1-Login\n2-Register");
    	Scanner scan=new Scanner(System.in);
        int choose = scan.nextInt();
        if(choose==1){
        	System.out.println("Enter a username: ");
            uName=scan.nextLine();
            System.out.println("Enter a password: ");
            uPas=scan.nextLine();
            if(!login(uName,uPas)){
            	System.out.println("Wrong username or password");
            }
        }else if(choose==2){
        	register();
        }else
        	System.out.println("Wrong selection");
        	
    	
    }
    
    
    private boolean login(String name,String pass){
    	for(int i=0; i<users.size(); i++)
    		if(users.get(i).getName().equals(name)&&users.get(i).getPassword().equals(pass)){
    			user=users.get(i);
    			return true;
    		}		
    	return false;
    }
    
    private boolean isUserinList(String username, String email){
        for (int i = 0; i < users.size(); i++) {
            if(username.equals(users.get(i).getUserName()) ||
                    !email.equals(users.get(i).getEmail())){
                return false;
            }

        }
        return  true;
    }
    private void register(){
        int status =0;
        Guest guest=new Guest();
        guest.signUP();
        while (status==0) {
            if (isUserinList(guest.getUserName(), guest.getEmail()) == false) {
                System.out.println("Wrong username or email");
                status = 0;
                guest.signUP();
            } else {
                status = 1;
            }
        }
        users.add(guest);
    }

    private void CSVReaderUser()
    {
        String csvFile = "user.csv";
        String line = "";

        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();

            while ((line = br.readLine()) != null) {

                // use ; as separator
                String[] temp = line.split(cvsSplitBy);
                Guest guest=new Guest(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5].charAt(0));
                users.add(guest);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
