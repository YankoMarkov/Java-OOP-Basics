package mordorsCrueltyPlan;

class Mood extends Food {
	private String mode;
	
	public String getMode() {
		return this.mode;
	}
	
	private void setMode(String mode) {
		this.mode = mode;
	}
	
	public void addMode() {
		if (this.getPoint() < -5) {
			this.setMode("Angry");
		} else if (this.getPoint() < 0) {
			this.setMode("Sad");
		} else if (this.getPoint() <= 15) {
			this.setMode("Happy");
		} else {
			this.setMode("JavaScript");
		}
	}
}
