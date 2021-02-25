import java.util.Objects;

public class Packing implements IWeight{
    /**
     * Класс «Упаковка товара». Упаковка имеет название и массу в кг (собственная масса
     * упаковки).
     */
    private String name;
    private double weightOfPackage;

    public Packing(String name, double weightOfPackage) throws PackingException {
        if(name.isEmpty()){
            throw new PackingException("Название товара пусто");
        }
        else if(weightOfPackage <= 0){
            throw new PackingException("Вес отрицательный", weightOfPackage);
        }
        this.name = name;
        this.weightOfPackage = weightOfPackage;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getWeightOfPackage() {
        return weightOfPackage;
    }

    public void setWeightOfPackage(double weightOfPackage) throws PackingException{
        if(weightOfPackage <= 0){
            throw new PackingException("Вес отрицательный");
        }
        this.weightOfPackage = weightOfPackage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packing packing = (Packing) o;
        return Double.compare(packing.weightOfPackage, weightOfPackage) == 0 &&
                name.equals(packing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weightOfPackage);
    }

    @Override
    public String toString(){
        return String.format("Название:%s, вес: %f", name, weightOfPackage);
    }

    @Override
    public double getWeight() {
        return getWeightOfPackage();
    }
}