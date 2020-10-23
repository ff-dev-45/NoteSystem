package noteSystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Comparator;

public class NoteModel {

    private static NoteModel _model = new NoteModel();

    private ObservableList<Item> _items = FXCollections.observableArrayList();
    private ObservableList<Tag> _tags = FXCollections.observableArrayList(new Tag("None"));


    public static NoteModel getInstance(){return _model;}

    public ObservableList<Tag> getTags(){return _tags;}
    public ObservableList<Item> getItems(){return _items;}


    public void addItem(Item item){
        if(!_items.contains(item)){
            _items.add(item);
        }
    }

    public void removeItem(Item item){
        if(_items.contains(item)){
            _items.remove(item);
        }
    }

    public void addTag(Tag tag){
        if(!_tags.contains(tag)){
            _tags.add(tag);
        }
    }

    public void removeTag(Tag tag){
        if(_tags.contains(tag)){
            _tags.remove(tag);
        }
    }

    public void sort(Tag tag){
        _items.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if(o1.toString().equals(tag.toString())){
                    return 0;
                }
                return 1;
            }
        });
    }
}
