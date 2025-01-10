
 public class Vector3D {
    private double x, y, z;

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

     public void setX(double x) {
             this.x = x;
     }
     public void setY(double y) {
        this.y = y;
     }
     public void setZ(double z) {
        this.z = z;
     }
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public Vector3D normalize() {
        double mag = magnitude();
        if(mag == 0.0)
            throw new IllegalArgumentException("can't be done with zero magnitude");
        return new Vector3D(x/mag, y/mag, z/mag);
    }

 }
