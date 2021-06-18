public class Eagle extends Bird implements Fly {

	private boolean flying;
	private int altitude;

	public Eagle(String name) {
		super(name);
		this.flying = false;
		this.altitude = 0;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	public boolean isFlying() {
		return flying;
	}

	public void setFlying(boolean flying) {
		this.flying = flying;
	}

	@Override
	public String sing() {
		return "Screech!";
	}

	@Override
	public void takeOff() {
		if (!this.isFlying() && this.getAltitude() == 0) {
			this.setFlying(true);
			System.out.println(this.getName() + " takes off in the sky");
		} else
			System.out.println(this.getName() + " is already flying");
	}

	@Override
	public void ascend(int altitude) {
		if (this.flying) {
			this.setAltitude(this.getAltitude() + altitude);
			System.out.println(this.getName() + " flies upward, altitude: " + this.getAltitude());
		} else
			System.out.println(this.getName() + " needs to fly first");

	}

	@Override
	public void glide() {
		if (this.flying) {
			System.out.println(this.getName() + " glides in the air");
		} else
			System.out.println(this.getName() + " needs to fly first");
	}

	@Override
	public void descend(int altitude) {
		if (this.flying) {
			if (this.getAltitude() - altitude <= 0) {
				this.setAltitude(this.getAltitude() - altitude);
				System.out.println(this.getName() + " descends, altitude: " + this.getAltitude());
			} else
				System.out.println(this.getName() + " cannot descend below the ground");
		} else
			System.out.println(this.getName() + " needs to fly firs");
	}

	@Override
	public void land() {
		if (this.flying) {
			this.setAltitude(0);
			this.flying = false;
			System.out.println(this.getName() + " lands");
		} else
			System.out.println(this.getName() + " is not flying");
	}
}