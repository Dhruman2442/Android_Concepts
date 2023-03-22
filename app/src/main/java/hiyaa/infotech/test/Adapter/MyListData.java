package hiyaa.infotech.test.Adapter;

public class MyListData {

    private String number;
    private String name;
    private int imgId;


    public MyListData(String number,String name, int imgId) {
        this.number = number;
        this.name = name;
        this.imgId = imgId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {

        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
