package guru.springframework.examplebeans;

public class FakeJmsBroker {

    private String userName;
    private String password;
    private String url;
    private String[] animals;
    private float price;
    private boolean response;

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String[] getAnimals() {
        return animals;
    }

    public void setAnimals(String[] animals) {
        this.animals = animals;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getListAnimals(){

        String out = "";
        for (String animal: this.animals){
            out += animal + " ";
        }
        return out;
    }
}
