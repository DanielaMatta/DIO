package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dto.MessageResponseDTO;
import Entity.Person;
import Repository.PersonRepository;

@Service
public class PersonService {

	private PersonRepository personRepository;
	
	
	@Autowired
	public PersonService(PersonRepository personRepository) {
		
		this.personRepository = personRepository;}
	
	
	
	public MessageResponseDTO createPerson(Person person) {
		Person savedPerson = personRepository.save(person);
		return MessageResponseDTO
				.builder().message("Created person with Id" + savedPerson.getId()).build();
	
}
}