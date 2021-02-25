import java.util.Objects;

/**
 * Класс «Товар». Товар имеет название и описание (строки).
 */

public class Goods {
    private String name;
    private String description;

    public Goods(String name, String description) throws GoodsException{
        if(name.isEmpty() || description.isEmpty()){
            throw new GoodsException("Название товара или описание пусто");
        }
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void setName(String name) throws GoodsException{
        if(name.isEmpty()){
            throw new GoodsException("Название товара пусто");
        }
        this.name = name;
    }

    public void setDescription(String description) throws GoodsException{
        if(description.isEmpty()){
            throw new GoodsException("Описание пусто");
        }
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(name, goods.name) &&
                Objects.equals(description, goods.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    public String toString(){
        return String.format("Название товара:%s, Описание товара:%s", name, description);
    }
}
