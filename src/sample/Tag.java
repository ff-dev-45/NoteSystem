package sample;

import java.util.List;

public class Tag {
    private String _tagName;
    private List<Tag> isAlso;

    public Tag(String tagName){
        _tagName=tagName;
    }

    public void addTag(Tag tagToAdd){
        if(!isAlso.contains(tagToAdd)) {
            isAlso.add(tagToAdd);
        }
    }

    @Override
    public String toString(){
        return _tagName;
    }
}
