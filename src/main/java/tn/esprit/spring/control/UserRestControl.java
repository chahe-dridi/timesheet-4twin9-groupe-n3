package tn.esprit.spring.control;

 
import java.util.List;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IUserService;

// userRestControl
@RestController // = @Controller + @ResponseBody 
@RequestMapping("/user")
public class UserRestControl {

	private final IUserService userService;  // Declare the service as a final field

    // Constructor injection
    public UserRestControl(IUserService userService) {
        this.userService = userService;
    }

    // URL: http://localhost:????/????/????/retrieve-all-users
	@GetMapping("/retrieve-all-users")
	public List<User> retrieveAllUsers() {
		return userService.retrieveAllUsers();
	}
	// http://localhost:????/timesheet-devops/retrieve-user/{user-id}
	@GetMapping("/retrieve-user/{user-id}")
	public User retrieveUser(@PathVariable("user-id") String userId) {
		return userService.retrieveUser(userId);
	}



	// Ajouter User : http://localhost:????/timesheet-devops/add-user 
	@PostMapping("/add-user")
	public User addUser(@RequestBody User u) {
		// Retourne immédiatement le résultat sans utiliser une variable temporaire.
		return userService.addUser(u);
	}

	
	// Supprimer User : 
	// http://localhost:????/timesheet-devops/remove-user/{user-id}
	@DeleteMapping("/remove-user/{user-id}")
	public void removeUser(@PathVariable("user-id") String userId) {
		// Supprime les lignes commentées inutiles
		userService.deleteUser(userId);
	}
	// Modifier User 
	// http://localhost:????/timesheet-devops/modify-user 
	@PutMapping("/modify-user") 
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	 
} 
 