package ubu.gii.dass.refactoring;

public class NewRelease extends MovieType {
	@Override
	public int getTypeCode() {
		return MovieType.NEW_RELEASE;
	}
	
	@Override
	public double getCharge(Rental rental) {
		double result = rental.getDaysRented() * 3;
		return result;
	}
}
