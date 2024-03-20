class Box{

	private double width;
	private double height;
	private double depth;
	
	Box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	double volume(){
		return width*height*depth;
	}
}

class BoxWeight extends Box{
	double weight;
	
	BoxWeight(double w,double h,double d,double m){
		super(w,h,d);
		weight=m;
	}
}
class Shipment extends BoxWeight{
	double cost;
	
	Shipment(double w,double h,double d,double m,double c){
		super(w,h,d,m);
		cost=c;
	}
}

class DemoShipment{
	public static void main(String args[]){
	Shipment shipment1=new Shipment(10,20,15,50,300.50);
	double vol;
	vol=shipment1.volume();
	System.out.println("volume of shipment1 is "+vol);
	System.out.println("Weight of shipment1 is "+shipment1.weight);
	System.out.println("Shipping cost:"+shipment1.cost);
	}
}
	
