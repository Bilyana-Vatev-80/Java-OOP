package CollectionHierarchy;

public class MyListImpl extends Collection implements MyList{

    public MyListImpl (){
        super();
    }
    @Override
    public String remove() {
        return getItems().remove(getItems().size() - 1);
    }

    @Override
    public int add(String item) {
        getItems().add(item);
        return 0;
    }

    @Override
    public int getUsed() {
        return getItems().size();
    }
}
