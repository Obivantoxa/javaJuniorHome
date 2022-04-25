public class Truck extends Vehicle {
	
	
	
	public double load; // текущая загрузка машины 
	public double max_load; // максимальная всестимость машины 
	
	
	public Truck(){
		
	}
	
	public Truck(double load, double max_load, double petrol, double max_petrol) {
		super(max_petrol, petrol);
		this.load = load;
		this.max_load = max_load;
	}

	public double getLoad() {
		return load;
	}

	public double getMax_load() {
		return max_load;
	}
	
	public void arrive(){
		super.arrive();
		Base.goods_on_base = Base.goods_on_base + getLoad();
	}
	
	  public boolean leave() {
		  if (Base.people_on_base < 1) {
	            return false;
	        }
	        if (Base.vehicles_on_base < 1) {
	            return false;
	        }
	        double needs_petrol = getTank_volume() - getPetrol_amount();
	        if (needs_petrol > Base.petrol_on_base) {
	            return false;
	        }
	        Base.people_on_base--;
	        Base.vehicles_on_base--;
	        Base.petrol_on_base = Base.petrol_on_base - needs_petrol;

	        double needs_load = max_load;
	        if (Base.goods_on_base >= needs_load) {
	            Base.goods_on_base = Base.goods_on_base - needs_load;
	        } else {
	            Base.goods_on_base = 0;
	        }
	        return true;
		  
	  }
	
	

}
