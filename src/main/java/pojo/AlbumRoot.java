package pojo;

import java.util.ArrayList;

public class AlbumRoot{
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "pojo.AlbumRoot{" +
                "albums=" + albums +
                '}';
    }

    public ArrayList<Album> albums;
}