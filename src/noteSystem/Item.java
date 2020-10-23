package noteSystem;

import java.util.List;

public class Item {
    private String _name;
    private String _contents;
    private List<Tag> _tags;

    public Item(String name, String content, List<Tag> tags){
        _name = name;
        _contents = content;
        _tags = tags;
    }

    public void addTags(Tag tag){
        if(!_tags.contains(tag)){
            _tags.add(tag);
        }
    }


    public String getName(){ return _name; }
    public String getContents() {return _contents;}
    public List<Tag> getTags() {return _tags; }

    public String toString(){
        String output= _name+" \t\t\t Tags: "+_tags;
        return output;
    }

}
