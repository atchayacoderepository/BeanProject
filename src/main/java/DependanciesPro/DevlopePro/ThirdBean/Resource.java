package DependanciesPro.DevlopePro.ThirdBean;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import DependanciesPro.DevlopePro.User;


public class Resource 
{
	@RestController
	public class UserResource 
	{

		@Autowired
		private User service;

		// GET /users
		// retrieveAllUsers
		// http://localhost:8080/users/
		@GetMapping("/users")
		public List<User> retrieveAllUsers() {
			return service.findAll();
		}

		@GetMapping("/users/{id}/{username}/dummy")
		public User retrieveUser(@PathVariable int id, @PathVariable String username,
				@RequestParam(value = "testData", required = true) String test) throws Exception {

			System.out.println(username + " " + test);
			User user = service.findOne(id);
			System.out.println(user);
			if (user == null)
				throw new Exception();

			return user;
		}

		@PostMapping("/users")
		public ResponseEntity<Object> createUser(@RequestBody User user) {

			User savedUser = service.save(user);

			URI location = ((UriComponents)ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser))
					.toUri();

			return ResponseEntity.created(location).build();

		}

	}
}


