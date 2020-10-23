package noteSystem;

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

    public List<Tag> getTags(){
        return isAlso;
    }

    public boolean checkIsTag(Tag tag){
        if(isAlso.contains(tag)){
            return true;
        }
        return false;
    }



    @Override
    public String toString(){
        String output = "<"+_tagName+">";
        return output;
    }
}
