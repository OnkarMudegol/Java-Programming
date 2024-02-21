    class Bicycle
    {
        public int gear;
        public int speed;
        public Bicycle(int gear, int speed)
        {
            this.gear = gear;
            this.speed = speed;
        }
        public void speedUp(int increment)
        {
            speed += increment;
        }
        public String display()
        {
            return ("No of gears are: "+gear+"\n"+"speed of bycucle is: "+speed);
        }
    }
    class MountainBike extends Bicycle
    {
        public int seatHeight;
        public MountainBike(int gear, int speed,int startHeight)
        {
            super(gear,speed);
            seatHeight = startHeight;
        }
        public void setHeight(int newValue)
        {
            seatHeight = newValue;
        }
        public String display()
        {
            return (super.display()+"\nseat height is: "+seatHeight);
        }
    }
public class inheritance
{
    public static void main(String args[])
    {
        MountainBike vehicle = new MountainBike(3,100,25);
        System.out.println(vehicle.display());
    }
}
