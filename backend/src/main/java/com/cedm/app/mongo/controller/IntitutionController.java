@RestController
@RequestMapping("/api/institutions")
public class InstitutionController {

	@Autowired
	private InstitutionRepository institutionRepository;

	@GetMapping("/")
	public List<Institution> getAllInstitutions() {
		return institutionRepository.findAll();
	}

	@GetMapping("/{id}")
	public Institution getInstitutionById(@PathVariable(value = "id") ObjectId institutionId) {
		return institutionRepository.findById(institutionId);
	}

	@PostMapping("/")
	public Institution createInstitution(@Valid @RequestBody Institution institution) {
		return institutionRepository.save(institution);
	}

	@PutMapping("/{id}")
	public Institution updateInstitution(@PathVariable(value = "id") ObjectId institutionId,
			@Valid @RequestBody Institution institutionDetails) {
		Institution institution = institutionRepository.findById(institutionId);
		institution.setType(institutionDetails.getType());
		institution.setIdentification(institutionDetails.getIdentification());
		institution.setContact(institutionDetails.getContact());
		institution.setCredentials(institutionDetails.getCredentials());
		institution.setEntities(institutionDetails.getEntities());
		institution.setPrograms(institutionDetails.getPrograms());
		return institutionRepository.save(institution);
	}

	@DeleteMapping("/{id}")
	public void deleteInstitution(@PathVariable(value = "id") ObjectId institutionId) {
		Institution institution = institutionRepository.findById(institutionId);
		institutionRepository.delete(institution);
	}
}

@Repository
public interface InstitutionRepository extends MongoRepository<Institution, String> {
	Institution findById(ObjectId id);
}
