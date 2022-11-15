public class StringDataStorage {
    private String data;

    public StringDataStorage() {
        data = "";
    }
    public <T> StringDataStorage(T dataObject) {
        data = dataObject.toString();
    }

    public <T> void changeData(T dataObject) {
        data = data.toString();
    }

    public String getData() {
        return data;
    }
}
