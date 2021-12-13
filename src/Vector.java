public class Vector {
    private double x;
    private  double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
        return Math.sqrt(x * 2 + y * 2 + z * 2);
    }
    public double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector crossProduct (Vector vector){
        return new Vector (
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }
    public double cos(Vector vector) {
        // Для вычисления длины и произведения используются
        //методы multiply и length
        return scalarProduct(vector) / (length() * vector.length());
    }
    public Vector add(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    public Vector subtract(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }

    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
