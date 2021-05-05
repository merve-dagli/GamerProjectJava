package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	GamerCheckService gamerCheckService;
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.CheckPerson(gamer)) {
			System.out.println("Validation successfull.");
			add(gamer);
		}else {
			System.out.println("Validation Error - Not a valid person.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.CheckPerson(gamer)) {
			System.out.println("Validation successfull.");
			update(gamer);
		}else {
			System.out.println("Validation Error - Not a valid person.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println(gamer.getId());
		
	}

}
