package co.edu.uco.grades.api.controller;

@RestController

public class IdTypeController {
	
	@postMapping
	public void create (@RequestBody IdTypeDTO dto) {
			System.out.println("estoy en crear !!");
			
	}
	@putMapping( "/{id}" )
	public void update(@PathVariable("id") int id, @RequestBody IdTypeDTO dto) {
			System.out.println("estoy en actualizar !!");
	}
	
	@delete Mapping("/{id}")
	public void delete(@PathVariable("id") int id) {
			System.out.println("estoy en eliminar !!");
}
	@GetMapping( "/{id}" )
	public void findById(@PathVariable("id") int id) {
			System.out.println("estoy en consultar por id !!");
}
	@putMapping( "/{id}" )
	public void find(@PathVariable("id") int id, @RequestBody IdTypeDTO dto) {
			System.out.println("estoy en actualizar !!");
			
			
			
			
		
	public class IdController {
		@GetMapping("/dummy")
		public IdTypeDTO getDummy() {
			return new IdTypeDTO();
			
		}
		
		@PostMapping
		public void create(@RequestBody IdTypeDTO dto) {
			validator<IdTypeDTO> validator = new CreateIdTypeValidator();
			
			if (messages.isEmpy()) {
				
			}
			
		}
		
		@PutMapping ("/{id}")
		public void update (@PathVariable ("id"),int id @RequestBody IdTypeDTO dto) {
			System.out.println("estoy en actualizar")
		}
	}
	
	