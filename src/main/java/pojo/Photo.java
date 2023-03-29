package pojo;// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
import java.util.ArrayList;
public class Photo{
    public String id;
    public String name;
    public String description;
    public String count_views;
    public String count_faves;
    public String count_comments;
    public String date_taken;
    public String count_tags;
    public String count_notes;
    public int rotation;
    public String date_imported;
    public String photopage;
    public String original;
    public String license;
    public ArrayList<Object> geo;
    public ArrayList<Object> groups;
    public ArrayList<Object> albums;
    public ArrayList<Object> tags;
    public ArrayList<Object> people;
    public ArrayList<Object> notes;

    @Override
    public String toString() {
        return "pojo.Photo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", count_views='" + count_views + '\'' +
                ", count_faves='" + count_faves + '\'' +
                ", count_comments='" + count_comments + '\'' +
                ", date_taken='" + date_taken + '\'' +
                ", count_tags='" + count_tags + '\'' +
                ", count_notes='" + count_notes + '\'' +
                ", rotation=" + rotation +
                ", date_imported='" + date_imported + '\'' +
                ", photopage='" + photopage + '\'' +
                ", original='" + original + '\'' +
                ", license='" + license + '\'' +
                ", geo=" + geo +
                ", groups=" + groups +
                ", albums=" + albums +
                ", tags=" + tags +
                ", people=" + people +
                ", notes=" + notes +
                ", privacy='" + privacy + '\'' +
                ", comment_permissions='" + comment_permissions + '\'' +
                ", tagging_permissions='" + tagging_permissions + '\'' +
                ", safety='" + safety + '\'' +
                ", comments=" + comments +
                '}';
    }

    public String privacy;
    public String comment_permissions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCount_views() {
        return count_views;
    }

    public void setCount_views(String count_views) {
        this.count_views = count_views;
    }

    public String getCount_faves() {
        return count_faves;
    }

    public void setCount_faves(String count_faves) {
        this.count_faves = count_faves;
    }

    public String getCount_comments() {
        return count_comments;
    }

    public void setCount_comments(String count_comments) {
        this.count_comments = count_comments;
    }

    public String getDate_taken() {
        return date_taken;
    }

    public void setDate_taken(String date_taken) {
        this.date_taken = date_taken;
    }

    public String getCount_tags() {
        return count_tags;
    }

    public void setCount_tags(String count_tags) {
        this.count_tags = count_tags;
    }

    public String getCount_notes() {
        return count_notes;
    }

    public void setCount_notes(String count_notes) {
        this.count_notes = count_notes;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public String getDate_imported() {
        return date_imported;
    }

    public void setDate_imported(String date_imported) {
        this.date_imported = date_imported;
    }

    public String getPhotopage() {
        return photopage;
    }

    public void setPhotopage(String photopage) {
        this.photopage = photopage;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public ArrayList<Object> getGeo() {
        return geo;
    }

    public void setGeo(ArrayList<Object> geo) {
        this.geo = geo;
    }

    public ArrayList<Object> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Object> groups) {
        this.groups = groups;
    }

    public ArrayList<Object> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Object> albums) {
        this.albums = albums;
    }

    public ArrayList<Object> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Object> tags) {
        this.tags = tags;
    }

    public ArrayList<Object> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Object> people) {
        this.people = people;
    }

    public ArrayList<Object> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Object> notes) {
        this.notes = notes;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getComment_permissions() {
        return comment_permissions;
    }

    public void setComment_permissions(String comment_permissions) {
        this.comment_permissions = comment_permissions;
    }

    public String getTagging_permissions() {
        return tagging_permissions;
    }

    public void setTagging_permissions(String tagging_permissions) {
        this.tagging_permissions = tagging_permissions;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    public ArrayList<Object> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Object> comments) {
        this.comments = comments;
    }

    public String tagging_permissions;
    public String safety;
    public ArrayList<Object> comments;
}

