package mordorsCrueltyPlan;

class Food {
	private int point;
	
	int getPoint() {
		return this.point;
	}
	
	public void eatFood(String food) {
		switch (food.toLowerCase()) {
			case "cram":
				this.point += 2;
				break;
			case "lembas":
				this.point += 3;
				break;
			case "apple":
				this.point += 1;
				break;
			case "melon":
				this.point += 1;
				break;
			case "honeycake":
				this.point += 5;
				break;
			case "mushrooms":
				this.point -= 10;
				break;
			default:
				this.point -= 1;
				break;
		}
	}
}
