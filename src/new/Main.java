public class Main {
    public static void main(String[] args) {
   /*    Bus v = new Bus(15,50,19.5, 60);

// get
        System.out.println( v.getPetrol_amount() );
        System.out.println( v.getTank_volume() );
        System.out.println();

// init
        Base.vehicles_on_base = 49;
        Base.people_on_base = 99;
        Base.petrol_on_base = 1000.0;
        Base.goods_on_base  = 2000.0;

        System.out.println("Initially:");
        System.out.println( Base.vehicles_on_base );
        System.out.println( Base.people_on_base );
        System.out.println( Base.petrol_on_base );
        System.out.println( Base.goods_on_base );
        System.out.println();

// arrive
        v.arrive();
        System.out.println( "Arrived:" );

        System.out.println( Base.vehicles_on_base );	// arrived
        System.out.println( Base.people_on_base );

        System.out.println( Base.petrol_on_base );	// same
        System.out.println( Base.goods_on_base );
        System.out.println();

// leave
        v.leave();
        System.out.println( "Left:" );

        System.out.println( Base.vehicles_on_base );	// left
        System.out.println( Base.people_on_base );

// should be 1000-(60-19.5)
        System.out.println( Base.petrol_on_base );	// changed!

        System.out.println( Base.goods_on_base );	// same
        System.out.println();
*/        
        
        
        Truck v1 = new Truck(100,2106,20,40);

     // get
             System.out.println( v1.getPetrol_amount() );
             System.out.println( v1.getTank_volume() );
             System.out.println();

     // init
             Base.vehicles_on_base = 49;
             Base.people_on_base = 99;
             Base.petrol_on_base = 1000.0;
             Base.goods_on_base  = 2000.0;

             System.out.println("Initially:");
             System.out.println( Base.vehicles_on_base );
             System.out.println( Base.people_on_base );
             System.out.println( Base.petrol_on_base );
             System.out.println( Base.goods_on_base );
             System.out.println();

     // arrive
             v1.arrive();
             System.out.println( "Arrived:" );

             System.out.println( Base.vehicles_on_base );	// arrived
             System.out.println( Base.people_on_base );

             System.out.println( Base.petrol_on_base );	// same
             System.out.println( Base.goods_on_base );
             System.out.println();

     // leave
             v1.leave();
             System.out.println( "Left:" );

             System.out.println( Base.vehicles_on_base );	// left
             System.out.println( Base.people_on_base );

     // should be 1000-(60-19.5)
             System.out.println( Base.petrol_on_base );	// changed!

             System.out.println( Base.goods_on_base );	// same
             System.out.println();
             Truck v2 = new Truck(100,2106,20,40);
             v2.arrive();
             v2.leave();
             System.out.println( "Left:" );

             System.out.println( Base.vehicles_on_base );	// left
             System.out.println( Base.people_on_base );

     // should be 1000-(60-19.5)
             System.out.println( Base.petrol_on_base );	// changed!

             System.out.println( Base.goods_on_base );	// same
             System.out.println();
             Bus v3 = new Bus(1,100,20,40);
             v3.arrive();
             v3.leave();
             System.out.println( "Left:" ); 

             System.out.println( Base.vehicles_on_base );	// left
             System.out.println( Base.people_on_base );

     // should be 1000-(60-19.5)
             System.out.println( Base.petrol_on_base );	// changed!

             System.out.println( Base.goods_on_base );	// same
             System.out.println();
    }
}
