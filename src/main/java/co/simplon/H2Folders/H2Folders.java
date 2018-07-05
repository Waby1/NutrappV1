package co.simplon.H2Folders;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import co.simplon.model.AlimentModel;
import co.simplon.repository.AlimentRepository;

@Component
public class H2Folders implements ApplicationListener<ContextRefreshedEvent> {

	private final static char CSV_SEPARATOR = ';';
	private AlimentRepository AlimentRepo;

	public H2Folders(AlimentRepository groupRepo) {
		this.AlimentRepo = groupRepo;

	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		loadFoodTable("src/main/resources/data/glycemique.csv");
	}

	private final void loadFoodTable(String foodFileLocation) {

		List<AlimentModel> newAliments = new ArrayList<>();

		CSVParser csvParser = new CSVParserBuilder().withSeparator(CSV_SEPARATOR).build();

		try (CSVReader reader = new CSVReaderBuilder(new FileReader(foodFileLocation)).withCSVParser(csvParser)
				.build()) {

			List<String[]> fileLineList = reader.readAll();

			for (String[] fileLine : fileLineList) {
				
				AlimentModel x = new AlimentModel();
				
				x.setName(fileLine[0]);
				x.setChargeGly(Integer.valueOf(fileLine[1]));

				newAliments.add(x);

			}

			AlimentRepo.saveAll(newAliments);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// We do nothing John Snow, as this is for Dev DB fill up
		} catch (IOException e) {
			e.printStackTrace();
			// We do nothing John Snow, as this is for Dev DB fill up
		}
	}

}
