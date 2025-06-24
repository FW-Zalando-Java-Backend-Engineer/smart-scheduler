package org.example.smartscheduler.web;
import org.example.smartscheduler.model.Person;
import org.example.smartscheduler.repo.PersonRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/people")
public class PersonController {

    private final PersonRepository repo;

    public PersonController(PersonRepository repo){
        this.repo = repo;
    }

    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable Long id){
        return repo.findById(id); // Return Optional.empty() if not found.

    }

    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return repo.save(person);
    }

    /**
     *
     * examples:
     * Request:
     * GET http://localhost:8080/people/1
     * Response:
     * {
     *     "id":1,
     *     "name":"John"
     * }
     *
     * Request:
     * POST http://localhost:8080/people
     * Content-Type: application/json
     *
     * RequestBody:
     * {
     *     "name":"Alice"
     * }
     *
     * Response:
     * {
     *      "id":3,
     *     "name":"Alice"
     * }
     *
     * JSON
     * [
     * {
     *     "key":"value"
     *
     * },
     * {
     *     "key":"value"
     *
     *       },
     * {
     *       "key":"value"
     *
     *      },
     * ]
     *
     * */

}
