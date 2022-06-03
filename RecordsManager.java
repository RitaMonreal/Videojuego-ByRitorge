 

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RecordsManager {
    private static final String RECORDS_FILE = "records.rec";
    private static final int MAX_RECORDS_IN_FILE = 5;

    final static Charset ENCODING = StandardCharsets.UTF_8;
    
    public static void save(String name, int score) {
        List<GameRecord> records = new LinkedList<>();
        List<String> lines = new LinkedList<>();

        records.add(new GameRecord(name, score));

        records.sort(Comparator.comparingInt(GameRecord::getScore).reversed());

        int counter = 0;
        for(GameRecord orderedRecord: records) {
            lines.add(orderedRecord.getPlayerName() + "," + orderedRecord.getScore());
            counter++;
            if(counter >= MAX_RECORDS_IN_FILE) {
                break;
            }
        }

        try {
            Files.write(Path.of(RECORDS_FILE), lines, ENCODING);
        } catch (IOException e) {
            System.err.println("Error guardando archivo");
        }
    }

    public static List<GameRecord> getRecords() {
        Path path = Paths.get(RECORDS_FILE);
        List<GameRecord> records = new LinkedList<>();

        try(Scanner scanner = new Scanner(path, ENCODING.name())) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] recordInfo = line.split(",");
                records.add(new GameRecord(recordInfo[0], Integer.parseInt(recordInfo[1])));
            }
        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo");
        }
        return records;
    }
}
