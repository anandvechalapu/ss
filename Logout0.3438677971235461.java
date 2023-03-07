·       All the existing user session should be destroyed and redirected to the Login page.

Controller:
@Controller
public class LogoutController {
    
    @RequestMapping(value="/logout", method=RequestMethod.GET)
    public String logout() {
        // Destroy user session here
        return "redirect:/login";
    }
}

Service:
@Service
public class LogoutService {
    
    public void destroySession() {
        // Destroy user session here
    }
    
}

Repository:
@Repository
public class LogoutRepository {
    
    public void logoutUser(String userId) {
        // Logout user with given userId
    }
    
}