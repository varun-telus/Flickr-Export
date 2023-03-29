/*
 * @author: Varun Patil
 * email: varun.patil@amdocs.com
 * date: 8/16/2022
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import pojo.Album;
import pojo.AlbumRoot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FlickrExportMainClass {
    public static void main(String[] args) throws IOException {
        File photoDirectory = new File("C:\\Users\\x223454\\Documents\\Flickr\\Flickr Data"); // Location where the photos are stored
        File albumJsonFile = new File("C:\\Users\\x223454\\Documents\\Flickr\\albums.json"); // Location where the album json file is stored
        File albumsLocation = new File("C:\\Users\\x223454\\Documents\\Flickr"); //Location where you want to create the albums
        File photoJsonLocation = new File("C:\\Users\\x223454\\Documents\\Flickr\\photo_json"); //Location where photo json files are stored
        exportPhotosToAlbums(photoDirectory,albumJsonFile,albumsLocation,photoJsonLocation);
    }

    /*
    This method is looping through photos directory and finding a match with albums.json file. Any match found would
    create a directory with album name and copy the jpg and json file.
     */
    public static void exportPhotosToAlbums(File photoDirectory, File albumJsonFile, File albumsLocation, File photoJsonLocation) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(); // To parse json files
        AlbumRoot albumRoot = objectMapper.readValue(albumJsonFile, AlbumRoot.class); //Parsing albums json
        List<Album> albums = albumRoot.getAlbums();// extract the albums list
        albums.forEach((item) ->{
                    new File(albumsLocation+"\\Albums\\" + item.getTitle()).mkdirs(); // create album folders
                    String description = item.getDescription();
            try {
                Files.write(Paths.get(albumsLocation+"\\Albums\\" + item.getTitle().trim()+"\\albumDescription.txt"), description.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        File[] photoDirListing = photoDirectory.listFiles(); // read all photos
        File[] photoJsonListing = photoJsonLocation.listFiles(); // read all photo json
        for (Album album : albums) {
            List<String> photoList = album.getPhotos();
            for (String photoName : photoList) {
                for (File file : photoDirListing) {
                    if (file.getName().contains(photoName)) {
                        System.out.println("Photo found: "+file.getName()+", Copying the photo to album: "+album.getTitle());
                        FileUtils.copyFileToDirectory(new File(photoDirectory+"\\" + file.getName()), new File(albumsLocation+"\\Albums\\" + album.getTitle()));
                        for(File photoJson:photoJsonListing){
                            if(photoJson.getName().contains(photoName)){
                                System.out.println("Json Photo file found: "+photoJson.getName()+", Copying the json to album: "+album.getTitle());
                                FileUtils.copyFileToDirectory(new File(photoJsonLocation+"\\" + photoJson.getName()), new File(albumsLocation+"\\Albums\\" + album.getTitle()));
                            }
                        }
                    }
                }

            }
        }

    }
}