package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepository;



	@Override
	public List<User> retrieveAllUsers() {
		return new ArrayList<>(); // Retourne une liste vide au lieu de null
	}



	@Override
	public User addUser(User u) {
		User utilisateur = null; // Variable temporaire inutile
		try {
			// Ajouter l'utilisateur
			utilisateur = userRepository.save(u); // Si tu utilises un repository JPA
		} catch (Exception e) {
			// Gérer l'exception si nécessaire
		}
		return utilisateur; // Retourner l'utilisateur ajouté
	}


	@Override 
	public User updateUser(User u) {

		User userUpdated = null; 

		
		try {
			// TODO Log à ajouter en début de la méthode 
			userUpdated = userRepository.save(u); 
			// TODO Log à ajouter à la fin de la méthode 

		} catch (Exception e) {
			// TODO log ici : l....("error in updateUser() : " + e);
		}

		return userUpdated; 
	}

	@Override
	public void deleteUser(String id) {

		try {
			// TODO Log à ajouter en début de la méthode 
			userRepository.deleteById(Long.parseLong(id)); 
			// TODO Log à ajouter à la fin de la méthode 

		} catch (Exception e) {
			// TODO log ici : l....("error in deleteUser() : " + e);
		}

	}

	@Override
	public User retrieveUser(String id) {
		User u = null;
		try {
			u =  userRepository.findById(Long.parseLong(id)).get();

		} catch (Exception e) {
		}

		return u;
	}

}
