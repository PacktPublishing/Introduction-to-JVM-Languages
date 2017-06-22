package chapter03.main;

import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import spark.Spark;
import chapter03.backend.CharacterCounter;

public class WebService {
	private static ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) {
		Spark.get("/main", (req, res) -> {
			res.type("application/json");
			try {
				String value = req.queryMap("value").value();
				Map<Character, Integer> map = CharacterCounter.countCharacters(value == null ? "" : value);
				return mapper.writeValueAsString(map);
			} catch (Exception e) {
				e.printStackTrace();
				return "{}";
			}
		});
	}
}