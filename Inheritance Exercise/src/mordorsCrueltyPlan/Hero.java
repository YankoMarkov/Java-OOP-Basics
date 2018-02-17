package mordorsCrueltyPlan;

class Hero extends Mood {
	
	@Override
	public String toString() {
		return String.format("%d%n%s", this.getPoint(), this.getMode());
	}
}
