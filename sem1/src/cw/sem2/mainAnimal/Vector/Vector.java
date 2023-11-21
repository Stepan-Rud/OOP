package cw.sem2.mainAnimal.Vector;

public class Vector {
    private Integer x;
    private Integer y;
    private Integer z;

    public Vector(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public Vector(){
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     *
     * @return длина вектора
     */
    public double lenghtVector() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    /**
     *
     * @param vector2
     * @return Скалярное произведение вектора
     */
    public double scolar(Vector vector2) {
        return this.x * vector2.x + this.y * vector2.y + this.z * vector2.z;
    }
/**
    * @apiNote метод, вычисляющий вектроное произведение с другим вектором
* @param vector2 выбор вектора, с котором необходимо вычислить вектроеное произведение
* @return новый вектор
*/
    public Vector multiVector(Vector vector2) {
        return new Vector(
                this.y*vector2.z - this.z*vector2.y,
                this.z*vector2.x - this.x*vector2.z,
                this.x*vector2.y - this.y*vector2.x);
    }

    /**
     * vector2
     * @param vector2 Косинус между векторами
     * @return косинус
     */
    public double cos(Vector vector2) {
        return scolar(vector2) / (lenghtVector() * vector2.lenghtVector());
    }
}
