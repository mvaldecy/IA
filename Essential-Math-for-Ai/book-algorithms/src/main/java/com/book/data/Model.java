package com.book.data;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.book.entities.Person;

public class Model {

  public static ArrayList<Person> getPersons() {
		ArrayList<Person> persons = new ArrayList<Person>();
		String filePath = "book-algorithms/src/main/java/com/book/data/persons.csv";

		try(Reader reader = new FileReader(filePath);
			CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
				for(CSVRecord record: csvParser) {
					// Gender,Height,Weight,Index
					String gender = record.get("Gender");
					int height = Integer.parseInt(record.get("Height"));
					int weight = Integer.parseInt(record.get("Weight"));
					int index = Integer.parseInt(record.get("Index"));
					persons.add(new Person(gender, height, weight, index));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return persons;
  }

	public static void main(String[] args) {
		System.out.println(getPersons().get(0).toString());
	}
}
