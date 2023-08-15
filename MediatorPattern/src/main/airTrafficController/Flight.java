package main.airTrafficController;

public class Flight implements Commad {

	private IATCMediator iatcMediator;
	
	public Flight(IATCMediator mediator) {
		this.iatcMediator = mediator;
	}
	
	@Override
	public void land() {
		if(iatcMediator.isLandingOk()) {
			System.out.println("Successfully landed");
			iatcMediator.setLandingStatus(true);
		}
	}
	
	public void getReady() {
		System.out.println("Ready for landing.");
	}
	
}
