package noteSystem;

import java.util.ArrayList;
import java.util.List;

public class Tag {
    private String _tagName;
    private List<Tag> isAlso= new ArrayList<Tag>();

    public Tag(String tagName){
        _tagName=tagName;
    }

    public void addTag(Tag tagToAdd){
        if(!isAlso.contains(tagToAdd)) {
            isAlso.add(tagToAdd);
        }
    }

    public void addTags(List<Tag> tags){
        for(Tag tag: tags){
            if(!isAlso.contains(tag)){
                isAlso.add(tag);
            }
        }
    }

    public List<Tag> getTags(){
        return isAlso;
    }

    public boolean checkIsTag(Tag tag){
        if(isAlso.contains(tag)){
            return true;
        }
        for(Tag isAlsoTag: isAlso){
            if(isAlsoTag.checkIsTag(tag)){
                return true;
            }
        }
        return false;
    }



    @Override
    public String toString(){
        String output = "<"+_tagName+">";
        /*for(Tag tag: isAlso){
             output+=tag.toString();
        }*/
        return output;
    }
}
