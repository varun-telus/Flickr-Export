# Flickr Export

A Java command-line tool that organises your Flickr photo export into album folders on your local machine.

When you download your data from Flickr, you receive a flat directory of photos together with a set of JSON metadata files. This tool reads the `albums.json` export file, creates a folder for each album, and copies the matching photos and their JSON metadata into the corresponding folder.

## Prerequisites

- Java 8 or later
- Maven 3 (only needed if you want to build from source)

## Usage

A pre-built JAR is included in the repository (`flickr.jar`).

```
java -jar flickr.jar <photosDir> <albumsJson> <outputDir> <photoJsonDir>
```

| Argument | Description |
|---|---|
| `photosDir` | Directory containing the exported photo files |
| `albumsJson` | Path to the `albums.json` file from the Flickr export |
| `outputDir` | Directory where the album sub-folders will be created |
| `photoJsonDir` | Directory containing the per-photo JSON metadata files |

### Examples

**Windows**
```
java -jar flickr.jar "C:\Users\username\Documents\Flickr\Flickr Data" "C:\Users\username\Documents\Flickr\albums.json" "C:\Users\username\Documents\Flickr" "C:\Users\username\Documents\Flickr\photo_json"
```

**macOS / Linux**
```
java -jar flickr.jar "Users/username/Documents/Flickr/Flickr Data" "Users/username/Documents/Flickr/albums.json" "Users/username/Documents/Flickr" "Users/username/Documents/Flickr/photo_json"
```

After running, the tool creates an `Albums/` folder inside `outputDir`. Each album gets its own sub-folder named after the album title, containing:
- The photo files belonging to that album
- The matching per-photo JSON metadata files
- An `albumDescription.txt` file with the album description

## Building from Source

```bash
mvn package
```

The executable JAR (with all dependencies bundled) will be produced at:

```
target/flickr-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Dependencies

- [Jackson Databind](https://github.com/FasterXML/jackson-databind) — JSON parsing
- [Apache Commons IO](https://commons.apache.org/proper/commons-io/) — file copy utilities
